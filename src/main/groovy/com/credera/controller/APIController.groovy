package com.credera.controller

import com.credera.model.Widget
import com.credera.repository.WidgetRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.dao.EmptyResultDataAccessException
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.*

import javax.servlet.http.HttpServletResponse

@RestController
@RequestMapping("/api/widget")
class APIController {

  @Autowired
  WidgetRepository widgetRepository

  @RequestMapping(value = "", method = RequestMethod.POST)
  Widget createWidget(@RequestBody Widget widget, BindingResult result) {
    if (!result.hasErrors()) {
        return widgetRepository.save(widget)
    }
    return null;
  }

    @RequestMapping(value = "", method = RequestMethod.GET)
    List<Widget> getWidgets() {
        return widgetRepository.findAll()
    }

    @RequestMapping(value = "/{widgetId}", method = RequestMethod.DELETE)
    String getWidgets(@PathVariable Long widgetId, HttpServletResponse response) {
        try {
            widgetRepository.delete(widgetId)
        } catch (EmptyResultDataAccessException e) {
            response.setStatus(500)
            return "Successfully deleted widget!"
        }
        return "Successfully deleted widget!"
    }
}

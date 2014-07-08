package com.credera.controller

import com.credera.repository.WidgetRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class WidgetController {

  @Autowired
  WidgetRepository widgetRepository

  @RequestMapping("/widgets")
  String widgetList(Model model) {
    model.addAttribute("widgets", widgetRepository.findAll())
    return "index"
  }
}

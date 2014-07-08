package com.credera.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class IndexController {

  @RequestMapping("/")
  String home() {
    return "Hello World!"
  }
}

package com.credera.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController {

  @Value('${message}')
  String message

  @RequestMapping("/message")
  String home() {
    return message
  }
}

/*
 *
 */
package com.global.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
	 @RequestMapping(value = "/hello")
	  public String index() {
	    return "Hello World!!!";
	  }
}

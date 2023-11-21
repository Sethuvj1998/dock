package com.Onesofts.Jenkin.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/sethu")
public class Jenkin {
	@GetMapping(value="/add")
	public String getAdd() {
		return "Message Recevied";
	}

}

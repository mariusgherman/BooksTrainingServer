package com.books.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author marius.gherman
 */

@Controller
@RequestMapping("/api/books")
public class BooksController {

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome() {
		return "hello";
	}
}
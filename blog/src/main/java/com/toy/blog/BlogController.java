package com.toy.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController
{
	@Autowired
	private BlogService blogService;

	@RequestMapping(value = "/")
	public String main() throws Exception
	{
		System.out.println(" blogService = " + blogService.findItemsCnt());
		return "main";
	}
}

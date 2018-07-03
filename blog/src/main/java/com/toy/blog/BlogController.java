package com.toy.blog;

import java.util.List;

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
		List<Blog> items = blogService.findItems(null);

		System.out.println("items = " + items.size());
		for (Blog item : items)
		{
			System.out.println("item = " + item.getId());
		}

		System.out.println(" blogService = " + blogService.findItemsCnt());
		return "main";
	}
}

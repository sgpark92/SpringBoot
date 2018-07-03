package com.toy.blog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService
{
	@Autowired
	private BlogMapper blogMapper;

	@Override
	public List<Blog> findItems(Blog item) throws Exception
	{
		return blogMapper.findItems(item);
	}

	@Override
	public int findItemsCnt() throws Exception
	{
		return blogMapper.findItemsCnt();
	}

}

package com.toy.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService
{
	@Autowired
	private BlogMapper blogMapper;

	@Override
	public int findItemsCnt() throws Exception
	{
		return blogMapper.findItemsCnt();
	}

}

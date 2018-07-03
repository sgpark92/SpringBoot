package com.toy.blog;

import java.util.List;

public interface BlogService
{
	public List<Blog> findItems(Blog item) throws Exception;

	public int findItemsCnt() throws Exception;
}

package com.toy.blog;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlogMapper
{
	public List<Blog> findItems(Blog item) throws Exception;

	public int findItemsCnt() throws Exception;
}

package com.toy.blog;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlogMapper
{
	public int findItemsCnt() throws Exception;
}

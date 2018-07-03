package com.toy.blog;

import java.util.Date;

import com.toy.user.User;

public class Blog
{
	private int id;
	private User user;
	private String title;
	private String type;
	private String comment;
	private Date rgstDate;
	private Date lastDate;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getComment()
	{
		return comment;
	}

	public void setComment(String comment)
	{
		this.comment = comment;
	}

	public Date getRgstDate()
	{
		return rgstDate;
	}

	public void setRgstDate(Date rgstDate)
	{
		this.rgstDate = rgstDate;
	}

	public Date getLastDate()
	{
		return lastDate;
	}

	public void setLastDate(Date lastDate)
	{
		this.lastDate = lastDate;
	}

}

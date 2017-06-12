package com.resto;


public class detail {
	String name;
	String age;
	
	public String getName()
	
	{
		return name;
	}
	
	public String getAge()
	{
		return age;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public void setAge(String age)
	{
		this.age = age;
	}
	
    @Override
	public String toString()
	{
	return name + " " + age;
	}
	
}

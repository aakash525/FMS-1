import java.util.*;
public class User {
	
	private String name;
	private String post;
	private String username;
	private String password;
	private int uid;
	
/*	public User(String x, String y,int i)
	{
		setName(x);
		setPassword(y);
		setId(i);
	}
*/	

	public void setName(String x)
	{
		name = x;
	}
	
	public String getName()
	{
		return name;
	}

	public void setPost(String x)
	{
		post = x;
	}
	
	public String getPost()
	{
		return post;
	}

	public void setUsername(String x)
	{
		username = x;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public void setPassword(String y)
	{
		password = y;
	}
	
	public String getPassword()
	{
		return password;
	}

	public void setId(int i)
	{
		uid = i;
	}
	
	public int getId()
	{
		return uid;
	}
	
	
	
}


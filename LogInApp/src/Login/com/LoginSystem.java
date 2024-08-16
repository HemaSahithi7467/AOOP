package Login.com;

public class LoginSystem {
	private static LoginSystem instance;
	private static String loggedInuser;
	private LoginSystem()
	{
		loggedInuser = null;
	}
	public static LoginSystem getUser()
	{
		if(instance == null)
		{
			instance = new LoginSystem();
		}
		return instance;
	}
	
	public static LoginSystem Authenticate(String Username)
	{
		if(loggedInuser == Username){
			System.out.println("Logged in");
		}
		return instance;
	
	}
	
	public void login(String Username)
	{
		if(loggedInuser == null)
		{
			loggedInuser = Username;
			System.out.println("user 1 logged in successfully!!!"+" "+ Username);
		}
		else
		{
			System.out.println("Another user is already logged in. Login failed!!"+" "+ Username);
		}
	}
	public void logout()
	{
		if(loggedInuser != null)
		{
	    System.out.println("Another user is:::"+ loggedInuser + " "+"logout");	
	    loggedInuser = null;
		}
		else
		{
			System.out.println("No one.. can assigned a user in the system");
		}
	}
	
}

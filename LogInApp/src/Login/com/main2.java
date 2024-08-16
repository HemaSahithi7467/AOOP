package Login.com;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LoginSystem login_user1 = LoginSystem.getUser();
        login_user1.login("Arjun");
        
        LoginSystem user2 = LoginSystem.getUser();
        user2.login("Sanju");
        
        
	}

}

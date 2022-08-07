package movie_booking_simulator;

import java.util.*;

public class Authentication {
	
	String username[] = new String[] {"user1","user2","user3","user4","user5","user6","user7","user8","user9","user10"};
	String password[] = new String[] {"0000","1111","2222","3333","4444","5555","6666","7777","8888","9999"};
	
	public int verified() {
		int link = -1;
		System.out.println("Please Enter UserName: ");
		Scanner in = new Scanner(System.in);
		String uname = in.next();
		int flag = 0;
		for(int j=0; j<username.length;j++) {
			
			if (uname.equals(username[j])) {
				
				flag = 1;
				break;
			}
		}
		
		if(flag==1){
			link = authentication(uname);
		}
		else {
			System.out.println("Inavalid UserName");
		}
		return link;
		
	}
	public int authentication(String uname) {
		
		boolean verified = false;
		int k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Password: ");
		String pswd = sc.next();
		for(k=0;k<username.length;k++) {
			
			if(uname.equals(username[k])) {
				
				if(pswd.equals(password[k])) {
					verified=true;
					break;
				}
				else {
					verified=false;
				}
			}
		}
		if(verified) {
			System.out.println("Login Successful");
		}
		else {
			System.out.println("Login Failed. Invalid Password");
		}
		System.out.println("index: "+k);
		return k;
		
	}
	
	
	
	
	
}

package movie_booking_simulator;

import java.util.*;

public class Main_Class {
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
//authenticating user
		Authentication auth = new Authentication();
		int i = auth.verified();
		if(i>=0 && i<=10) {
		int ch,i1,n,movch; String rowch[]=new String[12];
		int colch[]=new int[12];
		String time = new String();
		String timecheck = new String();
		Show_Details objshow = new Show_Details();
		Hall_Screen objscreen = new Hall_Screen();
		Ticket objticket = new Ticket();
		
		while(true){
		System.out.println("\n\t\t   Movie Ticket Booking System\n");
		System.out.println("1.Book Movie Tickets");
		System.out.println("2.See Movies/Show Timings");
		System.out.println("3.Exit");
		System.out.println("\nAdvanced Bookings are closed as of now.");
		System.out.println("\nEnter Choice");
		ch = in.nextInt();
		switch(ch)
		{
			case 1:	objshow.display_show_timings();
					System.out.println("Choose the Movie");
					movch=in.nextInt();
					do{
					System.out.println("Enter Show timings (hh:mm)");
					time=in.next();
					timecheck=objshow.check_time(movch,time);
					}while(timecheck.equals("false"));
					System.out.println("Enter Number of seats");
					n=in.nextInt();
					for(i1=0;i1<n;i1++){
						objscreen.display_seats();
						rowch[i1]=in.next().toUpperCase();
						objshow.show_empty_seats(rowch[i1],movch);
						colch[i1]=in.nextInt();
						if(objshow.check_seats(rowch[i1],colch[i1],movch))
						{
							System.out.println("Seat is not available");
						}
						objshow.fill_seat(rowch[i1],colch[i1],movch);
					}
					for(i1=0;i1<n;i1++)
					{
								objticket.print_ticket(objshow.getmovie(movch), time, 3, objscreen.getcat(rowch[i1]), rowch[i1], colch[i1]);
					}
					break;
				
			case 2: objshow.display_show_timings();
					break;
					
			case 3: System.exit(0);			
		}
	}
	}
	}
}
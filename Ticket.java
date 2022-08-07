package movie_booking_simulator;

import java.util.*;

public class Ticket {
	
	Hall_Screen s = new Hall_Screen();

	void print_ticket(String movie,String showtime,int screen,String cat, String rowch, int colch)
	{
		Date date = new Date();
		int cost = s.getcost(cat);
		System.out.println("\t\t----------Your Ticket----------");
		System.out.println("\tMovie: "+movie+"\t");
		System.out.print("\tTime: "+showtime);
		System.out.println("\t\t\tSeat: "+rowch+colch);
		System.out.print("\tCategory: "+cat);
		System.out.println("\t\t\tScreen: "+screen);
		System.out.println("\tDate: "+date);
		System.out.println("\tPrice: ₹"+cost);
		System.out.println("\tThank You!\n\n");
	}
} 

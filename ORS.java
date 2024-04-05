package com.codinghub;

import java.util.HashMap;
import java.util.Scanner;

public class Onlinereservatonsytem {
	static Scanner s=new Scanner(System.in);
	static Reservation reservation=new Reservation();
	public static void main(String[] args) {
		login();
		menu();
	}
	
	public static void login()
	{
		System.out.println("enter username");
		String username=s.nextLine();
		System.out.println("enter password");
		String password=s.nextLine();
		if(isValidUser(username,password))
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Invalid Username or Password");
		}
		
	}
	public static boolean isValidUser(String username,String password)
	{
		return username.equals("aravind") && password.equals("9476");
	}
	public static void menu()
	{
		System.out.println("Welcome to online reservation system");
		System.out.println("1.Reserve Ticket");
		System.out.println("2.Cancel Ticket");
		System.out.println("3.Logout");
		int choice=s.nextInt();
		switch(choice)
		{
		case 1:
			reserveTicket();
			menu();
			break;
		case 2:
			cancelTicket();
			menu();
			break;
		case 3:
			System.out.println("Logged Out");
			System.exit(0);
			break;
		}
	}
	public static  void reserveTicket()
	{
		System.out.println("Enter train details");
		int trainno=s.nextInt();
		System.out.println("From: ");
		String From=s.next();
		System.out.println("To: ");
		String To=s.next();
		String Details="Train no: "+trainno+ " , From: "+From+" , To: "+To;
		String PNR="PNR"+(int)(Math.random()*1000);
        reservation.storeticketdetails(PNR, Details);

		System.out.println("Ticket Booked Successfully ");
		System.out.println("PNR Number is  "+PNR+ " Train Deatils is "+Details);
		
	}
	public static void cancelTicket()
	{
		System.out.println("Enter PNR NO:");
		String pnr=s.next();
		System.out.println(pnr);
		String cancelleddetails=reservation.cancelticket(pnr);
//		System.out.println(cancelleddetails);
		if(cancelleddetails!=null)
		{
			System.out.println("Cancelled Ticket Successfully");
		}
		else
		{
			System.out.println("Invalid PNR");
		}
	}
}
class Reservation
{
	HashMap<String,String> reservationdetails=new HashMap<>();
	
	public void storeticketdetails(String PNR,String Details)
	{
		reservationdetails.put(PNR, Details);
//		System.out.println(reservationdetails);
		System.out.println(reservationdetails.keySet());
	}
	public String cancelticket(String pnr)
	{
		return reservationdetails.remove(pnr);
	}
}

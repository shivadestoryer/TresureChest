package mypog;
import java.util.Scanner;
//import java.util.Random;

public class WhileLop {
	Scanner sc=new Scanner(System.in);
	void cala() {
	int CP=sc.nextInt();
	int SP=sc.nextInt();
	int margin;
	int cent;
	//System.out.println("Enter the Cost Price and Selling Price Respectively");
	if(SP>CP)
	{
		margin=SP-CP;
		System.out.println("***Congrats Profit of"+margin+"***");
		cent=margin*100/CP;
		System.out.println("*****Profit % "+cent+"****");
	}
	else
	{
		margin=CP-SP;
		System.out.println("***Lost of"+margin+"***");
		cent=margin*100/CP;
		System.out.println("*****Loss % "+cent+"***");
	}
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("*********Welcome to profit and loss GURU******");
		System.out.println("**Enter the Cost price And Selling price respectively**");
		WhileLop w=new WhileLop();
		w.cala();
	}
}
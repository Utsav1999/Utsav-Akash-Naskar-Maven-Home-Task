package com.EPEP.maven.EPEPMaven;
import java.util.*;
/**
 * Hello world!
 *
 */
abstract class A  //class to sort the chocolates and sweets according to their prices and weights
{
	public abstract void bsort(String arr[], int price[], double weight[]); //to sort
	public void show(String arr[], int price[], double weight[]) //to display
	{
		
	}
	public void rshow(String arr[], int price[], double weight[], int myrange) // to show items within range
	{
		
	}
}

class Chocolates extends A
{
	public void bsort(String arr[], int price[], double weight[])
	{
		int i,j,ptemp;
		double wtemp;
		String ctemp;
		for(i=0;i<4;i++)
		{
			for(j=0;j<4-i;j++)
			{
				if(price[j]>price[j+1])
				{
					ptemp=price[j];
					price[j]=price[j+1];
					price[j+1]=ptemp;
					
					wtemp=weight[j];
					weight[j]=weight[j+1];
					weight[j+1]=wtemp;
					
					ctemp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=ctemp;
				}
			}
		}
	}
	
	public void show(String arr[], int price[], double weight[])
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Product: "+arr[i]+" Price: "+price[i]+" Weight: "+weight[i]);
		}
	}
	
	public void rshow(String arr[], int price[], double weight[], int myrange) // to show items within range
	{
		for(int i=0;i<5;i++)
		{
			if(price[i]<=myrange)
			{
				System.out.println("Product: "+arr[i]+" Price: "+price[i]+" Weight: "+weight[i]);
			}
		}
	}
}

class Sweets extends A
{
	public void bsort(String arr[], int price[], double weight[])
	{
		int i,j,ptemp;
		double wtemp;
		String ctemp;
		for(i=0;i<4;i++)
		{
			for(j=0;j<4-i;j++)
			{
				if(price[j]>price[j+1])
				{
					ptemp=price[j];
					price[j]=price[j+1];
					price[j+1]=ptemp;
					
					wtemp=weight[j];
					weight[j]=weight[j+1];
					weight[j+1]=wtemp;
					
					ctemp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=ctemp;
				}
			}
		}
	}
	
	public void show(String arr[], int price[], double weight[])
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Product: "+arr[i]+" Price: "+price[i]+" Weight: "+weight[i]);
		}
	}
	
	public void rshow(String arr[], int price[], double weight[], int myrange) // to show items within range
	{
		for(int i=0;i<5;i++)
		{
			if(price[i]<=myrange)
			{
				System.out.println("Product: "+arr[i]+" Price: "+price[i]+" Weight: "+weight[i]);
			}
		}
	}
}

public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	Scanner sc = new Scanner(System.in);
    	String carr[]= {"Guylian","Lindt","Ghirardelli","Hersheys","Cadbury"}; //chocolate names
    	int cprice[]= {200,150,135,140,120}; //chocolate prices
    	double cweight[]={100,135.6,100,175.3,200}; //chocolate weights
    	String sarr[]= {"Gulab Jamun","Jalebi","Rashgulla","Rash Malai","Ladoo"}; //sweet names
    	int sprice[]= {20,15,22,12,10}; //sweet prices
    	double sweight[]= {4,5,2,3,3}; //sweet quantity
    	Chocolates c=new Chocolates();
    	Sweets s=new Sweets();
    	c.bsort(carr, cprice, cweight);
    	s.bsort(sarr, sprice, sweight);
    	while(true)
    	{
    		System.out.println("Welcome to Super Market. Choose your New Year gifts.");
    		System.out.println("Enter 1 to see only Chocolates list\nEnter 2 to see only Sweets list\nEnter 3 to see both Chocolates and Sweets list.\nEnter 4 to Exit the Super Market");
    		System.out.print("Enter your choice: ");
    		//Scanner sc = new Scanner(System.in);
    		int choice = sc.nextInt();
    		switch(choice)
    		{
    			case 1: System.out.println("\nAvailable Chocolate Products: ");
    					c.show(carr, cprice, cweight);
    					System.out.println("\nEnter your price range: ");
    					int myrange=sc.nextInt();
    					c.rshow(carr, cprice, cweight, myrange);
    					break;
    			case 2: System.out.println("\nAvailable Sweet Products: ");
						s.show(sarr, sprice, sweight);
						System.out.println("\nEnter your price range: ");
						int myrange1=sc.nextInt();
						s.rshow(sarr, sprice, sweight, myrange1);
						break;
				case 3: System.out.println("\nAvailable Chocolate Products: ");
    					c.show(carr, cprice, cweight);
    					System.out.println("\nEnter your price range: ");
    					int myrange2=sc.nextInt();
    					c.rshow(carr, cprice, cweight, myrange2);
    					System.out.println("\nAvailable Sweet Products: ");
						s.show(sarr, sprice, sweight);
						System.out.println("\nEnter your price range: ");
						int myrange3=sc.nextInt();
						s.rshow(sarr, sprice, sweight, myrange3);
						break;
    			case 4: System.exit(0);
    			default: System.out.println("\nWrong Entry");
    		}
    	}
    }
}

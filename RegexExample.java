package com.bridgelabs.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample
{
		
	public static void fName()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name:");
		
		String lname=sc.next();
		
		Pattern p=Pattern.compile("[A-Z][a-z]*");
		Matcher m1=p.matcher(lname);
		if(m1.find())
		{
			System.out.println("valid Name..");
		}else
		{
			System.out.println("Invalid  Name..");
		}
	}
	public static void lName()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Last Name:");
		
		String lname=sc.next();
		
		Pattern p=Pattern.compile("[A-Z][a-z]*");
		Matcher m1=p.matcher(lname);
		if(m1.find())
		{
			System.out.println("valid Name..");
		}else
		{
			System.out.println("Invalid Last Name..");
		}
	}
	public static void checkEmail()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mail id:");
		String mail=sc.next();
		
		Pattern p=Pattern.compile("[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
		
		Matcher m=p.matcher(mail);
		
		if(m.find())
		{
			System.out.println("Valid Email id..");
		}else
		{
			System.out.println("Invalid Email id...");
		}
	}
	public static void checkMobileNo()
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Mobile no:");
		String mobileno=sc1.nextLine();
		//Pattern p=Pattern.compile("(91)[6-9][0-9]{10}");
		boolean output=Pattern.matches("(91)[0-9]{10}", mobileno);
		//Matcher m=p.matcher(mobileno);
		if(output==true)
		{
			System.out.println("Valid Mobile no..");
		}else
		{
			System.out.println("Invalid mobile no");
		}
	}
	

	public static void main(String[] args) 
	{
		
	
	RegexExample rx=new RegexExample();
	
	fName();
	lName();
	checkEmail();
	checkMobileNo();
	
	}
	
	

}

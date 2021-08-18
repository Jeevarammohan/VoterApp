package com.voterapp.main;

import java.util.Scanner;

import com.voterapp.exception.NotEligibleException;
import com.voterapp.service.ElectionBooth;

public class Voter {

	public static void main(String[] args)throws NotEligibleException{
		Scanner scanner = new Scanner(System.in);
		ElectionBooth booth  = new ElectionBooth();
		System.out.println("Enter the age:");
		int age=scanner.nextInt();
		System.out.println("Enter the locality");
		String locality=scanner.next();
		System.out.println("Enter the voter id:");
		int vid=scanner.nextInt();
		try{
			booth.checkEligibility(age, locality, vid);
		}
		catch(NotEligibleException e) {
			System.out.println(e.getMessage());
		}
		scanner.close();
	}

}
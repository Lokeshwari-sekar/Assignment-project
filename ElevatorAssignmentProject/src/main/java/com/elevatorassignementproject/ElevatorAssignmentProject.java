package com.elevatorassignementproject;

import java.util.Scanner;

/**
 * *********************SIMPLE JAVA ASSIGNMENT**********************
 *
 *In this Elevator selection process class is having three major functions
 *
 *
 *-->First process is selecting FLOORS OPTIONS 
 *-->Second process is selecting FIRE ALARM OPTION 
 * -->Third process is Selecting QUIT OPTION
 * 
 *
 *
 */
class ElevatorSelectionProcess
{
	static Scanner sc=new Scanner(System.in);

	//FLOOR SELECTION FUNCTION
	/**
	 * Here the floor numbers are starting from 0 to 10...
	 *  
	 *  Initially it shows the current floor number It helps to 
	 *  select the what ever the floor number that person wants...
	 *  
	 * repeated selecting option is also given...
	 * 
	 */
	
	public void selectFloor()
	{
		int liftno;
		int initialfloor=0; 
		while(true)
		{ 

			while(true)
			{
				System.out.println("now you are in floor number: "+initialfloor);
				System.out.println("Enter the number where i want to lift from 1 to 10");
				liftno=sc.nextInt();

				if(liftno>=1  && liftno<=10)
				{
					//loop for selection of floor it goes until the reach required floor
					if(liftno>initialfloor)	
					{
						System.out.print("going up");
						for(int  i=1;i<=liftno;i++)
						{
							System.out.print(i+"...");

							if(i==liftno)
							{
								System.out.println(i+"Ding!");
								System.out.println("lift is stopped...");
							}
						}
					}
					else
					{
						System.out.println("going down");
						for(int  i=1;i<=liftno;i++)
						{
							System.out.print(i+"...");

							if(i==liftno)
							{
								System.out.println(i+"Ding!");
								System.out.println("lift is stopped...");
							}

						}
					}
					initialfloor=liftno;
					System.out.println("do you want to continue the floor selection process yes/no");
					String in=sc.next();
					if(in.equalsIgnoreCase("no"))
					{

						break;
					}

				}//if the selected floor number is not valid means it gives the change to re enter
				else
				{
					System.out.println("enter the valid number");
					break;
				}
			}break;	
		}}

	//FIRE ALARM FUNCTION
	/**
	 * This fire alarm gives the alert message and 
	 * it immediately tell like to press exit
	 * 
	 */
	void fireAlarm()
	{
		System.out.println("Danger! You must exit the building now!");
		System.out.println("e for Exit");
		char fin=sc.next().charAt(0);

		switch(fin)
		{
		case 'e':System.out.println("now you are safe");
		System.out.println("lift is stopped");
		System.out.println("you are in floor no 0");
		break;
		default: System.out.println("invalid option");
		}
	}

	//QUIT FUNCTION
	/**
	 * It shows the quieted message...
	 */
	public void elevatorQuit() 
	{
		System.out.println("now you are quieted...");

	}
}
/*
 * In this main elevator assignment project class having the selection process
 * using witch cases.
 * 
 */

public class ElevatorAssignmentProject {

	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {

		ElevatorSelectionProcess eob=new ElevatorSelectionProcess();

		while(true)
		{

			System.out.println("*******Don't worry I will Lift You*******");
			System.out.println("Enter your option");


			System.out.println("s for selecting the FLOOR option");
			System.out.println("f for selecting the FIRE ALARM  option");
			System.out.println("q for selecting the QUIT option");
			char n=sc.next().charAt(0);
			while(true) {
				switch(n)
				{
				case 's':System.out.println("your selecting the floor selection process");
				eob.selectFloor();
				break;
				case 'f':System.out.println("your selecting the fire alarm process");
				eob.fireAlarm();
				break;
				case 'q':System.out.println("your selecting the quit process");
				eob.elevatorQuit();
				break;
				default: System.out.println("Invalid choice");

				}break;
			}
			if(n=='s')
			{
				System.out.println("do you want to continue yes/no");
				String in=sc.next();
				if(in.equalsIgnoreCase("no"))
				{
					break;
				}
			} else {
				break;
			}
		}
	}}





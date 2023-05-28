import java.util.Scanner;
class Zwiggy
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("\nWelcome to FastServe Are You HUNGER"+(char)4+(char)4+(char)4);
		System.out.println("\nPlease Select your Hotel ");
		System.out.println("\n1.AL-Safa \n2.Buhari \n3.S.S Hyderabad \n4.Noha \n5.Exit\n");
		int hotel = sc.nextInt();
		switch (hotel)
		{
		case 1:
		{
		System.out.println("Thankyou for selecting AL-Safa "+(char)5+(char)5+"\n");
		System.out.println("\n1.Special Biriyani \n2.Dum Biriyani \n3.Royal Kunafa \n4.Naan with Butter Garlic Chicken\n");
		int food = sc.nextInt();
		switch (food)
		{
		case 1:
		{
		int price = 240;
		System.out.println("\nPlease Enter the Quantity");
		int qty = sc.nextInt();
		double bill = qty*price;
		System.out.println("\nYour Total Bill is "+bill+"\n");
		System.out.println("\nEnter the Way of Payment you would like to go:\n ");
		System.out.println("1.Google Pay\n ");
		System.out.println("2.Cash on Delivery ");
		int payment = sc.nextInt();
		switch(payment)
		{
		case 1:
		{
		System.out.println("\nEnter the Bill Amount:\n ");
		int sum = sc.nextInt();
		if(sum==bill)
		{
			System.out.println("\nPlease wait The OTP Will be Generated....\n");
			Thread.sleep(2000);
			double otp = 9999*Math.random()+9999;
			int check = (int)otp;
			System.out.println(check);
			Thread.sleep(500);
			System.out.println("\nEnter the OTP: \n");
			int enter = sc.nextInt();
			if(enter==check)
			{
				System.out.println("\nProcessing Please wait....\n");
				Thread.sleep(1000);
				System.out.println("ORDERED SUCCESSFULLY\n");
				System.out.println("YOUR ORDER WILL REACH YOUR HOME WITHIN 30 MINS\n");
				System.out.println("THANK YOU VISIT AGAIN\n");
			}
			else if(enter!=check)
			{
				System.out.println("\nPlease Enter the OTP Correctly\n");
				System.out.println("YOUR OTP WAS WRONG!!!");
				System.out.println("\nTry again....");
			}
			}
			else if(sum!=bill)
			{
				System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
				System.out.println("Please Enter the Correct Amount \n ");
				System.out.println("Try again....");
			}
			break;
		}
		case 2:
			{
			System.out.println("\nCash on Delivery\n");
			System.out.println("\nEnter the Bill Amount:\n ");
			int sum = sc.nextInt();
			if(sum!=bill)
			{
			System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
			System.out.println("Please Enter the Correct Amount \n ");
			System.out.println("Try again....");
			break;
			}
			System.out.println("\nTo Place the Order Enter your Address");
			String place = sc.next();
			Thread.sleep(1000);
			System.out.println("\nIs This is your Address right: " + place);
			System.out.println("\nShall we Place the Order? ");
			Thread.sleep(1000);
			String hawk = sc.next();
			if(hawk.equals("yes"))
				{
				System.out.println("\nYour Order has Placed Successfully\n ");
				System.out.println("Will reach Your home within 30MINS\n ");
				}
				break;
			}
		}
		break;
		}
		case 2:
		{
		int price_2 = 140;
		System.out.println("\nPlease Enter the Quantity");
		int qty = sc.nextInt();
		double bill = qty*price_2;
		System.out.println("\nYour Total Bill is "+bill+"\n");
		System.out.println("\nEnter the Way of Payment you would like to go:\n ");
		System.out.println("1.Google Pay\n ");
		System.out.println("2.Cash on Delivery ");
		int payment = sc.nextInt();
		switch(payment)
		{
		case 1:
		{
		System.out.println("\nEnter the Bill Amount:\n ");
		int sum = sc.nextInt();
		if(sum==bill)
		{
			System.out.println("\nPlease wait The OTP Will be Generated....\n");
			Thread.sleep(2000);
			double otp = 9999*Math.random()+9999;
			int check = (int)otp;
			System.out.println(check);
			Thread.sleep(500);
			System.out.println("\nEnter the OTP: \n");
			int enter = sc.nextInt();
			if(enter==check)
			{
				System.out.println("\nProcessing Please wait....\n");
				Thread.sleep(1000);
				System.out.println("ORDERED SUCCESSFULLY\n");
				System.out.println("YOUR ORDER WILL REACH YOUR HOME WITHIN 30 MINS\n");
				System.out.println("THANK YOU VISIT AGAIN\n");
			}
			else if(enter!=check)
			{
				System.out.println("\nPlease Enter the OTP Correctly\n");
				System.out.println("YOUR OTP WAS WRONG!!!");
				System.out.println("\nTry again....");
			}
			}
			else if(sum!=bill)
			{
				System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
				System.out.println("Please Enter the Correct Amount \n ");
				System.out.println("Try again....");
			}
			break;
		}
		case 2:
			{
			System.out.println("\nCash on Delivery\n");
			System.out.println("\nEnter the Bill Amount:\n ");
			int sum = sc.nextInt();
			if(sum!=bill)
			{
			System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
			System.out.println("Please Enter the Correct Amount \n ");
			System.out.println("Try again....");
			break;
			}
			System.out.println("\nTo Place the Order Enter your Address");
			String place = sc.next();
			Thread.sleep(1000);
			System.out.println("\nIs This is your Address right: " + place);
			System.out.println("\nShall we Place the Order? ");
			Thread.sleep(1000);
			String hawk = sc.next();
			if(hawk.equals("yes"))
				{
				System.out.println("\nYour Order has Placed Successfully\n ");
				System.out.println("Will reach Your home within 30MINS\n ");
				}
				break;
			}
		}
		break;
		}
		case 3:
		{
		int price_3 = 200;
		System.out.println("\nPlease Enter the Quantity");
		int qty = sc.nextInt();
		double bill = qty*price_3;
		System.out.println("\nYour Total Bill is "+bill+"\n");
		System.out.println("\nEnter the Way of Payment you would like to go:\n ");
		System.out.println("1.Google Pay\n ");
		System.out.println("2.Cash on Delivery ");
		int payment = sc.nextInt();
		switch(payment)
		{
		case 1:
		{
		System.out.println("\nEnter the Bill Amount:\n ");
		int sum = sc.nextInt();
		if(sum==bill)
		{
			System.out.println("\nPlease wait The OTP Will be Generated....\n");
			Thread.sleep(2000);
			double otp = 9999*Math.random()+9999;
			int check = (int)otp;
			System.out.println(check);
			Thread.sleep(500);
			System.out.println("\nEnter the OTP: \n");
			int enter = sc.nextInt();
			if(enter==check)
			{
				System.out.println("\nProcessing Please wait....\n");
				Thread.sleep(1000);
				System.out.println("ORDERED SUCCESSFULLY\n");
				System.out.println("YOUR ORDER WILL REACH YOUR HOME WITHIN 30 MINS\n");
				System.out.println("THANK YOU VISIT AGAIN\n");
			}
			else if(enter!=check)
			{
				System.out.println("\nPlease Enter the OTP Correctly\n");
				System.out.println("YOUR OTP WAS WRONG!!!");
				System.out.println("\nTry again....");
			}
			}
			else if(sum!=bill)
			{
				System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
				System.out.println("Please Enter the Correct Amount \n ");
				System.out.println("Try again....");
			}
			break;
		}
		case 2:
			{
			System.out.println("\nCash on Delivery\n");
			System.out.println("\nEnter the Bill Amount:\n ");
			int sum = sc.nextInt();
			if(sum!=bill)
			{
			System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
			System.out.println("Please Enter the Correct Amount \n ");
			System.out.println("Try again....");
			break;
			}
			System.out.println("\nTo Place the Order Enter your Address");
			String place = sc.next();
			Thread.sleep(1000);
			System.out.println("\nIs This is your Address right: " + place);
			System.out.println("\nShall we Place the Order? ");
			Thread.sleep(1000);
			String hawk = sc.next();
			if(hawk.equals("yes"))
				{
				System.out.println("\nYour Order has Placed Successfully\n ");
				System.out.println("Will reach Your home within 30MINS\n ");
				}
				break;
			}
		}
		break;
		}
		case 4:
		{
		int price_4 = 250;
		System.out.println("\nPlease Enter the Quantity");
		int qty = sc.nextInt();
		double bill = qty*price_4;
		System.out.println("\nYour Total Bill is "+bill+"\n");
		System.out.println("\nEnter the Way of Payment you would like to go:\n ");
		System.out.println("1.Google Pay\n ");
		System.out.println("2.Cash on Delivery ");
		int payment = sc.nextInt();
		switch(payment)
		{
		case 1:
		{
		System.out.println("\nEnter the Bill Amount:\n ");
		int sum = sc.nextInt();
		if(sum==bill)
		{
			System.out.println("\nPlease wait The OTP Will be Generated....\n");
			Thread.sleep(2000);
			double otp = 9999*Math.random()+9999;
			int check = (int)otp;
			System.out.println(check);
			Thread.sleep(500);
			System.out.println("\nEnter the OTP: \n");
			int enter = sc.nextInt();
			if(enter==check)
			{
				System.out.println("\nProcessing Please wait....\n");
				Thread.sleep(1000);
				System.out.println("ORDERED SUCCESSFULLY\n");
				System.out.println("YOUR ORDER WILL REACH YOUR HOME WITHIN 30 MINS\n");
				System.out.println("THANK YOU VISIT AGAIN\n");
			}
			else if(enter!=check)
			{
				System.out.println("\nPlease Enter the OTP Correctly\n");
				System.out.println("YOUR OTP WAS WRONG!!!");
				System.out.println("\nTry again....");
			}
			}
			else if(sum!=bill)
			{
				System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
				System.out.println("Please Enter the Correct Amount \n ");
				System.out.println("Try again....");
			}
			break;
		}
		case 2:
			{
			System.out.println("\nCash on Delivery\n");
			System.out.println("\nEnter the Bill Amount:\n ");
			int sum = sc.nextInt();
			if(sum!=bill)
			{
			System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
			System.out.println("Please Enter the Correct Amount \n ");
			System.out.println("Try again....");
			break;
			}
			System.out.println("\nTo Place the Order Enter your Address");
			String place = sc.next();
			Thread.sleep(1000);
			System.out.println("\nIs This is your Address right: " + place);
			System.out.println("\nShall we Place the Order? ");
			Thread.sleep(1000);
			String hawk = sc.next();
			if(hawk.equals("yes"))
				{
				System.out.println("\nYour Order has Placed Successfully\n ");
				System.out.println("Will reach Your home within 30MINS\n ");
				}
				break;
			}
		}
		}
		break;
		}
		break;
		}

		
		case 2:
		{
		System.out.println("Thankyou for selecting Buhari "+(char)5+(char)5+"\n");
		System.out.println("\n1.Idli \n2.Pongal \n3.Dosa \n4.Puri\n");
		int food = sc.nextInt();
		switch (food)
		{
		case 1:
		{
		int price = 70;
		System.out.println("\nPlease Enter the Quantity");
		int qty = sc.nextInt();
		double bill = qty*price;
		System.out.println("\nYour Total Bill is "+bill+"\n");
		System.out.println("\nEnter the Way of Payment you would like to go:\n ");
		System.out.println("1.Google Pay\n ");
		System.out.println("2.Cash on Delivery ");
		int payment = sc.nextInt();
		switch(payment)
		{
		case 1:
		{
		System.out.println("\nEnter the Bill Amount:\n ");
		int sum = sc.nextInt();
		if(sum==bill)
		{
			System.out.println("\nPlease wait The OTP Will be Generated....\n");
			Thread.sleep(2000);
			double otp = 9999*Math.random()+9999;
			int check = (int)otp;
			System.out.println(check);
			Thread.sleep(500);
			System.out.println("\nEnter the OTP: \n");
			int enter = sc.nextInt();
			if(enter==check)
			{
				System.out.println("\nProcessing Please wait....\n");
				Thread.sleep(1000);
				System.out.println("ORDERED SUCCESSFULLY\n");
				System.out.println("YOUR ORDER WILL REACH YOUR HOME WITHIN 30 MINS\n");
				System.out.println("THANK YOU VISIT AGAIN\n");
			}
			else if(enter!=check)
			{
				System.out.println("\nPlease Enter the OTP Correctly\n");
				System.out.println("YOUR OTP WAS WRONG!!!");
				System.out.println("\nTry again....");
			}
			}
			else if(sum!=bill)
			{
				System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
				System.out.println("Please Enter the Correct Amount \n ");
				System.out.println("Try again....");
			}
			break;
		}
		case 2:
			{
			System.out.println("\nCash on Delivery\n");
			System.out.println("\nEnter the Bill Amount:\n ");
			int sum = sc.nextInt();
			if(sum!=bill)
			{
			System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
			System.out.println("Please Enter the Correct Amount \n ");
			System.out.println("Try again....");
			break;
			}
			System.out.println("\nTo Place the Order Enter your Address");
			String place = sc.next();
			Thread.sleep(1000);
			System.out.println("\nIs This is your Address right: " + place);
			System.out.println("\nShall we Place the Order? ");
			Thread.sleep(1000);
			String hawk = sc.next();
			if(hawk.equals("yes"))
				{
				System.out.println("\nYour Order has Placed Successfully\n ");
				System.out.println("Will reach Your home within 30MINS\n ");
				}
				break;
			}
		}
		break;
		}
		case 2:
		{
		int price_2 = 60;
		System.out.println("\nPlease Enter the Quantity");
		int qty = sc.nextInt();
		double bill = qty*price_2;
		System.out.println("\nYour Total Bill is "+bill+"\n");
		System.out.println("\nEnter the Way of Payment you would like to go:\n ");
		System.out.println("1.Google Pay\n ");
		System.out.println("2.Cash on Delivery ");
		int payment = sc.nextInt();
		switch(payment)
		{
		case 1:
		{
		System.out.println("\nEnter the Bill Amount:\n ");
		int sum = sc.nextInt();
		if(sum==bill)
		{
			System.out.println("\nPlease wait The OTP Will be Generated....\n");
			Thread.sleep(2000);
			double otp = 9999*Math.random()+9999;
			int check = (int)otp;
			System.out.println(check);
			Thread.sleep(500);
			System.out.println("\nEnter the OTP: \n");
			int enter = sc.nextInt();
			if(enter==check)
			{
				System.out.println("\nProcessing Please wait....\n");
				Thread.sleep(1000);
				System.out.println("ORDERED SUCCESSFULLY\n");
				System.out.println("YOUR ORDER WILL REACH YOUR HOME WITHIN 30 MINS\n");
				System.out.println("THANK YOU VISIT AGAIN\n");
			}
			else if(enter!=check)
			{
				System.out.println("\nPlease Enter the OTP Correctly\n");
				System.out.println("YOUR OTP WAS WRONG!!!");
				System.out.println("\nTry again....");
			}
			}
			else if(sum!=bill)
			{
				System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
				System.out.println("Please Enter the Correct Amount \n ");
				System.out.println("Try again....");
			}
			break;
		}
		case 2:
			{
			System.out.println("\nCash on Delivery\n");
			System.out.println("\nEnter the Bill Amount:\n ");
			int sum = sc.nextInt();
			if(sum!=bill)
			{
			System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
			System.out.println("Please Enter the Correct Amount \n ");
			System.out.println("Try again....");
			break;
			}
			System.out.println("\nTo Place the Order Enter your Address");
			String place = sc.next();
			Thread.sleep(1000);
			System.out.println("\nIs This is your Address right: " + place);
			System.out.println("\nShall we Place the Order? ");
			Thread.sleep(1000);
			String hawk = sc.next();
			if(hawk.equals("yes"))
				{
				System.out.println("\nYour Order has Placed Successfully\n ");
				System.out.println("Will reach Your home within 30MINS\n ");
				}
				break;
			}
		}
		break;
		}
		case 3:
		{
		int price_3 = 40;
		System.out.println("\nPlease Enter the Quantity");
		int qty = sc.nextInt();
		double bill = qty*price_3;
		System.out.println("\nYour Total Bill is "+bill+"\n");
		System.out.println("\nEnter the Way of Payment you would like to go:\n ");
		System.out.println("1.Google Pay\n ");
		System.out.println("2.Cash on Delivery ");
		int payment = sc.nextInt();
		switch(payment)
		{
		case 1:
		{
		System.out.println("\nEnter the Bill Amount:\n ");
		int sum = sc.nextInt();
		if(sum==bill)
		{
			System.out.println("\nPlease wait The OTP Will be Generated....\n");
			Thread.sleep(2000);
			double otp = 9999*Math.random()+9999;
			int check = (int)otp;
			System.out.println(check);
			Thread.sleep(500);
			System.out.println("\nEnter the OTP: \n");
			int enter = sc.nextInt();
			if(enter==check)
			{
				System.out.println("\nProcessing Please wait....\n");
				Thread.sleep(1000);
				System.out.println("ORDERED SUCCESSFULLY\n");
				System.out.println("YOUR ORDER WILL REACH YOUR HOME WITHIN 30 MINS\n");
				System.out.println("THANK YOU VISIT AGAIN\n");
			}
			else if(enter!=check)
			{
				System.out.println("\nPlease Enter the OTP Correctly\n");
				System.out.println("YOUR OTP WAS WRONG!!!");
				System.out.println("\nTry again....");
			}
			}
			else if(sum!=bill)
			{
				System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
				System.out.println("Please Enter the Correct Amount \n ");
				System.out.println("Try again....");
			}
			break;
		}
		case 2:
			{
			System.out.println("\nCash on Delivery\n");
			System.out.println("\nEnter the Bill Amount:\n ");
			int sum = sc.nextInt();
			if(sum!=bill)
			{
			System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
			System.out.println("Please Enter the Correct Amount \n ");
			System.out.println("Try again....");
			break;
			}
			System.out.println("\nTo Place the Order Enter your Address");
			String place = sc.next();
			Thread.sleep(1000);
			System.out.println("\nIs This is your Address right: " + place);
			System.out.println("\nShall we Place the Order? ");
			Thread.sleep(1000);
			String hawk = sc.next();
			if(hawk.equals("yes"))
				{
				System.out.println("\nYour Order has Placed Successfully\n ");
				System.out.println("Will reach Your home within 30MINS\n ");
				}
				break;
			}
		}
		break;
		}
		case 4:
		{
		int price_4 = 50;
		System.out.println("\nPlease Enter the Quantity");
		int qty = sc.nextInt();
		double bill = qty*price_4;
		System.out.println("\nYour Total Bill is "+bill+"\n");
		System.out.println("\nEnter the Way of Payment you would like to go:\n ");
		System.out.println("1.Google Pay\n ");
		System.out.println("2.Cash on Delivery ");
		int payment = sc.nextInt();
		switch(payment)
		{
		case 1:
		{
		System.out.println("\nEnter the Bill Amount:\n ");
		int sum = sc.nextInt();
		if(sum==bill)
		{
			System.out.println("\nPlease wait The OTP Will be Generated....\n");
			Thread.sleep(2000);
			double otp = 9999*Math.random()+9999;
			int check = (int)otp;
			System.out.println(check);
			Thread.sleep(500);
			System.out.println("\nEnter the OTP: \n");
			int enter = sc.nextInt();
			if(enter==check)
			{
				System.out.println("\nProcessing Please wait....\n");
				Thread.sleep(1000);
				System.out.println("ORDERED SUCCESSFULLY\n");
				System.out.println("YOUR ORDER WILL REACH YOUR HOME WITHIN 30 MINS\n");
				System.out.println("THANK YOU VISIT AGAIN\n");
			}
			else if(enter!=check)
			{
				System.out.println("\nPlease Enter the OTP Correctly\n");
				System.out.println("YOUR OTP WAS WRONG!!!");
				System.out.println("\nTry again....");
			}
			}
			else if(sum!=bill)
			{
				System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
				System.out.println("Please Enter the Correct Amount \n ");
				System.out.println("Try again....");
			}
			break;
		}
		case 2:
			{
			System.out.println("\nCash on Delivery\n");
			System.out.println("\nEnter the Bill Amount:\n ");
			int sum = sc.nextInt();
			if(sum!=bill)
			{
			System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
			System.out.println("Please Enter the Correct Amount \n ");
			System.out.println("Try again....");
			break;
			}
			System.out.println("\nTo Place the Order Enter your Address");
			String place = sc.next();
			Thread.sleep(1000);
			System.out.println("\nIs This is your Address right: " + place);
			System.out.println("\nShall we Place the Order? ");
			Thread.sleep(1000);
			String hawk = sc.next();
			if(hawk.equals("yes"))
				{
				System.out.println("\nYour Order has Placed Successfully\n ");
				System.out.println("Will reach Your home within 30MINS\n ");
				}
				break;
			}
		}
		}
		break;
		}
		break;
		}


		case 3:
		{
		System.out.println("Thankyou for selecting S.S Hyderabad "+(char)5+(char)5+"\n");
		System.out.println("\n1.Mutton Biriyani \n2.Rabbit Fry \n3.Pornfret Fish \n4.Sea Crab\n");
		int food = sc.nextInt();
		switch (food)
		{
		case 1:
		{
		int price = 350;
		System.out.println("\nPlease Enter the Quantity");
		int qty = sc.nextInt();
		double bill = qty*price;
		System.out.println("\nYour Total Bill is "+bill+"\n");
		System.out.println("\nEnter the Way of Payment you would like to go:\n ");
		System.out.println("1.Google Pay\n ");
		System.out.println("2.Cash on Delivery ");
		int payment = sc.nextInt();
		switch(payment)
		{
		case 1:
		{
		System.out.println("\nEnter the Bill Amount:\n ");
		int sum = sc.nextInt();
		if(sum==bill)
		{
			System.out.println("\nPlease wait The OTP Will be Generated....\n");
			Thread.sleep(2000);
			double otp = 9999*Math.random()+9999;
			int check = (int)otp;
			System.out.println(check);
			Thread.sleep(500);
			System.out.println("\nEnter the OTP: \n");
			int enter = sc.nextInt();
			if(enter==check)
			{
				System.out.println("\nProcessing Please wait....\n");
				Thread.sleep(1000);
				System.out.println("ORDERED SUCCESSFULLY\n");
				System.out.println("YOUR ORDER WILL REACH YOUR HOME WITHIN 30 MINS\n");
				System.out.println("THANK YOU VISIT AGAIN\n");
			}
			else if(enter!=check)
			{
				System.out.println("\nPlease Enter the OTP Correctly\n");
				System.out.println("YOUR OTP WAS WRONG!!!");
				System.out.println("\nTry again....");
			}
			}
			else if(sum!=bill)
			{
				System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
				System.out.println("Please Enter the Correct Amount \n ");
				System.out.println("Try again....");
			}
			break;
		}
		case 2:
			{
			System.out.println("\nCash on Delivery\n");
			System.out.println("\nEnter the Bill Amount:\n ");
			int sum = sc.nextInt();
			if(sum!=bill)
			{
			System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
			System.out.println("Please Enter the Correct Amount \n ");
			System.out.println("Try again....");
			break;
			}
			System.out.println("\nTo Place the Order Enter your Address");
			String place = sc.next();
			Thread.sleep(1000);
			System.out.println("\nIs This is your Address right: " + place);
			System.out.println("\nShall we Place the Order? ");
			Thread.sleep(1000);
			String hawk = sc.next();
			if(hawk.equals("yes"))
				{
				System.out.println("\nYour Order has Placed Successfully\n ");
				System.out.println("Will reach Your home within 30MINS\n ");
				}
				break;
			}
		}
		break;
		}
		case 2:
		{
		int price_2 = 170;
		System.out.println("\nPlease Enter the Quantity");
		int qty = sc.nextInt();
		double bill = qty*price_2;
		System.out.println("\nYour Total Bill is "+bill+"\n");
		System.out.println("\nEnter the Way of Payment you would like to go:\n ");
		System.out.println("1.Google Pay\n ");
		System.out.println("2.Cash on Delivery ");
		int payment = sc.nextInt();
		switch(payment)
		{
		case 1:
		{
		System.out.println("\nEnter the Bill Amount:\n ");
		int sum = sc.nextInt();
		if(sum==bill)
		{
			System.out.println("\nPlease wait The OTP Will be Generated....\n");
			Thread.sleep(2000);
			double otp = 9999*Math.random()+9999;
			int check = (int)otp;
			System.out.println(check);
			Thread.sleep(500);
			System.out.println("\nEnter the OTP: \n");
			int enter = sc.nextInt();
			if(enter==check)
			{
				System.out.println("\nProcessing Please wait....\n");
				Thread.sleep(1000);
				System.out.println("ORDERED SUCCESSFULLY\n");
				System.out.println("YOUR ORDER WILL REACH YOUR HOME WITHIN 30 MINS\n");
				System.out.println("THANK YOU VISIT AGAIN\n");
			}
			else if(enter!=check)
			{
				System.out.println("\nPlease Enter the OTP Correctly\n");
				System.out.println("YOUR OTP WAS WRONG!!!");
				System.out.println("\nTry again....");
			}
			}
			else if(sum!=bill)
			{
				System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
				System.out.println("Please Enter the Correct Amount \n ");
				System.out.println("Try again....");
			}
			break;
		}
		case 2:
			{
			System.out.println("\nCash on Delivery\n");
			System.out.println("\nEnter the Bill Amount:\n ");
			int sum = sc.nextInt();
			if(sum!=bill)
			{
			System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
			System.out.println("Please Enter the Correct Amount \n ");
			System.out.println("Try again....");
			break;
			}
			System.out.println("\nTo Place the Order Enter your Address");
			String place = sc.next();
			Thread.sleep(1000);
			System.out.println("\nIs This is your Address right: " + place);
			System.out.println("\nShall we Place the Order? ");
			Thread.sleep(1000);
			String hawk = sc.next();
			if(hawk.equals("yes"))
				{
				System.out.println("\nYour Order has Placed Successfully\n ");
				System.out.println("Will reach Your home within 30MINS\n ");
				}
				break;
			}
		}
		break;
		}
		case 3:
		{
		int price_3 = 400;
		System.out.println("\nPlease Enter the Quantity");
		int qty = sc.nextInt();
		double bill = qty*price_3;
		System.out.println("\nYour Total Bill is "+bill+"\n");
		System.out.println("\nEnter the Way of Payment you would like to go:\n ");
		System.out.println("1.Google Pay\n ");
		System.out.println("2.Cash on Delivery ");
		int payment = sc.nextInt();
		switch(payment)
		{
		case 1:
		{
		System.out.println("\nEnter the Bill Amount:\n ");
		int sum = sc.nextInt();
		if(sum==bill)
		{
			System.out.println("\nPlease wait The OTP Will be Generated....\n");
			Thread.sleep(2000);
			double otp = 9999*Math.random()+9999;
			int check = (int)otp;
			System.out.println(check);
			Thread.sleep(500);
			System.out.println("\nEnter the OTP: \n");
			int enter = sc.nextInt();
			if(enter==check)
			{
				System.out.println("\nProcessing Please wait....\n");
				Thread.sleep(1000);
				System.out.println("ORDERED SUCCESSFULLY\n");
				System.out.println("YOUR ORDER WILL REACH YOUR HOME WITHIN 30 MINS\n");
				System.out.println("THANK YOU VISIT AGAIN\n");
			}
			else if(enter!=check)
			{
				System.out.println("\nPlease Enter the OTP Correctly\n");
				System.out.println("YOUR OTP WAS WRONG!!!");
				System.out.println("\nTry again....");
			}
			}
			else if(sum!=bill)
			{
				System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
				System.out.println("Please Enter the Correct Amount \n ");
				System.out.println("Try again....");
			}
			break;
		}
		case 2:
			{
			System.out.println("\nCash on Delivery\n");
			System.out.println("\nEnter the Bill Amount:\n ");
			int sum = sc.nextInt();
			if(sum!=bill)
			{
			System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
			System.out.println("Please Enter the Correct Amount \n ");
			System.out.println("Try again....");
			break;
			}
			System.out.println("\nTo Place the Order Enter your Address");
			String place = sc.next();
			Thread.sleep(1000);
			System.out.println("\nIs This is your Address right: " + place);
			System.out.println("\nShall we Place the Order? ");
			Thread.sleep(1000);
			String hawk = sc.next();
			if(hawk.equals("yes"))
				{
				System.out.println("\nYour Order has Placed Successfully\n ");
				System.out.println("Will reach Your home within 30MINS\n ");
				}
				break;
			}
		}
		break;
		}
		case 4:
		{
		int price_4 = 150;
		System.out.println("\nPlease Enter the Quantity");
		int qty = sc.nextInt();
		double bill = qty*price_4;
		System.out.println("\nYour Total Bill is "+bill+"\n");
		System.out.println("\nEnter the Way of Payment you would like to go:\n ");
		System.out.println("1.Google Pay\n ");
		System.out.println("2.Cash on Delivery ");
		int payment = sc.nextInt();
		switch(payment)
		{
		case 1:
		{
		System.out.println("\nEnter the Bill Amount:\n ");
		int sum = sc.nextInt();
		if(sum==bill)
		{
			System.out.println("\nPlease wait The OTP Will be Generated....\n");
			Thread.sleep(2000);
			double otp = 9999*Math.random()+9999;
			int check = (int)otp;
			System.out.println(check);
			Thread.sleep(500);
			System.out.println("\nEnter the OTP: \n");
			int enter = sc.nextInt();
			if(enter==check)
			{
				System.out.println("\nProcessing Please wait....\n");
				Thread.sleep(1000);
				System.out.println("ORDERED SUCCESSFULLY\n");
				System.out.println("YOUR ORDER WILL REACH YOUR HOME WITHIN 30 MINS\n");
				System.out.println("THANK YOU VISIT AGAIN\n");
			}
			else if(enter!=check)
			{
				System.out.println("\nPlease Enter the OTP Correctly\n");
				System.out.println("YOUR OTP WAS WRONG!!!");
				System.out.println("\nTry again....");
			}
			}
			else if(sum!=bill)
			{
				System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
				System.out.println("Please Enter the Correct Amount \n ");
				System.out.println("Try again....");
			}
			break;
		}
		case 2:
			{
			System.out.println("\nCash on Delivery\n");
			System.out.println("\nEnter the Bill Amount:\n ");
			int sum = sc.nextInt();
			if(sum!=bill)
			{
			System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
			System.out.println("Please Enter the Correct Amount \n ");
			System.out.println("Try again....");
			break;
			}
			System.out.println("\nTo Place the Order Enter your Address");
			String place = sc.next();
			Thread.sleep(1000);
			System.out.println("\nIs This is your Address right: " + place);
			System.out.println("\nShall we Place the Order? ");
			Thread.sleep(1000);
			String hawk = sc.next();
			if(hawk.equals("yes"))
				{
				System.out.println("\nYour Order has Placed Successfully\n ");
				System.out.println("Will reach Your home within 30MINS\n ");
				}
				break;
			}
		}
		}
		break;
		}
		break;
		}
		
		case 4:
		{
		System.out.println("Thankyou for selecting Noha "+(char)5+(char)5+"\n");
		System.out.println("\n1.Lobster Frittata \n2.Wagyu Steak \n3.Westin Hotel Bagel \n4.Samundari Khazana \n");
		int food = sc.nextInt();
		switch (food)
		{
		case 1:
		{
		int price = 500;
		System.out.println("\nPlease Enter the Quantity");
		int qty = sc.nextInt();
		double bill = qty*price;
		System.out.println("\nYour Total Bill is "+bill+"\n");
		System.out.println("\nEnter the Way of Payment you would like to go:\n ");
		System.out.println("1.Google Pay\n ");
		System.out.println("2.Cash on Delivery ");
		int payment = sc.nextInt();
		switch(payment)
		{
		case 1:
		{
		System.out.println("\nEnter the Bill Amount:\n ");
		int sum = sc.nextInt();
		if(sum==bill)
		{
			System.out.println("\nPlease wait The OTP Will be Generated....\n");
			Thread.sleep(2000);
			double otp = 9999*Math.random()+9999;
			int check = (int)otp;
			System.out.println(check);
			Thread.sleep(500);
			System.out.println("\nEnter the OTP: \n");
			int enter = sc.nextInt();
			if(enter==check)
			{
				System.out.println("\nProcessing Please wait....\n");
				Thread.sleep(1000);
				System.out.println("ORDERED SUCCESSFULLY\n");
				System.out.println("YOUR ORDER WILL REACH YOUR HOME WITHIN 30 MINS\n");
				System.out.println("THANK YOU VISIT AGAIN\n");
			}
			else if(enter!=check)
			{
				System.out.println("\nPlease Enter the OTP Correctly\n");
				System.out.println("YOUR OTP WAS WRONG!!!");
				System.out.println("\nTry again....");
			}
			}
			else if(sum!=bill)
			{
				System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
				System.out.println("Please Enter the Correct Amount \n ");
				System.out.println("Try again....");
			}
			break;
		}
		case 2:
			{
			System.out.println("\nCash on Delivery\n");
			System.out.println("\nEnter the Bill Amount:\n ");
			int sum = sc.nextInt();
			if(sum!=bill)
			{
			System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
			System.out.println("Please Enter the Correct Amount \n ");
			System.out.println("Try again....");
			break;
			}
			System.out.println("\nTo Place the Order Enter your Address");
			String place = sc.next();
			Thread.sleep(1000);
			System.out.println("\nIs This is your Address right: " + place);
			System.out.println("\nShall we Place the Order? ");
			Thread.sleep(1000);
			String hawk = sc.next();
			if(hawk.equals("yes"))
				{
				System.out.println("\nYour Order has Placed Successfully\n ");
				System.out.println("Will reach Your home within 30MINS\n ");
				}
				break;
			}
		}
		break;
		}
		case 2:
		{
		int price_2 = 900;
		System.out.println("\nPlease Enter the Quantity");
		int qty = sc.nextInt();
		double bill = qty*price_2;
		System.out.println("\nYour Total Bill is "+bill+"\n");
		System.out.println("\nEnter the Way of Payment you would like to go:\n ");
		System.out.println("1.Google Pay\n ");
		System.out.println("2.Cash on Delivery ");
		int payment = sc.nextInt();
		switch(payment)
		{
		case 1:
		{
		System.out.println("\nEnter the Bill Amount:\n ");
		int sum = sc.nextInt();
		if(sum==bill)
		{
			System.out.println("\nPlease wait The OTP Will be Generated....\n");
			Thread.sleep(2000);
			double otp = 9999*Math.random()+9999;
			int check = (int)otp;
			System.out.println(check);
			Thread.sleep(500);
			System.out.println("\nEnter the OTP: \n");
			int enter = sc.nextInt();
			if(enter==check)
			{
				System.out.println("\nProcessing Please wait....\n");
				Thread.sleep(1000);
				System.out.println("ORDERED SUCCESSFULLY\n");
				System.out.println("YOUR ORDER WILL REACH YOUR HOME WITHIN 30 MINS\n");
				System.out.println("THANK YOU VISIT AGAIN\n");
			}
			else if(enter!=check)
			{
				System.out.println("\nPlease Enter the OTP Correctly\n");
				System.out.println("YOUR OTP WAS WRONG!!!");
				System.out.println("\nTry again....");
			}
			}
			else if(sum!=bill)
			{
				System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
				System.out.println("Please Enter the Correct Amount \n ");
				System.out.println("Try again....");
			}
			break;
		}
		case 2:
			{
			System.out.println("\nCash on Delivery\n");
			System.out.println("\nEnter the Bill Amount:\n ");
			int sum = sc.nextInt();
			if(sum!=bill)
			{
			System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
			System.out.println("Please Enter the Correct Amount \n ");
			System.out.println("Try again....");
			break;
			}
			System.out.println("\nTo Place the Order Enter your Address");
			String place = sc.next();
			Thread.sleep(1000);
			System.out.println("\nIs This is your Address right: " + place);
			System.out.println("\nShall we Place the Order? ");
			Thread.sleep(1000);
			String hawk = sc.next();
			if(hawk.equals("yes"))
				{
				System.out.println("\nYour Order has Placed Successfully\n ");
				System.out.println("Will reach Your home within 30MINS\n ");
				}
				break;
			}
		}
		break;
		}
		case 3:
		{
		int price_3 = 1010;
		System.out.println("\nPlease Enter the Quantity");
		int qty = sc.nextInt();
		double bill = qty*price_3;
		System.out.println("\nYour Total Bill is "+bill+"\n");
		System.out.println("\nEnter the Way of Payment you would like to go:\n ");
		System.out.println("1.Google Pay\n ");
		System.out.println("2.Cash on Delivery ");
		int payment = sc.nextInt();
		switch(payment)
		{
		case 1:
		{
		System.out.println("\nEnter the Bill Amount:\n ");
		int sum = sc.nextInt();
		if(sum==bill)
		{
			System.out.println("\nPlease wait The OTP Will be Generated....\n");
			Thread.sleep(2000);
			double otp = 9999*Math.random()+9999;
			int check = (int)otp;
			System.out.println(check);
			Thread.sleep(500);
			System.out.println("\nEnter the OTP: \n");
			int enter = sc.nextInt();
			if(enter==check)
			{
				System.out.println("\nProcessing Please wait....\n");
				Thread.sleep(1000);
				System.out.println("ORDERED SUCCESSFULLY\n");
				System.out.println("YOUR ORDER WILL REACH YOUR HOME WITHIN 30 MINS\n");
				System.out.println("THANK YOU VISIT AGAIN\n");
			}
			else if(enter!=check)
			{
				System.out.println("\nPlease Enter the OTP Correctly\n");
				System.out.println("YOUR OTP WAS WRONG!!!");
				System.out.println("\nTry again....");
			}
			}
			else if(sum!=bill)
			{
				System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
				System.out.println("Please Enter the Correct Amount \n ");
				System.out.println("Try again....");
			}
			break;
		}
		case 2:
			{
			System.out.println("\nCash on Delivery\n");
			System.out.println("\nEnter the Bill Amount:\n ");
			int sum = sc.nextInt();
			if(sum!=bill)
			{
			System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
			System.out.println("Please Enter the Correct Amount \n ");
			System.out.println("Try again....");
			break;
			}
			System.out.println("\nTo Place the Order Enter your Address");
			String place = sc.next();
			Thread.sleep(1000);
			System.out.println("\nIs This is your Address right: " + place);
			System.out.println("\nShall we Place the Order? ");
			Thread.sleep(1000);
			String hawk = sc.next();
			if(hawk.equals("yes"))
				{
				System.out.println("\nYour Order has Placed Successfully\n ");
				System.out.println("Will reach Your home within 30MINS\n ");
				}
				break;
			}
		}
		break;
		}
		case 4:
		{
		int price_4 = 2000;
		System.out.println("\nPlease Enter the Quantity");
		int qty = sc.nextInt();
		double bill = qty*price_4;
		System.out.println("\nYour Total Bill is "+bill+"\n");
		System.out.println("\nEnter the Way of Payment you would like to go:\n ");
		System.out.println("1.Google Pay\n ");
		System.out.println("2.Cash on Delivery ");
		int payment = sc.nextInt();
		switch(payment)
		{
		case 1:
		{
		System.out.println("\nEnter the Bill Amount:\n ");
		int sum = sc.nextInt();
		if(sum==bill)
		{
			System.out.println("\nPlease wait The OTP Will be Generated....\n");
			Thread.sleep(2000);
			double otp = 9999*Math.random()+9999;
			int check = (int)otp;
			System.out.println(check);
			Thread.sleep(500);
			System.out.println("\nEnter the OTP: \n");
			int enter = sc.nextInt();
			if(enter==check)
			{
				System.out.println("\nProcessing Please wait....\n");
				Thread.sleep(1000);
				System.out.println("ORDERED SUCCESSFULLY\n");
				System.out.println("YOUR ORDER WILL REACH YOUR HOME WITHIN 30 MINS\n");
				System.out.println("THANK YOU VISIT AGAIN\n");
			}
			else if(enter!=check)
			{
				System.out.println("\nPlease Enter the OTP Correctly\n");
				System.out.println("YOUR OTP WAS WRONG!!!");
				System.out.println("\nTry again....");
			}
			}
			else if(sum!=bill)
			{
				System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
				System.out.println("Please Enter the Correct Amount \n ");
				System.out.println("Try again....");
			}
			break;
		}
		case 2:
			{
			System.out.println("\nCash on Delivery\n");
			System.out.println("\nEnter the Bill Amount:\n ");
			int sum = sc.nextInt();
			if(sum!=bill)
			{
			System.out.println("\nTHE AMOUNT YOU ENTERED WAS WRONG \n ");
			System.out.println("Please Enter the Correct Amount \n ");
			System.out.println("Try again....");
			break;
			}
			System.out.println("\nTo Place the Order Enter your Address");
			String place = sc.next();
			Thread.sleep(1000);
			System.out.println("\nIs This is your Address right: " + place);
			System.out.println("\nShall we Place the Order? ");
			Thread.sleep(1000);
			String hawk = sc.next();
			if(hawk.equals("yes"))
				{
				System.out.println("\nYour Order has Placed Successfully\n ");
				System.out.println("Will reach Your home within 30MINS\n ");
				}
				break;
			}
		}
		}
		break;
		}
		break;
		}

		case 5:
		{
		Thread.sleep(1000);
		System.out.println("You are Exit Visit Again!");
		break;
		}
		}
	}
}

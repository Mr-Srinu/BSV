import java.util.Calendar;
import java.util.Scanner;
import java.util.*;

class Main
{


  public static void main (String[]args)
  {

    Scanner sc = new Scanner (System.in);

    Calendar cal = Calendar.getInstance ();
    String S;
    int a;
    String msg = "Exiting.....";



      System.out.println ("    This is a random code genrator     ");
      System.out.println ("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.println ();
      System.out.println ("        MENU       ");
      System.out.println ("====================");
      System.out.println ("1. Random");
      System.out.println ("2. Transaction");
      System.out.println ("3. Referal");
      System.out.println ("4. Exit");
      System.out.println ("=====================");
      System.out.println ();




    do
      {
	System.out.print ("Enter what type of code you want? ");
	System.out.println ();
	a = sc.nextInt ();
	Random r = new Random ();

	String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	switch (a)
	  {
	  case 1:
	    System.out.printf ("your Random code is ");
	    System.out.printf ("%tQ", cal);


	    for (int i = 0; i < 1; i++)
	      {
		System.out.print (alphabet.
				  charAt (r.nextInt (alphabet.length ())));
	      }

	    System.out.printf ("%tS", cal);
	    System.out.println ();
	    System.out.println ();
	    break;

	  case 2:
	    System.out.printf ("your Transaction code is ");
	    System.out.printf ("%tQ", cal);


	    for (int i = 0; i < 1; i++)
	      {
		System.out.print (alphabet.
				  charAt (r.nextInt (alphabet.length ())));
	      }

	    System.out.printf ("%tS", cal);
	    System.out.println ();
	    System.out.println ();

	    break;

	  case 3:
	    System.out.printf ("your Referal code is ");
	    System.out.printf ("%tQ", cal);


	    for (int i = 0; i < 1; i++)
	      {
		System.out.print (alphabet.
				  charAt (r.nextInt (alphabet.length ())));
	      }

	    System.out.printf ("%tS", cal);
	    System.out.println ();
	    System.out.println ();
	    break;
	  case 4:
	    System.out.println ();
	  for (char c:msg.toCharArray ())
	      {
		System.out.print (c);

		try
		{
		  Thread.sleep (500);
		} catch (InterruptedException e)
		{
		}

	      }
	    break;
	  }
	if (a < 1 || a > 4)
	  {
	    System.out.println ("Invalid Choice");
	  }

      }
    while (a <= 3);



  }

}

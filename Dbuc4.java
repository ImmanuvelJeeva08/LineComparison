/**
  * Calculating length of the two lines
  * Check the Lines are Equal or not
  * Check two lines are greater or lesser then when compare to each other
  */

import java.util.Scanner;
class Dbuc4
{
	// Calculate Length of two lines

	static void checkLine(int x1, int y1, int x2, int y2, int a1, int b1, int a2, int b2) {
	
		 double dis1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

                 System.out.println("Length between "+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis1);

                 double dis2=Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));

                 System.out.println("Length between "+"("+a1+","+b1+"),"+"("+a2+","+b2+")===>"+dis2);

                 if (dis1 > dis2) // check Line1 is greater
                 {
                        System.out.println("Line1 Greater than Line2");
                 }
                 else if(dis1 < dis2) // check Line2 is greater
		 {
                        System.out.println("Line2 Greater than Line1 ");
 		 }
		 else   // otherwise print two lines are equal

			System.out.println("Two Lines are Equals");


 	}	
        public static void main(String arg[])

        {
		// Get input of two lines get from user

                 int x1,x2,y1,y2;

                 Scanner sc=new Scanner(System.in);

                 System.out.println("enter x1 point");

                 x1=sc.nextInt();

                 System.out.println("enter y1 point");

                 y1=sc.nextInt();

                 System.out.println("enter x2point");

                 x2=sc.nextInt();

                 System.out.println("enter y2 point");

                 y2=sc.nextInt();

                 int a1,a2,b1,b2;

                 System.out.println("enter a1 point");

                 a1=sc.nextInt();

                 System.out.println("enter b1 point");

                 b1=sc.nextInt();

                 System.out.println("enter a2point");
            
		 a2=sc.nextInt();

                 System.out.println("enter b2 point");

                 b2=sc.nextInt();

		// Passing line points as a argument to the method
		
		 checkLine(x1,y1,x2,y2,a1,b1,a2,b2);
        }

}

                 

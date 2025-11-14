package project_Sopping_Cart;
import java.util.Scanner;
public class Shopping_Cart{
	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
     //cart items
	//add to cart
	//buy items 
		//boolean isShopping=true;
		int  choice;
//	while(isShopping)  {
			 System.out.println("\n***Wellcome to store***\n");
	 System.out.println("1.Shirts");
	 System.out.println("2.Shoos");
	 System.out.println("3.Electronics");
	 System.out.println("4.Exit");
	 
	System.out.print("\nEnter your choice :");
	 choice=scan.nextInt();
 
	switch(choice) {
	 case 1 -> Shirts.shirts();
	 case 2 -> Shoos.shoos();
	 case 3 -> Electronics.electronics();
	 case 4 -> exit();//isShopping=false;
	 default ->System.out.println("Invalid choice");
	 }
	
}
	//	 scan.close();
		 	
	
	static void exit() {
		System.out.println("Closed");
	}

}

		
package project5;

import java.util.Scanner;

public class Customerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String name, city;
        int id;
        System.out.println("enter customer id");
		id=sc.nextInt();
        sc.nextLine();
        System.out.println("enter name");
        name=sc.nextLine(); 
        System.out.println("enter city");
        city=sc.nextLine(); 
        Customer c=new Customer();
		c.setCustomerId(id); 
		c.setCustomerName (name);
        System.out.println(c);
	}

}

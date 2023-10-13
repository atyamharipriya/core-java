package com.tns.exceptions;

public class NestedTry 
  {
	public static void check() 
	{
	String str="TNS";
	int slength=str.length();
	System.out.println("the length  is"+slength);
	String  anotherString="hello";
	int y=6;
	try 
    {
		int z=y/0;
	
		try {
			System.out.println(str.charAt(y));
		    }
		
		catch( StringIndexOutOfBoundsException ex)
		{
			System.out.println("IndexOutOfBound"+ex.getMessage());
		
	    }
    }
		catch(ArithmeticException  ex)
		{
			System.out.println("Arithmetic exception"+ex.getMessage());
			
        }
    }	
}

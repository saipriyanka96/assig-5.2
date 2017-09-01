package binarysearch;
////Package is a grouping of related types providing access protection and name 
//space management
//binary search is package name
import java.util.Scanner;
//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//using it's name. It aLLows you to specify classes from other packages that can be referenced without qualify them with their package.
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utility classes
//Scanner is a simple text scanner which can parse primitive types ans string using regular expressions

public class Binarysearch {
//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class
//binary search is also called as binary chop is search algorithm that finds the position of target value within the sorted array
	public static void main(String[] args) {
//Java Program processing starts from the main() method which is a mandatory part of every program 		
//static used to prepare a field,method or inner classes as a class field.
//void is used to define the return type of the method
//String[] args is actually an array of java.lang.String type and it's name is args here
//String is predefined class name 
//args is name of the array
			
		// TODO Auto-generated method stub
		int c,first,last,middle,n,search,array[];
//first is first element of an array
//last is the last element of an array
//middle is the middle element of an array
//n is no.of elements in arrays
		Scanner in=new Scanner(System.in);
		//to scan values which we initialize

		System.out.println("Enter number of elements:");
		//System is a final class in java.lang package
		//out is a static member field of system class and it's type PrintStream
			//println is a method of PrintStream class and it means print in next line
		//Inside the brackets is value which to be printed		

		n=in.nextInt();
		//scans next token of the input as int
		array=new int[n];
//declaring the values to arrray
		System.out.println("Enter"+n+"integers");
//here we enter integers
		for (c=0;c<n;c++)
			array[c]=in.nextInt();
		System.out.println("Enter value to find");
		search=in.nextInt();
		
		first=0;
		last=n-1;
		middle=(first+last)/2;
		
		while(first<=last)
		{
			if(array[middle]<search)
				first=middle+1;
			else if(array[middle]==search)
			{
				System.out.println(search+"found at location"+(middle+1)+".");
				break;		
			}
			else
				last=middle-1;
			middle=(first+last)/2;
		}
		if(first>last)
			System.out.println(search+"is not present in list.\n");
	}
//binary search comparing the middle element of the array with the target value.
//If the target value matches the middle element,its position in the array is returned
//If the target value is less than or greater than the middle element, the search continues 
//in the lower or upper half of the array respectively ,eliminating the other half from consideration
//Given an array A of n elements with values 
//this will take worst case option.position of searched values,if it presents in the array or -1
//if it is absent
}
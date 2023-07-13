package org.emp;
import  java.util.Scanner;
public class EmployeeInfo {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Id");
		Short nextShort=sc.nextShort();
		System.out.println("Student Id is :" +nextShort);
		System.out.println("Enter Student Name");
		String name=sc.next();
		System.out.println("Student Name is :" +name);
		System.out.println("Enter Mark1");
		Byte nextByte=sc.nextByte();
		System.out.println("Mark1 is :" +nextByte);
		System.out.println("Enter Mark2");
		Byte nextByte1=sc.nextByte();
		System.out.println("Mark2 is :" +nextByte1);
		System.out.println("Enter Mark3");
		Byte nextByte11=sc.nextByte();
		System.out.println("Mark3 is :" +nextByte11);
		System.out.println("Enter Mark4");
		Byte nextByte111=sc.nextByte();
		System.out.println("Mark4 is :" +nextByte111);
		System.out.println("Enter Mark5");
		Byte nextByte1111=sc.nextByte();
		System.out.println("Mark5 is :" +nextByte1111);
	}
}

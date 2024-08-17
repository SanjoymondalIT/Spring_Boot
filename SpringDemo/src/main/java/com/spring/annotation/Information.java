package com.spring.annotation;

public class Information extends Message {
	@Override
		public void display()
		{
		System.out.println("ITER SAAT 3");	
		}
		

	public static void main(String [] args)
	{
		Information i1= new Information();
		i1.display();
		
		//Message m1= new Message();
		//m1.display();
	
	}
	}

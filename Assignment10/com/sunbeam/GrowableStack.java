package com.sunbeam;

import java.util.Arrays;

public class GrowableStack implements Stack
{
	private Employee[]arr;
	private int top;
	public GrowableStack()
	{
		arr=new Employee[STACK_SIZE];
		top=-1;
	}

	@Override
	public void push(Employee e) 
	{
		if(top==arr.length-1)
		{
			arr=Arrays.copyOf(arr, arr.length*2);
			System.out.println("Growable size of array"+arr.length);
		}
		arr[++top]=e;
		System.out.println("Pushed="+e);	
	}

	@Override
	public Employee pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is Empty");
			return null;
		}
		else
		{
			return arr[top--];
		}
		
	}
	

}

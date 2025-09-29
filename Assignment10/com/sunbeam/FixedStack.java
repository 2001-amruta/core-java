package com.sunbeam;

public class FixedStack implements Stack
{
	private Employee[]arr;
	private int top;
	

	

	public FixedStack()
	{
		int STACK_SIZE = 5;
		arr=new Employee[STACK_SIZE];
		top=-1;
	}

	@Override
	public void push(Employee e) 
	{
		if(top==arr.length-1)
		{
			System.out.println("Stack is full");
			
		}
		else
		{
			arr[++top]=e;
			System.out.println("push element="+e);
		}
		
	}

	@Override
	public Employee pop() {
		if(top==-1)
		{
			System.out.println("Stack is Full");
			return null;
		}
		else 
		{
			return arr[top--];
		}
		
	}
	

}

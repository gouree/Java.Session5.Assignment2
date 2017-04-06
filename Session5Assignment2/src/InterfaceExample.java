
/*
 * Create an interface Stack in package myPack with following methods
Methods:
• void push(int I)
• int pop()
Create two sub classes inheriting the Stack interface.
class FixedStack that can accept a fixed numbers of integers. The size of the Stack will be specified
in the constructor. If the number of integers exceed the size, “Stack overflow” message should be
displayed.
class VariableStack that can accept numbers more than its size. The size of the Stack will be
specified in the constructor. If the number of integers exceed the size, the stack should
automatically grow to accommodate the new element.
 */


public class InterfaceExample
{
	public static void main(String args[])
	{
		Stack f= new FixedStack();    //creating object of FixedStack
		VariableStack v= new VariableStack();    //creating object of VariableStack
		int val;
		
		System.out.println("Fixed stack operations");
		System.out.println("***********************");
		
		
		//push elements in fixedstack
		System.out.println("Push Operations");
		System.out.println("****************");
		f.push(10);
		f.push(20);
		f.push(30);
		f.push(40);
		
		
		//pop elements from fixedstack
		System.out.println("Pop Operations");
		System.out.println("****************");
		val=f.pop();
		System.out.println("popped element = "+val);
		val=f.pop();
		System.out.println("popped element = "+val);
		val=f.pop();
		System.out.println("popped element = "+val);
		val=f.pop();
		System.out.println("popped element = "+val);
		
		
		System.out.println("Variable stack operations");
		System.out.println("***********************");
		
		
		//push elements in variablestack
		System.out.println("Push Operations");
		System.out.println("****************");
		v.push(10);
		v.push(20);
		v.push(30);
		v.push(40);
				
		
		//pop elements from variablestack
		System.out.println("Pop Operations");
		System.out.println("****************");
		val=f.pop();
		System.out.println("popped element = "+val);
		val=f.pop();
		System.out.println("popped element = "+val);
		val=f.pop();
		System.out.println("popped element = "+val);
		val=f.pop();
		System.out.println("popped element = "+val);
		val=f.pop();
		System.out.println("popped element = "+val);
		
	}
}


//create interface stack
interface Stack 
{
	
	 public void push(int i);
	
	 public int pop();
	
}

//fixedstack implements the interface stack
class FixedStack implements Stack
{
	 
		int s[]=new int[20];  //creating an array for stack

		int top=0;	//top pointing to the index of topmost element
		int size;	//size specifies size of stack
	 
		FixedStack()
		{
			size =3;		//stack size is initialized to 3
		}	
	
	
		//method to push elements in stack
		public void push(int i)
		{
		
			if(top==size)
			{
				System.out.println("Stack overflow!!!");
			}
			else
			{
				top++;
				s[top]=i;
				System.out.println();
				System.out.println("value of stack---->");
				System.out.println();
				for(int j=1;j<=top;j++)
				{
						System.out.print("   "+s[j]+"   ");
				}
			}
		}
	
		//method to pop elements from stack
		public int pop()
		{
			if(top==0)
			{
				System.out.println(" Stack underflow");
				return(0);
			}
			else
			{
				int val=s[top];
				top--;
				System.out.println();
				System.out.println("value of stack---->");
				System.out.println();
				for(int j=1;j<=top;j++)
				{
					System.out.print("   "+s[j]+"   ");
				}

				return(val);
			}
		}
	
}

class VariableStack implements Stack
{
		int s[]=new int[20];	// declaring an array for stack
		int top=0;				
		int size;
		
		VariableStack()
		{
				size =3;		//initializing size of the stack 
		}
	
		//	method to push elements in stack
	
		public void push(int i)
		{
		//if size exceeds the initialized size add extra memory to stack
			if(top==size)
			{
				System.out.println("Adding extra memory!!!");
				size++;
				top++;
				s[top]=i;
				System.out.println("value of stack---->");
				System.out.println();
				
				for(int j=1;j<=top;j++)
				{
					System.out.print("   "+s[j]+"   ");
				}
			}
			
			else
			{
				top++;
				s[top]=i;
				System.out.println();
				System.out.println("value of stack---->");
				System.out.println();
				
				for(int j=1;j<=top;j++)
				{
					System.out.print("   "+s[j]+"   ");
				}
			}
		}
	
	
		//method to pop elements from stack
			public int pop()
			{
				if(top==0)
				{
					System.out.println(" Stack underflow");
					return(0);
				}
				else
				{
					int val=s[top];
					top--;
					System.out.println();
					System.out.println("value of stack---->");
					System.out.println();
				
					for(int j=1;j<=top;j++)
					{
						System.out.print("   "+s[j]+"   ");
					}

					return(val);
				}
			}
	
}


package overloading;
import java.util.Scanner;
import java.util.Stack;

	public class Test
	{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack =new Stack<Integer>();
		while(sc.hasNext())
		{
			String a=sc.next();
			if(a.equals("+")||a.equals("*")||a.equals("-")||a.equals("/"))
			{
				int x=stack.pop();
				int y=stack.pop();
				if(a.equals("+"))
				{
					stack.push(x+y);
				}
				else if(a.equals("*"))
				{
					stack.push(x*y);
				}
				else if(a.equals("-"))
				{
					stack.push(x-y);
				}
				else 
				{
					stack.push(x/y);
				}
			}
			else
				{
					int k=Integer.parseInt(a);
					stack.push(k);
				}
			
		}
		System.out.println(stack);
	}
	}

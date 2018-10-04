import java.util.Scanner;

public class Solution1 {

	public static void main(String args[])
    {
   	 Scanner sc=new Scanner(System.in);
   	 System.out.println("Enter the Size of Array");
   	 int N=sc.nextInt();
   	 int a[]=new int[N];
   	 for(int i=0;i<N;i++)
   	 {
   		 a[i]=sc.nextInt();    	 
        }
   			int c=0;
   			for(int i=0;i<a.length;i++)
   			{
   				for(int j = i+1; j<a.length;j++)
   				{
   					if(a[i]>a[j])
   					{
   						int temp = a[i];
   						a[i]=a[j];
   						a[j]=temp;
   					}
   					
   				}
   				System.out.print(a[i]);
   			}
   			for(int i=0;i<a.length-1;i++)
   			{
   				
   				if(a[i]==a[i+1])
   					c++;
   			}
   			System.out.println();
   			System.out.println(c);
   		}

    }


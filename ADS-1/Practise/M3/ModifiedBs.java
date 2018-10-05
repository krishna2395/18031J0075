import java.util.Arrays;
import java.util.Scanner;
public class ModifiedBs {
		 public static void main(String[] args)
	    {
		 Scanner sc=new Scanner(System.in);
	   	 System.out.println("Enter the Size of Array");
	   	 int N=sc.nextInt();
	   	 int a[]=new int[N];
	   	System.out.println("Enter "+N+" elements");
	   	 for(int i=0;i<N;i++)
	   	 {
	   		 a[i]=sc.nextInt();    	 
	        }
	   	 Arrays.sort(a);
	   	System.out.println("Enter the Target value to search");
	   	int h=sc.nextInt();
	   	for(int i=0;i<a.length;i++)
	  	 {
	  		System.out.println(a[i]);     	 
	       }
	   	BinarySearch d=new BinarySearch();
	   	int k=d.binarySearch(a, 0,N-1, h);
	   	 System.out.println(k);
	    } 
	}
	class BinarySearch 
	{ 
	    int binarySearch(int a[], int l, int r, int x) 
	    { 
	        if (r>=l) 
	        { 
	            int mid = l + (r - l)/2; 
	   
	            if (a[mid] == x)
	            {
	            	while(a[mid-1]==x)
	            	{
	            		mid=mid-1;
	            		if(mid==0)
	            			return mid;
	            	}
	            	System.out.println("Smallest Index value equal to the target value is:" );
	               return mid; 
	            }
	  
	            if (a[mid] > x) 
	               return binarySearch(a, l, mid-1, x); 
	   
	            return binarySearch(a, mid+1, r, x); 
	        } 
	       
	        return -1; 
	    } 
	}


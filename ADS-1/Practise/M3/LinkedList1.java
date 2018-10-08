package overloading;
class Node
{
	int data;
	Node next;
	Node(int a)
	{
		data=a;
		next=null;
	}	
}

public class LinkedList1 
{
	Node Head;
	Node Tail;
	public void Insertlast(int d)
	{
		Node n=new Node(d);
		if(Head==null && Tail==null)
		{
			Head=n;
			Tail=n;
		}
		else
		{
			Tail.next=n;
			Tail=Tail.next;
		}
	}
	public void DeleteLast()
	{
		Node temp=Head;
		while(temp!=null)
		{
			if(temp.next.next==null)
			{
				temp.next=null;
			}
		}
		temp=temp.next;
	}
	public void Display()
	{
		Node temp=Head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.data;
		}
	}
	public static void main(String args[])
	{
		LinkedList1 b =new LinkedList1();
		b.Insertlast(10);
		b.Insertlast(25);
		b.Insertlast(30);
		b.Display();
		
	}
}

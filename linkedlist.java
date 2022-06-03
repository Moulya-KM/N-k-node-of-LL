// { 

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}



///////////////////////////////n/k th node of linked list
// { 
import java.util.*;

class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class LinkedList
{
    static Node head;
    
     public static void addToTheLast(Node node) 
	{
		if (head == null) 
		{
			head = node;
		} else 
		{
		   Node temp = head;
		   while (temp.next != null)
		   temp = temp.next;
		   temp.next = node;
		}
    }
    
     public static void main (String[] args) {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t-- > 0)
		 {
		     int n = sc.nextInt();
		     int a1 = sc.nextInt();
		     Node head = new Node(a1);
		     addToTheLast(head);
		     for(int i = 1; i < n; i++)
		     {
		         int a = sc.nextInt(); 
				 addToTheLast(new Node(a));
			 }
			 int k = sc.nextInt();
			GfG gfg = new GfG();
			System.out.println(gfg.nknode(head, k));
		     }
		 }
}// } Driver Code Ends


/*
class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class GfG
{
    public static int nknode(Node head, int k)
    {
       // add your code here
       int len=(int)Math.ceil(length(head)/(double)k);
      
       Node t=head;
       for(int i=1;i<len;i++){
           t=t.next;
       }
       
       return t.data;
    }
    
    static int length(Node head) {
        int l=0;
        Node t=head;
        
        if(t==null){
            return 0;
        }
        
        while(t.next != null) {
            t=t.next;
            l++;
        }
        return l+1;
       
    }
}

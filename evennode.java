//You are given the size of total nodes contained in a linked list. You have to create a linked list and print the count of nodes which have values divisible by 2.
//count only even number !!
import java.util.*;
class node
{
    int data;
    
    node next;
    node(int data)
    {
        this.data=data;
    }
}
public class Solution
{
    int count=0;
    node head;
    public void insertAtEnd(int data)
    {
    node n=new node(data);
   
    if(head==null)
    {
    head=n;
    }
    else
    {
        node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=n;
    }
}
    public void printm()
    {
        node temp=head;
        {
            while (temp!=null)
            {
                if(temp.data%2==0)
                {
                count++;
                }
                temp=temp.next;
               
            }
            System.out.println(count);
        }
    }

    public static void main(String args[])
    {
        Solution obj=new Solution();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        {
            for(int i=0;i<num;i++)
            {
                int number=sc.nextInt();
                obj.insertAtEnd(number);
            }
            obj.printm();
        }
    }
}
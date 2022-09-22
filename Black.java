
public class Node  
    { 
int data; 
Node next; 
Node(int d) {data = d; 
             next = null;} 
    } 



public static Node concatenate (Node head1, Node head2) //head1 points to head of list1, head2 points to head of list2
{
                Node temp=null;
                if (head1==NULL) //if the first linked list is empty
                                return (head2);
                if (head2==NULL) //if second linked list is empty
                                return (head1);

                temp=head1;       //place temporary pointer on the first node of the first linked list

                while (temp.next!=NULL) //move p to the last node
                                temp=temp.next;
                temp.next=head2;                           //address of the first node of the second linked list stored in the last node of the first linked list

                return (head1);
}


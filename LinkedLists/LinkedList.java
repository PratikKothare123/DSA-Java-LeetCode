package LinkedLists;

public class LinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static  Node head;
    public static  Node tail;
    public static int size;

    //Add First In LinkedList
    public void addFirst(int data){
        // Step:I Create New-Node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //Step-II newnode next = head
        newNode.next = head; //link 

        //Step-III head = newNode
        head = newNode;
    }

    //Add Last In LinkedList
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head ==null){
            head = tail = newNode;
            return ;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //Print LinkedList
    public void print(){
        if(head==null){
            System.out.println("LinkedList Is Empty!");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }

    //Add Node in Particular Index
    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i<idx-1){
            temp=temp.next;
            i++;
        }

        newNode.next=temp.next;
        temp.next = newNode;
    }


    //Remove Node From first of LinkedList
    public int removeFirst(){
        if(size==0){
            System.out.println("LinkedList Is Empty!");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;

        }
        int val = head.data;
        head = head.next;
         size--;
        return val;
    }

     //Remove Node From Last of LinkedList
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty!");
            return Integer.MIN_VALUE;
        }else if(size ==1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }

        //prev = i= size-2;
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data; //tail.data
        prev.next = null;
        tail=prev;
        size--;
        return val;

    }

    //Search in linkedlist -> Iterative Search
    public static int itrsearch(int key){
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data ==key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    //Recursive Search 

    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public  int recSearch(int key){
        return helper(head,key);
    }

    //Reverse LL, --> 3 variable, 4 step
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next; 

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr=next;
        }
        head = prev;
    }

    //Find & Remove Nth Node From End
    public void deleteNthFromEnd(int n){
        int sz = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }
        //Delete 1st from LL
        if(n==sz){
            head = head.next;  //removeirst();
            return;
        }
        //sz-n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }

    //Find middle  
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next!=null){
            slow=slow.next; //+1
            fast=fast.next.next;  //+2
        }
        return slow; //Slow is my mid Node
    }

    //Check LL Is Palindrome or Not
    public boolean checkPalindrome(){
        if(head ==null || head.next == null){
            return true;
        }
        //Step1: Find mid
        Node midNode = findMid(head);

        //Step2: Reverse 2nd Half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;    
        }
        Node right = prev; // right head
        Node left = head;


        //Step3: check left half == right half
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(1);
        // ll.add(2,2);
        // ll.print();
        // System.out.println("Size: "+ll.size);
        // ll.removeFirst();
        // ll.print();
        //  System.out.println("Size: "+ll.size);
        // ll.removeLast();
        // ll.print();

        // System.out.println(ll.itrsearch(3));
        // System.out.println(ll.itrsearch(10));

        // System.out.println(ll.recSearch(9));
        // System.out.println(ll.recSearch(10));

        // ll.reverse();
        // ll.print(); //4->3->9->2->1->

        // ll.deleteNthFromEnd(4);
        // ll.print();


        ll.addLast(1);
        ll.addLast(2);
         ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
        System.out.println(ll.checkPalindrome());
       


    }
}

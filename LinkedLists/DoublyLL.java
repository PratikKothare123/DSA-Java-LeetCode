package LinkedLists;

public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;
    
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //Add
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head=  newNode;
    }

    //Remove removeLast
    public int removeFirst(){
        if(head==null){
            System.out.println("DLL id empty!");
            return Integer.MIN_VALUE;
        }
        if(size ==1){
            int val = head.data;
            head=tail=null;
             size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
         size--;
        return val;
       
    }

    //Print
    public void printdll(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+ "<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //Remove
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.printdll();
        System.out.println("Size: "+size);

        dll.removeFirst();
        dll.printdll();

        System.out.println("Size: "+size);
        

    }
}

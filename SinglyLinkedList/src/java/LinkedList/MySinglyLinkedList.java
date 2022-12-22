package LinkedList;

public class MySinglyLinkedList {

    Node head;
    Node tail;
     int size;

     boolean isEmpty(){
         return head==null;
     }
     public void addFirst(int data){

         Node node = new Node(data);
         if(isEmpty()){
             head=tail=node;
         }
         else{
             node.next=head;
             head=node;
         }
         size++;
     }
     public void add(int data){
         Node node = new Node(data);
         if(isEmpty()){
             head=tail=node;
         }
         else{
             tail.next=node;
             tail = node;
            size++;
         }

     }

     public int indexOf(int value){
         int pos=0;
         if(isEmpty()) return  -1;
         Node node = head;
         while (node!=null) {
             if (node.id == value)
                 return pos;

             node = node.next;
             pos++;
         }
         return  -1;



     }

     public void removeNode(int value){

         if(isEmpty())
             System.out.println("List is empty");

         Node current = head;
         Node prev = head;
          while(current!=null){
            if(current.id==value) {
                // case1: remove first
                 if (current == head) {
                    head= head.next;
                    current.next=null;
                    return;
                 }
                 // case2: remove last
                else if(current== tail){
                    tail=prev;
                    prev.next=null;

                 }
                // remove from the middle
                else{
                    prev.next= current.next;
                    current.next= null;
                 }
                size--; // after the deletion

            }
            prev = current;
            current= current.next;

         }


     }

    void printNodes(){
        Node current=head;
        while(current!=null){
            if (current.next==null) System.out.println(current.id+"=> null");
            else {
                System.out.print(current.id+"=> ");
            }
            current=current.next;
        }
    }

}

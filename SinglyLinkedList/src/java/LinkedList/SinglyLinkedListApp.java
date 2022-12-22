package LinkedList;

import java.util.ArrayList;

public class SinglyLinkedListApp {
    public static void main(String[] args) {
        MySinglyLinkedList mylist1=new MySinglyLinkedList();

        mylist1.add(1);
        mylist1.add(3);
        mylist1.add(6);
        mylist1.add(7);

        mylist1.printNodes();
        //mylist1.removeNode(6);
        System.out.println( "the index of 6 is:"+ mylist1.indexOf(6));
        mylist1.printNodes();





    }
}
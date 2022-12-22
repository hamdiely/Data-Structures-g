package BinarySearchTreeImpl;

public class Main {
    public static void main(String[] args) {


        MyTree tree = new MyTree();
        tree.insert(25);
        tree.insert(15);
        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(22);
        tree.insert(12);
        tree.traverseInOrder();
        System.out.println();

        System.out.println("-------------");

        System.out.println(tree.get(15));
        System.out.println(tree.get(30));
        System.out.println(tree.get(100));

        System.out.println("--------------");

        System.out.println("the max value in the tree is: "+ tree.max());
        System.out.println("the min value in the tree is: "+ tree.min());


    }
}
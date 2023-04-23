package binaryTree;


public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree();
        tree.add(5);
        tree.add(3);
        tree.add(8);
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(10);
        tree.add(1);
        System.out.println(tree.getMin());
        System.out.println(tree.getMax());
        System.out.println(tree.descSequence());
    }
}
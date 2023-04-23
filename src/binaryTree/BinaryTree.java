package binaryTree;

import java.util.Stack;

public class BinaryTree <T extends Comparable> {
    public TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public void add(T node) {
        TreeNode<T> newNode = new TreeNode<>();
        newNode.setValue(node);

        if (this.root == null) {
            root = newNode;
        } else {
            TreeNode nextNode = root;
            TreeNode basicNode;
            while (nextNode != null) {
                basicNode = nextNode;
                if (node.compareTo(nextNode.getValue()) == 0) {
                    return;
                } else if (node.compareTo(nextNode.getValue()) < 0) {
                    nextNode = nextNode.getLeft();
                    if (nextNode == null) {
                        basicNode.setLeft(newNode);
                        return;
                    }
                } else {
                    nextNode = nextNode.getRight();
                    if (nextNode == null) {
                        basicNode.setRight(newNode);
                        return;
                    }
                }
            }
        }
    }


    public T getMin() {
        TreeNode<T> nextNumber = root;
        TreeNode<T> minNumber = nextNumber;
        while (nextNumber != null) {
            minNumber = nextNumber;
            nextNumber = nextNumber.getLeft();
        }
        return minNumber.getValue();
    }

    public T getMax() {
        TreeNode<T> nextNumber = root;
        TreeNode<T> maxNumber = nextNumber;
        while (nextNumber != null) {
            maxNumber = nextNumber;
            nextNumber = nextNumber.getRight();
        }
        return maxNumber.getValue();
    }

//    public String descSequence() {
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root);
//        String lineOfBinaryTree = "";
//        while (!stack.isEmpty()) {
//            TreeNode<T> node = stack.pop();
//            lineOfBinaryTree += node.getValue() + " ";
//
//            if (node.getRight() != null){
//                stack.push(node.getRight());
//            }
//
//            if (node.getLeft() != null){
//                stack.push(node.getLeft());
//            }
//        }
//        return lineOfBinaryTree;
//    }

    public String descSequence() {
        TreeNode<T> nextNode = root;
        String line = "";
        if (root != null) {
            if (nextNode.getLeft() == null && nextNode.getRight() == null) {
                System.out.println(nextNode.getValue());
            } else {
                if (nextNode.getLeft() != null) {
                    traversal(nextNode.getLeft());
                    System.out.print(nextNode.getValue() +  " ");
                }
                if (nextNode.getRight() != null){
                    traversal(nextNode.getRight());
                }
            }
        }
        return line;
    }

    public void traversal (TreeNode node) {
        if (node.getLeft() != null) {
            traversal(node.getLeft());
        }

        System.out.print(node.getValue() + " ");
        if (node.getRight() != null) {
            traversal(node.getRight());
        }
    }

}


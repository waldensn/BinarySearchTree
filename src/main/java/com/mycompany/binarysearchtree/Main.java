package com.mycompany.binarysearchtree;

//Tree diagram
//                 50
//
//         30             80
//
//      10   45         70   95
//
//     5    35  48    55    90  105
public class Main {
    public static void main(String[] args){
        //Node root = new Node(50);
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(80);
        tree.insert(10);
        tree.insert(45);
        tree.insert(70);
        tree.insert(95);
        tree.insert(5);
        tree.insert(35);
        tree.insert(48);
        tree.insert(55);
        tree.insert(90);
        tree.insert(105);
        
        System.out.println("Tree has a height of " + tree.getHeight() + ".");
        tree.insert(120);
        System.out.println("Tree has a height of " + tree.getHeight() + ".");
        tree.insert(4);
        tree.insert(3);
        System.out.println("Tree has a height of " + tree.getHeight() + ".");
//        System.out.println("Tree has " + tree.getNumberOfNodes() + " nodes.");
//        
//        System.out.println("Is 70 in the tree? " + (tree.contains(70) ? "Yes" : "No") );
//        System.out.println("Is 12 in the tree? " + (tree.contains(12) ? "Yes" : "No") );
//        System.out.println("Is 55 in the tree? " + (tree.contains(55) ? "Yes" : "No") );
//        System.out.println("Is 40 in the tree? " + (tree.contains(40) ? "Yes" : "No") );
//        System.out.println("Is 5 in the tree? " + (tree.contains(5) ? "Yes" : "No") );
//        System.out.println("Is 6 in the tree? " + (tree.contains(6) ? "Yes" : "No") );
//        System.out.println("Is 48 in the tree? " + (tree.contains(48) ? "Yes" : "No") );
//        System.out.println("Is 47 in the tree? " + (tree.contains(47) ? "Yes" : "No") );
//        
//        Node node45 = tree.search(45);
//        String leftNode45 = node45.getLeft() == null ? "empty" : node45.getLeft().getData().toString();
//        String rightNode45 = node45.getRight() == null ? "empty" : node45.getRight().getData().toString();
//        String parentNode45 = node45.getParent() == null ? "empty" : node45.getParent().getData().toString();
//        System.out.println("Node 45 left child: " + leftNode45 + " right child: " + rightNode45 + " parent: " + parentNode45);
//        
//        Node node70 = tree.search(70);
//        String leftNode70 = node70.getLeft() == null ? "empty" : node70.getLeft().getData().toString();
//        String rightNode70 = node70.getRight() == null ? "empty" : node70.getRight().getData().toString();
//        String parentNode70 = node70.getParent() == null ? "empty" : node70.getParent().getData().toString();
//        System.out.println("Node 70 left child: " + leftNode70 + " right child: " + rightNode70 + " parent: " + parentNode70);
//        
//        Node node105 = tree.search(105);
//        String leftNode105 = node105.getLeft() == null ? "empty" : node105.getLeft().getData().toString();
//        String rightNode105 = node105.getRight() == null ? "empty" : node105.getRight().getData().toString();
//        String parentNode105 = node105.getParent() == null ? "empty" : node105.getParent().getData().toString();
//        System.out.println("Node 105 left child: " + leftNode105 + " right child: " + rightNode105 + " parent: " + parentNode105);
//
//        tree.delete(80);
//        Node node90 = tree.search(90);
//        String leftNode90 = node90.getLeft() == null ? "empty" : node90.getLeft().getData().toString();
//        String rightNode90 = node90.getRight() == null ? "empty" : node90.getRight().getData().toString();
//        String parentNode90 = node90.getParent() == null ? "empty" : node90.getParent().getData().toString();
//        System.out.println("Node 90 left child: " + leftNode90 + " right child: " + rightNode90 + " parent: " + parentNode90);
//        
//        Node node95 = tree.search(95);
//        String leftNode95 = node95.getLeft() == null ? "empty" : node95.getLeft().getData().toString();
//        String rightNode95 = node95.getRight() == null ? "empty" : node95.getRight().getData().toString();
//        String parentNode95 = node95.getParent() == null ? "empty" : node95.getParent().getData().toString();
//        System.out.println("Node 95 left child: " + leftNode95 + " right child: " + rightNode95 + " parent: " + parentNode95);
        
        //Tree diagram
//                 50
//
//         30             90
//
//      10   45         70   95
//
//     5    35  48    55       105

        System.out.print("Inorder: ");
        tree.inOrder();
        System.out.println();
        System.out.print("Preorder: ");
        tree.preOrder();
        System.out.println();
        System.out.print("Postorder: ");
        tree.postOrder();
        System.out.println();
        System.out.print("Breadth first: ");
        tree.breadthFirst();
        System.out.println();
    }
}

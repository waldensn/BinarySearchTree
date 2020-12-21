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
        Node root = new Node(50);
        Tree tree = new Tree(root);
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
        
        System.out.println("Is 70 in the tree? " + (tree.search(70) ? "Yes" : "No") );
        System.out.println("Is 12 in the tree? " + (tree.search(12) ? "Yes" : "No") );
        System.out.println("Is 55 in the tree? " + (tree.search(55) ? "Yes" : "No") );
        System.out.println("Is 40 in the tree? " + (tree.search(40) ? "Yes" : "No") );
        System.out.println("Is 5 in the tree? " + (tree.search(5) ? "Yes" : "No") );
        System.out.println("Is 6 in the tree? " + (tree.search(6) ? "Yes" : "No") );
        System.out.println("Is 48 in the tree? " + (tree.search(48) ? "Yes" : "No") );
        System.out.println("Is 47 in the tree? " + (tree.search(47) ? "Yes" : "No") );
        
        System.out.print("Inorder: ");
        tree.inOrder(root);
        System.out.println();
        System.out.print("Preorder: ");
        tree.preOrder(root);
        System.out.println();
        System.out.print("Postorder: ");
        tree.postOrder(root);
        System.out.println();
        System.out.print("Breadth first: ");
        tree.breadthFirst(root);
        System.out.println();
    }
}

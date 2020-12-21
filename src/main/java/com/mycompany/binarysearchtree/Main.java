/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.binarysearchtree;

/**
 *
 * @author walde
 */

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

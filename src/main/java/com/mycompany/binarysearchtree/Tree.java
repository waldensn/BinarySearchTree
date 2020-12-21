/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author walde
 */
public class Tree {
    private Node root;
    
    public Tree(Node root){
        this.root = root;
    }
    
    public Node getRoot(){return this.root;}
    
    //print the tree
    @Override
    public String toString(){
        StringBuilder treeSb = new StringBuilder();
        
        return treeSb.toString();
    }
    
    public Node insert(int key){
        return this.insertRecursive(this.root, key);
    }
    
    public Node insertRecursive(Node<Integer> root, Integer key){
        if ( root == null ){
            return new Node(key);
        }
        
        if ( key < root.getData() ){
            root.setLeft(insertRecursive(root.getLeft(), key));
        }
        else if ( key > root.getData() ){
            root.setRight(insertRecursive(root.getRight(), key));
        }
        return root;
    }
    
    //delete
    
    //search
    
    //get number of levels
    
    //breadth first
//    public String breadthFirst(Node<Integer> root){
//        
//    }
    
    //in order (left root right)
    public void inOrder(Node root)  { 
        if (root == null) 
            return;
        
        //traverse left subtree recursively
        inOrder(root.getLeft()); 
   
        //root node
        System.out.print(root.getData() + " "); 
   
        //traverse right subtree recursively
        inOrder(root.getRight()); 
    } 
    
    //pre order (root left right)
    public void preOrder(Node root)  { 
        if (root == null) 
            return; 
        
        //root node
        System.out.print(root.getData() + " "); 
        
        //traverse left subtree recursively
        preOrder(root.getLeft());  
   
        //traverse right subtree recursively
        preOrder(root.getRight()); 
    } 
        
    //post order (left right root)
    public void postOrder(Node root)  { 
        if (root == null) 
            return;     
        
        //traverse left subtree recursively
        postOrder(root.getLeft());  
   
        //traverse right subtree recursively
        postOrder(root.getRight()); 
        
        //root node
        System.out.print(root.getData() + " "); 
    } 
    
    //first level, then second level, etc
    public void breadthFirst(Node root){
        Queue<Node> queue = new LinkedList();
        if (root == null) {return;}
        queue.add(root);
        
        //use a queue to list the nodes breadth first
        while (!queue.isEmpty()){
            Node n = queue.remove();
            System.out.print(n.getData() + " ");
            //if we have left node, add it to the end of the queue
            if ( n.getLeft() != null){
                queue.add(n.getLeft());
            }
            //if we have right node, add it to the end of the queue
            if ( n.getRight() != null){
                queue.add(n.getRight());
            }
        }
    }
    
    //balance tree
}

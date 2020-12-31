
package com.mycompany.binarysearchtree;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Tree {
    private Node<Integer> root;
    
    public Tree(){
        this.root = null;
    }
    
    public Tree(Node<Integer> root){
        this.root = root;
    }
    
    public Node<Integer> getRoot(){return this.root;}
    
    //print the tree
    @Override
    public String toString(){
        StringBuilder treeSb = new StringBuilder();
        
        return treeSb.toString();
    }
    
    //insert new node
    public void insert(int key){
        root = insertRecursive(this.root, null, key);
    }
    
    public Node<Integer> insertRecursive(Node<Integer> root, Node<Integer> parent, Integer key){
        if ( root == null ){
            return new Node(parent, key);
        }
        
        if ( key < root.getData() ){
            root.setLeft(insertRecursive(root.getLeft(), root, key));
        }
        else if ( key > root.getData() ){
            root.setRight(insertRecursive(root.getRight(), root, key));
        }
        return root;
    }
    
    //does tree contain a node
    public boolean contains(int key){
       Node<Integer> keyNode = this.searchRecursive(this.root, key);   
       if ( keyNode != null ){
           return true;
       }
       else {
           return false;
       }
    }
    
    //find and return node
    public Node<Integer> search(int key){
       return this.searchRecursive(this.root, key);   
    }
     
    public Node<Integer> searchRecursive(Node<Integer> root, Integer key){
        //base case is root null or key found
        if ( root == null || root.getData().equals(key) ){
            return root;
        }
        //if key less than root key, traverse left subtree
        if ( key < root.getData()){
            return searchRecursive(root.getLeft(), key);
        }
        //if key greater than root key, traverse right subtree
        return searchRecursive(root.getRight(), key);
    }
    
    //delete a node
    public void delete(int key){
        root = deleteRecursive(root, key);
    }
    
    public Node<Integer> deleteRecursive(Node<Integer> root, int key){
        if ( root == null ){
            return root;
        }
        //if key less than root key, traverse left subtree
        if ( key < root.getData() ){
            root.setLeft( deleteRecursive(root.getLeft(), key) );
        }
        //if key greater than root key, traverse right subtree
        else if ( key > root.getData() ){
            root.setRight( deleteRecursive(root.getRight(), key) );
        }
        //found node to delete
        else
        {
            //node to delete has zero or one child node
            if ( root.getLeft() == null ){
                if ( root.getRight() != null ){
                    root.getRight().setParent(root.getParent());
                }
                return root.getRight();
            }
            else if ( root.getRight() == null ){
                if ( root.getLeft() != null ){
                    root.getLeft().setParent(root.getParent());
                }
                return root.getLeft();
            }
            
            //node to delete has two children, so find the smallest node on the right subtree
            //replace the node to delete with that node, then delete the smallest node on the right subtree
            root.setData( getMinValue( root.getRight() ) );
            root.setRight( deleteRecursive(root.getRight(), root.getData()) );
        }
        
        return root;
    }
    
    //get smallest key from a tree
    public Integer getMinValue(Node<Integer> root){
        Integer minValue = root.getData();
        while ( root.getLeft() != null ){
            minValue = (Integer)root.getLeft().getData();
            root = root.getLeft();
        }
        return minValue;
    }
    
    //get number of nodes
    public int getNumberOfNodes(){
        Queue<Node<Integer>> queue = new LinkedList();
        int numNodes = 0;
        if (root == null) {return numNodes;}
        queue.add(root);
        
        //use a queue to list the nodes breadth first
        while (!queue.isEmpty()){
            Node<Integer> n = queue.remove();
            numNodes++;
            //if we have left node, add it to the end of the queue
            if ( n.getLeft() != null){
                queue.add(n.getLeft());
            }
            //if we have right node, add it to the end of the queue
            if ( n.getRight() != null){
                queue.add(n.getRight());
            }
        }
        
        return numNodes;
    }
   
    //get height of tree
    //height of empty tree is zero
    public int getHeight(){
        return this.getHeightRecursive(root);
    }
    
    public int getHeightRecursive(Node<Integer> root){
        if ( root == null ){
            return 0;
        }
        else {
            //get height of subtree
            int leftHeight = getHeightRecursive(root.getLeft());
            int rightHeight = getHeightRecursive(root.getRight());
            
            //return larger of the two heights
            if ( leftHeight > rightHeight ){
                return leftHeight + 1;
            }
            else {
                return rightHeight + 1;
            }
        }   
    }
    
    //in order (left root right)
    public void inOrder(){
        this.printInOrder(root);
    }
    
    public void printInOrder(Node<Integer> root)  { 
        if (root == null) 
            return;
        
        //traverse left subtree recursively
        printInOrder(root.getLeft()); 
   
        //root node
        System.out.print(root.getData() + " "); 
   
        //traverse right subtree recursively
        printInOrder(root.getRight()); 
    } 
    
    //pre order (root left right)
    public void preOrder(){
        this.printPreOrder(root);
    }
    
    public void printPreOrder(Node<Integer> root)  { 
        if (root == null) 
            return; 
        
        //root node
        System.out.print(root.getData() + " "); 
        
        //traverse left subtree recursively
        printPreOrder(root.getLeft());  
   
        //traverse right subtree recursively
        printPreOrder(root.getRight()); 
    } 
        
    //post order (left right root)
    public void postOrder(){
        this.printPostOrder(root);
    }
    
    public void printPostOrder(Node<Integer> root)  { 
        if (root == null) 
            return;     
        
        //traverse left subtree recursively
        printPostOrder(root.getLeft());  
   
        //traverse right subtree recursively
        printPostOrder(root.getRight()); 
        
        //root node
        System.out.print(root.getData() + " "); 
    } 
    
    //first level, then second level, etc
    public void breadthFirst(){
        Queue<Node> queue = new LinkedList();
        if (root == null) {return;}
        queue.add(root);
        
        //use a queue to list the nodes breadth first
        while (!queue.isEmpty()){
            Node<Integer> n = queue.remove();
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

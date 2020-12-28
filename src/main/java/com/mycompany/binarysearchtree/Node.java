package com.mycompany.binarysearchtree;

public class Node<T> {
    private T data;
    private Node parent;
    private Node left;
    private Node right;
    
    public Node(T data){
        this.data = data;
        this.parent = null;
        this.left = null;
        this.right = null;
    }
    
    public Node(Node parent, T data){
        this.data = data;
        this.parent = parent;
        this.left = null;
        this.right = null;
    }
    
    public T getData(){return this.data;}
    public Node getParent(){return this.parent;}
    public Node getLeft(){return this.left;}
    public Node getRight(){return this.right;}
    
    public void setData(T data){this.data = data;}
    public void setParent(Node parent){this.parent = parent;}
    public void setLeft(Node left){this.left = left;}
    public void setRight(Node right){this.right = right;}
}

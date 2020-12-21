package com.mycompany.binarysearchtree;

public class Node<T> {
    private T data;
    private Node left;
    private Node right;
    public Node(T data){
        this.data = data;
        left = null;
        right = null;
    }
    
    public T getData(){return this.data;}
    public Node getLeft(){return this.left;}
    public Node getRight(){return this.right;}
    
    public void setData(T data){this.data = data;}
    public void setLeft(Node left){this.left = left;}
    public void setRight(Node right){this.right = right;}
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bstlab;

/**
 *
 * @author INT203
 */
public class BSTnode {
    //This is basically the same one 
    //as the one that was made here before
    
    int data;
    BSTnode left;
    BSTnode right;
    
    public BSTnode()
    {
        data = 0;
        left = null;
        right = null;
    }
    public BSTnode(int data)
    {
        this.data = data;
    }
    public BSTnode(int data, BSTnode left, BSTnode right)
    {
        this.data = data; this.left = left; this.right = right;
    }
}

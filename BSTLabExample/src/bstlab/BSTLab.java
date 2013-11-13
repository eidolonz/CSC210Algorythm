/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bstlab;

/**
 *
 * @author INT203
 */
public class BSTLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OurBST tree = new OurBST();
        
        tree.insert(50);tree.insert(25);tree.insert(75);
        tree.insert(10);tree.insert(55);tree.insert(52);
        tree.insert(90);tree.delete(75);
        System.out.println(tree.root.data);
        System.out.println(tree.root.right.data);
        System.out.println(tree.root.left.data);
        System.out.println(tree.root.right.left.left.data);
        tree.insert(53);
        int a = tree.Height(tree.root);
        System.out.println("Tree height : "+ a);
    }

}

public class BSTNode{
  int data;
  BSTNode left;
  BSTNode right;
  
  public BSTNode(){
    this.data = 0;
    this.left = null;
    this.right = null;
  }
  
  public BSTNode(int newData){
    this.data = newData;
  }
  
  public BSTNode(int newData, BSTNode left, BSTNode right){
    this.data = newData;
    this.left = left;
    this.right = right;
  }
}
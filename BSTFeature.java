//Insert, Delete, and Height

public class BSTFeature{
  BSTNode root;  
  
  public BSTFeature(){
    root = null;
  }
  
  public void insert(int newData){
    if(root == null){
      root = new BSTNode(newData);
    }else{
      BSTNode backPointer, pointer;
      backPointer = pointer = root;
      while(pointer != null){
        backPointer = pointer;
        if(newData < pointer.data){
          pointer = pointer.left;
        }else{
          pointer = pointer.right;
        }
      }
      if(newData < backPointer.data){
        backPointer.left = new BSTNode(newData);
      }else{
        backPointer.right = new BSTNode(newData);
      }
    }  
  }
  
  BSTNode pointer, backPointer;
  public void delete(int data){
    backPointer = pointer = root;
    pointer = delete(pointer, data);
  }  
  public BSTNode delete(BSTNode node, int data){
    if(node == null){
      return null;
    }    
    backPointer = pointer;    
    if(data < node.data && node.left != null){
      node = delete(node.left, data);
    }else if(data > node.data && node.right != null){
      node = delete(node.right, data);
    }    
    return node;
  }
  public void swap(int x, int y){
    int temp = x;
    x = y;
    y = temp;    
  }
}
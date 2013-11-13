public class BSTLab{
  public static void main(String[] args){
    BSTFeature bf = new BSTFeature();
    
    bf.insert(5);
    bf.insert(2);
    bf.insert(8);
    bf.insert(4);
    bf.insert(1);
    bf.delete(2);
    
    //System.out.println(bf.root.left.right.data);
    //System.out.println(bf.root.left.data);
    System.out.println(bf.root.data);
    //System.out.println(bf.root.right.data);*/
  }
}
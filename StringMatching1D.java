public class StringMatching1D{
  public static void main(String[] args){
    char[] text = {'A','N','O','L','O','V','E','I','S','N','E','V','E','R','D','I','E'};
    char[] pattern = {'L','O','V','E','I','S','N','E','V','E','R','D','I','E'};
    boolean found = false;
    
    int i = 0;
    for(int j = 0; i < text.length && j < text.length; i++){
      if(pattern[j] == text[i]){
        j++;
        if(j >= pattern.length){
          found = true; break;
        }
      }else{
        j = 0;
      }
    }
    
    if(found == true){
      i++;
      System.out.println("Found at location: " + (i - (pattern.length-1)) + " to " + i);
    }else{
      System.out.println("Not Found!");
    }
    
  }
}
public class StringMatching2D{
  public static void main(String[] args){
    int row = 5; int col = 4;
    boolean found = false;
    
    char[][] text = new char[row][col];
    text[0][0] = 'A'; text[0][1] = 'W'; text[0][2] = 'L'; text[0][3] = 'W';
    text[1][0] = 'W'; text[1][1] = 'H'; text[1][2] = 'A'; text[1][3] = 'H';
    text[2][0] = 'L'; text[2][1] = 'A'; text[2][2] = 'V'; text[2][3] = 'A';
    text[3][0] = 'A'; text[3][1] = 'T'; text[3][2] = 'E'; text[3][3] = 'T';
    text[4][0] = 'W'; text[4][1] = 'H'; text[4][2] = 'A'; text[4][3] = 'T';
    
    char[] pattern = {'W','H','A','S'};
    
    for(int rText = 0, xPattern = 0; rText < row && xPattern < row; rText++){
      for(int cText = 0; cText < col && xPattern < col; cText++){
        if(pattern[xPattern] == text[rText][cText]){
          xPattern++;
          if(xPattern >= pattern.length){
            rText++; cText++;
            System.out.println("Found at location: r[" + rText + "][" + (cText - (xPattern -1)) + "] to c[" + rText + "][" + cText + "]");
            rText--; cText--;
            xPattern = 0;
            found = true;
          }
        }
      }
    } 
    for(int cText = 0, xPattern = 0; cText < col && xPattern < col; cText++){
      for(int rText = 0; rText < row && xPattern < row; rText++){
        if(pattern[xPattern] == text[rText][cText]){
          xPattern++;
          if(xPattern >= pattern.length){
            rText++; cText++;
            System.out.println("Found at location: r[" + (rText - (xPattern -1)) + "][" + cText  + "] to c[" + rText + "][" + cText + "]");
            rText--; cText--;
            xPattern = 0;
            found = true;
          }
        }
      }
    }
    
    if(!found){
      System.out.println("Not Found!");
    }
  }
}
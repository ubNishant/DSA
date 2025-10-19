 class Jagged {
    public static void main(String[] args) {
     
        int[][] jaggedArray = new int[5][];
        
       
        jaggedArray[0] = new int[3]; 
        jaggedArray[1] = new int[2]; 
        jaggedArray[2] = new int[6]; 
        jaggedArray[3] = new int[1]; 
        jaggedArray[4] = new int[4];
        
  
        
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
               
            }
        }
        
      
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.println(jaggedArray[i][j]);
            }
         System.out.println("");
        }
    }
}

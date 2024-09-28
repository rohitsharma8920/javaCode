public class number_prymide {
    public static void main(String[] args) {
        
      int   n = 5 ;

      for (int i = 1 ; i <= n ;i++){
        for (int j = 0 ; j <= n-i ; j++){
            System.out.print("  ");
        }
        int p = i;
        for (int k = 1 ; k < i + 1 ; k++){
            System.out.print(p+ " " );
            // p = p-1;
        }
        int q = 2;
        for(int k = 2 ; k < i + 1 ; k++){
            System.out.print(q + " ");
            q = q+1;
        }
        System.out.println();

      }
    }
    
}

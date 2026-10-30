public class ProjectEuler {
   
   public static int problem1() {
      int sum = 0;

      for (int i = 1; i < 1000; i++) {
         if (i % 3 == 0 || i % 5 == 0) {
            sum += i;
         }
      }
      return sum;
   }
   
   public static int problem2() {
      int limit = 4000000;
      int sum = 0;
        
      int term1 = 1;
      int term2 = 2;
        
      while (term2 <= limit) {
          if (term2 % 2 == 0) {
              sum += term2;
          }
            
            int nextTerm = term1 + term2;
            term1 = term2;
            term2 = nextTerm;
        }
      return sum;
   }
   
   public static void main(String[] args) {
      System.out.println("The answer to problem 1 is: " + problem1());
      System.out.println("The answer to problem 2 is: " + problem2());      
   }  
}
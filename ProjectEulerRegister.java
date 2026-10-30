public class ProjectEulerRegister {
   public static void main(String[] args) {
   
      long totalNum = 0l;
      
      for (int i = 1; i < 379000; i++) {
         long currentValue = i;
         long num = (long) Math.pow(currentValue, 2);
         
         if (num % 2 != 0) {
            totalNum += num;
         }
         
      }
      System.out.println("Total: " + totalNum);
   
   }
}
package Exercise;
public class Exercise11_RollDoubles {
    public static void main(String[] args) {
         int a = 0;
         int x,y;
         do{
             x=(int)(Math.random() * 6) + 1;
             y=(int)(Math.random() * 6)+ 1;
             a++;
             System.out.println("Roll " + a + ": " + x + " and " + y);
         }
         while(x!=y);
    System.out.println("Ban da gieo duoc doi "+a);
    }
}

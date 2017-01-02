

public class RedCircle implements DrawAPI {
   @Override
   public void drawCircle(int radius, int x, int y) {
      System.out.println("Drawing Circle["+this.getClass()+" radius: " + radius + ", x: " + x + ", " + y + "]");
   }
}
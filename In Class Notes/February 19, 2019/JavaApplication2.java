package javaapplication2;

public class JavaApplication2 {
  public static void main(String[] args) {
    /*
    System.out.println("Hellow, world");
    double x = 5;
    int y = 10;
    Integer otherY = 10;
    Integer z = y + otherY;
    String math = "5";
    Integer a = Integer.parseInt(math);

    Block f = null;
    System.out.println(f);

    Block b = new Block();
    b.x = 5;
    b.y = 0;
    b.z = 0;
    Block c = new Block();
    c.x = 10;
    c.y = 5;
    c.z = 0;
    int n = 5;
    int m = 5;
    int l = n + m;
    b.breakBlock();
    System.out.println("B = " + b.x + ", " + b.y + ", " + b.z);
    System.out.println("C = " + c.x + ", " + c.y + ", " + c.z);
    System.out.println("n + m = " + (n + m));
    System.out.println("Shape is " + Block.shape); */

    GrassBlock b = new GrassBlock(1,2,3);
    //Block c = new Block(true, 51);
    try {
      b.makeNoise();
    } catch (UnsupportedOperationException ex) {
      System.out.println("Someone's getting a bad grade")
    }
  }
}

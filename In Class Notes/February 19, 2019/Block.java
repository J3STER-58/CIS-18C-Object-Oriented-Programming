package javaapplication2;

public abstract class Block impliments audible, drawable {

  //public static String shape = "Square";
  public int x, y, z;
  public boolean n;

  public Block (boolean y, int n) {
    this.x = 0;
    this.y = 0;
    this.z = 0;
  }

  public void breakBlock() {
    // do something to break the block
  }
}

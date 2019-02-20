package javaapplication2;

public class GrassBlock extends Block {
  public GrassBlock(int x, int y, int z) {
    super(true, 314);
    this.x = x;
    this.y = y;
    this.z = z;
  }

  @Override
  public abstract void draw() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public abstract void makeNoise() {
    throw new UnsupportedOperationException("Not supported yet.");
  }
}

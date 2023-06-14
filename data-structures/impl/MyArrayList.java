public class MyArrayList<E> implements MyIList<E> {
  public static final int DEFAULT_SIZE = 8;

  private E[] data;
  private int currentSize;
  private int currentPostion;

  @SuppressWarnings("unchecked")
  public MyArrayList(int initialSize) {
    data = (E[]) (new Object[initialSize]);
    currentSize = currentPostion = 0;
  }

  public MyArrayList() {
    this(DEFAULT_SIZE);
  }

  @Override
  public int getCurrentPosition() {
    return currentPostion;
  }

  @Override
  public int getCurrentSize() {
    return currentSize;
  }

  @Override
  public E getValue() {
    if (currentPostion < currentSize) return data[currentPostion];
    return null;
  }

  @Override
  public final void clear() {
    currentSize = currentPostion = 0;
  }
}
public class MyArrayStack<E> implements MyIStack<E> {
  private static final int DEFAULT_INITIAL_CAPACITY = 8;
  
  private E[] data;
  private int length;
  private int capacity;

  public MyArrayStack() {
    this(DEFAULT_INITIAL_CAPACITY);
  }

  @SuppressWarnings("unchecked")
  public MyArrayStack(int initialCapacity) {
    capacity = initialCapacity;
    length = 0;
    data = (E[]) new Object[initialCapacity];
  }

  @Override
  public int getLength() {
    return length;
  }

  @Override
  public void push(E element) {
    if (length == capacity) increaseCapacity();
    data[length++] = element;
  }

  @Override
  public E pop() {
    if (length < 1) return null;
    return data[--length];
  }

  public void clear() {
    for (;length > 0; length--) pop();
  }

  @SuppressWarnings("unchecked")
  private void increaseCapacity() {
    capacity *= 2;
    E[] newData = (E[]) new Object[capacity];
    System.arraycopy(data, 0, newData, 0, length);
    data = newData;
  }
}
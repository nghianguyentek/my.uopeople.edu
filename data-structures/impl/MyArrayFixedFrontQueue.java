public class MyArrayFixedFrontQueue<E> implements MyIQueue<E> {
  private static final int DEFAULT_INITIAL_CAPACITY = 8;

  private int capacity;
  private E[] data;
  private int size;

  @SuppressWarnings("unchecked")
  public MyArrayFixedFrontQueue(int initialCapacity) {
    if (initialCapacity < 1) 
      throw new IllegalArgumentException("initialCapacity must be greater than 0");

    capacity = initialCapacity;
    data = (E[]) new Object[initialCapacity];
    size = 0;
  }

  public MyArrayFixedFrontQueue() {
    this(DEFAULT_INITIAL_CAPACITY);
  }

  @Override
  public void enqueue(E element) {
    if (size == capacity) increaseCapacity();

    for (int i = size; i > 0; i--) data[i] = data[i-1];

    data[0] = element;
    size++;
  }

  @Override
  public E dequeue() {
    return data[--size];
  }

  @SuppressWarnings("unchecked")
  private void increaseCapacity() {
    capacity *= 2;
    E[] newData = (E[]) new Object[capacity];
    System.arraycopy(data, 0, newData, 0, size);
    data = newData;
  }
}
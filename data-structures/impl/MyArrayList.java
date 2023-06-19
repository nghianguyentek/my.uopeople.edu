public class MyArrayList<E> implements MyIList<E> {
  private static final int DEFAULT_INITIAL_CAPACITY = 8;

  private E[] data;
  private int length;
  private int capacity;

  @SuppressWarnings("unchecked")
  public MyArrayList(int initialCapacity) {
    capacity = initialCapacity;
    data = (E[]) (new Object[initialCapacity]);
    length = 0;
  }

  public MyArrayList() {
    this(DEFAULT_INITIAL_CAPACITY);
  }

  @Override
  public int getLength() {
    return length;
  }

  @Override
  public E getElement(int index) {
    if (index < length) return data[index];
    throw new IndexOutOfBoundsException(index);
  }

  @Override
  public void add(E element) {
    if (length == capacity) increaseCapacity();
    data[length++] = element;
  }

  @Override
  public void insert(E element, int index) {
    if (length == capacity) increaseCapacity();

    shiftRight(index);
    length++;
    data[index] = element;
  }

  public E remove(int index) {
    if (index < 0 || index >= length) throw new IndexOutOfBoundsException(index);

    E tmp = data[index];
    while(index<length) data[index] = data[++index];
    length--;
    return tmp;
  }

  @SuppressWarnings("unchecked")
  private void increaseCapacity() {
    capacity *= 2;
    E[] newData = (E[]) new Object[capacity];
    System.arraycopy(data, 0, newData, 0, length);
    data = newData;
  }

  private void shiftRight(int index) {
    E tmp;
    for(int i=index+1; i<length; i++) {
      tmp = data[i];
      data[i] = data[index];
      data[index] = tmp; 
    }

    data[length] = data[index];
  }
}
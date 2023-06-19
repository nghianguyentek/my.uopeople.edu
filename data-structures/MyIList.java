public interface MyIList<E> {
  public int getLength();

  public void add(E element);
  public void insert(E element, int index);

  public E getElement(int index);
  
  public E remove(int index);
}
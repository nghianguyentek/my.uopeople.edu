public interface MyIStack<E> {
  public int getLength();

  public void push(E element);
  public E pop();
  
  public void clear();
}
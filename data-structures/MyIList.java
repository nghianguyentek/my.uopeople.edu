public interface MyIList<E> {
  public int getCurrentPosition();
  public int getCurrentSize();

  public E getValue();
  
  public void clear();
}
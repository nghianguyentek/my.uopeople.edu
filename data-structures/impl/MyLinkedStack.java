public class MyLinkedStack<E> implements MyIStack<E> {
  private MyDoubleLinkNode<E> tail;
  private MyDoubleLinkNode<E> head;
  private int length = 0;

  @Override
  public int getLength() {
    return length;
  }

  @Override
  public void push(E element) {
    MyDoubleLinkNode<E> newNode = new MyDoubleLinkNode<>(element);

    if (length++ == 0) {
      tail = head = newNode;
    } else {
      tail.setNext(newNode);
      tail = newNode;
    }
  }

  @Override
  public E pop() {
    if (length < 1) return null;
    E value = head.getData();
    head = head.next();
    return value;
  }

  public void clear() {
    for (;length > 0; length--) pop();
  }
}
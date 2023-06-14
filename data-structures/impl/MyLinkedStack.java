public class MyLinkedStack<E> implements MyIStack<E> {
  private MyLinkNode<E> topNode;
  private int length = 0;

  @Override
  public int getLength() {
    return length;
  }

  @Override
  public void push(E element) {
    MyLinkNode<E> newNode = new MyLinkNode<>(element);

    if (length++ == 0) {
      topNode = newNode;
    } else {
      newNode.setNext(topNode);
      topNode = newNode;
    }
  }

  @Override
  public E pop() {
    if (length < 1) return null;
    E value = topNode.getData();
    topNode = topNode.next();
    length--;
    return value;
  }

  public void clear() {
    while(length > 0) pop();
  }
}
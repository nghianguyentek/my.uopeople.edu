public class MyLinkNode<E> {
  private E data;
  private MyLinkNode<E> next;

  public MyLinkNode(E data) {
    this.data = data;
  }

  public MyLinkNode() {
    this(null);
  }

  public void setData(E data) {
    this.data = data;
  }

  public E getData() {
    return data;
  }

  public MyLinkNode<E> next() {
    return next;
  }

  public void setNext(MyLinkNode<E> next) {
    this.next = next;
  }
}
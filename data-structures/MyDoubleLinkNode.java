public class MyDoubleLinkNode<E> extends MyLinkNode<E> {
  private MyDoubleLinkNode<E> previous;

  public MyDoubleLinkNode(E data) {
    super(data);
  }

  public MyDoubleLinkNode() {
    super();
  }

  public MyDoubleLinkNode<E> previous() {
    return previous;
  }

  @Override
  public MyDoubleLinkNode<E> next() {
    return (MyDoubleLinkNode<E>) super.next();
  }

  public void setPrevious(MyDoubleLinkNode<E> previous) {
    this.previous = previous;
  }
}
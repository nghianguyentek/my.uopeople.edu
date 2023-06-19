public class MyArrayFixedFrontQueueTest {
  public static void main(String[] args) {
    specifyInvalidInitialCapacity();
    enqueue();
  }

  private static void specifyInvalidInitialCapacity() {
    try {
      new MyArrayFixedFrontQueue(0);
      throw new AssertionError("Specified invalid initial capacity but no exception thrown");
    } catch(IllegalArgumentException iae) {
    }
  }

  private static void enqueue() {
    MyIQueue<Integer> queue = new MyArrayFixedFrontQueue<>(1);
    queue.enqueue(1);
    queue.enqueue(2);

    int output = queue.dequeue();
    if (output != 1) throw new AssertionError("Expected returning 1, but got " + output);

    output = queue.dequeue();
    if (output != 2) throw new AssertionError("Expected returning 2, but got " + output);
  }
}
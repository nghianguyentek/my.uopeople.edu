public class MyArrayListTest {
  public static void main(String[] args) {
    MyIList list = new MyArrayList();
    assert list.getLength() == 0 : "Current size must be 0";
  }
}
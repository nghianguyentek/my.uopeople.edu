public class VisitorExample {
  public static void main(String[] args) {
    Visitor visitor = new ToStringVisitor();
    AHost aHost = new AHost();
    BHost bHost = new BHost();

    aHost.accept(visitor);
    bHost.accept(visitor);
  }
}
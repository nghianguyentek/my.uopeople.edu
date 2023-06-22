public class ToStringVisitor extends Visitor {
  @Override
  public void visit(AHost host) {
    System.out.println(host);
  }

  @Override
  public void visit(BHost host) {
    System.out.println(host);
  }
}
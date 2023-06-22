public class Player {
  private Strategy strategy;

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }

  public void nextMove() {
    strategy.operate();
  }
}
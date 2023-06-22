public class StrategyExample {
  public static void main(String[] args) {
    Player npc = new Player();

    npc.setStrategy(new DependStrategy());
    npc.nextMove();

    npc.setStrategy(new AttackStrategy());
    npc.nextMove();
  }
}
public class Player {
  private int numLives; // initiates player numLives
  private int hp; // initiates player hp
  private int xp; // initiates player xp

  public void setnumLives(int numLives) { // sets num lives
    this.numLives = numLives;
  }

  public int getnumLives() { // gets num lives
    return numLives;
  }

  public void sethp(int hp) { // sets player hp
    this.hp = hp;
  }

  public int gethp() { // gets player hp
    return hp;
  }

  public void setxp(int xp) { // sets player xp
    this.xp = xp;
  }

  public int getxp() { // gets player xp
    return xp;
  }

  public Player(int numLives, int hp, int xp) {
    this.numLives = numLives; // declares num lives
    this.hp = hp; // declares hp
    this.xp = xp; // declares xp
  }
}
public class Character {
  private String name;
  private int HP;
  private int defense;
  private int attack;
  private int speed;
  private int evasion;

  public Character(){
    name = "";
    HP = 100;
    defense = 5;
    attack = 5;
    speed = 10;
    evasion = 0;
  }

  public Character(String n, int h, int d, int a, int s, int e){
    name = n;
    HP = h;
    defense = d;
    attack = a;
    speed = s;
    evasion = e;
  }

  public String getName(){
    return name;
  }
  public int getHP(){
    return HP;
  }
  public int getDefense(){
    return defense;
  }
  public int getAttack(){
    return attack;
  }
  public int getSpeed(){
    return speed;
  }
  public int getEvasion(){
    return evasion;
  }

  public void setName(String n){
    name = n;
  }
  public void setHP(int h){
    HP = h;
  }
  public void setDefense(int d){
    defense = d;
  }
  public void setAttack(int a){
    attack = a;
  }
  public void setSpeed(int s){
    speed = s;
  }
  public void setEvasion(int e){
    evasion = e;
  }


}

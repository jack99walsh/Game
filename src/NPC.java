public class NPC extends Character {

  public int scriptNum;
  public boolean givesQuest;
  public int pacifism; //set on a level from 0-4; 0 = hostile, 4 = beta af
  public boolean essential;

  public NPC(){
    super();
  }
  public NPC(String n, int h, int d, int a, int s, int e){
    super(n, h, d, a, s, e);
  }

  public int getScriptNum(){
    return scriptNum;
  }
  public int getPacifism(){
    return pacifism;
  }
  public boolean getGivesQuest(){
    return givesQuest;
  }
  public boolean getEssential(){
    return essential;
  }

  public void setScriptNum(int s){
    scriptNum = s;
  }
  public void setPacifism(int p){
    pacifism = p;
  }
  public void setGivesQuest(boolean g){
    givesQuest = g;
  }
  public void setEssential(boolean e){
    essential = e;
  }


}

import java.util.*;

public class Acts {

  public String titleCard;
  public String partCard;
  public List<String> response;
  public List<String> script;

  public Acts(){
    titleCard = "";
    partCard = "";
    response = new ArrayList();
    script = new ArrayList();
  }
  public Acts(String t, String p, ArrayList r, ArrayList s){
    titleCard = t;
    partCard = p;
    response = r;
    script = s;
  }

  public String getTitleCard(){
    return titleCard;
  }
  public String getPartCard(){
    return partCard;
  }
}

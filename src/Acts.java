import java.util.*;

public class Acts {

  public String actCard;
  public String partCard;
  public List<String> response;
  public List<String> script;

  public Acts(){
    actCard = "";
    partCard = "";
    response = new ArrayList();
    script = new ArrayList();
  }
  public Acts(String a, String p, ArrayList r, ArrayList s){
    actCard = a;
    partCard = p;
    response = r;
    script = s;
  }

  public String getActCard(){
    return actCard;
  }
  public String getPartCard(){
    return partCard;
  }
}

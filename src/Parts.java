import java.util.*;

public class Parts extends Acts {

  public Parts(){
    super();
  }
  public Parts(String t, String p, ArrayList r, ArrayList s){
    super(t, p, r, s);
  }

  public String getResponses(int i){
    return response.get(i);
  }
  public String getScript(int i){
    return script.get(i);
  }
}

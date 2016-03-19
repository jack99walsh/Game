import java.util.*;

public class Main {

  public static ArrayList responses = new ArrayList();
  public static ArrayList script = new ArrayList();
  public static String input;
  public static Parts A1P1 = new Parts("Act 1", "Part 1", responses, script);

  public static void main (String[] args){

    //Act 1: Part 1
    responses.add("You wake up, cold and confused. You are disoriented and unsure of where you are. You look around discover you are in a cinderblock basement.");
    responses.add("You try to get up, but discover you are naked your hands are bound.");
    //End of Act 1: Part 1

    Scanner in = new Scanner(System.in);

    //Begin Act1: Part 1 Code
    System.out.println(A1P1.getResponses(0));
    /*try {
        Thread.sleep(4500);
    }
    catch (InterruptedException ex) {
    }*/
    System.out.println(A1P1.getResponses(1));
    input = in.nextLine();
    boolean cont = false;
    //System.out.println(input.toLowerCase().indexOf("dildo"));
    while (cont = false) {
      if (input.toLowerCase().indexOf("pockets") <= -1){
        System.out.println("You can't do that.");
        continue;
      }
      else if (input.toLowerCase().indexOf("pockets") >= 0) {
        System.out.println("You are naked, remember?");
        break;
      }
    }
    //End Act 1: Part 1 Code
  }
}

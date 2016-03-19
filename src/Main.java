import java.util.*;

public class Main {

  public static ArrayList responses11 = new ArrayList();
  public static ArrayList script11 = new ArrayList();
  public static String input;
  public static Parts A1P1 = new Parts("Act 1", "Part 1", responses11, script11);
  public static Character player = new Character();

  public static void main (String[] args){
    //Act 1: Part 1
    responses11.add("You wake up, cold and confused. You are disoriented and unsure of where you are. You look around discover you are in a cinderblock basement.");
    responses11.add("You try to get up, but discover you are naked your hands are bound by ropes.");
    responses11.add("After looking around for a while you discover a short rusty blade.");
    responses11.add("It appears that if you try to cut the ropes with the knife you may cut yourself on accident.");
    responses11.add("Will you try to cut the ropes?");
    //End of Act 1: Part 1

    Scanner in = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = in.nextLine();
    System.out.println("Your name is " + name + ". Is this correct?");
    input = in.nextLine();
    while (input.toLowerCase().equals("no")){
      System.out.println("What is your name?");
      name = in.nextLine();
      System.out.println("Your name is " + name + ". Is this correct?");
      input = in.nextLine();
    }
    player.setName(name);

    //Begin Act1: Part 1 Code
    System.out.println(A1P1.getActCard());
    try {Thread.sleep(1250);} catch (InterruptedException ex){}
    System.out.println(A1P1.getPartCard());
    try {Thread.sleep(1250);} catch (InterruptedException ex){}

    System.out.println(A1P1.getResponses(0));
    try {Thread.sleep(4500);} catch (InterruptedException ex){}
    System.out.println(A1P1.getResponses(1));
    input = in.nextLine();

    for (int i = 0; i < i + 1; i++) {
      if (input.toLowerCase().indexOf("pockets") >= 0) {
        System.out.println("You are naked, remember?");
        input = in.nextLine();
      }
      else if ((input.toLowerCase().indexOf("look for") >= 0 || input.toLowerCase().indexOf("search for") >= 0 || input.toLowerCase().indexOf("try to find") >= 0) && (input.toLowerCase().indexOf("knife") >= 0 || input.toLowerCase().indexOf("sharp") >= 0 || input.toLowerCase().indexOf("blade") >= 0)) {
        System.out.println();
        break;
      }
      else {
          System.out.println("You can't do that.");
          input = in.nextLine();
      }
    }

    System.out.println(A1P1.getResponses(2));
    try {Thread.sleep(500);} catch (InterruptedException ex){}
    System.out.println(A1P1.getResponses(3));
    try {Thread.sleep(500);} catch (InterruptedException ex){}
    System.out.println(A1P1.getResponses(4));
    input = in.nextLine();
    if (input.toLowerCase().equals("yes") || input.toLowerCase().equals("y")){
      //finish this statement
    }

    //End Act 1: Part 1 Code
  }
}

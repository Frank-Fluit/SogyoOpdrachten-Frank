package nl.sogyo.javaopdrachten;


public class Roborally{
  public static void main(String [] args){
    Robot myFirstRobot = new Robot(1, 0, "West");
    myFirstRobot.turnleft();
    myFirstRobot.forward(2);
    myFirstRobot.backward();
    myFirstRobot.printState();
    System.out.println(myFirstRobot.xposition);
    System.out.println(myFirstRobot.yposition);

    myFirstRobot.execute();
    myFirstRobot.printState();
    System.out.println(myFirstRobot.xposition);
    System.out.println(myFirstRobot.yposition);





  }
}





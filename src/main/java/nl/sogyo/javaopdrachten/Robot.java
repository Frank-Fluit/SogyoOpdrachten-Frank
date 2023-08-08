package nl.sogyo.javaopdrachten;

import java.util.ArrayList;
import java.util.List;

public class Robot{




  //instance variables
  int xposition;
  int yposition;
  String facing;
  private List<String> commands;




  public Robot(int xposition, int yposition, String facing) {
   this.xposition = xposition;
   this.yposition = yposition;
   this.facing = facing;
   this.commands = new ArrayList<>();
}




public void turnleft() {
    commands.add("left");
}

public void turnright() {
    commands.add("right");
}

public void forward() {
    forward(1);
}


void forward(int speed){


    String speedstring = Integer.toString(speed);

    commands.add("forward " +speedstring);

}

public void backward() {
    commands.add("backward");
}

public void execute(){
    for (String command : commands){
        if(command.equals("left")){
            
            if (facing.equals("North")) {
                facing = "West";
            }
            else if (facing.equals("West")) {
                facing = "South";
            }
            else if (facing.equals("South")) {
                facing = "East";
            }
            else if (facing.equals("East")) {
                facing = "North";
            }

        }

        else if(command.equals("right")){
            
            if (facing.equals("North")) {
                facing = "East";
            }
            else if (facing.equals("East")) {
                facing = "South";
            }
            else if (facing.equals("South")) {
                facing = "West";
            }
            else if (facing.equals("West")) {
                facing = "North";
            }
        }


       

        else if(command.substring(0, 7).equals("forward")){
            char chariteratnr = command.charAt(8);
            int iteratnr = Character.getNumericValue(chariteratnr);

            if (iteratnr < 1 || iteratnr > 3) {
                System.out.println("Invalid distance. Please specify a distance between 1 and 3.");
                return;
            }
            
            else{
            

                for(int i = 0; i < iteratnr; i++){

                    if (facing.equals("North")) {
                        yposition= yposition +1;
                    }
                    else if (facing.equals("East")) {
                        xposition = xposition +1;
                    }
                    else if (facing.equals("South")) {
                        yposition = yposition -1;
                    }
                    else if (facing.equals("West")) {
                        xposition = xposition -1;
                    }
                } 
            }

        }

        

        else if(command.equals("backward")){
            if (facing.equals("North")) {
                yposition= yposition -1;
            }
            else if (facing.equals("East")) {
                xposition = xposition -1;
            }
            else if (facing.equals("South")) {
                yposition = yposition +1;
            }
            else if (facing.equals("West")) {
                 xposition = xposition +1;
            }

        }
    }
}


  void printState(){
   System.out.println(facing);
  }
}


  
 








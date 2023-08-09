package nl.sogyo.javaopdrachten;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Tree{




//take the nodes out of the list
// transform the nodelist into a list of nodeinstances




public ArrayList<ArrayList<String>> separateNodesAndEdges(ArrayList<String> fileLines) { 

    ArrayList<String> nodeLines = new ArrayList<String>();
    ArrayList<String> edgeLines = new ArrayList<String>();
    
    for(String line : fileLines){

        String[] parts = line.split(",");
    
        int lengthline = parts.length;
    
        if(lengthline ==3){
            edgeLines.add(line);
        }
        else if(lengthline ==2){
            nodeLines.add(line);
        }
    }

        ArrayList<ArrayList<String>> result = new ArrayList<>();

        result.add(edgeLines);

        result.add(nodeLines);

        return result;
        }
    

public ArrayList<String> readTreeInputFile(String path) {
    
    //Create listOfInputLines(path)
    String pathString = "/home/frank/java-opdrachten-frank/src/main/resources/intermediate/decision-tree-data.txt";
    ArrayList<String> fileLines = new ArrayList<String>();

    try {
        Scanner scanner = new Scanner(new File(pathString));
        
        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();

            //System.out.println(line);

            fileLines.add(line);

        }
        
        scanner.close(); 

    } catch (FileNotFoundException e) {
        System.out.println("Bestand niet gevonden: " );
        e.printStackTrace();
    }

    return fileLines;

    
}





}


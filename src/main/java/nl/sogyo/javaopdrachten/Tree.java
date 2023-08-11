package nl.sogyo.javaopdrachten;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Tree{

public static ArrayList<String> readTreeInputFile(String path) {
    
    ArrayList<String> fileLines = new ArrayList<String>();
    try {
        Scanner scanner = new Scanner(new File(path));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            fileLines.add(line);
        }
        scanner.close(); 
    } catch (FileNotFoundException e) {
        System.out.println("Bestand niet gevonden: " );
        e.printStackTrace();
    }
    return fileLines;
}

public static ArrayList<ArrayList<String>> separateNodesAndEdges(ArrayList<String> fileLines) { 

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
    

public static String getUserInput() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
}

public static void runTree(Node currentNode,ArrayList<Node> nodesAsObjects,ArrayList<Edge> edgesAsObjects){
Boolean endTreeReached = false;
    while (!endTreeReached) {
        System.out.println(currentNode.questionOrAnswerLine);
        System.out.print("Beantwoord de vraag volgens het volgende format: {Ja}/{Nee}");
        String inputUser = Tree.getUserInput();
        if(inputUser.equals("ja")){
            inputUser = "Ja";
        }
        if(inputUser.equals("nee")){
            inputUser = "Nee";
        }
        System.out.println("Uw invoer: " + inputUser);
        
        Edge matchingEdge = Edge.findMatchingEdge(inputUser, currentNode.name, edgesAsObjects);
        
        if (matchingEdge != null) {
            Node destinationNode = Node.findNodeByName(matchingEdge.destinationNode, nodesAsObjects);
            
            if (destinationNode != null) {
                currentNode = destinationNode;
                
                if (!currentNode.question) {
                    System.out.println("De boom waar u naar op zoek bent is: " + currentNode.questionOrAnswerLine);
                    endTreeReached = true;
                }
            }
        }
    }





}
}


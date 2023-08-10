package nl.sogyo.javaopdrachten;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DecisionTree{
public static void main(String [] args){

    //7 potential methods
    
    //Read tree inputfile
    String PATH = "/home/frank/java-opdrachten-frank/src/main/resources/intermediate/decision-tree-data.txt";
    Tree myFirstTree = new Tree();
    ArrayList<String> fileLines = myFirstTree.readTreeInputFile(PATH);

    //Separate nodes and edges
    ArrayList<ArrayList<String>> nodesAndEdgesSeparated = myFirstTree.separateNodesAndEdges(fileLines);
    ArrayList<String> edgeStringList = nodesAndEdgesSeparated.get(0);
    ArrayList<String> nodesStringList = nodesAndEdgesSeparated.get(1);


    // Create Destination Nodes list
    ArrayList<String> destinationNodes = new ArrayList<>();
    for(String entry: edgeStringList){
        String[] edgeParts = entry.split(",");
        String destinationNode = edgeParts[1];
        destinationNodes.add(destinationNode.trim());
    }
    
    //Nodes are initiated and put in edgelist
    ArrayList<Node> nodesAsObjects = new ArrayList<>();
    for(String line: nodesStringList){
        String[] parts = line.split(",");
        String nodename = parts[0].trim();
        String questionOrAnswer = parts[1].trim();
        char finalChar = questionOrAnswer.charAt(questionOrAnswer.length() - 1);
        Boolean question = false;
        if(Character.toString(finalChar).equals( "?")){
            question = true;
        }
        else if(!Character.toString(finalChar).equals("?")){
            question = false;
        }
        Node node = new Node(question,nodename,questionOrAnswer);
        nodesAsObjects.add(node);
    }

    //Edges are initiated and put in edgelist
    ArrayList<Edge> edgesAsObjects = new ArrayList<>();
    for(String line: edgeStringList){
        String[] parts = line.split(",");
        String originNode = parts[0].trim();
        String destinationNode = parts[1].trim();
        String answer = parts[2].trim();
    
        Edge edge = new Edge(originNode,destinationNode,answer);
        edgesAsObjects.add(edge);
    }

    // finds startnode is found
    String beginNode = null;
    for(String line:nodesStringList){
        String[] parts = line.split(",");
        String nodename = parts[0];
        if(!destinationNodes.contains(nodename)){
            beginNode = nodename;   
        }
    }
    Node currentNode = null;
    for (Node node : nodesAsObjects){
        if(node.name.equals(beginNode)){
            currentNode = node;
        }
    }

    // Runtree
    Boolean endTreeReached = false;
    while (!endTreeReached) {
        
        Boolean newNodeFound = false;
        System.out.println(currentNode.questionOrAnswerLine);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Beantwoord de vraag volgens het volgende format: {Ja}/{Nee}, denk aan hoofdletter ");
        String inputUser = scanner.nextLine(); 
        System.out.println("De optie die je gekozen hebt is: " + inputUser);
        
        for (Edge edge : edgesAsObjects) {
            
            if (inputUser.equals(edge.answer) && currentNode.name.equals(edge.originNode)) {
  
                while(!newNodeFound){

                    for(Node node: nodesAsObjects){

                        if(edge.destinationNode.equals(node.name)){
                            
                            currentNode = node;
                            newNodeFound = true;

                            if(currentNode.question == false){

                                System.out.println("The tree you are looking for is: " + currentNode.questionOrAnswerLine);
                                endTreeReached =true;
                            
                            }
                        }
                    }
                } 
            }
        }
    } // end main while loop tree 
} //end main
}// end class








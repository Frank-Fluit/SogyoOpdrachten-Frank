package nl.sogyo.javaopdrachten;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DecisionTree{
public static void main(String [] args){

    
    // Get all the info in list form
    String PATH = "/home/frank/java-opdrachten-frank/src/main/resources/intermediate/decision-tree-data.txt";
    Tree myFirstTree = new Tree();
    ArrayList<String> fileLines = myFirstTree.readTreeInputFile(PATH);
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
    
    //makes list of node objects: add mame and type
    ArrayList<Node> nodesAsObjects = new ArrayList<>();
    for(String line: nodesStringList){
        String[] parts = line.split(",");
        String nodename = parts[0].trim();
        String questionOrAnswer = parts[1].trim();
        char finalChar = questionOrAnswer.charAt(questionOrAnswer.length() - 1);
        System.out.println(finalChar);
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

    // finds beginnode
    String beginNode = null;
    for(String line:nodesStringList){
        String[] parts = line.split(",");
        String nodename = parts[0];
        if(!destinationNodes.contains(nodename)){
            System.out.println(nodename + " is the beginnode");
            beginNode = nodename;
                
        }
    }

    Boolean endTreeReached = false;

    System.out.println("Beginnode = " + beginNode);

    for(Node node:nodesAsObjects){
        System.out.println(node.name);
        System.out.println(node.question);
        System.out.println(node.questionOrAnswerLine);

    }
// hints found online:

    while (!endTreeReached) {
        // Logic to process nodes and perform desired operations
    
        // For example, you can iterate through your nodesAsObjects list
        for (Node node : nodesAsObjects) {
            // Perform operations based on the node properties
            // For instance, you can check if it's a question node and take actions accordingly
            if (node.question) {
                // Implement logic for handling question nodes
            } else {
                // Implement logic for handling answer nodes
            }
        }
    
        // You might update endTreeReached based on certain conditions
        // For example, if you reach a specific node, you might set endTreeReached to true
        // endTreeReached = true; // Replace this with your actual condition
    }

    //More code here

    




    } //end main
} // end class








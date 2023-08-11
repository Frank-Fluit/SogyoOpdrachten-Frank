package nl.sogyo.javaopdrachten;

import java.util.ArrayList;

public class Node{

    Boolean question;
    String name;
    String questionOrAnswerLine;

public Node(Boolean question, String name, String questionorAnswerLine) {
    
    this.question = question;
    this.name = name;
    this.questionOrAnswerLine = questionorAnswerLine;    
}


public static ArrayList<String> getDestinationNodes(ArrayList<Edge> edgesAsObjects){
ArrayList<String> destinationNodes = new ArrayList<>();
    for(Edge edge: edgesAsObjects){
        String destinationNode = edge.destinationNode;
        destinationNodes.add(destinationNode.trim());
    }
    return destinationNodes;
}

public static ArrayList<Node> nodesAsObjects(ArrayList<String> nodesStringList){


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


    return nodesAsObjects;
}

public static Node findCurrentNode(ArrayList<Node> nodesAsObjects, ArrayList<String> destinationNodes){
    
    Node currentNode = null;
    for (Node node : nodesAsObjects){
        if(!destinationNodes.contains(node.name)){
            currentNode = node;
        }
    }
    return currentNode;
}

public static Node findNodeByName(String nodeName, ArrayList<Node> nodesAsObjects){
    for (Node node : nodesAsObjects) {
        if (nodeName.equals(node.name)) {
            return node;
        }
    }
    return null;

}
}
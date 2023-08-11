package nl.sogyo.javaopdrachten;


import java.util.ArrayList;

public class Main{
public static void main(String [] args){

    
    String filePath = "/home/frank/java-opdrachten-frank/src/main/resources/intermediate/decision-tree-data.txt";
    ArrayList<String> fileLines = Tree.readTreeInputFile(filePath);

    
    ArrayList<ArrayList<String>> nodesAndEdgesSeparated = Tree.separateNodesAndEdges(fileLines);
    ArrayList<String> edgeStringList = nodesAndEdgesSeparated.get(0);
    ArrayList<String> nodesStringList = nodesAndEdgesSeparated.get(1);

    ArrayList<Node> nodes = Node.nodesAsObjects(nodesStringList);
    ArrayList<Edge> edges = Edge.createEdgeObjects(edgeStringList);


    ArrayList<String> destinationNodes = Node.getDestinationNodes(edges);
    Node currentNode = Node.findCurrentNode(nodes,destinationNodes);
    

    Tree.runTree(currentNode,nodes,edges);

} 
}








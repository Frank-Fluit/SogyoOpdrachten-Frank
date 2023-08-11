package nl.sogyo.javaopdrachten;

import java.util.ArrayList;

public class Edge{

    String originNode;
    String destinationNode;
    String answer;

public Edge(String originNode, String destinationNode, String answer) {
    
    this.originNode = originNode;
    this.destinationNode = destinationNode;
    this.answer = answer;    
}

public static ArrayList<Edge> createEdgeObjects(ArrayList<String> edgeStringList){

    ArrayList<Edge> edges = new ArrayList<>();
    for(String line: edgeStringList){
        String[] parts = line.split(",");
        String originNode = parts[0].trim();
        String destinationNode = parts[1].trim();
        String answer = parts[2].trim();
    
        Edge edge = new Edge(originNode,destinationNode,answer);
        edges.add(edge);
    }

    return edges;
}

public static Edge findMatchingEdge(String answer, String originNode, ArrayList<Edge> edgesAsObjects){

    for (Edge edge : edgesAsObjects) {
        if (answer.equals(edge.answer) && originNode.equals(edge.originNode)) {
            return edge;
        }
    }
    return null;

}
}

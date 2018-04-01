package weight;

import java.util.LinkedList;

public class Node {
    String name;

    public Node(String name) {
        this.name = name;
    }

    LinkedList<Edge> edges = new LinkedList<>();

    public Edge connect(Node node, boolean reverse) {
        Edge edge = new Edge();
        edge.value = 10;
        edge.n1 = this;
        edge.n2 = node;
        this.edges.add(edge);
        if (reverse) {
            node.edges.add(edge);
        }
        return edge;
    }

}

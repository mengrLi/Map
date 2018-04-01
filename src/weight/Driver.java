package weight;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.LinkedList;

public class Driver {
    public static void main(String[] args) {
        Node a = new Node("A");
        Node b = new Node("B");
        Edge edge = a.connect(b, true);
        //  Edge edge = new Edge();
        edge.value = 10;
       /* edge.n1=a;
        edge.n2=b;
        a.edges.add(edge);
        b.edges.add(edge);*/
        LinkedList<Edge> edges = b.edges;
        for (Edge edge1 : edges) {
            Node opposite = edge1.opposite(b);
        }

    }

}

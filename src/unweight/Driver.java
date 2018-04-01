package unweight;

public class Driver {
    public  static void main(String[] args)
    {
       // Node a = new Node("A");
        //Node b = new Node("B");

        Graph graph = new Graph();
        Node a =graph.getorCreateNode("A");
        Node b = graph.getorCreateNode("B");

        a.addNode(b,true);

    }
}

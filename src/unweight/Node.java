package unweight;

import java.util.LinkedList;

public class Node {
    String name;
    LinkedList<Node> nodes = new LinkedList<>();

    public Node()
    {}
    public Node(String name)
    {
        this.name=name;

    }
    public  void addNode(Node node, boolean inverse)
    {
        this.nodes.add(node);
        if (inverse)
        {
            node.addNode(this,false);//   youyu node.nodes.add(this);
        }

    }
}

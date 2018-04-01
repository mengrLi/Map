package weight;
/*
1. youxiangtu
2. wuxiangtu
3. wuxiangyouzhongliang
 */

public class Edge {
    Node n1;
    Node n2;
    int value;

    public Node opposite(Node source) {
        // return n1==source? n2:n1;
        if (n1 == source) {
            return n2;
        }
        if (n2 == source) {
            return n1;
        } else
            return null;
    }
}

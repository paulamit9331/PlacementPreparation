package DataStructures.Tree;

public class Node {
    public int data;
    public Node lc;
    public Node rc;

    public Node(int data) {
        super();

        this.data = data;
        this.lc = this.rc = null;
    }
}

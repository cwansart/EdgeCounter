package edgecounter;

public class Edge {

    /**
     * This is the vertex this edge points to.
     */
    public final Vertex target;

    /**
     * This is the input you need to walk this edge
     */
    public final int input;

    /**
     * Initializes target and input attribues.
     *
     * @param target
     * @param input
     */
    public Edge(Vertex target, int input) {
        this.target = target;
        this.input = input;
    }
}

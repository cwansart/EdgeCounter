package edgecounter;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    /**
     * This is the label or name of the vertex.
     */
    public final String name;

    /**
     * This contains all edges that goes out of this edge.
     */
    public List<Edge> edges = new ArrayList<>();

    /**
     * This initlaizes the name and edges.
     *
     * @param name
     */
    public Vertex(String name) {
        this.name = name;
    }

    /**
     * This adds a new edge to the vertex.
     *
     * @param edge
     */
    public void addEdge(Edge edge) {
        this.edges.add(edge);
    }
}

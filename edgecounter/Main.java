package edgecounter;

public class Main {

    public static void main(String[] args) {

        Vertex q0 = new Vertex("q0"); // start
        Vertex q1 = new Vertex("q1");
        Vertex q2 = new Vertex("q2");
        Vertex q4 = new Vertex("q4"); // end

        // Edges from q0
        q0.addEdge(new Edge(q1, 0));
        q0.addEdge(new Edge(q2, 1));

        // Edges from q1
        q1.addEdge(new Edge(q4, 1));

        // Edges from q2
        q2.addEdge(new Edge(q4, 0));

        // Edges from q4
        q4.addEdge(new Edge(q0, 0));
        q4.addEdge(new Edge(q1, 1));

        // This are the min and max settings.
        final int k = 14;

        EdgeCounter edgeCounter = new EdgeCounter(q0, q4);

        for (int i = 2; i <= k; i++) {
            System.out.println("N(" + i + ") = " + edgeCounter.startCounting(i));
        }
    }
}

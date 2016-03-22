package edgecounter;

public class EdgeCounter {

    private int k;
    private final Vertex start;
    private final Vertex end;

    public EdgeCounter(Vertex start, Vertex end) {
        this.start = start;
        this.end = end;
    }

    /**
     * Starts counting with given k.
     * 
     * @param k
     * @return returns the count of accpected words.
     */
    public int startCounting(int k) {
        this.k = k;
        return startCounting(0, this.start);
    }

    private int startCounting(int count, Vertex next) {
        // If we reach max count but are not at the end, this is a fail,
        // therefore we don't need to count it.
        if(count == k && next != end) {
            return 0;
        }
        
        if(count == k && next == end) {
            return 1;
        }
        
        count++;
        int result = 0;
        for(Edge edge: next.edges) {
            result += startCounting(count, edge.target);
        }
        
        return result;
    }

}

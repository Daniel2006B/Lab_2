package Task1;

// Клас Edge представляє ребро графа
class Edge {
    private final Vertex from; // Вершина, з якої виходить ребро
    private final Vertex to;    // Вершина, до якої веде ребро

    public Edge(Vertex from, Vertex to) {
        this.from = from;
        this.to = to;
    }

    public Vertex getFrom() {
        return from;
    }

    public Vertex getTo() {
        return to;
    }
}


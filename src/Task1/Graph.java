package Task1;

import java.util.ArrayList;
import java.util.List;

// Клас Graph представляє граф (орієнтований або неорієнтований)
class Graph {
    private final boolean isDirected;  // Чи орієнтований граф
    private final List<Vertex> vertices; // Список вершин
    private final List<Edge> edges;     // Список ребер

    public Graph(boolean isDirected) {
        this.isDirected = isDirected;
        this.vertices = new ArrayList<>();
        this.edges = new ArrayList<>();
    }

    // Метод для додавання вершини
    public void addVertex(Vertex vertex) {
        vertices.add(vertex);
    }

    // Метод для додавання дуги між двома вершинами
    public void addEdge(Vertex from, Vertex to) {
        edges.add(new Edge(from, to));
        if (!isDirected) {  // Якщо граф неорієнтований, додаємо зворотне з'єднання
            edges.add(new Edge(to, from));
        }
    }

    // Метод для виведення графу в консоль
    public void printGraph() {
        System.out.println("Граф:"); // Заголовок
        for (Edge edge : edges) {
            System.out.print(edge.getFrom() + " -> " + edge.getTo() + "\n");
        }
    }
}

package Task1;
import java.util.Scanner;

// Тестовий клас для демонстрації графу
public class Main1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запитуємо у користувача, чи граф буде орієнтованим
        System.out.print("Введіть 'true' для орієнтованого графа або 'false' для неорієнтованого: ");
        boolean isDirected = scanner.nextBoolean();

        // Створюємо граф
        Graph graph = new Graph(isDirected);

        // Додаємо вершини
        graph.addVertex(new Vertex("A", 1));
        graph.addVertex(new Vertex("B", 2));
        graph.addVertex(new Vertex("C", 3));
        graph.addVertex(new Vertex("D", 4));

        // Додаємо ребра між вершинами
        graph.addEdge(new Vertex("A", 1), new Vertex("B", 2)); // A -> B
        graph.addEdge(new Vertex("A", 1), new Vertex("C", 3)); // A -> C
        graph.addEdge(new Vertex("B", 2), new Vertex("D", 4)); // B -> D

        // Виводимо граф
        graph.printGraph();

        scanner.close(); // Закриваємо сканер
    }
}

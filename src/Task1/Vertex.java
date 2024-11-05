package Task1;
// Клас Vertex представляє вершину графа
class Vertex {
    private final String name; // Назва вершини
    private final int value;    // Значення вершини

    public Vertex(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name + " (" + value + ")"; // Виводимо назву та значення вершини
    }
}


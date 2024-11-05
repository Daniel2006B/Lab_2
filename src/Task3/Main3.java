package Task3;

public class Main3 {
    public static void main(String[] args) {
        // Створюємо товари
        Product product1 = new Product("Laptop", 0.3, 0.4, 0.05);
        Product product2 = new Product("Chair", 1.2, 0.5, 0.8);
        Product product3 = new Product("Table", 2.0, 1.0, 0.75);
        Product product4 = new Product("Smartphone", 0.1, 0.07, 0.01);
        Product product5 = new Product("Monitor", 0.6, 0.4, 0.2);
        Product product6 = new Product("TV", 1.5, 0.9, 0.1);

        // Створюємо комірку складу
        WarehouseCell warehouseCell = new WarehouseCell(2.0, 1.0, 1.0);

        // Додаємо товари в комірку
        warehouseCell.addProduct(product1); // Успішно
        warehouseCell.addProduct(product2); // Успішно
        warehouseCell.addProduct(product3); // Занадто велика
        warehouseCell.addProduct(product4); // Успішно
        warehouseCell.addProduct(product5); // Успішно
        warehouseCell.addProduct(product6); // Перевищує кількість

        // Виведення усіх товарів в комірці
        warehouseCell.printAllProducts();
    }
}

package Task3;

import java.util.ArrayList;
import java.util.List;

public class WarehouseCell {
    private final double maxLength;
    private final double maxWidth;
    private final double maxHeight;
    private final List<Product> products;
    private final int maxCapacity = 5;

    public WarehouseCell(double maxLength, double maxWidth, double maxHeight) {
        this.maxLength = maxLength;
        this.maxWidth = maxWidth;
        this.maxHeight = maxHeight;
        this.products = new ArrayList<>();
    }

    // Метод для додавання товару в комірку
    public void addProduct(Product product) {
        // Перевірка місткості
        if (products.size() >= maxCapacity) {
            System.out.println("Error: Cannot add more than " + maxCapacity + " items to this warehouse cell.");
            return;
        }

        // Перевірка розмірів
        if (product.getLength() > maxLength || product.getWidth() > maxWidth || product.getHeight() > maxHeight) {
            System.out.println("Error: Product " + product.getName() + " is too large for this warehouse cell.");
            return;
        }

        // Додаємо товар у список
        products.add(product);
        System.out.println("Product " + product.getName() + " added successfully.");
    }

    // Метод для виведення інформації про всі товари в комірці
    public void printAllProducts() {
        if (products.isEmpty()) {
            System.out.println("No products in this warehouse cell.");
        } else {
            System.out.println("Products in this warehouse cell:");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }
}


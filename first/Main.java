package first;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProduct(new Product("сыр", 300))
                .addProduct(new Product("вода", 10))
                .addProduct(new Product("вино", 330))
                .addProduct(new Yogurt("Danone", 300, "сладкий"))
                .addProduct(new Perfume("Si", 6500, "Dior"))
                .addProduct(new Product("Творог", 150))
                .addProduct(new Product("Lays", 100))
                .addProduct(new Product("Mars", 70))
                .addProduct(new Product("Twix", 70.99))
                .addProduct(new Product("Алёнка", 90))
                .addProduct(new Product("Колокольчик", 85))
                .addProduct(new Perishable("Молоко Бурёнка", 85, LocalDate.of(2023, 3, 25)))
                .addProduct(new Perishable("Молоко Коровка", 85, LocalDate.of(2023, 3, 25)))
                .addProduct(new Perishable("Молоко Василёк", 85, LocalDate.of(2023, 3, 25)))
                .addProduct(new Perishable("Шоколадка Аленка", 120, LocalDate.of(2024, 05, 30)));
        ;

        System.out.println(vendingMachine);
        System.out.println("__________________________________");
        System.out.println(vendingMachine.findProduct("Молоко"));
        System.out.println(vendingMachine.findProduct("Алёнка"));
        System.out.println(vendingMachine.findProduct("Пиво"));
        System.out.println("__________________________________");
        System.out.println("продан: " + vendingMachine.sellProduct(vendingMachine.findProduct("Twix").get(0)));
        System.out.println("__________________________________");
        System.out.println(vendingMachine);

    }
}
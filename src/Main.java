import lesson.MultiplicationTable;
import lesson.Task;
import pasport.Passport;
import pasport.PassportList;
import product.Product;
import product.ProductList;
import product.Recipe;
import product.RecipeList;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Product banana = new Product("Банан", 70.0, 1);
        Product meat = new Product("Мясо", 370.0, 2);
        Product fish = new Product("Рыба", 583.0, 1);
        Product eggs = new Product("Яйца", 99.0, 1);
        Product sausage = new Product("Колбаса", 400.0, 1);
        Product polkaDots = new Product("Горошек", 80.0, 1);

        ProductList productList = new ProductList();
        productList.addProduct(banana);
        productList.addProduct(meat);
        productList.addProduct(fish);
        System.out.println(productList);

        Set<Product> products = new HashSet<>();
        products.add(sausage);
        products.add(polkaDots);
        products.add(eggs);
        Recipe salad = new Recipe("Оливье", products);
        System.out.println(salad);


        /////
        numberSetRemoveEven();
        /////

        MultiplicationTable multiplicationTable = new MultiplicationTable();
        System.out.println(multiplicationTable);
        Task task1 = new Task(2, 3);
        Task task2 = new Task(3, 2);
        Set<Task> set = new HashSet<>();
        set.add(task1);
        set.add(task2);
        System.out.println(set);


        ////
        Passport ivanov = new Passport(1234, "Иван", "Иванович", "Иванов", LocalDate.of(1979, 12, 12));
        Passport petrov = new Passport(1357, "Петр", "Петрович", "Петров", LocalDate.of(1999, 01, 05));
        Passport sidorov = new Passport(2468, "Алексей", "Алексеевич", "Сидоров", LocalDate.of(2003, 12, 11));

        PassportList passportList = new PassportList();
        passportList.addOrUpdatePassport(ivanov);
        passportList.addOrUpdatePassport(petrov);
        passportList.addOrUpdatePassport(sidorov);

        System.out.println(passportList);

    }

    private static void numberSetRemoveEven() {
        Set<Integer> numbers = new HashSet<>(20);
        Random random = new Random();
        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);

        Iterator<Integer> numberIterator = numbers.iterator();
        while (numberIterator.hasNext()) {
            int number = numberIterator.next();
            if (number % 2 != 0) {
                numberIterator.remove();
            }
        }
        System.out.println(numbers);

    }
    //////


}
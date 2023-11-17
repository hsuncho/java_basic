package etc.stream;

import java.util.Comparator;
import java.util.stream.Collectors;

import static etc.stream.Menu.*;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Sorting {

    public static void main(String[] args) {

        // order dishes by lower calories
        System.out.println("===== order by lower calories(ascending order) =====");
        menuList.stream()
                .sorted(comparing(Dish::getCalories))
                .collect(toList())
                .forEach(System.out::println);

        System.out.println("\n===== order by name =====");
        menuList.stream()
                .sorted(comparing(Dish::getName))
                .collect(toList())
                .forEach(System.out::println);

        // order dishes by higher calories
        System.out.println("\n===== order by higher calories(descending order) =====");
        menuList.stream()
                .sorted(comparing(Dish::getCalories).reversed())
                .collect(toList())
                .forEach(System.out::println);

        // filter top 3 dishes of which calories are lower than 500 calories
        System.out.println("\n===== filter top 3 dishes =====");
        menuList.stream()
                .filter(dish -> dish.getCalories() < 500) // filter dishes of which calories are lower than 500
                .sorted(comparing(Dish::getCalories).reversed()) // order data (descending order)
                .limit(3) // select top 3 data
                .collect(toList()) // put data(3) in list
                .forEach(System.out::println); // print using 'for'(repeating)

        // limit() just return data by viewed order
        // need to sort data by specific order

    }

}

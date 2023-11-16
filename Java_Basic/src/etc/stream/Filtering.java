package etc.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static etc.stream.Menu.menuList;
import static java.util.stream.Collectors.toList;

public class Filtering {

    public static void main(String[] args) {
        
        // stream의 filter
        // 필터 조건에 맞는 데이터들을 필터링하여 리스트로 반환

        // 메뉴 중에 채식주의자가 먹을 수 있는 요리를 필터링
        menuList.stream()
                .filter(dish -> dish.isVegetarian())
                .collect(toList())
                .forEach(dish -> System.out.println(dish));

//        for (Dish dish : dishInVegetarian) {
//            System.out.println("dish = " + dish);
//        }
        
//        dishInVegetarian.forEach(dish -> System.out.println("dish = " + dish));
        System.out.println("\n===== filter dish which is meat and of which calories are less than 600 =====");

        menuList.stream()
                .filter(d->d.getType() == Dish.Type.MEAT && d.getCalories() < 600)
                .collect(toList())
                .forEach(d -> System.out.println(d));

        System.out.println("\n===== filter dish of which length of name is 4 =====");
        menuList.stream()
                .filter(dish -> dish.getName().length() == 4)
                .collect(toList())
                .forEach(d -> System.out.println(d));

        System.out.println("\n===== filter dish of which calories are more than 300 =====");
        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .limit(3) // 상위 top 3 추출
                .collect(toList())
                .forEach(d -> System.out.println(d));
        // not ordered by calories yet(first in first out)

        System.out.println("\n==================================================");
        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .skip(2) // 맨 앞 2개 제외시킴
                .collect(toList())
                .forEach(d -> System.out.println(d));

        System.out.println("\n===== filter 2 fish dishes which appeared first =====");
        menuList.stream()
                .filter(dish -> dish.getType() == Dish.Type.FISH)
                .limit(2)
                .collect(toList())
                .forEach(d -> System.out.println(d));

        List<Integer> numbers = List.of(1, 2, 1, 3, 3, 2, 4, 4, 5, 6);

        // 짝수만 걸러내기
        System.out.println("\n===== filter even number =====");
        List<Integer> filteredNumber = numbers.stream()
                .filter(number -> number % 2 == 0)
                .distinct() // remove duplicated values
                .collect(toList());
//                .forEach(n -> System.out.print(n+" "));
        System.out.println("filteredNumber = " + filteredNumber);

        // 중복 제거
        Set<Integer> distinctNumbers = new HashSet<>(filteredNumber);
        System.out.println(distinctNumbers);




    }
}

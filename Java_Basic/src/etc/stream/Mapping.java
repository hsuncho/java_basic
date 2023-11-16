package etc.stream;

import java.util.List;
import java.util.stream.Collectors;

import static etc.stream.Menu.*;
import static java.util.stream.Collectors.*;

public class Mapping {

    private static class DishNameType {
        private String name;
        private Dish.Type type;

        // general Constructor
        public DishNameType(Dish dish) {
            this.name = dish.getName();
            this.type = dish.getType();
        }

        @Override
        public String toString() {
            return "DishNameType{" +
                    "name='" + name + '\'' +
                    ", type=" + type +
                    '}';
        }
    }


    // 이름과 칼로리만 가진 클래스를 설계
    private static class SimpleDish {
        // static is generally for variable and method
        // but possible to use for inner class
        private String name;
        private int calories;

        public SimpleDish(String name, int calories) {
            this.name = name;
            this.calories = calories;
        }

        public SimpleDish(Dish dish) {
            this.name = dish.getName();
            this.calories = dish.getCalories();
        }

        @Override
        public String toString() {
            return "SimpleDish{" +
                    "name='" + name + '\'' +
                    ", calories=" + calories +
                    '}';
        }
    }

    public static void main(String[] args) {

        // stream의 map: 컬렉션 (리스트, 셋, 맵 ....)에서
        // 원하는 정보만 추출하여 새로운 컬렉션으로 반환해줌(일괄 처리 가능)

        List<Integer> nameList = menuList.stream()
                .map(dish -> dish.getCalories()) // type of dish.getName() is String
                .collect(toList());
        System.out.println("nameList = " + nameList);

        /*
            요리 목록에서 메뉴 이름과 칼로리를 추출하고 싶다.
        */

        menuList.stream()
                // if conveyed dish I will make SimpleDish object
//                .map(dish -> new SimpleDish(dish.getName(), dish.getCalories()))
                .map(dish -> new SimpleDish(dish))
                .collect(toList())
                .forEach(d -> System.out.println(d));

        /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰 음식들을
            필터링한 다음에 음식의 이름과 타입만 추출해서 출력해주세요.
        */

        System.out.println("=================================================");
        menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .map(dish -> new DishNameType(dish))
                .collect(toList())
                .forEach(d -> System.out.println(d));



    }

}

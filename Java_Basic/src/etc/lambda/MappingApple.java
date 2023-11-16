package etc.lambda;

import java.util.ArrayList;
import java.util.List;

public class MappingApple {

    // 사과의 색상만 추출(return type: colors)
    // if extract only weight of apples, return type will be Integer
    public static List<Color> mappingAppleByColor(List<Apple> apples) {
        List<Color> colorList = new ArrayList<>();
        for(Apple a: apples) {
            Color color = a.getColor(); // extract colors
            colorList.add(color); // add colors to colorList
        }
        return colorList;
    }

    public static <X, Y> List<Y> map(List<X> apples, GenericFunction<X,Y> mapper) {
        List<Y> mappedList = new ArrayList<>();
        for(X x: apples) {
            Y y = mapper.apply(x); // extract Y from X <- parameterize this action
            mappedList.add(y); // add to mappedList
        }
        return mappedList;
    }

}

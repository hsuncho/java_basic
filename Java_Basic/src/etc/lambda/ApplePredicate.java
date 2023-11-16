package etc.lambda;

@FunctionalInterface // 해당 인터페이스가 람다 표현식으로 객체 생성이 가능한 인터페이스인지를 검사
public interface ApplePredicate {

    // 사과를 전달받으면 조건에 맞는 검사를 수행하는 메서드
    boolean test(Apple apple);

    // 틀만 만들어 놓아 오버라이딩 될 거니까 조건이 무엇이냐에 따라 달라질 수 있는 거야
}

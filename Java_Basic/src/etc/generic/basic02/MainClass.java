package etc.generic.basic02;

public class MainClass {

	public static void main(String[] args) {

		Box<Integer, String> b = new Box<>(1,"홍길동");
		String name = b.get(1);

	}

}

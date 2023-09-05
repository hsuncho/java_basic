package etc.api.lang.obj;

public class MainClass {

	public static void main(String[] args) {

		Person park = new Person("박영희", 25);
		Person hong = new Person("홍길동", 24);
		
		String str = new String("hi");
		System.out.println(str); //toString 오버라이딩 되어있는 형태

		//객체 타입의 변수를 출력하거나 값을 얻을 때는
		//뒤에 자동으로 toString()이 붙어서 진행됩니다.
		//컴파일 과정에서 toString()이 자동적으로 붙음
		//원래 toString()은 주소값을 보여주지만, Person에서 오버라이딩이 진행되었기 때문에
		//주소값을 가지고 있는 변수를 호출하면 필드의 정보가 드러남
		System.out.println(park);
		System.out.println(hong);

		if(hong.equals(park)) {
			System.out.println("이름과 나이가 같네요!");
		} else {
			System.out.println("이름이 다를 수도, 나이가 다를 수도, 둘 다 다를 수도...");
		}
		
		//finalize는 gc가 호출되는 순서가 보장되지 않기 때문에
		//사용이 권장되지 않습니다.(deprecated)
//		hong = null;
//		park = null;
//		System.gc(); //가비지 컬렉터를 호출(부른다고 바로 안 올 수도 있습니다.)
		
		Person kim = new Person("김복제인간", 100);
		try {
			Person clonePerson = (Person) kim.clone();
			System.out.println("복사된 객체 정보: "+clonePerson);
			System.out.println("kim의 주소: "+kim.hashCode());
			System.out.println("복제된 객체 주소: "+clonePerson.hashCode());
			//toString이 오버라이딩되었으므로 더이상 toString으로 주소값을 볼 수 없음
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}

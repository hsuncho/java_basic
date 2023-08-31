package oop.poly.player;

public class Player {
	String name;
	int level;
	int atk;
	int hp;
	
	Player() {
		this.level = 1;
		this.atk =3;
		this.hp = 50;
	}
	
	Player (String name) {
		this(); 
		this.name = name;
	}
	
	Player(String name, int hp){
		this(name); 
		this.hp = hp;
	}
	
	void attack(Player target) {
		if(this == target) {
			System.out.println("스스로는 때릴 수 없습니다.");
			return; 
		}
			System.out.println(this.name+"(이)가 "+target.name+"(을)를 공격합니다.");
			target.hp-=10;
			this.hp+=5;
			System.out.println("나의 체력: "+this.hp+", 상대의 체력: "+target.hp);
	}

	void characterInfo() {
		System.out.println("*** 캐릭터의 정보 ***");
		System.out.println("# 아이디: "+name);
		System.out.println("# 레벨: "+level);
		System.out.println("# 공격력: "+atk);
		System.out.println("# 체력: "+hp);
		System.out.println("이 메서드를 호출한 객체의 이름: "+this.name);
	}
}












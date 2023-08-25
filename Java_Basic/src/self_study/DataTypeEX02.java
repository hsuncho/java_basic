package self_study;

public class DataTypeEX02 {

	public static void main(String[] args) {
		char a,b,c,d,e;
		
		a='A';
		System.out.printf("%c \t",a);
		System.out.printf("%d \n",(int)a);
		
		b='a';
		c=(char) (b+1);
		System.out.printf("%c \t",b);
		System.out.printf("%c \n", c);
		
		d=90;
		System.out.printf("%c \n", d);
		
		d='가';
		e =(char)(d+1);
		System.out.printf("%d \t",(int)d);
		System.out.printf("%c \n",e);
		
		String str1 = 2+3+"";
		String str2 = 2+""+3;
		String str3 = ""+2+3;
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
	}

}

package ActiveAndPassive_Class;

public class Mytest7 {
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("java.lang.String");
		System.out.println(clazz.getClassLoader());
		
		Class<?> clazz1 = Class.forName("ActiveAndPassive_Class.c");
		System.out.println(clazz1.getClassLoader());
	}
}
class c{
	
}
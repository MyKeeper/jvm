package ActiveAndPassive_Class;


/**
 * 对于静态字段来说，只有直接定义了该字段的类才会被初始化
 * 在这个程序中，虽然使用了mychild 子类的名字 但是并没有直接主动使用mychild类 
 * 所以mychild类是没有被初始化的 所以 mychild中的代码是不会被执行的
 * @author loser
 *
 */
public class Mytest01 {
	public static void main(String[] args) {
		//System.out.println(Mychild.str);
		System.out.println(Mychild.str2);
		/**
		 * 当调用mychild的str2时  达成了主动使用类的要求  同时要注意的是 如
		 * 果子类被初始化了 那么他的父类一定要先初始化
		 */
		/**
		 * -XX:+TraceClassLoading,这个虚拟机参数是用于追踪类的加载信息并打印出来
		 * 在main配置参数的界面  有个vm option中输入该字段 即可
		 * 在控制台 会打印类的加载信息
		 * 
		 * 在这里得出了一个结论，虽然上述代码中mychild没有被初始化，但是jvm已经将mychild加载了
		 */
	}
}

class Myparent1{
	public static String  str ="hello word";
	static{
		System.out.println("Myparent1 static block");
	}
}

class Mychild extends Myparent1 {
	public static String str2="welcome";
	static {
		System.out.println("Mychild static block");
	}
}
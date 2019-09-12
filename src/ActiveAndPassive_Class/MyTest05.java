package ActiveAndPassive_Class;

import java.util.UUID;

/**
 * 当一个接口被初始化时 并不要求其父接口都完成初始化
 * 如果一个接口中定义了一个有明确值得变量，那么他是 public static final修饰的 在类初始
 * 化的时候 他会被加载到调用它的方法的类的常量池中  这样 就会回出发对接口的主动调用 同样更不会出发接口父类的
 * 主动调用  他们两个都不会被初始化
 * 
 * 
 * 如果将子接口的关键字改为 class  这时候 接口编程了类  其中的变量修饰符就不会是final修饰的了
 * 所以他会被初始化   由于初始化一个类的时候 不会初始化他的父接口 所以a=6不会被打印出来
 * 
 * 当一个类被初始化的时候 他所实现的接口是不会被初始化的
 * 因为b是final的 值是明确的  所以他在初始化的时候 b会方法mytest5的常量池中  所以 mytest5在初始化之后就跟mychild5没有任何关系了
 * 只有当这正使用父接口的时候（如引用接口所定义的常量时），才会初始化
 * @author loser
 *
 */
/*public class MyTest05 {
	public static void main(String[] args) {
		System.out.println(MyChild5.b);
	}
}
interface MyParent5{
	public static int a =6;//接口中的常量都是public  static  fianl的
	
}
interface MyChild5 extends MyParent5{
	public static UUID b=UUID.randomUUID();
}*/
public class MyTest05 {
	public static void main(String[] args) {
		System.out.println(MyChild5.b);
	}
}
interface MyParent5{
	public static Thread thread = new Thread(){
		{
			System.out.println("myparent5 invoked");
		}
	};
}
interface MyChild5 extends MyParent5{
	public static UUID b=UUID.randomUUID();
}
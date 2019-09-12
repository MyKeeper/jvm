package ActiveAndPassive_Class;

import java.util.UUID;

public class Mytest3 {
	public static void main(String[] args) {
		System.out.println(MyParent3.str);
	}
}
/**
 * 这次静态代码块执行了  为什么？ 为什么明明已经声明为常量final型的了还是执行了
 * 》》此str 并不是编译期间就可以确定的的  像这样的只有运行期才能确定值的常量 会触发该类的初始化
 * 
 * 当一个常量的值并非编译期间可以决定的，那么其值就不会被放到调用类的常量池中，
 * 这时在程序运行时，会导致主动使用这个常量所在的类，显然会导致这个类被初始化
 * @author loser
 *
 */
class MyParent3{
	public static final String str = UUID.randomUUID().toString();//随机生成一个32位的uuid值  在编译期间 这个值是不知道的
	static{
		System.out.println("myparent static code");
	}
}
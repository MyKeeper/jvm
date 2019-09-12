package ActiveAndPassive_Class;
/**
 * 常量在编译阶段 会存入到调用这个常量的方法所在类的常量池中
 * 本质上，调用类并没有直接引用到定义的类，因此不会触发定义常量类的初始化
 * 注意：这里指的时将常量放到了Mytest2的常量池中，只有mytest2与parent2就再也没有关系了
 * 甚至，我们可以将myparent2的class文件删除
 * @author loser
 *
 */
public class MyTest02 {
	public static void main(String[] args) {
		System.out.println(MyParent2.str);
	}
}
class MyParent2{
	public static final String str = "hello word";
	static{
		System.out.println("myparent static block");
	}
}

package ActiveAndPassive_Class;

public class Mytest4 {
	public static void main(String[] args) {
		/**
		 * 创建一个类的实例的时候 表示对类的主动使用  既然时主动使用 就会导致静态代码块的执行
		 */
		//MyParent4 myParent4 = new MyParent4();
		/**
		 *对于数组类型，其类型时有jvm在运行期间动态生成的，表示[...classLoader.MyPreant4
		 *这种形式，动态生成的类型 其父类型就是object
		 *对于数组来说，javaDoc经常构成数组元素为Component 实际上就是数组降低一个维度后的类型
		 */
		MyParent4[] myParent4s = new MyParent4[1];
	}
}
class MyParent4{
	static{
		System.out.println("MyParent4 static block");
	}
}
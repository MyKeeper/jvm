package ActiveAndPassive_Class;

public class Mytest4 {
	public static void main(String[] args) {
		/**
		 * ����һ�����ʵ����ʱ�� ��ʾ���������ʹ��  ��Ȼʱ����ʹ�� �ͻᵼ�¾�̬������ִ��
		 */
		//MyParent4 myParent4 = new MyParent4();
		/**
		 *�����������ͣ�������ʱ��jvm�������ڼ䶯̬���ɵģ���ʾ[...classLoader.MyPreant4
		 *������ʽ����̬���ɵ����� �丸���;���object
		 *����������˵��javaDoc������������Ԫ��ΪComponent ʵ���Ͼ������齵��һ��ά�Ⱥ������
		 */
		MyParent4[] myParent4s = new MyParent4[1];
	}
}
class MyParent4{
	static{
		System.out.println("MyParent4 static block");
	}
}
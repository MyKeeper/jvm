package ActiveAndPassive_Class;

import java.util.UUID;

/**
 * ��һ���ӿڱ���ʼ��ʱ ����Ҫ���丸�ӿڶ���ɳ�ʼ��
 * ���һ���ӿ��ж�����һ������ȷֵ�ñ�������ô���� public static final���ε� �����ʼ
 * ����ʱ�� ���ᱻ���ص��������ķ�������ĳ�������  ���� �ͻ�س����Խӿڵ��������� ͬ������������ӿڸ����
 * ��������  �������������ᱻ��ʼ��
 * 
 * 
 * ������ӽӿڵĹؼ��ָ�Ϊ class  ��ʱ�� �ӿڱ������  ���еı������η��Ͳ�����final���ε���
 * �������ᱻ��ʼ��   ���ڳ�ʼ��һ�����ʱ�� �����ʼ�����ĸ��ӿ� ����a=6���ᱻ��ӡ����
 * 
 * ��һ���౻��ʼ����ʱ�� ����ʵ�ֵĽӿ��ǲ��ᱻ��ʼ����
 * ��Ϊb��final�� ֵ����ȷ��  �������ڳ�ʼ����ʱ�� b�᷽��mytest5�ĳ�������  ���� mytest5�ڳ�ʼ��֮��͸�mychild5û���κι�ϵ��
 * ֻ�е�����ʹ�ø��ӿڵ�ʱ�������ýӿ�������ĳ���ʱ�����Ż��ʼ��
 * @author loser
 *
 */
/*public class MyTest05 {
	public static void main(String[] args) {
		System.out.println(MyChild5.b);
	}
}
interface MyParent5{
	public static int a =6;//�ӿ��еĳ�������public  static  fianl��
	
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
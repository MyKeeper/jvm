package ActiveAndPassive_Class;
/**
 * �����ڱ���׶� ����뵽������������ķ���������ĳ�������
 * �����ϣ������ಢû��ֱ�����õ�������࣬��˲��ᴥ�����峣����ĳ�ʼ��
 * ע�⣺����ָ��ʱ�������ŵ���Mytest2�ĳ������У�ֻ��mytest2��parent2����Ҳû�й�ϵ��
 * ���������ǿ��Խ�myparent2��class�ļ�ɾ��
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

package ActiveAndPassive_Class;


/**
 * ���ھ�̬�ֶ���˵��ֻ��ֱ�Ӷ����˸��ֶε���Żᱻ��ʼ��
 * ����������У���Ȼʹ����mychild ��������� ���ǲ�û��ֱ������ʹ��mychild�� 
 * ����mychild����û�б���ʼ���� ���� mychild�еĴ����ǲ��ᱻִ�е�
 * @author loser
 *
 */
public class Mytest01 {
	public static void main(String[] args) {
		//System.out.println(Mychild.str);
		System.out.println(Mychild.str2);
		/**
		 * ������mychild��str2ʱ  ���������ʹ�����Ҫ��  ͬʱҪע����� ��
		 * �����౻��ʼ���� ��ô���ĸ���һ��Ҫ�ȳ�ʼ��
		 */
		/**
		 * -XX:+TraceClassLoading,������������������׷����ļ�����Ϣ����ӡ����
		 * ��main���ò����Ľ���  �и�vm option��������ֶ� ����
		 * �ڿ���̨ ���ӡ��ļ�����Ϣ
		 * 
		 * ������ó���һ�����ۣ���Ȼ����������mychildû�б���ʼ��������jvm�Ѿ���mychild������
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
package ActiveAndPassive_Class;

import java.util.UUID;

public class Mytest3 {
	public static void main(String[] args) {
		System.out.println(MyParent3.str);
	}
}
/**
 * ��ξ�̬�����ִ����  Ϊʲô�� Ϊʲô�����Ѿ�����Ϊ����final�͵��˻���ִ����
 * ������str �����Ǳ����ڼ�Ϳ���ȷ���ĵ�  ��������ֻ�������ڲ���ȷ��ֵ�ĳ��� �ᴥ������ĳ�ʼ��
 * 
 * ��һ��������ֵ���Ǳ����ڼ���Ծ����ģ���ô��ֵ�Ͳ��ᱻ�ŵ�������ĳ������У�
 * ��ʱ�ڳ�������ʱ���ᵼ������ʹ������������ڵ��࣬��Ȼ�ᵼ������౻��ʼ��
 * @author loser
 *
 */
class MyParent3{
	public static final String str = UUID.randomUUID().toString();//�������һ��32λ��uuidֵ  �ڱ����ڼ� ���ֵ�ǲ�֪����
	static{
		System.out.println("myparent static code");
	}
}
/*
 * �����
 * ����һ����̬���飬��������Ӷ���ʹ��ռ��25M�Ĵ�С������������ִ��
 * java -Xmx20m -Xms5m heap
 * ���ǻ�������Ӳ���-XX:+HeapDumpOnOutOfMemoryError,���ڴ����ʱ������������Ϣ
 * ����������ʹ����-XX:HeapDumpPath=d:/a.dump,��ָ�������ѵ�λ��
 */

import java.util.Vector;

public class heap{

	public static void main(String[] args){
		Vector v = new Vector();
		for(int i = 0; i < 25; i++)
			v.add(new byte[1*1024*1024]);
	}

}
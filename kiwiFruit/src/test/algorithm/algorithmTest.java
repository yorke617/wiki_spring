package test.algorithm;

import org.junit.Test;


public class algorithmTest {

	
	/**
	 * ��Ǯ��ټ�
	 */
	public void test1(){
		int cock,hen,chicken=0;
		for (cock = 0; cock < 20; cock++) {
			for (hen = 0; hen <= 33; hen++) {
				chicken = 100 - cock - hen;
				int p;
				p = chicken % 3;
				if(5*cock+3*hen+chicken/3 == 100 && p==0){
					System.out.println("������"+cock+";ĸ����"+hen+";С����"+chicken);
				}
			}
		}
	}
	
	//@Test
	/**
	 * ���ŵ��
	 */
	public void test2(){
		for (int i = 0; i < 100; i++) {
			int a = i%3;
			int b = i%7;
			int c = i%5;
			if (a == 1 && b == 4 && c == 0) {
				System.out.println("�����б���"+i);
				return;
			}
		}
	}
	@Test
	/**
	 * ��������
	 */
	public void test3(){
		int[] a = {22,321,212,32,3234,3,1,32,12,65,54};
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j = i-1;
			for (; j>=0 && a[j]>temp; j--) {
				a[j+1] = a[j];
			}
			a[j+1] = temp;
			for (int j2 = 0; j2 < a.length; j2++) {
				System.out.print(a[j2]+",");
			}
			System.out.println("-----"+j);
		}
	}
	/**
	 * ����������
	 */
	public void test4(){
		System.out.println("��1�������ӵĶ�����1");
		System.out.println("��2�������ӵĶ�����1");
		int f1 = 1, f2 = 1, m = 12;
		int f = 0;
		for (int i = 3; i <= m; i++) {
			f = f2;
			f2 = f1 + f2;
			f1 = f;
			System.out.println("��"+i+"�������ӵĶ�����"+f2);
		}
	}
	
}

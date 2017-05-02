package test.utilTest;

public class QueueUtil {
	private int queueCapacity;//��������
	private int queueLength;//���е�Ԫ�ظ���
	private int queueHead;//���е�ͷ
	private int queueTail;//���е�β
	private Object[] queue;//���е�������
	/**
	 * ���캯��
	 * @param capacity
	 */
	public QueueUtil(int capacity){
		queue = new Object[capacity];
		queueCapacity = capacity;
		clearQueue();
	}
	/**
	 * ��������е�Ԫ��
	 */
	public void clearQueue(){
		queueLength = 0;
		queueHead = 0;
		queueTail = -1;
	}
	/**
	 * ��ȡ���е�Ԫ�ظ���
	 * @return
	 */
	public int queueLength(){
		return queueLength;
	}
	/**
	 * �ж϶����Ƿ�����
	 * @return
	 */
	public boolean queueFull(){
		return queueLength == queueCapacity ? true : false;
	}
	/**
	 * �ж϶����Ƿ�Ϊ��
	 * @return
	 */
	public boolean queueEmpty(){
		return queueLength == 0 ? true : false;
	}
	/**
	 * Ϊ�������Ԫ��
	 * @param obj
	 * @return
	 */
	public boolean addQueue(Object obj){
		if (queueFull()) {
			//throw new Exception("������������������ӣ�");
			return false;
		}else{
			queueTail++;
			queueTail = queueTail%queueCapacity;
			queue[queueTail] = obj;			
			queueLength++;
			return true;
		}
			
	}
	/**
	 * ��ȡ���е�ͷԪ��
	 * @return
	 */
	public Object ObtainQueue(){
		Object obj;
		if (queueEmpty()) {
			return false;
		}else{
			obj = queue[queueHead];
			queueLength--;
			queueHead++;
			queueHead = queueHead%queueCapacity;
		}
		return obj;
	}
	
	@Override
	public String toString() {
		String output = "";
		int i = queueHead;
		System.out.println(queueHead);
		System.out.println(queueTail);
		while ( i != queueTail) {
			output = output + (queue[i].toString() +",");
			i++;
			i = i%queueCapacity;
		}
		
		return output;
	}
}

package test.utilTest;

public class QueueUtil {
	private int queueCapacity;//队列容量
	private int queueLength;//队列的元素个数
	private int queueHead;//队列的头
	private int queueTail;//队列的尾
	private Object[] queue;//队列的数据组
	/**
	 * 构造函数
	 * @param capacity
	 */
	public QueueUtil(int capacity){
		queue = new Object[capacity];
		queueCapacity = capacity;
		clearQueue();
	}
	/**
	 * 清除队列中的元素
	 */
	public void clearQueue(){
		queueLength = 0;
		queueHead = 0;
		queueTail = -1;
	}
	/**
	 * 获取队列的元素个数
	 * @return
	 */
	public int queueLength(){
		return queueLength;
	}
	/**
	 * 判断队列是否已满
	 * @return
	 */
	public boolean queueFull(){
		return queueLength == queueCapacity ? true : false;
	}
	/**
	 * 判断队列是否为空
	 * @return
	 */
	public boolean queueEmpty(){
		return queueLength == 0 ? true : false;
	}
	/**
	 * 为队列添加元素
	 * @param obj
	 * @return
	 */
	public boolean addQueue(Object obj){
		if (queueFull()) {
			//throw new Exception("队列已满，不可再添加！");
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
	 * 获取队列的头元素
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

package test.utilTest;

public class StackUtil {
	private int stackSize;
	private int stackTop;
	private Object[] stack;
	/**
	 * ���췽��
	 * @param size
	 */
	public StackUtil(int size){
		stackSize = size;
		stack = new Object[stackSize];
		clearStack();
	}
	/**
	 * ����ջ
	 */
	public void clearStack(){
		stackTop = 0;
	}
	/**
	 * �ж�ջ�Ƿ�Ϊ��
	 * @return
	 */
	public boolean stackEmpty(){
		return 0==stackTop ? true:false;
	}
	/**
	 * �ж�ջ�Ƿ�����
	 * @return
	 */
	public boolean stackFull(){
		return stackTop >= stackSize ? true : false;
	}
	/**
	 * ��ȡջ��Ԫ�ظ���
	 * @return
	 */
	public int stackLength(){
		return stackTop;
	}
	/**
	 * Ϊջ�����Ԫ��
	 * @param obj
	 * @return
	 */
	public void pushStack(Object obj) throws Exception{
		if (stackFull()) {
			throw new Exception("ջ�ڴ�������");
		}else{
			stack[stackTop] = obj;
			stackTop ++;
		}
	}
	/**
	 * ��ȡջԪ��
	 * @return
	 * @throws Exception
	 */
	public Object popStack() throws Exception{
		if (stackEmpty()) {
			throw new Exception("ջ����Ԫ�أ�");
		}else{
			return stack[--stackTop];
		}
	}
	
	@Override
	public String toString() {
		String output = "";
		for (int i = stackTop-1; i >= 0; i--) {
			output = output + stack[i].toString() + ",";
		}
		return output;
	}
	
}

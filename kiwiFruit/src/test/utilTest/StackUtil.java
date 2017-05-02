package test.utilTest;

public class StackUtil {
	private int stackSize;
	private int stackTop;
	private Object[] stack;
	/**
	 * 构造方法
	 * @param size
	 */
	public StackUtil(int size){
		stackSize = size;
		stack = new Object[stackSize];
		clearStack();
	}
	/**
	 * 清理栈
	 */
	public void clearStack(){
		stackTop = 0;
	}
	/**
	 * 判断栈是否为空
	 * @return
	 */
	public boolean stackEmpty(){
		return 0==stackTop ? true:false;
	}
	/**
	 * 判断栈是否已满
	 * @return
	 */
	public boolean stackFull(){
		return stackTop >= stackSize ? true : false;
	}
	/**
	 * 获取栈的元素个数
	 * @return
	 */
	public int stackLength(){
		return stackTop;
	}
	/**
	 * 为栈中添加元素
	 * @param obj
	 * @return
	 */
	public void pushStack(Object obj) throws Exception{
		if (stackFull()) {
			throw new Exception("栈内存已满！");
		}else{
			stack[stackTop] = obj;
			stackTop ++;
		}
	}
	/**
	 * 获取栈元素
	 * @return
	 * @throws Exception
	 */
	public Object popStack() throws Exception{
		if (stackEmpty()) {
			throw new Exception("栈中无元素！");
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

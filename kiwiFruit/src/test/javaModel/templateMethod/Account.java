package test.javaModel.templateMethod;

public abstract class Account {
	public final double calculateInterest(){
		String accountType = doGetAccountType();
		double accountAmount = calculateAmount(accountType);
		double rate = doCalculateInterestRate();
		return accountAmount * rate;
	}
	public abstract String doGetAccountType();
	public abstract double doCalculateInterestRate();
	public double calculateAmount(String accountType){
		if ("Money Market".equals(accountType)) {
			return 10000l;
		}else if ("Certificate of Deposite".equals(accountType)) {
			return 30000l;
		}else
			return 0l;
	}
}

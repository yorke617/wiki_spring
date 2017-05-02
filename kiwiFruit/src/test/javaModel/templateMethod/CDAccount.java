package test.javaModel.templateMethod;

public class CDAccount extends Account {

	@Override
	public double doCalculateInterestRate() {
		return 0.06;
	}

	@Override
	public String doGetAccountType() {
		return "Certificate of Deposite";
	}

}

package test.javaModel.templateMethod;

public class MoneyMarketAccount extends Account {

	@Override
	public double doCalculateInterestRate() {
		return 0.045;
	}

	@Override
	public String doGetAccountType() {
		return "Money Market";
	}

}

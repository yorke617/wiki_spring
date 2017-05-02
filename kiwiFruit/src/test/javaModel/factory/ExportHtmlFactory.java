package test.javaModel.factory;

public class ExportHtmlFactory implements ExportFactory {

	public ExportFile factory(String type) {
		if ("standard".equals(type)) {
			return new ExportStandardHtmlFile();
		}else if ("financial".equals(type)) {
			return new ExportFinancialHtmlFile();
		}
		return null;
	}

}

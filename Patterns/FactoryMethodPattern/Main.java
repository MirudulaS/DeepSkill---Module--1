
public class Main {
	public static void main(String[] args) {
		DocumentFactory factory;
		Document docs;
		// For Word Docs
		factory = new WordDocumentFactory();
		docs = factory.createDocument();
		docs.open();
		// For PDF Docs
		factory = new PdfDocumentFactory();
		docs = factory.createDocument();
		docs.open();
		// For Excel Docs
		factory = new ExcelDocumentFactory();
		docs = factory.createDocument();
		docs.open();
	}
}

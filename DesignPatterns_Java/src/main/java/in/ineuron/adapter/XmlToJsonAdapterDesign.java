package in.ineuron.adapter;

public class XmlToJsonAdapterDesign {
	
	public static void main(String[] args) {
		XMLData data= new XMLData("XML Data");
//		AnalyticsTool tool=new AnalyticsTool("JSON data");
		AnalyticsTool tool=new Adaptor(data);
		Client c=new Client(tool);
		c.startProcessing();
	}

}

class XMLData {
	String data;
	public XMLData(String data) {
		this.data=data;
	}
	@Override
	public String toString() {
		return "XMLData [data=" + data + "]";
	}
}

class AnalyticsTool{
	String data;
	public AnalyticsTool() {
	}
	public AnalyticsTool(String data) {
		this.data=data;
	}
	public void processData() {
		System.out.println("Processing Data:"+data);
	}
}

class Client{
	AnalyticsTool tool;
	public Client(AnalyticsTool tool) {
		this.tool=tool;
	}
	public void startProcessing() {
		tool.processData();
	}
}

class Adaptor extends AnalyticsTool{
	
	XMLData xmlData;

	public Adaptor(XMLData xmlData) {
		this.xmlData=xmlData;
	}
	
	@Override
	public void processData() {
		System.out.println("Converting XML to JSON and Processing Data:"+xmlData);
	}
	
}

import org.json.simple.JSONObject;

public class Demo {

    public static void main(Sting args[]) {

		JSONObject jsonObject;
		String line1, line2, line3;

		ReaderJSON r=new ReaderJSON();
		r.readerFromJSONFiles();

		jsonObject=r.getJsonObject();

		line1=(String)jsonObject.get("line1")

		System.out.println(line1);
		
		
	}

}

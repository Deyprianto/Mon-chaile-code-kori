public class Client {
    public static void main(String[] args) {
        JSON json = new JSON("");
        IAdaptee iAdaptee = new JsonToXmlAdapter(json);
        iAdaptee.convert(json);


    }
}
class XML{
public XML(String data) {
    System.out.println(data);
}
}
class JSON{
    public JSON(String data) {}
    XML convertToXml() {
        return new XML("Stringified json data");
    }
}
interface IAdaptee {
    XML convert(JSON json);
}
class JsonToXmlAdapter implements IAdaptee{
   private JSON json;
   public JsonToXmlAdapter(JSON json) {
    this.json = json;
   }
   public XML convert(JSON json) {
    return json.convertToXml();

   }
}
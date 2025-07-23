package AdapterDesignPattern.Ques2;

public class Adapter implements CsvReader{
    private JsonReader jsonReader;
    Adapter(JsonReader jsonReader){
        this.jsonReader = jsonReader;
    }

    @Override
    public void readCsv(String filePath){
        System.out.println("Converted csv at path " + filePath + " to json.");
        jsonReader.readJson(filePath);
    }
}

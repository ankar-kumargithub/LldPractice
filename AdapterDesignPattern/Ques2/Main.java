package AdapterDesignPattern.Ques2;

public class Main {
    public static void main(String[] args) {
        CsvReader csvReader = new Adapter(new JsonReader());
        csvReader.readCsv("C://ankit/Desktop/new.csv");
    }
}

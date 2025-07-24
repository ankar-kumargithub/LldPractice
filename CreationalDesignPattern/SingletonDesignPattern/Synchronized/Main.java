public class DbConnection{ 
    private static DbConnection connObject;

    // Constructor helps to create new object. So restricting it by making it private
    private DbConnection(){}

    // Exposing a method to get this object. Creating instance only when called for the first time.
    // Synchronized make this function thread safe by provideing access to only one thread at a time.
    // Hence Slow.
    public static synchronized  DbConnection getInstance(){
        if(connObject == null){
            connObject = new DbConnection();
        }
        return connObject;
    }
}
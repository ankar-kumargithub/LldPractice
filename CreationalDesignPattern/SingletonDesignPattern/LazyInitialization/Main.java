public class DbConnection{ 
    private static DbConnection connObject;

    // Constructor helps to create new object. So restricting it by making it private
    private DbConnection(){}

    // Exposing a method to get this object. Creating instance only when called for the first time.
    public static DbConnection getInstance(){
        if(connObject == null){
            connObject = new DbConnection();
        }
        return connObject;
    }
}
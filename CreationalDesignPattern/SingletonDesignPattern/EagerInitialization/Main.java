public class DbConnection{
    // Eager Initialization on loading of class. Making it static to be accesses via className
    private static DbConnection connObject = new DbConnection(); 
    
    // Constructor helps to create new object. So restricting it by making it private
    private DbConnection(){}

    // Exposing a method to get this object
    public static DbConnection getInstance(){
        return connObject;
    }
}
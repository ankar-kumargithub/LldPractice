package ProxyDesignPattern.Ques2;

public class Main {
    public static void main(String[] args) {
        CommandInterface executor = new CommandProxy("nonadmin", "1234");
        try {
            executor.runCommand("ls"); // allowed
            executor.runCommand("rm -rf /"); // throws Exception
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        CommandInterface adminExecutor = new CommandProxy("admin", "admin123");
        try {
            adminExecutor.runCommand("rm -rf /");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}

package ProxyDesignPattern.Ques2;

public class CommandExecutorImpl implements CommandInterface {
    @Override
    public void runCommand(String command) {
        System.out.println("Running Command : " + command);
    }
}

package ProxyDesignPattern.Ques2;

public class CommandProxy implements CommandInterface{
    private String userType;
    private String password;
    private CommandExecutorImpl commandExecutorImpl;

    public CommandProxy(String userType, String password){
        this.userType  = userType;
        this.password = password; 
        this.commandExecutorImpl = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String command) throws Exception{
        if(userType == "admin"){
            if(password != "admin123"){
                throw new Exception("Password for admin in incorrect!");
            }
            else{
                commandExecutorImpl.runCommand(command);
            }
        }
        else{
            if(command.contains("rm") || command.contains("del")){
                throw new Exception("Operation not allowed for non-admin users");
            }
            else{
                commandExecutorImpl.runCommand(command);
            }
        }
    }
}

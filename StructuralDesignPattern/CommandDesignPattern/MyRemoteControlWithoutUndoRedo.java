package CommandDesignPattern;

public class MyRemoteControlWithoutUndoRedo {

    ///Stack<ICommandWithoutUndoRedo> commandStack = new Stack<>();
    ICommandWithoutUndoRedo commandWithoutUndoRedo;

    MyRemoteControlWithoutUndoRedo(){
    }

    public void setCommand(ICommandWithoutUndoRedo  command){
        this.commandWithoutUndoRedo = command;
    }

    public void pressButton(){
        this.commandWithoutUndoRedo.execute();
    }
    
    /// public void undo(){
    /// if(!commandStack.isEmpty()){
    ///     ICommandWithoutUndoRedo lastCommand = commandSTack.pop();
    ///     lastCommand.undo
    ///  } 
    /// }
}

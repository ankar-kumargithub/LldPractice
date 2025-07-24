package CommandDesignPattern;

public class TurnAcOnCommand implements ICommandWithoutUndoRedo{
    AirConditioner airConditioner;
    TurnAcOnCommand(AirConditioner airConditioner){
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute(){
        airConditioner.turnOnAC();
    }

}

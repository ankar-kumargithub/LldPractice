package CommandDesignPattern;

public class TurnAcOffCommand implements ICommandWithoutUndoRedo{
    AirConditioner airConditioner;
    TurnAcOffCommand(AirConditioner airConditioner){
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute(){
        airConditioner.turnOffAC();
    }
}

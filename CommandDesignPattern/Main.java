package CommandDesignPattern;

class Main {
    public static void main(String args[]){
        /// Command design pattern solves by seperating the logic of 
        /// - Reciever
        /// - Invoker
        /// - Command
        AirConditioner airConditioner = new AirConditioner();
        MyRemoteControlWithoutUndoRedo remote = new MyRemoteControlWithoutUndoRedo();
        remote.setCommand(new TurnAcOffCommand(airConditioner));
        remote.pressButton(); 

        /// remote.undo();
    }
}
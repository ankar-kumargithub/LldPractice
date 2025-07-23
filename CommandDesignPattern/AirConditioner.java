package CommandDesignPattern;

public class AirConditioner {
    int temperature;
    boolean isOn;

    public void turnOnAC(){
        this.isOn = true;
        System.out.println("AC is On.");
    }

    public void turnOffAC(){
        this.isOn = false;
        System.out.println("AC is Off.");
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
        System.out.println("Temperature changed to: " + temperature);
    }
}

package CoffeeMachine;

public class Timer {
    int time;
    public void setTimer(int intime){
        this.time = intime;
    }
    public void startHeater(int temp){
        Heater ht= new Heater();
        while(this.time!=0){
            ht.setTemp(temp);
            this.time--;
        }
    }
}

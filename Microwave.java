
public class Microwave {
    private int power;
    private int time;
    
    public Microwave() {
        this.power = 0;
        this.time = 0;
    }
    
    public void pressPower() {
        this.power = this.power == 1 ? 2 : 1;
        System.out.println("Power button pressed. Microwave power is set to " + this.power + "%.");
    }
    
    public void pressTime() {
        this.time += 30;
        System.out.println("Time button pressed. Microwave time is set to " + this.time + " seconds.");
    }
    
    public void pressReset() {
        this.time = 0;
        this.power = 1;
        System.out.println("Reset button pressed. Microwave time and power are reset.");
    }
    
    public void pressStart() {
        System.out.println("Start button pressed. Microwave started with " + this.time + " seconds and " + this.power + "% power.");
    }
}

public class Main {
    public static void main(String[] args) {
        Microwave myMicrowave = new Microwave();
        myMicrowave.pressTime();
        myMicrowave.pressTime();
        myMicrowave.pressPower();
        myMicrowave.pressStart();
        myMicrowave.pressReset();
    }
}

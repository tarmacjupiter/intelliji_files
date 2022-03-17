package unit_9.lab.sub_classes;

import unit_9.lab.Strength;

import java.util.concurrent.ThreadLocalRandom;

public class PowerLifting extends Strength {
    private boolean hasBelt;

    public PowerLifting(String name, int workoutNum, int duration, int weight, boolean hasBelt) {
        super(name, workoutNum, duration, weight);
        this.hasBelt = hasBelt;
    }

    public void startHeavyLift() throws InterruptedException {
        System.out.println("Starting to lift VERY heavy");
        int rNum = ThreadLocalRandom.current().nextInt(0, 1);

        Thread.sleep(5);
        if(rNum === 0){
            System.out.println("Successful Heavy Lift!");
        } else {
            System.out.println("OOPS. Your back is broken!!!");
        }
    }
}

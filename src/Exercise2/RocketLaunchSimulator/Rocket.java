package Exercise2.RocketLaunchSimulator;

public class Rocket {
    private String stage = "Pre-Launch";
    private double fuel;
    private int altitude = 0;
    private int speed = 0;
    private boolean stageComplete = false;
    private boolean orbitAchieved = false;
    private int desiredOrbitAltitude;

    public Rocket(double initialFuel, int orbitAltitude) {
        this.fuel = initialFuel;
        this.desiredOrbitAltitude = orbitAltitude;
    }

    public String getStage() {
        return stage;
    }

    public double getFuel() {
        return fuel;
    }

    public int getAltitude() {
        return altitude;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isStageComplete() {
        return stageComplete;
    }

    public boolean isOrbitAchieved() {
        return orbitAchieved;
    }

    public int getDesiredOrbitAltitude() {
        return desiredOrbitAltitude;
    }

    public void updateState() {
        fuel -= 5;
        speed += 1000;
        if (altitude + 10 >= desiredOrbitAltitude) {
            altitude = desiredOrbitAltitude;
            achieveOrbit();
        } else {
            altitude += 10;
        }
    }

    public void stageSeparation() {
        stageComplete = true;
        stage = "Stage 2";
    }

    public void achieveOrbit() {
        orbitAchieved = true;
    }

    public void reduceFuel(double amount) {
        fuel -= amount;
    }
}

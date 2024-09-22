package Exercise2.RocketLaunchSimulator;

public class Rocket {
    private String stage = "Pre-Launch";
    private double fuel;
    private int altitude = 0;
    private int speed = 0;
    private boolean stageComplete = false;
    private boolean orbitAchieved = false;
    private int desiredOrbitAltitude;

    public Rocket(double fuel, int altitude) {
        this.fuel=fuel;
        this.desiredOrbitAltitude = altitude;
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
        altitude += 10;
        speed += 1000;
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

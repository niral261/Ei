package Exercise2.RocketLaunchSimulator;

import java.util.Random;

public class MissionControl {
    private Rocket rocket;
    private Random random = new Random();

    public MissionControl(Rocket rocket) {
        this.rocket = rocket;
    }

    public void runPreLaunchChecks() {
        System.out.println("All systems are 'Go' for launch.");
    }

    public void launchSequence() {
        System.out.println("Launching...");

        while (rocket.getFuel() > 0 && !rocket.isOrbitAchieved()) {
            rocket.updateState();

            if (randomEvent()) {
                System.out.println("System malfunction! Correcting...");
                rocket.reduceFuel(10);
            }

            printRocketState();

            if (rocket.getAltitude() >= 50 && !rocket.isStageComplete()) {
                rocket.stageSeparation();
                System.out.println("Stage 1 complete. Entering Stage 2.");
            }

            if (rocket.getAltitude() >= rocket.getDesiredOrbitAltitude() && !rocket.isOrbitAchieved()) {
                rocket.achieveOrbit();
                System.out.println("Orbit achieved! Mission Successful.");
                printMissionSummary();
                break;
            }

            try {
                Thread.sleep(1000); // Simulate each second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (rocket.getFuel() <= 0) {
            System.out.println("Mission Failed due to insufficient fuel.");
        }
    }

    public void fastForward(int seconds) {
        for (int i = 0; i < seconds; i++) {
            if (rocket.getFuel() <= 0) {
                System.out.println("Mission Failed due to insufficient fuel.");
                break;
            }

            rocket.updateState();

            if (randomEvent()) {
                System.out.println("System malfunction! Correcting...");
                rocket.reduceFuel(10);
            }

            printRocketState();

            if (rocket.getAltitude() >= 50 && !rocket.isStageComplete()) {
                rocket.stageSeparation();
                System.out.println("Stage 1 complete. Entering Stage 2.");
            }

            if (rocket.getAltitude() >= rocket.getDesiredOrbitAltitude() && !rocket.isOrbitAchieved()) {
                rocket.achieveOrbit();
                System.out.println("Orbit achieved! Mission Successful.");
                printMissionSummary();
                break;
            }
        }
    }

    private void printRocketState() {
        System.out.println("Stage: " + rocket.getStage() + ", Fuel: " + rocket.getFuel() + "%, Altitude: " + rocket.getAltitude() + " km, Speed: " + rocket.getSpeed() + " km/h");
    }

    private boolean randomEvent() {
        return random.nextDouble() < 0.05;
    }

    private void printMissionSummary() {
        System.out.println("\nMission Summary:");
        System.out.println("- Peak Altitude: " + rocket.getAltitude() + " km");
        System.out.println("- Max Speed: " + rocket.getSpeed() + " km/h");
        System.out.println("- Fuel Remaining: " + rocket.getFuel() + "%");
        System.out.println("- Mission Duration: " + (rocket.getAltitude() / 10) + " seconds");
    }
}


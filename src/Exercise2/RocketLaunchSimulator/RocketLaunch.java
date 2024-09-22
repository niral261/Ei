package Exercise2.RocketLaunchSimulator;

import java.util.Scanner;

public class RocketLaunch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial fuel percentage (e.g., 100): ");
        double fuel = sc.nextDouble();

        System.out.print("Enter desired orbit altitude (e.g., 120 km): ");
        int orbitAltitude = sc.nextInt();

        sc.nextLine(); 

        Rocket rocket = new Rocket(fuel, orbitAltitude);
        MissionControl missionControl = new MissionControl(rocket);

        System.out.println("Type 'start_checks' to begin pre-launch checks.");

        do {
            String command = sc.nextLine();

            switch (command) {
                case "start_checks":
                    missionControl.runPreLaunchChecks();
                    break;
                case "launch":
                    missionControl.launchSequence();
                    break;
                case "fast_forward":
                    System.out.print("Enter the number of seconds to fast forward: ");
                    int seconds = sc.nextInt();
                    sc.nextLine();
                    missionControl.fastForward(seconds);
                    break;
                default:
                    System.out.println("Unknown command. Available commands: start_checks, launch, fast_forward.");
            }
        } while (!rocket.isOrbitAchieved() && !(rocket.getFuel() <= 0));

        sc.close();
    }
}


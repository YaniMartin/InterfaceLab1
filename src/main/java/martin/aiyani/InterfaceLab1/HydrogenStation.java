package martin.aiyani.InterfaceLab1;

import java.util.Scanner;

/**
 * Created by yanimartin on 2/2/16.
 */
public class HydrogenStation implements FuelStation{
    private int hydrogen = 108;
    private int fuelLevel = 0;


    public void driveToStation() {
        if (fuelLevel <=2){
            System.out.println("Danger! Low fuel! Auto-route to power station...\n");
        }

    }

    public void refuelCars() {

        do{
            System.out.println("Refueling..." + fuelLevel + " gallons.\n");
            fuelLevel+=3;
            hydrogen -=3;
            if(hydrogen ==0){
                System.out.println("We sorry, this station has recently been attacked by a rabid flock of grey pigeons. We are out of fuel. Goodbye.\n");
                System.exit(0);
            }

            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } while(fuelLevel<36);
        System.out.println("You're all fueled and ready to float away!\n");

    }

    public void driveBack() {
        Mirai mirai = new Mirai();
        if (fuelLevel == 36){
            Scanner in = new Scanner(System.in);
            System.out.println("Do you want to keep driving? 'yes' or 'no'\n");
            String answer = in.next();
            answer.toLowerCase();

            if (answer.equals("yes")) {
                mirai.drive();
            }
            else{
                System.exit(0);
            }

        }

    }
}

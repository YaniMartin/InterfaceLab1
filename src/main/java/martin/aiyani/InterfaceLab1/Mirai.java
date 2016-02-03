package martin.aiyani.InterfaceLab1;

import java.util.Scanner;

/**
 * Created by yanimartin on 2/2/16.
 */
public class Mirai extends Car {
    private int fuelLevel = 35;
    private int distanceDriven = 0;

    public void startArt(){
        System.out.println("░░                           Σ▓▓▄                                 ''░░░░░░░░░░╣╢\n" +
                "░                        ╓▄▄▓▓▓█▓▄,                  ▄▄               '░░░░░░░░░\n" +
                "                    ╓▄▓▓▓▓▓▓▓▓▓█▀▓▓▓Γ               \"▓▓Q                ''░░░░░░\n" +
                "              ,▄▄▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▀         ,▄▄▄▄▓▓▓▓▓▓▓▓▓▓▓▄              '░░░░\n" +
                "          ~Φ▓▓▓▓▓▓▓█▀▀▀Γ`▀▀█▓▓▓▓▓▓▌  ╓╗▄▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌,             '░░\n" +
                "                             ▓▓▓▓▓▓▓▓▓▓▓▓▌Γ▀█▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓█▀▀              '░\n" +
                "                             ▀█▓▓▓▓▓█▓▓▓▓     ╙▀█▓▓▓▓█▀▀Γ`                      \n" +
                "                       ╓▓▓▓▓▓▓▓▓▓█▓▓▄▄▄▓██▒▀▓▓▄▄▄,                              \n" +
                "                    ╗▒╢▓▓▓▓▓▓▓▓▓▓▓█████▌çç╖╔-╥Θ████▓▒ƒ┬                         \n" +
                "                 ╓╣▌δ]▓▌  ▄▓▓▓▓▓▓▓,,,,,,,░░ ╫▒▒▄▄▄▄▄▄▄▄╨δδ╢@╥╖-,                \n" +
                "               ╓╬▀▀▀δ▓▓▄▄▄▓▓▓▓▓▓▌╙Σ╩╨╨δÅΘ╢░░░░ΣΣ▀▀▀▀▀╨Θ╜▀▀▀▀▀███▓▒å▓▓▄          \n" +
                "            ╥░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓    ▄▄,   '   '░⌐░▄▄▄▄▄╓╓,        ╙▀ ░░░        \n" +
                "░          ¿░è░░  ⌐ ▓▓▓▓▓▓▓▓▓▓▓▓  ▓▓▒▓▓▓Q      -╢▓▓▓▓▓▓▓▓Ü░░           ░▐       \n" +
                "░░░░      ]░]╦Q   \"░▓▓▓▓▓▓▓▓▓▓█▓ ▓▄█▌█▓▓▓▄      ╫▓▓▓▓▓▓▀ ░░            ░╕       \n" +
                "░░░░░░░░  ]░▓▓▓▄⌐   ▐▓▓▓▓▓▓▓▓▓▓▓µ▓▓▓▓▓█▓▓▓    ]╥▓▓▓▓▓▀,░▄▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓       \n" +
                "░░░░░░░░░░░╬▓▓▓▓░░░░⌂▓▓██████▀▀▀░▓▓▓╬▓▓▓▓▓µ⌐⌐ ]▓▓██▀░▄▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▀Q      \n" +
                "░░░░░░░░░░░δ█▓▓▓▌▄╣╣╣Σ╥╦╦╦╦╦╦╦╦╦╖▓▓▀▓▓▓▓▓▓▄Q▄▄▄▄▄▄▓▓███████▓▓▓▓▓▓▓▀▀▀▀▀Γ        \n" +
                "░░░░░░░░░░░░░▀▀██▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀█▀▀▀████▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀Γ`````   ");
    }
    @Override
    public void turnOn() {
        startArt();
        System.out.println("You Mirai has gained a brain! It's driving itself! (Careful not to light a match!)\n\n");
        Scanner in = new Scanner(System.in);
        System.out.println("Are you ready to fly? 'yes' or 'no'\n");
        String answer = in.next();
        answer.toLowerCase();

        if (answer.equals("yes") && fuelLevel > 1) {
            System.out.println("Mirai fuel cells activated\n");
            drive();

        } else if (answer.equals("no")){
           cowardEnd();
            System.exit(0);
        }
        else {
            turnOff();

        }
    }

    public void cowardEnd(){
        System.out.println("Really? Don't like to fly? Best find a boat, friend.\n");
    }

    @Override
    public void turnOff() {
        if (fuelLevel <= 0) {
            System.out.println("You don't have enough hydrogen to turn on! Powering off...\n");

        }

    }

    //assign fuelLevel to i??
    @Override
    public void refuel() {
        fuelLevel = 0;
        HydrogenStation hydrogenStation = new HydrogenStation();
        if (fuelLevel == 0){
            hydrogenStation.driveToStation();
            hydrogenStation.refuelCars();
            hydrogenStation.driveBack();

        }

    }

    public void drive() {
        fuelLevel = 36;
        distanceDriven = 0;

        for(int i=0; i<37; i+=3){
            System.out.println("You've driven " + distanceDriven + " and have " + fuelLevel + " gallons of hydrogen!\n");
            distanceDriven++;
            fuelLevel-=3;
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(fuelLevel ==0){


            }

        }
    }

}

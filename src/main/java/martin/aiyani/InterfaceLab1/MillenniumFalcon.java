package martin.aiyani.InterfaceLab1;

import java.util.Scanner;

/**
 * Created by yanimartin on 2/2/16.
 */
public class MillenniumFalcon extends Car {
    private int fuelLevel = 100000;
    private int distanceDriven = 0;

    public void startArt(){
        System.out.println("                    ,,µ▓█╤æææææ▓▓w▄,,,         ,,                               \n" +
                "           ▄▓▌#ΦΣΓΓ  ▄▄▄▓QΦ▓▓▓▓▌▄▄▄,  ▄▄█▀▀▀Γ▐▓▓▄█▓▄▄▓R▄                        \n" +
                "      ▓▀▌Γ  Γ ▄▄   \"█▓█▓▓▓▀Γ. ,æ▓Q▄▄Γ▀▓▓▓▓▓▓▓▌▄▄▄▄▓▓▓▓▌ó▓                       \n" +
                "   ▄δΓ▄▌▄▄▄æê▓▓█▀▀▀▓▓█▀▀█▓▌▄▄, ▀▀▓▓▓▓▓▓▓▌▄        .▓▀▓▓▌%▌                      \n" +
                "   ▀ΓΓ   ╓▀▓▓██▓▓▀ ▄▄mΦΓ▀▄█▀▀███▓▓▓▀▓██▀▀▀▓¼▄    ▐▀█▓▓▐▄█ Γ▄                    \n" +
                "  ▓    ▓▓▌  ,▄æñ▀Γ  ▄▌▓▀Γ ΓΓΓ▓   ▀▀▓▀▓▀▄ƒ  Γ▀▓W▄  ΓΣ▀▀     ▓▀▓▄                 \n" +
                "  ▌  ,▄██▓▓Γ ▌  ▄█▀▌▀Γ     ,█,,   ,,▀▄▄▀█▌x▄  Γ▀▓▀▄     ,▄▄██▌▀▄                \n" +
                "  ▓▓▓▓▄   █▌▄█▀Γ ▄▀       ▐▀▓▓▓▓▌. ▐▄  ▀▄ƒ▀▀▓▀▄  Γ▀▓▀▄  █▓▓▓▄▓▄µ▓▄▄             \n" +
                "   █▓▓▓▓ ▄▀▀  ,êΓ        ▄▀     ▀▀▀ΓΓ    Γ▀▄▓█▓▓▌w, Γ▀█▓▓▓▓▓█▀▀ Γ▀█▓,           \n" +
                "    ▀▓▓▓▓▄  ▄▀          ▓              ▄╤ƒ  Γ█▓▓▀▀▀▓¥▄  ▀▓█▄   ▄▓▓▓▓▓▓▄         \n" +
                "     ▀▓▓▓▓▓▓▌▄  ,#▀ΓΓΓΓ▀█▓▓▓▒▄▄▄▄▄▄▄▄▄▓▓▓▓▌¼▄▄#█▓▌▄ Γ▀▓▓█▀Γ▄▓▓▌▄▀▀▀▀  ▀▓▄       \n" +
                "         ▀▀▓▓▓▓▄▀  ▄▄▓▓▓▓▓▓▓▌▀▀▀▀▀▀▀▀▀▓▓▓▓█▌█    Γ▀██▓▓▓▓▓▓▓█▓▓▓▓▓▌▄    ▀▓▄     \n" +
                "            ▀▓▓▓▄▄▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▄▄▄  ▐███▄     ▄▄▄▄  Γ▀██▓█▀ ▀█▓▓▓▓▓▓▌▄  Γ▓▀,  \n" +
                "              ▀▓▓▓▓▓▓▓▓▓▀▐▄████▓▓▓▓▓▓▓▓▓▓▓▓▌9x╤▓▓▓▓█▀      ▀▀╤▄  ▀█▓▓▓▓▓▓▓▓▓▓▓  \n" +
                "                ▀█▓▓▓▓▓▄▄▓▓▓     `▀▀▀▀█▓▓▓▓▓▓▓▓▓▓▓▓▌τ*w▄▄,     Γ▀w▄  Γ▀█▓▓▓▓█▀  \n" +
                "                    Γ▀▀▀█▀▀               Γ▀▀█▓▓▓▓▓▓▓▓▓▓▓▄▄▌▀¥x╤▄#▀▀▄    Γ      \n" +
                "                                                 ▀▀▀█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓µ          \n" +
                "                                                       Γ▀▀▀████████▀Γ    ");
    }
    @Override
    public void turnOn() {
        startArt();
        System.out.println("The Millennium Falcon is stuck on autopilot! Hang on!\n\n");
        Scanner in = new Scanner(System.in);
        System.out.println("Did you find the seatbelt? 'yes' or 'no'\n");
        String answer = in.next();
        answer.toLowerCase();

        if (answer.equals("yes") && fuelLevel > 1) {
            System.out.println("Rickety hyperspace drives sputtering alive!\n");
            fuelLevel-=10000;
            drive();
        } else if (answer.equals("no")) {
            cowardEnd();
            System.exit(0);
        }
        else {
            turnOff();

        }
    }

    public void cowardEnd(){
        System.out.println("No? No? Why the bantha are you here then?!\n");
    }

    @Override
    public void turnOff() {
        if (fuelLevel <= 0) {
            System.out.println("The power core is exhausted! You've been flying too fast! Coasting to nearest outpost to refuel...\n");

        }

    }

    //assign fuelLevel to i??
    @Override
    public void refuel() {
        fuelLevel = 0;
        do{
            System.out.println("Refueling..." + fuelLevel + " watts.\n");
            fuelLevel+=10000;

            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while(fuelLevel<100001);
        System.out.println("You're all powered up and ready to fly!...if only Chewie can fix that autopilot...\n");


    }

    public void drive() {
        fuelLevel = 100000;
        distanceDriven = 0;

        for(int i=0;i<100001; i+=10000){
            System.out.println("You've flown " + distanceDriven + " and have " + fuelLevel + " watts of power.\n");
            distanceDriven++;
            fuelLevel-=10000;
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            if(fuelLevel ==0){
                turnOff();


            }

        }
    }


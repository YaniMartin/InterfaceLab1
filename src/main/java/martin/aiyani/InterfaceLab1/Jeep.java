package martin.aiyani.InterfaceLab1;

import java.util.Scanner;

/**
 * Created by yanimartin on 2/2/16.
 */
public class Jeep extends Car {
    private int fuelLevel = 20;
    private int distanceDriven = 0;


    public void startArt(){
        System.out.println("                            ,⌐~~~\"```  ,..,,╓µµ╔µ╤∞O                        \n" +
                "                               ╒▒╙ΓΓ^^^``            ]╤▌                        \n" +
                "                               ╫Γ                    ╬╬                         \n" +
                "                              (▒                µ═⌐,,▒▌                         \n" +
                "                              ΓW══╤╦#RRM≥MÆMR≤╗╫╨≈≈£Γ╠▄                         \n" +
                "                             ╒                    '  ▀@█▄```````∩┐              \n" +
                "             ,,╓╓▒╔½─~ⁿ\"\"`Ü ╚```````````````\"~    `╬╠▌Æ ▐        [              \n" +
                "            ▓▒\\ ▐╟½▀bΓΣ ,▄═Jµ~~~ⁿ`````       ,▐╬Q-═Å╩▒δΓ       ╒ ▒Jº═ºEE²²²φ    \n" +
                "            ▓▒▓▌▐▐▐▒▌▓▓▓▓▓▓▄▌ Φ▒╨╜╜╜^^^``      ▀▀Γ  ╠         ,▀╜     ,,   ▐    \n" +
                "          (τ▒╣ÜΓ▐▐▒▌▌▓▓▐╫.╢▀▌ ▐▄,,,,,═══≡mm*½##▒ⁿⁿ▄ƒΓ▀   ╙┴²*▀█,   ▄▓▓▓▓▓╕ ▐    \n" +
                "             µ  ▓▐▐▌▌▓▓▐ Γ` ▓▄▄▄▄▄▄▄▓▓▓▓▓▓▓▓▓▓▓▒  ▀Γ ╙▓▌▄▓▓▓▒▀▐▀▓ ▄▓▓▓▓▓▓▓µ╟    \n" +
                "          ≤█▓▌▒Γ▓▐▐▌▌▓▓▐4▄ ▓██▓▓▓▓▓███▓▓█▓▓▓▓▓▓▓Å         |   ╙Θ▀.▀▒▄▓▓▓▓▓▌▓    \n" +
                "        ƒ▄▀δ╫▌, ▀▓φ▌▌▓▓▐ `▐▀█▓█▓█▀▒▓▀╬▄▌▓▌▓▓▓▓▓▀▓½        ⌡      ╫Θ▓▀▀▌▀▓▓      \n" +
                "    ▐ΣΦ╙╩╩R╩█▓▓▓▒QQ▄▄▄▄▄,▄▓@Φ▓▓Γ▒▄Θ½▓▓▓█▓▓▓▓▓▓▓╕ ▌╦.-╥╥▒▄,▄▄▄▒▓▓▓╝▐▌▓▀▓▒▓▌      \n" +
                "     `@▄▄▄,,  ╕'   `Γ▀▀▀▀▓ ▐▄▓ÿ▄▄Φ▄██╙^▀▓█▓▓▓▓▓▓▓▓▓▓█▀▓▓▄█▓▌▒▒▓▓▀╨▓q▀▀▓▒▓▌      \n" +
                "      ▐█▓█▀▓▓▓▓▓▓▓▓▓▄▄╦▄,▓▓▓╣▄%▒▄╟▓δ ▄▒▄╙▓▌▓▓▓▓▓▓▓▓▀~ⁿ▀▀Θ▀δ▀Γ  ▓Σ╩▀▓▓█▄╣█Γ      \n" +
                "       µ█▀▓▓▌▀██▓▓▓▓▓▀▓█▀▓▓▓█Q▀▀Φ▓▓▄▌▄▓█▌▓▀▓▓▓Γ▀▀              └▓▓▒█▓▓▓█▌.      \n" +
                "       ╙▄▓▒▓▓▓▓▓▓▓▓▓█ ΓΓΓΓΣΣ▌╓▓▄▄▓▓▓▓██▓▓▀▀▓▌▌                   ▀█▓▓▓█Σ~`      \n" +
                "         ▀█▓▓▓▓▓▓▓█Γ        ▐²▀É▀▓▓▓▓▓▓█▄▀▓▓▓                  -~`              \n" +
                "        `~- ▐ΓΓΓ             ▓▓▓█▀▓▓▓▌▒▌▓▓▓▓          .⌐~`                      \n" +
                "                `~⌐.          █▓▓▓▀█▓▓▓▓▓█▀   .⌐~`                              \n" +
                "                        `ⁿ~-   Γ▀▀█▓▓▓█▀Γ`                                      \n" +
                "                                 `                                    ");
    }

    @Override
    public void turnOn() {
        startArt();
        System.out.println("Your Jeep! It's possessed! You have no control! (be sure to make use of handlebars) \n\n");

        Scanner in = new Scanner(System.in);
        System.out.println("Are you holding tight? 'yes' or 'no'\n");
        String answer = in.next();
        answer.toLowerCase();

        if (answer.equals("yes") && fuelLevel > 1) {
            System.out.println("Rugged engine roaring to life\n");
            drive();
        } else if (answer.equals("yes")){
            cowardEnd();
            System.exit(0);
        }
        else {
            turnOff();

        }
    }

    public void cowardEnd(){
        System.out.println("Really? You sissy. Go find a Prius.\n");
    }

    @Override
    public void turnOff() {
        if (fuelLevel <= 1) {
            System.out.println("You don't have enough gas run! Pushing to nearest gas station...\n");
        }

    }

    @Override
    public void refuel() {
        fuelLevel = 0;
        do{
            System.out.println("Refueling..." + fuelLevel + " gallons.\n");
            fuelLevel++;

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while(fuelLevel<21);
        System.out.println("You're all fueled and ready to take on the zombie invasion!\n");


    }

    public void drive() {
        fuelLevel = 20;
        distanceDriven = 0;

        for(int i=0; i<20; i++){
            System.out.println("You've driven " + distanceDriven + " miles and have " + fuelLevel + " gallons of gas.\n");
            distanceDriven++;
            fuelLevel--;
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(fuelLevel ==0){
                turnOff();

        }

        }
    }
}
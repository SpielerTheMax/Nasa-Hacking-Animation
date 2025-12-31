import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        final int min   = 150;
        final int max   = 250;
        final int minLetter   = 0;
        final int maxLetter   = 1;
        boolean stopped  = false;
        var random   = new Random();
        var scanner = new Scanner(System.in);

        try {
            System.out.println("Do u want to infect Nasa www.nasa.gov? [Y]es or [N]o");
            String choice   = scanner.nextLine().toUpperCase();
            while (true) {
                if (choice.equals("Y")) {
                    System.out.println("Proceeding ...");
                    scanner.close();
                    break;
                } else if (choice.equals("N")) {
                    System.out.println("Canceled infection ...");
                    scanner.close();
                    return;
                } else {
                    System.out.println("Couldn't read awnser your awnser! Please type [Y]es or [N]o!");
                    choice   = scanner.nextLine().toUpperCase();
                }
            }
            Thread.sleep(500);
            System.out.println("Getting ip-adress of Nasa www.nasa.gov ...");
            Thread.sleep(5000);
            System.out.println("Successfuly found ip-adress of www.nasa.gov: 169.204.100.2!");
            Thread.sleep(50);
            System.out.println("Connecting to ip-adress 169.204.100.2 ...");
            Thread.sleep(7000);
            System.out.println("Successfuly connected to 169.204.100.2 ...");
            Thread.sleep(50);
            System.out.println("Installing WannaCryV124 ...");
            Thread.sleep(15000);
            System.out.println("WannaCryV124 successfuly installed!");
            Thread.sleep(50);
            System.out.println("Running WannaCryV124 ...");
            Thread.sleep(5000);
            System.out.println("Starting infecting network ...");
            Thread.sleep(200);
            int amount  = random.nextInt((100 - 55) + 1) + 55;
            List<String> IPs    = new ArrayList<>();
            for (int i = 0; i < amount; i++) {
                Thread.sleep(100);
                int deviceId    =  random.nextInt((254 - 1) + 1) + 1;
                String ipAdress = "169.204.100." + Integer.toString(deviceId);
                boolean alreadyExists   = IPs.contains(ipAdress);
                if (!alreadyExists) {
                    System.out.println("Infected device with ip-adress " + ipAdress + "!");
                    IPs.add(ipAdress);
                }
            }
            Thread.sleep(1000);
            System.out.println("Encrypting all systems ...");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.err.println("Error 404!");
            stopped  = true;
        }
        while (true) {
            if (stopped) {
                break;
            }
            try {
                Thread.sleep(50);
                int amount  = random.nextInt((max - min) + 1) + min;
                String result   = "";
                for (int i = 0; i < amount; i++) {
                    int letter  = random.nextInt((maxLetter - minLetter) + 1) + minLetter;
                    result  = result + Integer.toString(letter);
                }
                System.out.println(result);
            } catch (InterruptedException e) {
                System.err.println("Error 404!");
                break;
            }
        }
    }
}
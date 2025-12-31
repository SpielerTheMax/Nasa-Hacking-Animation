import java.util.Random;

public class Main {
    public static void main(String[] args){
        final int min   = 150;
        final int max   = 250;
        final int minLetter   = 0;
        final int maxLetter   = 1;
        boolean stopped  = false;
        var random   = new Random();
        try {
            System.out.println("Searching ip of Nasa www.nasa.gov ...");
            Thread.sleep(5000);
            System.out.println("Successfuly found ip of www.nasa.gov: 192.269.1.1!");
            Thread.sleep(50);
            System.out.println("Connecting to ip-adress 192.269.1.1 ...");
            Thread.sleep(7000);
            System.out.println("Successfuly connected to 192.269.1.1 ...");
            Thread.sleep(50);
            System.out.println("Installing WannaCryV124 ...");
            Thread.sleep(15000);
            System.out.println("WannaCryV124 successfuly installed!");
            Thread.sleep(50);
            System.out.println("Running WannaCryV124 ...");
            Thread.sleep(1000);
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
import java.util.Scanner;

public class EcosystemProject {
    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    
    System.out.print("How many foxes do you want? ");
    int foxes = scnr.nextInt();
    System.out.print("How many rabbits do you want? ");
    int rabbits = scnr.nextInt();

    Species fox = new Species(foxes, 2, 2);
    Species rabbit = new Species(rabbits, 4, 0);

    boolean running = true;
    int i = 0;
    
    while (rabbit.getSize() > 1 && fox.getSize() > 1 && running) {
        
        if (i > 49) {
            running = false;
        }
        
        System.out.println("Rabbits: " + rabbit.getSize());
        
        int currentRateOfChange = rabbit.getRateOfChange(fox.totalFoodRate());
        System.out.println("New Rabbits: " + currentRateOfChange);
        rabbit.updateSize(currentRateOfChange);
        System.out.println("Rabbits after day: " + rabbit.getSize());

        
        int starvedFoxes = fox.totalFoodRate() - rabbit.getSize();
        if (starvedFoxes < 0) { starvedFoxes = 0; }
        System.out.println("Starved foxes: " + starvedFoxes);
        foxes = fox.getRateOfChange(starvedFoxes);
        System.out.println("Foxes after babies and starvation: " + foxes);
        fox.updateSize(foxes);

        i++;
    }
    }
}












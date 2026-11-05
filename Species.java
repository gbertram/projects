public class Species {
    private int size;
    private int reproRate; // per day
    private int food; // units needed per day

    public Species(int size, int reproRate, int food) {
        this.size = size;
        this.reproRate = reproRate;
        this.food = food;
    }

    public int getSize() { return size; }
    public int getReproRate() { return reproRate; }
    public int getfood() {return food;}

    public int totalReproRate() { return size * reproRate; }
    
    public int totalFoodRate() { return size * food;}
    
    public int getRateOfChange(int starveOrEaten) {
        int rateOfChange = totalReproRate() - starveOrEaten;
        return rateOfChange;
    }

    public void updateSize(int theRateOfChange) {
        size = theRateOfChange + size;
    }
    
}

/* a species has a size, reproductionRate, and food*/
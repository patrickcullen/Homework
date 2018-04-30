public class Waterbottle {
    private String name;
    private double volume;

    public Waterbottle(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return this.name;
    }

    public double getVolume() {
        return this.volume;
    }

    public double Drink() {
        this.volume -= 10;
        return this.volume;
    }

    public double Empty() {
        this.volume = 0;
        return this.volume;
    }

    public double Fill() {
        this.volume = 100;
        return this.volume;
    }

}
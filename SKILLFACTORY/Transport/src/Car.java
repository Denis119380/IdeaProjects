public class Car extends Transport {

    int maxPassengers;

    public Car(int fuel, int speed, int maxPassengers) {
        super(fuel, speed);
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int getFuelLevel() {
        return fuel;
    }

    @Override
    public boolean canMove(int n) {
        if (fuel >= n) {
            fuel -= n;
            return true;
        }
        else return false;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }
}
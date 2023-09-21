public class Tank {

    String name;

    private int x, y;
    private int dir;
    private int fuel = 100;

    public Tank(String name) {
        this.name = name;
    }

    public Tank(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public Tank(String name, int x, int y, int fuel) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.fuel = fuel;
    }


    public void goForward(int i) {
        if (fuel > 0) {
            if (i > 0) {
                fuel = fuel - i;
                if (fuel <= 0) {
                    i = i + fuel;
                }
            } else {
                fuel = fuel + i;
                if (fuel <= 0) {
                    i = i - fuel;
                }
            }
            if (dir == 0) x += i;
            else if (dir == 1) y += i;
            else if (dir == 2) x -= i;
            else y -= i;
        }
    }

    public void printPosition() {
        System.out.println("The Tank " + name + " is at " + x +", " + y + " now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        goForward(-i);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDir() {
        return dir;
    }

    public int getFuel() {
        return fuel;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}

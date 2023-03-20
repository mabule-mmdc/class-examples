public class Car extends Vehicle {
    int makeUTurn() {
        this.moveForward(1);
        this.steerRight();
        this.moveForward(1);
        this.steerRight();
        this.moveForward(1);

        return this.getTotalDistance();
    }

    public void moveForward(Integer distance) {
        System.out.println("I'm moving");
    }
}

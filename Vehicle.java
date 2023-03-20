public class Vehicle {
    String color;
    int wheels;
    String make;
    String model;
    String gas_type;
    Boolean requires_gas;
    private Integer total_distance = 0;

    int getTotalDistance() {
        return this.total_distance;
    }

    void setTotalDistance(Integer distanceToSet) {
        this.total_distance = distanceToSet;
    }

    public void moveForward(Integer distance) {
        this.setTotalDistance(this.addToTotalDistance(distance));
    }

    void moveForward(Integer distance, String statement) {
        this.setTotalDistance(this.addToTotalDistance(distance));

        System.out.println(statement);
    }

    void moveReverse(Integer distance) {
        this.setTotalDistance(this.addToTotalDistance(distance));
    }

    Integer addToTotalDistance(Integer distance) {
        System.out.println("Current distance " + this.total_distance);
        System.out.println("Distance to add " + distance);

        Integer totalDistance = this.total_distance + distance;

        System.out.println("New total distance " + totalDistance);
        return totalDistance;
    }

    void steerLeft() {

    }

    void steerRight() {

    }
}

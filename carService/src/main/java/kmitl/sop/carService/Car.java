package kmitl.sop.carService;

public class Car {
	private String color;
    private String type;
    private int displacement;
    private boolean sunroof;
    private int speed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public boolean isSunroof() {
        return this.sunroof;
    }

    public void setaSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
}

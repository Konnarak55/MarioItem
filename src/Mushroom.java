//65362769 Benyapa Kaeophaprap
public class Mushroom extends Item {

    public Mushroom() {
        this.name = "Mushroom";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void show() {
        this.appear = true;
        System.out.printf("");
    }

    public void getshow() {
        this.show();
    }

    
    public void run(int[] distance) {
        if (getAppear()) {
            System.out.println("Mushroom is moving...");
            int[] currentLocation = getLocation();
            currentLocation[0] = currentLocation[0] + distance[1];
            currentLocation[1] = currentLocation[1] - distance[0];
            setLocation(currentLocation);
            System.out.println("Mushroom is at location" + currentLocation[0] + "," + currentLocation[1]);
        } else {
            System.out.println("Mushroom is disappeard!");
        }
    }
}

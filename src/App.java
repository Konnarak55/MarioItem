//65362769 Benyapa Kaeophaprap
public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Item i1 = new Item();
        Mushroom m1 = new Mushroom();
        FireFlower f1 = new FireFlower();
        Starman s1 = new Starman();
        m1.show();
        s1.run(new int[] { 5, 0 });
        m1.setAppear(true);
        s1.setAppear(false);
        System.out.println(" : " + m1.getLocation());
        m1.run(new int[] { 10, 10 });

    }
}

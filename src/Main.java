// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Point p1=new Point(); // wywolanie konstruktora w nawiasach podajemy od razu dane do przekazania w zmiennych klasy
        p1.x=5;
        p1.y=6;    //to cout w cpp
        //System.out.println("Twoj x to " + p1.x + " a twoj y to " + p1.y); //taki cout, + to takie << w cout
        System.out.println(p1);
        System.out.println(p1.toSvg());

    }
}
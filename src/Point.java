public class Point {
    public double x;  //dostep do zmiennej w całym pliku (private-dostepne tylko w danej klasie)
    public double y;

    public String toString(){       //Metoda to taka funkcja dla klasy
        return "x="+x+" y="+y;
    }
    public String toSvg(){
        return " <svg height=\"100\" width=\"100\" xmlns=\"http://www.w3.org/2000/svg\">\n" +
                "  <circle r=\"45\" cx=\""+x+"\" cy=\""+y+"\" fill=\"red\" />\n" +
                "</svg> ";  //pojedynczy backslash tu pozwala wstawic cudzyslow, to po http oznacza skąd brac znaczniki
    }
}

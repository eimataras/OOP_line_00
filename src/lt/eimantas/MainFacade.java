package lt.eimantas;

import model.Line;
import model.Point;


public class MainFacade {


    public static void main(String[] args) {
        // write your code here
        Point start = new Point(1f, 1f, "Balta");
        Point end = new Point(5f, 4f, "Raudona");
        Line linija = new Line(start, end);
        System.out.println(start);
        System.out.println(end);
        System.out.println(linija);
        System.out.println("Ar start lygus end: "+start.equals(end));
        System.out.println("Ar start lygus start: "+start.equals(start));
    }
}

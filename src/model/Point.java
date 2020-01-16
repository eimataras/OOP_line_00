package model;

public class Point {

    //----------KINTAMIEJI--------------------------------------------
    private Float x;
    private Float y;
    private String color;


    //----------KONSTRUKTORIAI--------------------------------------------
    public Point() {
    }

    public Point(Float parX, Float parY) {
        x = parX;
        y = parY;
    }

    public Point(Float parX, Float parY, String parColor) {
        x = parX;
        y = parY;
        color = parColor;
    }

    public Point(String parColor) {
        color = parColor;
    }


    //----------METODAI--------------------------------------------

    public Double getDistance(Point parEnd) {
        return Math.sqrt(Math.pow(parEnd.x - x, 2) + Math.pow(parEnd.y - y, 2));
    }


    public int getQuarterIF() {
        int result = -1;

        if ((x >= 0) && (y >= 0)) {
            result = 0;
        } else if ((x >= 0) && (y < 0)) {
            result = 1;
        } else if ((x < 0) && (y < 0)) {
            result = 2;
        } else if ((x < 0) && (y >= 0)) {
            result = 3;
        }
        return result;
    }


    public boolean isSameQuarter(Point parPoint) {
        // if, return true/false
        return getQuarterIF() == parPoint.getQuarterIF();
    }

    @Override   //Ar du taskai vienodi?------------------------
    public boolean equals(Object obj) {
        boolean result = false;
        Point point = (Point) obj;
        if (point.x == x && point.y == y && point.color.equals(color)) {
            result = true;
        }
        return result;
    }

    @Override
    public String toString() {
        return "(" + x + " ; " + y + ")" + color;
    }
}

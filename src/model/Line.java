package model;

public class Line {
    private Point start;
    private Point end;

    public Line () {}



    public Line(Point parStart, Point parEnd) {
        start = parStart;
        end = parEnd;
    }




    public Double getLength() {
        return start.getDistance(end);
    }

    public int getStartQuarter() {
        return start.getQuarterIF();
    }

    public int getEndQuarter() {
        return end.getQuarterIF();
    }


    @Override
    public String toString() {
        String result = "ilgis: "+getLength()+"" +
                "\nPradzios ketvirtis: "+getStartQuarter()+
                "\nPabaigos ketvirtis: "+getEndQuarter()+
                "\nPradzios taskas: " +start.toString() +
                "\nPabaigos taskas: "+end.toString();
        return result;
    }
}

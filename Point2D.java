package selfStudy.Proje1.Point2D;

/**
 * Represents a point in a two-dimensional Cartesian coordinate system.
 *
 * This class stores x and y coordinates as real numbers and provides
 * basic geometric operations such as distance calculations.
 */
public class Point2D {
    private double x;
    private double y;

    Point2D(double x,double y){
        this.x=x;
        this.y=y;
    }
    /**
     * Copy Constructor
     *
     * Creates a Point2D object as given the point
     *
     * @param other the Point2D object to copy
     *
    * */
    Point2D(Point2D other){
        x=other.x;
        x=other.y;
    }
    /**
     * Getter method
     *
     * Returns the x value of the point
     *
     * @return the x value
     *
     */
    public double getX(){
        return x;
    }

    /**
     * Getter method
     * Returns the y value of the point
     *
     * @return the y value
     */
    public double getY(){
        return y;
    }

    /**
     * Returns a new Point2D object with the same coordinates.
     *
     * @return a new Point2D object representing the same point
     */
    public Point2D getPoint(){
        return new Point2D(getX(),getY());
    }

    /**
    *
    * Returns a point in String format
     * ex: (x,y)
     *
     * @return a formatted string representing the point
    *
    * */
    public String toString(){
        return "("+getX()+","+getY()+")";
    }

    /*
    *
    * It calculates the distance between this point and another point
    *
    *
    * @param other the other Point2D object
    * @return the distance between the two points
    * */
    public double distanceTo(Point2D other){
        return Math.sqrt(Math.pow(x-other.getX(),2)+Math.pow(y- other.getY(),2));
    }
    /*
    * It calculates the perpendicular distance from this point to a given line
    *
    * The line is assumed to be in the form y = mx + n
    *
    * @param line the Line2D object
    * @return the perpendicular distance from the point to the line
    * */
    public double distanceTo(Line2D line){
        return Math.abs(line.getM()*getX()+-1*getY()+ line.getN())/Math.sqrt(Math.pow(line.getM(),2)+1);

    }
}

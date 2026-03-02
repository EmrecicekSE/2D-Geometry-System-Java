package selfStudy.Proje1.Point2D;
/**
 * Represents a line in a two-dimensional Cartesian coordinate system.
 *
 * The line is expressed in slope-intercept form:
 *
 *     y = mx + n
 *
 *
 * m -> slope of the line
 * n -> y-intercept of the line
 */
public class Line2D {
    private double m;   // m is slope of the line
    private double n;


    Line2D(double m,double n){
        this.m=m;
        this.n=n;
    }
    /**
     * Copy constructor.
     * Creates a new Line2D object with the same slope
     * and intercept as the given line.
     *
     * @param other the Line2D object to copy
     */
    Line2D(Line2D other){
        m=other.m;
        n=other.n;
    }
    /*
    * Getter method
    *
    * It returns the slope of the line
    *
    * @return the slope (m)
    * */
    public double getM(){
        return m;
    }
    /*
    * Getter method
    *
    * Returns the y-intercept of the line.
    *
    * @return the intercept (n)
    * */
    public double getN(){
        return n;
    }

    /**
     * Returns a string representation of the line
     * in slope-intercept form.
     *
     * Example: y=2.0x+3.0
     *
     * @return formatted string representation of the line
     */
    @Override
    public String toString(){
        return "y="+getM()+"x+"+getN();
    }


    /*
    * It checks the slope of this line is equal to the slope of other line
    *
    * Two lines are parallel if their slopes are equal.
    *
    * @param other the other Line2D object
    * @return true if the lines are parallel, false otherwise
    * */
    public boolean isParallel(Line2D other){
        if(this.getM()==other.getM()){
            return true;
        }
        else{return false;}
    }

    /**
     * Computes the intersection point of this line
     * with another line
     *
     * If the lines are parallel the method prints
     * a message and returns null
     *
     * @param other the other Line2D object
     * @return the intersection point as a Point2D object
     *         or null if the lines are parallel
     */
    public Point2D intersection(Line2D other){
        if(!isParallel(other)){
            double newX=(this.getN()-other.getN())/ (other.getM()-this.getM());
            double newY=other.getM()*newX+other.getN();
            return new Point2D(newX,newY);
        }
        else{
            System.out.println("Same slope");
            return null;}
    }
}

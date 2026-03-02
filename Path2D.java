package selfStudy.Proje1.Point2D;
import java.util.ArrayList;

/**
 * Represents a path consisting of multiple 2D points.
 *
 * A Path2D object stores an ordered list of Point2D objects.
 * It can calculate the total length of the path and combine
 * two paths into a new one.
 */
public class Path2D {

    ArrayList<Point2D> points;

    /**
     * Constructs an empty Path2D object.
     * Initializes an empty list of points.
     */
    Path2D(){
        points=new ArrayList<>();
    }

    /**
     * Copy constructor.
     * Creates a new Path2D object using another Path2D object.
     *
     * @param other the Path2D object to copy
     */
    Path2D(Path2D other){
        points=other.points;
    }

    /**
     * Returns a string representation of the path.
     *
     * Points are displayed in order and separated by "===".
     *
     * Example:
     * (0.0,0.0)===(1.0,1.0)===(2.0,2.0)
     *
     * @return formatted string representation of the path
     */
    @Override
    public String toString() {
        String str="";
        for(int i=0;i<points.size();i++){
            if(i==points.size()-1){
                str+=points.get(i);
                break;
            }
            str+=points.get(i);
            str+="===";
        }
        return str;
    }

    /**
     * Adds a new point to the path.
     *
     * @param other the Point2D object to be added
     */
    void addPoint(Point2D other){
        points.add(other);
    }

    /**
     * Returns the number of points in the path.
     *
     * @return the size of the path
     */
    int size(){
        int count=0;
        while(count<points.size()){
            count++;
        }
        return count;
    }

    /**
     * Computes the total length of the path.
     *
     * The length is calculated as the sum of distances
     * between consecutive points.
     *
     * @return total path length
     */
    double length(){
        double length=0;
        for(int i=0;i<points.size()-1;i++){
            length+=points.get(i).distanceTo(points.get(i+1));
        }
        return length;
    }

    /**
     * Combines this path with another path.
     *
     * A new Path2D object is created containing
     * all points from this path followed by
     * all points from the other path.
     *
     * @param other the Path2D object to combine with
     * @return a new combined Path2D object
     */
    Path2D combine(Path2D other){
        Path2D newPath=new Path2D();

        for(int i=0;i<this.size();i++){
            newPath.addPoint(this.points.get(i));
        }
        for(int i=0;i<other.size();i++){
            newPath.addPoint(other.points.get(i));
        }
        return newPath;
    }
}
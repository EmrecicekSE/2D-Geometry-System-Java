package selfStudy.Proje1.Point2D;


public class Demo {
    public static void main(String[] args){
        System.out.println("====Point Test====");
        Point2D p1=new Point2D(0,0);
        Point2D p2=new Point2D(3,4);

        System.out.println("P1: "+p1);
        System.out.println("P2: "+p2);

        System.out.println("Distance p1-p2: " + p1.distanceTo(p2)); // should be 5

        System.out.println("\n===== LINE TEST =====");
        Line2D l1 = new Line2D(1,0);     // y = x
        Line2D l2 = new Line2D(-1,0);    // y = -x
        Line2D l3 = new Line2D(1,5);     // y = x + 5

        System.out.println("Line 1: " + l1);
        System.out.println("Line 2: " + l2);
        System.out.println("Line 3: " + l3);


        System.out.println("Are line 1 and line 3 parallel? :"+l1.isParallel(l3)); // should be true
        System.out.println("Intersection point of Line 1 and Line 2 :"+l1.intersection(l2));


        System.out.println("\n===== POINT TO LINE DISTANCE =====");
        System.out.println("Distance from p2 to l1: " + p2.distanceTo(l1));


        System.out.println("\n===== PATH TEST =====");
        Path2D path1 = new Path2D();
        path1.addPoint(new Point2D(0,0));
        path1.addPoint(new Point2D(3,4));
        path1.addPoint(new Point2D(6,8));

        System.out.println("Path1: " + path1);
        System.out.println("Path1 size: " + path1.size());
        System.out.println("Path1 length : " + path1.length()); // should be 10


        Path2D path2 = new Path2D();
        path2.addPoint(new Point2D(10,10));
        path2.addPoint(new Point2D(20,20));

        System.out.println("\nPath2: " + path2);

        Path2D combined = path1.combine(path2);
        System.out.println("\nCombined Path: " + combined);
        System.out.println("Combined length: " + combined.length());











    }
}

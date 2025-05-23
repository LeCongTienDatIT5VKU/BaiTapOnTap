package Ex2_9;

class MyPoint {
 private int x;
 private int y;

 public MyPoint(int x, int y) {
     this.x = x;
     this.y = y;
 }
 public int getX() {
     return x;
 }
 public void setX(int x) {
     this.x = x;
 }
 public int getY() {
     return y;
 }
 public void setY(int y) {
     this.y = y;
 }
 public double distance(MyPoint another) {
     int xDiff = this.x - another.x;
     int yDiff = this.y - another.y;
     return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
 }
 @Override
 public String toString() {
     return "(" + x + "," + y + ")";
 }
}
class MyTriangle {
 private MyPoint v1, v2, v3;

 public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
     this.v1 = new MyPoint(x1, y1);
     this.v2 = new MyPoint(x2, y2);
     this.v3 = new MyPoint(x3, y3);
 }
 public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
     this.v1 = v1;
     this.v2 = v2;
     this.v3 = v3;
 }
 public double getPerimeter() {
     double side1 = v1.distance(v2);
     double side2 = v2.distance(v3);
     double side3 = v3.distance(v1);
     return side1 + side2 + side3;
 }
 public String getType() {
     double side1 = v1.distance(v2);
     double side2 = v2.distance(v3);
     double side3 = v3.distance(v1);

     if (side1 == side2 && side2 == side3) {
         return "Equilateral";
     } else if (side1 == side2 || side2 == side3 || side3 == side1) {
         return "Isosceles";
     } else {
         return "Scalene";
     }
 }
 @Override
 public String toString() {
     return "MyTriangle[v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + "]";
 }
}


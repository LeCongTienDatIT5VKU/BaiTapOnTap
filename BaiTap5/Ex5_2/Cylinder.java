package BaiTap5.Ex5_2;

class Cylinder {
    private Circle base; 
    private double height;

    public Cylinder(double radius, String color, double height) {
        this.base = new Circle(radius, color); // Tạo Circle bên trong
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * Math.pow(base.getRadius(), 2) * height;
    }

    @Override
    public String toString() {
        return "Cylinder[base=" + base + ", height=" + height + "]";
    }
}


package BaiTap5.Ex5_1;

class Point {
    protected int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

class LineSub extends Point {
    private int x2, y2; // Điểm thứ hai của đoạn thẳng

    public LineSub(int x, int y, int x2, int y2) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public String toString() {
        return "LineSub from " + super.toString() + " to (" + x2 + "," + y2 + ")";
    }
}


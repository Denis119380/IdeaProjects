public class LimitingRectangle {
    int[][] points;

    int maxX, minX;
    int maxY, minY;

    public LimitingRectangle(int[][] points) {
        this.points = points;
    }


    public int getDifValFirst() {
        maxX = points [0][0];
        minX = points [0][0];

        for (int i = 0; points.length > i; i++) {
            if (maxX < points[i][0]) maxX = points[i][0];
            if (minX > points[i][0]) minX = points[i][0];
        }
        return maxX - minX;

    }
    public int getDifValSecond() {
        maxY = points [0][1];
        minY = points [0][1];

        for (int i = 0; i < points.length; i++) {
            if (maxY < points[i][1]) maxY = points[i][1];
            if (minY > points[i][1]) minY = points[i][1];
        }
        return maxY - minY;
    }
    public String getBorders() {
        return minY + ", " + maxY + ", " + minX + ", " + maxX;
    }
}
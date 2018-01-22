package com.company;

public class Robot {

    private int x;  
    private int y;

    public Robot() {
        x = 0;
        y = 0;
    }

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void mover(int ex, int ey) {

        if (ex >= -1 && ex <= 1 &&
                ey >= -1 && ey <= 1 &&
                (ex == 0 || ey == 0) &&
                x > -10 && x < 10 &&
                y > -10 && y < 10
                ) {

            x += ex;
            y += ey;
        }
    }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}

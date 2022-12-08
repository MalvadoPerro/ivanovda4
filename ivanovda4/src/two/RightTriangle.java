package two;

import static java.lang.Math.sqrt;

public class RightTriangle {
    int cathet1;
    int cathet2;
    int hypotenuse;

    public RightTriangle(int cathet1, int cathet2) {
        this.cathet1 = cathet1;
        this.cathet2 = cathet2;
    }

    public int len_hypo() {
        hypotenuse = (int) sqrt(cathet1 * cathet1 + cathet2 * cathet2);
        return  hypotenuse;
    }


}

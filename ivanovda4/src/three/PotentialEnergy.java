package three;

public class PotentialEnergy {
    final static int g = 10;
    int h;
    int m;

    public PotentialEnergy() {
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int calc_energy() {
        int energy = m * g * h;
        return energy;
    }
}

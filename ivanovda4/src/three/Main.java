package three;

public class Main {
    public static void main(String[] args) {
        PotentialEnergy energy = new PotentialEnergy();

        energy.setM(2);
        energy.setH(10);

        System.out.println("Потенциальная энергия тела массой " + energy.getM() + " кг на высоте " + energy.getH() + " м равно " + energy.calc_energy() + " Дж.");
    }
}

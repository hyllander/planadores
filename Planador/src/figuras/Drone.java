package figuras;

public class Drone implements Voador {
    @Override
    public void voar() {
        System.out.println("Drone está voando.");
    }

    @Override
    public void planar() {
        System.out.println("Drone está planando.");
    }

    @Override
    public void pousar() {
        System.out.println("Drone está pousando.");
    }
}

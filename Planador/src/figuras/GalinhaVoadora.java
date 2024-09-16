package figuras;

public class GalinhaVoadora implements Voador {
    @Override
    public void voar() {
        System.out.println("Galinha Voadora está voando.");
    }

    @Override
    public void planar() {
        System.out.println("Galinha Voadora está planando.");
    }

    @Override
    public void pousar() {
        System.out.println("Galinha Voadora está pousando.");
    }
}

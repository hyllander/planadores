package figuras;

public class MeuVoador implements Voador {
    @Override
    public void voar() {
        System.out.println("Meu Voador está voando.");
    }

    @Override
    public void planar() {
        System.out.println("Meu Voador está planando.");
    }

    @Override
    public void pousar() {
        System.out.println("Meu Voador está pousando.");
    }
}

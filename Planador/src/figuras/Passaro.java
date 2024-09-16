package figuras;

public class Passaro implements Voador {
    private String especie; // Atributo específico da classe Passaro

    public Passaro(String especie) {
        this.especie = especie;
    }

    @Override
    public void voar() {
        System.out.println(especie + " está voando.");
    }

    @Override
    public void planar() {
        System.out.println(especie + " está planando.");
    }

    @Override
    public void pousar() {
        System.out.println(especie + " está pousando.");
    }

    public void cantar() { // Método específico da classe Passaro
        System.out.println(especie + " está cantando.");
    }
}

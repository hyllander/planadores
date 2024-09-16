package figuras;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Voador[] voadores = new Voador[10];

        // Instanciar aleatoriamente 10 voadores
        for (int i = 0; i < voadores.length; i++) {
            int tipo = random.nextInt(4); // Gera um número aleatório entre 0 e 3
            switch (tipo) {
                case 0:
                    voadores[i] = new GalinhaVoadora();
                    break;
                case 1:
                    voadores[i] = new Drone();
                    break;
                case 2:
                    voadores[i] = new MeuVoador();
                    break;
                case 3:
                    voadores[i] = new Passaro("Pássaro Azul"); // Passaro com uma espécie específica
                    break;
            }
        }


        for (Voador voador : voadores) {

            voador.voar();
            voador.planar();
            voador.pousar();


            if (voador instanceof Passaro) {
                Passaro passaro = (Passaro) voador;
                passaro.cantar();
            }
        }
    }
}

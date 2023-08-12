import java.util.ArrayList;

public class Boletim {
    private double pesoTotal;
    private double notaTotal;
    private double media;

    public Boletim() {
        pesoTotal = 0;
        notaTotal = 0;
        media = 0;
    }

    public void adicionarNota(double nota, double peso) {
        pesoTotal += peso;
        notaTotal += nota * peso;
        media = notaTotal / pesoTotal;
    }

    public boolean hasPassed() {
        return media > 7;
    }

}

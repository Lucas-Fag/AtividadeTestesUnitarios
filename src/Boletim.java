public class Boletim {
    private double pesoTotal;
    private double notaTotal;
    private double media;

    public Boletim() {
        pesoTotal = 0;
        notaTotal = 0;
        media = 0;
    }

    public void adicionarNota(double nota, double peso) throws Exception {
        if (nota < 0 || nota > 10) {
            throw new Exception("Nota inválida");
        }

        pesoTotal += peso;
        notaTotal += nota * peso;

        media = notaTotal / pesoTotal;
    }

    public boolean hasPassed() {
        return media >= 7;
    }

    public double getMedia() {
        return media;
    }

    public double getNotaTotal() {
        return notaTotal;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

}

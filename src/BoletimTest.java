import org.junit.Assert;
import org.junit.Test;

public class BoletimTest {

    @Test
    public void verificaNotaXPeso() throws Exception {
        Boletim boletim = new Boletim();

        boletim.adicionarNota(8, 2);

        Assert.assertEquals(boletim.getNotaTotal(), 16.0, 0.01);
    }

    @Test
    public void verificaMedia() throws Exception {
        Boletim boletim = new Boletim();

        boletim.adicionarNota(5, 1);
        boletim.adicionarNota(10, 2);
        boletim.adicionarNota(7, 1);

        Assert.assertEquals(boletim.getMedia(), 8.0, 0.01);
    }

    @Test
    public void verificaAprovacao() throws Exception {
        Boletim boletim = new Boletim();

        boletim.adicionarNota(6, 1);
        boletim.adicionarNota(7.5, 2);

        Assert.assertTrue(boletim.hasPassed());
    }

    @Test(expected = Exception.class)
    public void naoAceitaNotaMenorQueZero() throws Exception {
        Boletim boletim = new Boletim();

        boletim.adicionarNota(-1, 1);
    }

    @Test(expected = Exception.class)
    public void naoAceitaNotaMaiorQueDez() throws Exception {
        Boletim boletim = new Boletim();

        boletim.adicionarNota(10.5, 1);
    }

}

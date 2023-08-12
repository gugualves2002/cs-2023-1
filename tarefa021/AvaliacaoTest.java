package br.com.gilmar;

import static org.junit.Assert.assertEquals;

import br.com.gilmar.Avaliacao;
import org.junit.Test;

public class AvaliacaoTest {
    private double nota1;
    private double nota2;
    private double faltas;
    private double cargaHoraria;
    private String resultadoEsperado;
    private final Avaliacao avaliacao = new Avaliacao();

    @Test(expected = ValoresInvalidosException.class)
    public void CT01(){
        nota1 = null;
        nota2 = 7.00;
        faltas = 16;
        cargaHoraria = 64;
        resultadoEsperado = "Valores Inválidos.";
        assertEquals(resultadoEsperado, avaliacao.avalia(nota1, nota2, faltas, cargaHoraria));
    }

    @Test(expected = ValoresInvalidosException.class)
    public void CT02(){
        nota1 = 4.00;
        nota2 = null;
        faltas = 16;
        cargaHoraria = 64;
        resultadoEsperado = "Valores Inválidos.";
        assertEquals(resultadoEsperado, avaliacao.avalia(nota1, nota2, faltas, cargaHoraria));
    }

    @Test(expected = ValoresInvalidosException.class)
    public void CT03(){
        nota1 = 4.00;
        nota2 = 7.00;
        faltas = null;
        cargaHoraria = 64;
        avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
    }

    @Test(expected = ValoresInvalidosException.class)
    public void CT04(){
        nota1 = 0;
        nota2 = 0;
        faltas = 16;
        cargaHoraria = null;
        avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
    }

    @Test(expected = ValoresInvalidosException.class)
    public void CT06(){
        nota1 = -4.00;
        nota2 = 7.00;
        faltas = 8;
        cargaHoraria = 32;
        avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
    }

    @Test(expected = ValoresInvalidosException.class)
    public void CT07(){
        nota1 = 4.00;
        nota2 = -7.00;
        faltas = 8;
        cargaHoraria = 32;
        avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
    }

    @Test(expected = ValoresInvalidosException.class)
    public void CT08(){
       nota1 = -4.00;
        nota2 = 7.00;
        faltas = 8;
        cargaHoraria = -32;
        avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
    }

    @Test(expected = ValoresInvalidosException.class)
    public void CT09(){
        nota1 = 4.00;
        nota2 = 7.00;
        faltas = -8;
        cargaHoraria = 32;
        avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
    }

    @Test(expected = ValoresInvalidosException.class)
    public void CT10(){
        nota1 = 4;
        nota2 = 7.00;
        faltas = 8;
        cargaHoraria = 32;
        avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
    }

    @Test(expected = ValoresInvalidosException.class)
    public void CT11(){
        nota1 = 4.00;
        nota2 = 7;
        faltas = 8;
        cargaHoraria = 32;
        avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
    }

    @Test(expected = ValoresInvalidosException.class)
    public void CT12(){
        nota1 = 4.00;
        nota2 = 7.00;
        faltas = 8;
        cargaHoraria = 32.00;
        avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
    }

    @Test(expected = ValoresInvalidosException.class)
    public void CT13(){
        nota1 = 4.00;
        nota2 = 7.00;
        faltas = 8.00;
        cargaHoraria = 32;
        avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
    }

    @Test(expected = ValoresInvalidosException.class)
    public void CT14(){
        nota1 = 11.00;
        nota2 = 7.00;
        faltas = 8;
        cargaHoraria = 32;
        avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
    }

    @Test(expected = ValoresInvalidosException.class)
    public void CT15(){
        nota1 = 4.00;
        nota2 = 15.00;
        faltas = 8;
        cargaHoraria = 32;
        avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
    }

    @Test(expected = ValoresInvalidosException.class)
    public void CT16(){
        nota1 = 4.00;
        nota2 = 7.00;
        faltas = 8;
        cargaHoraria = 250;
        avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
    }

    @Test(expected = ValoresInvalidosException.class)
    public void CT17(){
        nota1 = 4.00;
        nota2 = 7.00;
        faltas = 35;
        cargaHoraria = 32;
        avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
    }

    @Test(expected = ValoresInvalidosException.class)
    public void CT18(){
        nota1 = 4.0;
        nota2 = 7.00;
        faltas = 8;
        cargaHoraria = 32;
        avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
    }

    @Test(expected = ValoresInvalidosException.class)
    public void CT19(){
        nota1 = 4.00;
        nota2 = 7.0;
        faltas = 8;
        cargaHoraria = 32;
        avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
    }

    @Test(expected = ValoresInvalidosException.class)
    public void CT20(){
        nota1 = 4.000;
        nota2 = 7.00;
        faltas = 8;
        cargaHoraria = 32;
        avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
    }

    @Test(expected = ValoresInvalidosException.class)
    public void CT21(){
        nota1 = 4.00;
        nota2 = 7.000;
        faltas = 8;
        cargaHoraria = 32;
        avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
    }

    @Test(expected = ValoresInvalidosException.class)
    public void CT22(){
        nota1 = 4.00;
        nota2 = 7.00;
        faltas = 10;
        cargaHoraria = 32;
        resultadoEsperado = "Reprovado por Falta.";
        try {
            assertEquals(resultadoEsperado, avaliacao.avalia(nota1, nota2, faltas, cargaHoraria));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test(expected = ValoresInvalidosException.class)
    public void CT23(){
        nota1 = 0.00;
        nota2 = 0.00;
        faltas = 16.00;
        cargaHoraria = 64.00;
        resultadoEsperado = "Reprovado por Média.";
        assertEquals(resultadoEsperado, avaliacao.avalia(nota1, nota2, faltas, cargaHoraria));
    }

    @Test(expected = ValoresInvalidosException.class)
    public void CT24(){
        nota1 = 2.00;
        nota2 = 1.00;
        faltas = 8;
        cargaHoraria = 32;
        resultadoEsperado = "Prova Extra.";
        assertEquals(resultadoEsperado, avaliacao.avalia(nota1, nota2, faltas, cargaHoraria));
    }

    @Test(expected = ValoresInvalidosException.class)
    public void CT25(){
        nota1 = 6.00;
        nota2 = 8.00;
        faltas = 8;
        cargaHoraria = 32;
        resultadoEsperado = "Aprovado.";
        assertEquals(resultadoEsperado, avaliacao.avalia(nota1, nota2, faltas, cargaHoraria));
    }
}

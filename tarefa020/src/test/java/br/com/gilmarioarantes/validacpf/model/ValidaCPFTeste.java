package br.com.gilmarioarantes.validacpf.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidaCPFTeste {
    @Test
    public void testValidCPFs() {
        ValidaCPF validaCPF = new ValidaCPF();

        // Casos válidos de CPF
        assertTrue(validaCPF.isCPF("123.456.789-09"));
        assertTrue(validaCPF.isCPF("12345678909"));
        assertTrue(validaCPF.isCPF("123.456.78909"));
        assertTrue(validaCPF.isCPF("123456789-09"));
    }

    @Test
    public void testInvalidCPFs() {
        ValidaCPF validaCPF = new ValidaCPF();

        // Casos inválidos de CPF
        assertFalse(validaCPF.isCPF("987.654.321-99"));
        assertFalse(validaCPF.isCPF("98765432199"));
        assertFalse(validaCPF.isCPF("987.654.32199"));
        assertFalse(validaCPF.isCPF("987654321-99"));
    }

    @Test
    public void testInvalidCPFsRepeatedDigits() {
        ValidaCPF validaCPF = new ValidaCPF();

        // Casos de CPF inválido com dígitos repetidos
        assertFalse(validaCPF.isCPF("000.000.000-00"));
        assertFalse(validaCPF.isCPF("999.999.999-99"));
    }

    @Test
    public void testInvalidCPFsIncorrectSize() {
        ValidaCPF validaCPF = new ValidaCPF();

        // Casos de CPF inválido com tamanho incorreto
        assertFalse(validaCPF.isCPF("123.456-78"));
        assertFalse(validaCPF.isCPF("123.456.789.012"));
    }

    @Test
    public void testInvalidCPFsNonNumericCharacters() {
        ValidaCPF validaCPF = new ValidaCPF();

        // Casos de CPF inválido com caracteres não numéricos
        assertFalse(validaCPF.isCPF("12@.45#678-90"));
        assertFalse(validaCPF.isCPF("AB3.CD6.FGH-IJ"));
    }

    @Test
    public void testValidCPFsWithCorrectVerifiers() {
        ValidaCPF validaCPF = new ValidaCPF();

        // Casos de CPF válido com dígitos verificadores corretos
        assertTrue(validaCPF.isCPF("529.982.247-25"));
    }

    @Test
    public void testInvalidCPFsWithIncorrectVerifiers() {
        ValidaCPF validaCPF = new ValidaCPF();

        // Casos de CPF inválido com dígitos verificadores incorretos
        assertFalse(validaCPF.isCPF("529.982.247-26"));
    }

    @Test
    public void testValidCPFsWithDifferentFormats() {
        ValidaCPF validaCPF = new ValidaCPF();

        // Casos de CPF válido com diferentes formatações
        assertTrue(validaCPF.isCPF(" 123 456 789 09 "));
        assertTrue(validaCPF.isCPF(" 123 - 456 - 789 - 09 "));
    }

    @Test
    public void testInvalidCPFsWithLeadingZeros() {
        ValidaCPF validaCPF = new ValidaCPF();

        // Casos de CPF inválido com zeros à esquerda
        assertFalse(validaCPF.isCPF("001.002.003-04"));
    }

    @Test
    public void testInvalidCPFsOneCorrectVerifier() {
        ValidaCPF validaCPF = new ValidaCPF();

        // Casos de CPF inválido com apenas um dígito verificador correto
        assertFalse(validaCPF.isCPF("529.982.247-20"));
        assertFalse(validaCPF.isCPF("529.982.247-21"));
    }
    
}

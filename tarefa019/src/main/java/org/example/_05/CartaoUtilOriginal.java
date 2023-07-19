package org.example._05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CartaoUtilOriginal {
    private final String numero;
    private final String validade;

    public CartaoUtilOriginal(String numero, String validade) {
        this.numero = numero;
        this.validade = validade;
    }

    public boolean isValido() {
        boolean validadeOK = isValidExpiryDate(validade);
        if (!validadeOK) {
            return false;
        }

        String formatado = removeNonNumericCharacters(numero);
        if (formatado.isEmpty()) {
            return false;
        }

        boolean formatoOK = isValidCardFormat(formatado);
        if (!formatoOK) {
            return false;
        }

        boolean luhnValido = isValidLuhnAlgorithm(formatado);
        if (!luhnValido) {
            return false;
        }

        return true;
    }

    private boolean isValidExpiryDate(String expiryDate) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/yyyy");
            Date expiry = dateFormat.parse(expiryDate);

            Calendar today = Calendar.getInstance();
            today.set(Calendar.DATE, 1);

            Calendar expiryCal = new GregorianCalendar();
            expiryCal.setTime(expiry);
            expiryCal.set(Calendar.DATE, 1);

            return expiryCal.after(today);
        } catch (ParseException e) {
            return false;
        }
    }

    private String removeNonNumericCharacters(String cardNumber) {
        return cardNumber.replaceAll("\\D+", "");
    }

    private boolean isValidCardFormat(String cardNumber) {
        return cardNumber.matches("^4(\\d{12}|\\d{15})$") || // VISA
                cardNumber.matches("^5[1-5]\\d{14}$") ||       // MASTERCARD
                cardNumber.matches("^3[47]\\d{13}$") ||        // AMEX
                cardNumber.matches("^3[68]\\d{12}|0[0-5]\\d{11}$"); // DINERS
    }

    private boolean isValidLuhnAlgorithm(String cardNumber) {
        int sum = 0;
        boolean doubleDigit = false;

        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(cardNumber.substring(i, i + 1));
            if (doubleDigit) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }
            sum += digit;
            doubleDigit = !doubleDigit;
        }

        return sum % 10 == 0;
    }
}
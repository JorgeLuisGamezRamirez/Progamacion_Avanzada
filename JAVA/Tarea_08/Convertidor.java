package Tarea08_mauijava;

import java.text.NumberFormat;
import java.util.Locale;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyConverter {
    private static final double EXCHANGE_RATE = 0.85; // Ejemplo: tasa de cambio de USD a EUR

    public String convertUsdToEur(double amount) {
        double convertedAmount = amount * EXCHANGE_RATE;
        return NumberFormat.getCurrencyInstance(Locale.GERMANY).format(convertedAmount);
    }
}

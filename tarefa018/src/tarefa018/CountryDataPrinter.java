package tarefa018;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class CountryDataPrinter {
    public static void main(String[] args) {
        Locale[] locales = {
                Locale.US,
                Locale.UK,
                Locale.GERMANY,
                Locale.FRANCE,
                Locale.ITALY,
                Locale.JAPAN,
                new Locale("es", "ES"),
                new Locale("pt", "BR"),
                new Locale("ru", "RU"),
                new Locale("zh", "CN")
        };

        for (Locale locale : locales) {
            ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);

            System.out.println(messages.getString("country.name") + ": " + locale.getDisplayCountry());
            System.out.println(messages.getString("country.language") + ": " + locale.getDisplayLanguage());
            System.out.println(messages.getString("country.short.date") + ": " + DateFormat.getDateInstance(DateFormat.SHORT, locale).format(new Date()));
            System.out.println(messages.getString("country.long.date") + ": " + DateFormat.getDateInstance(DateFormat.LONG, locale).format(new Date()));
            System.out.println(messages.getString("country.time.format") + ": " + DateFormat.getTimeInstance(DateFormat.DEFAULT, locale).format(new Date()));

            Currency currency = Currency.getInstance(locale);
            System.out.println(messages.getString("country.currency.symbol") + ": " + currency.getSymbol());

            DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getNumberInstance(locale);
            System.out.println(messages.getString("country.decimal.separator") + ": " + decimalFormat.getDecimalFormatSymbols().getDecimalSeparator());
            System.out.println(messages.getString("country.grouping.separator") + ": " + decimalFormat.getDecimalFormatSymbols().getGroupingSeparator());

            System.out.println(messages.getString("country.windows.codepage") + ": " + locale.toLanguageTag());

            System.out.println();
        }
    }
}

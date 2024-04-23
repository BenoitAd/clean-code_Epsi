package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe utilitaire pour les dates.
 */
public class DateUtils {


    /**
     * Formatte une date en chaîne de caractères.
     *
     * @param pattern Le pattern de formatage.
     * @param date    La date à formater.
     * @return La date formatée.
     */
    public static String format(String pattern, Date date) {
        if ( pattern.isBlank() || pattern.isEmpty() ) pattern = "dd/MM/yyyy HH:mm:ss";
        SimpleDateFormat formateur = new SimpleDateFormat(pattern);
        return formateur.format(date);
    }


}

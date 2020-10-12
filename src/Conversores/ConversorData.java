package Conversores;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Danilo Batista e Kalil Isac
 */

public class ConversorData {

    public static Date StringParaData(String valor)
    {
        try
        {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            return new java.sql.Date(format.parse(valor).getTime());
        }
        catch(ParseException e)
        {
            return null;
        }
    }
}

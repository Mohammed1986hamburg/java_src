package de.lubowiecki.webcustomers.converters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;


/**
 *
 * @author tlubowiecki
 */
@FacesConverter("DateConverter")
public class StringToDateConverter implements Converter {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("d.M.yyyy");
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        try {
            return DATE_FORMAT.parse(value);
        }
        catch(ParseException e) {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value instanceof Date) {
            return DATE_FORMAT.format((Date)value);
        }
        return "Ungültig";
    }
}

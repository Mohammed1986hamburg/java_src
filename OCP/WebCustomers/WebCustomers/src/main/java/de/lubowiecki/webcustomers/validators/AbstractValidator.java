/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.lubowiecki.webcustomers.validators;

import java.util.Locale;
import java.util.ResourceBundle;
import javax.faces.context.FacesContext;

/**
 *
 * @author tlubowiecki
 */
public abstract class AbstractValidator {
    
    public String getLocaleString(String bundleName, String key) {
        FacesContext context = FacesContext.getCurrentInstance();
        Locale loc = context.getViewRoot().getLocale();
        return ResourceBundle.getBundle("de.lubowiecki.lang." + bundleName, loc).getString(key);
    }
}

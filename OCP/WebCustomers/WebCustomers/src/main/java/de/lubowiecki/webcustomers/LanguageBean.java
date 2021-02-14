/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.lubowiecki.webcustomers;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author tlubowiecki
 */
@ManagedBean(name = "language")
@SessionScoped
public class LanguageBean {
    
    private Map<String, Locale> locales;
    private String current = Locale.getDefault().toLanguageTag();

    {
        locales = new LinkedHashMap<String, Locale>(3);
        locales.put("EN", Locale.ENGLISH);
        locales.put("DE", Locale.GERMAN);
        locales.put("FR", Locale.FRANCE);
    }
    
    public Map<String, Locale> getLocales() {
        return locales;
    }

    public void setCurrent(String locale) {
        current = locale;
        for(Map.Entry<String, Locale> e : locales.entrySet()) {
            if(e.getValue().toString().equals(locale)) {
                Locale.setDefault(e.getValue());
                FacesContext.getCurrentInstance().getViewRoot().setLocale(e.getValue());
            }
        }
    }

    public String getCurrent() {
        return current;
    }
}

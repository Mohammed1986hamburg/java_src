/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.lubowiecki.webcustomers.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author tlubowiecki
 */
@FacesValidator("PriceValidator")
public class PriceValidator extends AbstractValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        Double price = 0.0;
        try {
            price = Double.parseDouble(((String)value).replace(",", "."));
            if(price < 0.01) {
                throw new ValidatorException(new FacesMessage(getLocaleString("uicontrols", "msg_price1")));
            }
        }
        catch(NumberFormatException e) {
            throw new ValidatorException(new FacesMessage(getLocaleString("uicontrols", "msg_price2")));
        }
    }
}

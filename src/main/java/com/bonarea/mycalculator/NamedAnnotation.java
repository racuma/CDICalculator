/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.mycalculator;

import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Named;

public class NamedAnnotation extends AnnotationLiteral<Named> implements Named {

    private final String value;

    public NamedAnnotation(final String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}

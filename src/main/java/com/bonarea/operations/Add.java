/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.operations;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author alumne
 */

@RequestScoped
@Named("add")
public class Add implements IOperation {

    @Override
    public double calcula(int op1, int op2) {
        return op1 + op2;
    }

}

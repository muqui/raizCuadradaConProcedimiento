/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muqui;

import java.util.List;

/**
 *
 * @author mq12
 */
public class RaizCuadradaProce {
    private int casitaborde;
    private String numero;
    private List<List<String>> procedimiento;

   
    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the procedimiento
     */
    public List<List<String>> getProcedimiento() {
        return procedimiento;
    }

    /**
     * @param procedimiento the procedimiento to set
     */
    public void setProcedimiento(List<List<String>> procedimiento) {
        this.procedimiento = procedimiento;
    }

    /**
     * @return the casitaborde
     */
    public int getCasitaborde() {
        return casitaborde;
    }

    /**
     * @param casitaborde the casitaborde to set
     */
    public void setCasitaborde(int casitaborde) {
        this.casitaborde = casitaborde;
    }
}

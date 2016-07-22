/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muqui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author mq12
 */
public class Main {

    public static void main(String args[]) {
     Procedimiento p = new Procedimiento();
     RaizCuadradaProce  proce= new RaizCuadradaProce();
     proce.setNumero("40.8");
     proce.setProcedimiento(p.ProcedimientoRaizACuadrada(proce.getNumero()));
     proce.setCasitaborde(p.getCasitaborde());
     
        System.out.println("casita borde " + proce.getCasitaborde());

    }

   
}

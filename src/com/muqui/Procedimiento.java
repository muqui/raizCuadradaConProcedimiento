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
public class Procedimiento {
    private int casitaborde;
     public List<List<String>> ProcedimientoRaizACuadrada(String numero) {
        List<List<String>> procedimiento = new ArrayList<List<String>>();
        List<String> numeroyresultado = new ArrayList<String>();
        List<String> linea = null;
        int size = 0;
        int radicando = 0;
        int raiz = 0;
        int residuo = 0;
        int apuntador = 2;
        int sustraendo = 0;
        String sustraendostring = "";
        int parcial = 0;
         int PositionPunto = -1;
          int cantidadDecimal= 0;
        String Parcial = "";
        String raizstring = "";
        if (numero.indexOf('.') > 0) {

            int numeroSize = numero.length() - 1;
             PositionPunto = numero.indexOf('.');
             cantidadDecimal = numeroSize - PositionPunto;
            System.out.println("tiene decimal Cant. decimales " + cantidadDecimal + " size number: " + numeroSize);
            int modulo = cantidadDecimal % 2;
            /*
            Si decimales es a cero solo se le quita el punto decimal
             */
            if (cantidadDecimal == 0) {
                numero = numero.replace(".", "");

            } else if (modulo != 0) {

                numero = numero + "0";

            }
        }
        numero = numero.replace(".", "");
        size = numero.length();
        System.out.println("NUMBER FINAL " + numero + " Tamaño " + size);
        for (int i = 0; i < numero.length(); i++) {
            numeroyresultado.add(numero.substring(i, i + 1));
        }
        
        /*
         Primer radical si es impar
         */

        if (size % 2 != 0) {
            apuntador = 1;
            radicando = Integer.parseInt(numero.substring(0, 1));
            raiz = (int) Math.sqrt(radicando);
            residuo = radicando - (raiz * raiz);
            sustraendo = raiz * raiz;
            procedimiento.add(sustraendo(sustraendo, apuntador, numero.length()));
            apuntador = 3;
            System.out.println("primer radicando  " + radicando + " primera raiz " + raiz + " primer residuo " + residuo + " sustraendo " + sustraendo);
        } else {
            radicando = Integer.parseInt(numero.substring(0, 2));
            raiz = (int) Math.sqrt(radicando);
            residuo = radicando - (raiz * raiz);
            sustraendo = raiz * raiz;
            procedimiento.add(sustraendo(sustraendo, apuntador, numero.length()));
            apuntador = 4;
            System.out.println("primer radicando  " + radicando + " primera raiz " + raiz + " primer residuo " + residuo + " sustraendo " + sustraendo);
        }

        while (apuntador <= size) {
            linea = new ArrayList<String>();
            for (int i = 1; i <= numero.length(); i++) {
                linea.add("_");

            }
            String dividendotemp = residuo + numero.substring(apuntador - 2, apuntador);
            radicando = Integer.parseInt(dividendotemp);
            for (int i = 1; i < 10; i++) {
                Parcial = (raiz * 2) + "" + i;
                sustraendo = Integer.parseInt(Parcial) * i;
                raizstring = raiz + "" + (i );
                if (sustraendo > radicando) {
                    Parcial = (raiz * 2) + "" + (i - 1);
                    sustraendo = Integer.parseInt(Parcial) * (i - 1);
                    raizstring = raiz + "" + (i - 1);
                    break;
                } else {
                }

            }
            raiz = Integer.parseInt(raizstring);
            residuo = radicando - sustraendo;
            /*
                 add to line radicando
             */
                sustraendostring = "" + radicando;
            int position = apuntador - sustraendostring.length();
            for (int j = 0; j < sustraendostring.length(); j++) {

                linea.add(position, sustraendostring.substring(j, j + 1));
                linea.remove(size);
                position++;
            }
          
            for (int j = 0; j < Parcial.length(); j++) {
                linea.add(Parcial.substring(j, j + 1));
               
                
            }
             procedimiento.add(linea);
             /*
                 add to line sustraendo
             */
             linea = new ArrayList<String>();
            for (int i = 1; i <= numero.length(); i++) {
                linea.add("_");

            }
                sustraendostring = "" + sustraendo;
             position = apuntador - sustraendostring.length();
            for (int j = 0; j < sustraendostring.length(); j++) {

                linea.add(position, sustraendostring.substring(j, j + 1));
                linea.remove(size);
                position++;
            }
            System.out.println("radicando: " + radicando + " sustraendo: " + sustraendo + " Parcial: " + Parcial + " raiz: " + raiz + " Residuo: " + residuo);
            procedimiento.add(linea);
            apuntador = apuntador + 2;
        }
        /*
        add a procedimiento numeroyresultado
        */
       
        
        raizstring = ""+raiz;
        for (int i = 0; i < raizstring.length(); i++) {
            numeroyresultado.add(raizstring.substring(i, i+1));
        }
        /*
        Colocar los puntos decimales
        */
       //   System.out.println("PositionPunto " + PositionPunto);
          // si es impar  se agrega uno mas.
          if(cantidadDecimal%2 != 0){
          cantidadDecimal = cantidadDecimal+1;
          } 
          int puntoResultado = numeroyresultado.size() - (cantidadDecimal/2);
       //     System.out.println("cantidadDecimal " + cantidadDecimal + " puntoResultado " + puntoResultado);
        for (int i = 0; i < numeroyresultado.size(); i++) {
            if(i == PositionPunto){
                 System.out.println("" + numeroyresultado.get(i));
                 numeroyresultado.set(i, "."+numeroyresultado.get(i));
            }
             if(i == puntoResultado){
                 System.out.println("" + numeroyresultado.get(i));
                 numeroyresultado.set(i, "."+numeroyresultado.get(i));
            }
           
        }
        /*
        Fila de residuo
        */
    //    System.out.println("numero.length() " + numero.length());
           linea  = new ArrayList<String>();
            for (int i = 1; i <= numero.length(); i++) {
                linea.add("r");

            }
            procedimiento.add(linea);
         procedimiento.add(0, numeroyresultado);
         
         
        
        
         String  residuostring = ""+residuo;
          apuntador = numero.length() - residuostring.length();
          this.casitaborde = numero.length() ;
         //  System.out.println("aputnador resudio " + apuntador);
        
//        for (int i = apuntador; i < numero.length(); i++) {
//            System.out.println(i+ " residuoxxxxxxxxxxxxqqqqqq " +  residuostring.substring(0, 1) +  "residuostring "  + residuostring);
//        }
          for (int i = 0; i < residuostring.length(); i++) {
          //    System.out.println("" + residuostring.substring(i, i+1));
               if(apuntador == PositionPunto){
           //      System.out.println("" + numeroyresultado.get(i));
                 linea.add(apuntador, "."+residuostring.substring(i, i+1));
            }else{
                 linea.add(apuntador, residuostring.substring(i, i+1));
               }
             
       //        System.out.println("aputnador resudio " + apuntador);
                linea.remove(size);
               apuntador++;
        }
        
        
        
        
        
        
        Iterator iter = procedimiento.iterator();
        while (iter.hasNext()) {

            System.out.println("Final" + iter.next());
            // List<String> temp = (List<String>) iter.next(); 
        }
        return procedimiento;
    }

    /*
         add sustraendo a procedimiento
     */
    public ArrayList<String> sustraendo(int sustraendo, int apuntador, int size) {
        ArrayList<String> linea = new ArrayList<String>();
        String sustraendostring = "" + sustraendo;
        for (int i = 0; i < size; i++) {

            linea.add("!");
        }

        int position = apuntador - sustraendostring.length();
        for (int j = 0; j < sustraendostring.length(); j++) {

            linea.add(position, sustraendostring.substring(j, j + 1));
            linea.remove(size);
            position++;
        }
        System.out.println("sustraendo String " + sustraendostring + " TAMA " + sustraendostring.length() + " apuntador " + apuntador + "tamaño total " + size);

        return linea;
    }

    /**
     * @return the casitaborde
     */
    public int getCasitaborde() {
        return casitaborde;
    }

   

}

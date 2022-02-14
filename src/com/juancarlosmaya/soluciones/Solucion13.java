package com.juancarlosmaya.soluciones;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)
* */
public class Solucion13 {

   public String fechaDeHoy()
   {
       String datenow;
       DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
       datenow = ("AAAA/MM/DD HH:MM:SS = "+dtf3.format(LocalDateTime.now()));
       return datenow;
   }


    public void solucion()
    {
        System.out.println("La fecha de hoy es:\n"+ fechaDeHoy()+"\n");
    }
}

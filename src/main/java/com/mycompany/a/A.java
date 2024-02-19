/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.a;

import igu.Pantalla;
import java.util.Scanner;

/**
 *
 * @author Uriel Flores
 */
public class A {

    public static void main(String[] args) {
        
        Pantalla panta = new Pantalla();//se crea la interfaz 
        panta.setVisible(true);//se manda a llamar o ejecutar la interfaz
        panta.setLocationRelativeTo(null);//comando para la posicion de la pantalla en el centro
        
        

    }

    //funcion definitiva para decimal a otras bases
    public static String convertirASistema(int numero, int base){
        //DECLARAR POSIBLES RESIDUOS, ESTO PERMITE Y FACILITA LA CONVERSION A HEXADECIMAL
        String caracteres="0123456789ABCDEF";
        
        String resultado = ""; //DECALRACION E INICIALIZACION DE VARIABLE PARA ALMACENAR EL RESULTADO 
        
        int residuo,temp; //DECLARACION DE VARIABLES AUXILIARES PARA EL PROCESO DE CONVERSION
        
        temp=numero;
        
        while(temp>0){
            //
            residuo=temp % base;//SACA EL RESIDUO DE LA DIVISION ENTRE LA BASE PERO NO AFECTA AL NUMERO ORIGINAL
           
            temp = temp/base;//REALIZA LA DIVISION PARA PROGRESAR CON LA CONVERSION
            
            //charAt TOMA EL CARACTER EQUIVALENTE POR MEDIO DE SU POSICION EN LOS POSIBLES RESULTADOS
            resultado = caracteres.charAt(residuo)+resultado; //CONCATENAMOS EL RESIDUO A LA VARIABLE RESULTADO
        }
        
        
        return resultado; //REGRESA EL RESULTADO COMO STRING POR QUE HEXADECIMAL TIENE CARACTERES Y NUMEROS
    }
    
    
    //primera funcion para convertir de hexa(u otra) a decimal
    public static String convertirADecimal(String numero, int base){
        //  F7
        String caracteres= "0123456789ABCDEF";
        //                  0123456789,10,11...15
        numero=numero.toUpperCase();
        int decimal=0;
        
        for (int i = 0; i < numero.length(); i++) {//realiza el ciclo x veces dependeiendo de la cantidad de numeros
            
            char caracter = numero.charAt(i);//toma el caracter equivalente a la posicion de i
            //  
            //nos da un valor numerico dependiendo de la posicion en la que se encuentre el caracter
            int digito = caracteres.indexOf(caracter);//7
            
            //se hace la operacion para convertir el digito y se va sumando al resultado
            decimal = base * decimal + digito;// 
        }
        String res = String.valueOf(decimal);//se convierte el resultado entero en string
        
        return res;//retorna el resultado en string
    }
    

}

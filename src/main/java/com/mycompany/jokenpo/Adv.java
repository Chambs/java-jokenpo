/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jokenpo;
import java.util.Random;
/**
 *
 * @author Chambs
 */

public class Adv {   
    String perde(String pjogador){
        String padv;
        if(pjogador.equals("tesoura")){
            padv = "pedra";
        } else if(pjogador.equals("papel")){
            padv = "tesoura";
        } else {
            padv = "papel";
        }
        return padv;
    }
    
    String ganha(String pjogador){
        String padv;
        
        if(pjogador.equals("tesoura")){
            padv = "papel";
        } else if(pjogador.equals("papel")){
            padv = "pedra";
        } else {
            padv = "tesoura";
        }
        return padv;
    }
    
    String empate(String pjogador){
        String padv  = pjogador;
        return padv;
    }
    
    String justo(String pjogador){
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(100) + 1;
        String padv;
        // selecinoa a jogada do adv
        if(numero < 33){
            //Pedrà
            padv = "pedra";
        }
        else if(numero < 66){
            //papel
            padv = "papel";
        }
        else{
            //tesoura
            padv = "tesoura";
        }        
        return padv;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jokenpo;
import com.mycompany.jokenpo.Adv;
import java.util.Scanner;

/**
 *
 * @author Chambs
 */

public class Jogo {
    void Jogo(){
        Scanner scan = new Scanner(System.in);
        Adv adv = new Adv();
        String nome, pjogador, padv, modo;
        
        System.out.println("Digite o seu nome: ");
        nome = scan.nextLine().toUpperCase();
        
        System.out.println("\nJO KEN PO\n- Pedra"
                                    + "\n- Papel"
                                    + "\n- Tesoura"
                                    + "\n Digite a sua jogada: ");
        
        
        pjogador = scan.nextLine().toLowerCase();
        System.out.println("\nModo de jogo"
                         + "\n- Ganha"
                         + "\n- Perde"
                         + "\n- Empata"
                         + "\n- Justo"
                         + "\nEscolha: ");
        
        modo = scan.nextLine().toLowerCase();
        if(modo.equals("ganha")){
            padv = adv.ganha(pjogador);
        } else if(modo.equals("perde")){
            padv = adv.perde(pjogador);
        } else if(modo.equals("empata")){
            padv = adv.empate(pjogador);
        } else if(modo.equals("justo")){
            padv = adv.justo(pjogador);
        } else{           
            padv = "";
        }
        
        if(padv.equals("")){       
            System.out.println(">> ERRO\n>> MODO DE JOGO NAO ENCONTRADO!");
            System.out.printf(">> ['%s'] - INVALIDO", modo);
        } else{
            System.out.printf("\n%s x %s",pjogador,padv);
            System.out.println();

            if (pjogador.equals(padv)){
                System.out.println("Empate!");
            } else if((pjogador.equals("pedra") && padv.equals("tesoura")) ||
                        (pjogador.equals("papel") && padv.equals("pedra")) ||
                        (pjogador.equals("tesoura") && padv.equals("papel")) ) {
                System.out.printf("%s ganhou!", nome);
            } else{
                    System.out.println("O computador venceu!");
                }
            }
        }        
}

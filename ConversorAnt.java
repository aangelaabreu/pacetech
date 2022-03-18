/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversorant;

import java.util.Scanner;

/**
 *
 * @author Angela Maria Abreu e Silva
 */
public class ConversorAnt {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String menu = "0";
        float tempCelsius, tempFahrenheit, cotacaoDolar, quantidadeDolar, 
                quantidadeReal, conversaoMoeda = 0;
        
        do{
            System.out.println("Selecione uma opção:");
            System.out.println("1- Deseja converter de Celsius para Fahrenheit?");
            System.out.println("2- Deseja converter de Fahrenheit para Celsius?");
            System.out.println("3- Deseja converter de dolar para real?");
            System.out.println("4- Deseja converter de real para dolar?");
            System.out.println("5- Deseja sair?");

            menu = ler.next();
            
            switch(menu){
                case "1":
                    System.out.println("Digite a temperatura em Celsius:");
                    tempCelsius = ler.nextFloat();
                    tempFahrenheit = (float) (tempCelsius * 1.8 + 32);
                    System.out.println("A temperatura em Fahrenheit é: " + tempFahrenheit);
                    
                    menu = exibeContinuar();
                    break;
                case "2":
                    System.out.println("Digite a temperatura em Fahrenheit:");
                    tempFahrenheit = ler.nextFloat();
                    tempCelsius = (float) ((tempFahrenheit - 32) / 1.8);
                    System.out.println("A temperatura em Celsius é: " + tempCelsius);
                    
                    menu = exibeContinuar();
                    break;
                case "3":
                    System.out.println("Digite a cotação do dólar:");
                    cotacaoDolar = ler.nextFloat();
                    System.out.println("Digite a quantidade de dólar:");
                    quantidadeDolar = ler.nextFloat();
                    quantidadeReal = cotacaoDolar * quantidadeDolar;
                    System.out.println("O valor em real é: " + quantidadeReal);
                    
                    menu = exibeContinuar();
                    break;
                case "4":
                    System.out.println("Digite a cotação do dólar:");
                    cotacaoDolar = ler.nextFloat();
                    System.out.println("Digite a quantidade de real:");
                    quantidadeReal = ler.nextFloat();
                    quantidadeDolar = quantidadeReal / cotacaoDolar;
                    System.out.println("O valor em dólar é: " + quantidadeDolar);
                    
                    menu = exibeContinuar();
                    break;
                case "5":
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while(!menu.equals("5"));
    }
    
    static String exibeContinuar(){
        System.out.println("");
        System.out.println("1- Deseja fazer outra conversão?");
        System.out.println("2- Finalizar o programa");
        String opcao = new Scanner(System.in).next();
        if(opcao.equals("2")){
            return "5";
        }
        return "0";
    }
}

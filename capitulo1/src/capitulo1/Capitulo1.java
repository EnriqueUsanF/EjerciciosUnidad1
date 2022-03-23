/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo1;

/**
 *
 * @author luigi
 */
public class Capitulo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        unoDoce();
    }
    public static void unoUno(){
        System.out.println("Welcome to Java");
        System.out.println("Learning Java Now");
        System.out.println("Programming is fun");
    }
    public static void unoDos(){
        for (int i = 0; i < 5; i++) {
            System.out.println("I love Java");
        }
    }
    public static void unoTres(){
        System.out.println("    J\nJ  aaa\t v   vaaa");
        System.out.println("J  J  aa   v v   a a");
        System.out.println("J   aaaa    v    aaa");
    }
    public static void unoCuatro(){
        System.out.println("a\ta^2\ta^3\ta^4");
        for (int i = 1; i < 5; i++) {
            System.out.println(i + "\t" + i*i + "\t" + (i*i)*i + "\t" + ((i*i)*i)*i);
        }
    }
    public static void unoCinco(){
        System.out.println(((7.5 * 6.5) - (4.5 * 3)) / (47.5 - 5.5));
    }
    public static void unoSeis(){
        System.out.println("Sumatoria de 1 - 10:");
        int x = 0;
        for (int i = 1; i <= 10; i++) {
            x = x+i;
        }
        System.out.println(x);
    }
    public static void unoSiete(){
        System.out.println("Acercandose a PI:");
        double pi = 4;
        double sumaFracciones = 0, fraccion;
        int flag = 1;
        for (int i = 1; i <= 11; i++) {
            fraccion = i;
            if(i % 2 != 0 && flag == 1){
                sumaFracciones = sumaFracciones + 1/fraccion;
                flag = 2;
            }else if(i % 2 != 0 && flag == 2){
                sumaFracciones = sumaFracciones - 1/fraccion;
                flag = 1;
            }
        }
        System.out.println(pi * sumaFracciones);
        flag = 1;
        sumaFracciones = 0;
        for (int i = 1; i <= 13; i++) {
            fraccion = i;
            if(i % 2 != 0 && flag == 1){
                sumaFracciones = sumaFracciones + 1/fraccion;
                flag = 2;
            }else if(i % 2 != 0 && flag == 2){
                sumaFracciones = sumaFracciones - 1/fraccion;
                flag = 1;
            }
        }
        System.out.println(pi * sumaFracciones);
    }
    public static void unoOcho(){
        System.out.println("Circulo:");
        double area, perimetro;
        double pi = 3.14159;
        double radio = 6.5;
        perimetro = (2 * radio)* pi;
        area = (radio * radio) * pi;
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);
    }
    public static void unoNueve(){
        System.out.println("Rectangulo:");
        double area, perimetro;
        double altura = 8.6, base = 5.3;
        area = altura * base;
        perimetro = 2 * (altura + base);
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);
    }
    public static void unoDiez(){
        System.out.println("Corredor:");
        double tiempoCorrido = 50.5, kmRecorridos = 15;
        double valor = (60 * 15) / tiempoCorrido;
        double millas = valor / 1.6;
        System.out.println(millas + " Millas por hora");
    }
    public static void unoOnce(){
        int poblacionActual = 312032486;
        System.out.println("Poblacion original:");
        int segundosPorAnio = 31536000;
        int anio1 = 0, anio2 = 0, anio3 = 0, anio4 = 0, anio5 = 0;
        for (int i = 0; i <= segundosPorAnio*5; i++) {
            if(i > 0 && i <= segundosPorAnio){
                if(i % 7 == 0){
                    anio1++;
                }
                if(i % 13 == 0){
                    anio1--;
                }
                if(i % 45 == 0){
                    anio1++;
                }
            }else if(i > segundosPorAnio && i <= segundosPorAnio*2){
                if(i % 7 == 0){
                    anio2++;
                }
                if(i % 13 == 0){
                    anio2--;
                }
                if(i % 45 == 0){
                    anio2++;
                }
            }else if(i > segundosPorAnio*2 && i <= segundosPorAnio*3){
                if(i % 7 == 0){
                    anio3++;
                }
                if(i % 13 == 0){
                    anio3--;
                }
                if(i % 45 == 0){
                    anio3++;
                }
            }else if(i > segundosPorAnio*3 && i <= segundosPorAnio*4){
                if(i % 7 == 0){
                    anio4++;
                }
                if(i % 13 == 0){
                    anio4--;
                }
                if(i % 45 == 0){
                    anio4++;
                }
            }else{
                if(i % 7 == 0){
                    anio5++;
                }
                if(i % 13 == 0){
                    anio5--;
                }
                if(i % 45 == 0){
                    anio5++;
                }
            }
        }
        System.out.println("Peronas adicionale es el año 1: " + anio1);
        System.out.println("Peronas adicionale es el año 2: " + anio2);
        System.out.println("Peronas adicionale es el año 3: " + anio3);
        System.out.println("Peronas adicionale es el año 4: " + anio4);
        System.out.println("Peronas adicionale es el año 5: " + anio5);
        poblacionActual = poblacionActual + anio1 + anio2 + anio3 + anio4 + anio5;
        System.out.println("Crecimiento total de la poblacion: " + poblacionActual);
    }
    public static void unoDoce(){
        System.out.println("Corredor 2:");
        double horas = 1;
        double min = 40;
        double seg = 35;
        double tiempoTotalDouble = (((seg / 60) + min) / 60) + horas;
        //System.out.println(tiempoTotalDouble);
        double recorridomillas = 24;
        double unaHoraMillasRecorridas = recorridomillas / tiempoTotalDouble;
        //System.out.println(unaHoraMillasRecorridas);
        double kmPorHora = unaHoraMillasRecorridas * 1.6;
        System.out.println(kmPorHora + " Km en una hora");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kevin
 */
public class Cubiculo {
     int ID;
    String tipo;
    int hora;
    String disp;
    Cubiculo(int I, String T, int H, String D){
    ID=I;
    tipo=T;
    hora=H;
    disp=D;
    };
    void registrar(){
        System.out.println("ID: "+ID);
        System.out.println("TIPO: "+tipo);
        System.out.println("HORARIO: "+hora);
        System.out.println("DISPONIBILIDAD: "+disp);
    }; 
}

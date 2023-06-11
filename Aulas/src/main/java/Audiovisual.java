/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kevin
 */
public class Audiovisual {
    int ID;
    String tipo;
    int hora;
    String disp;
    int cap;
    Audiovisual(int I, String T, int H, String D, int C){
    ID=I;
    tipo=T;
    hora=H;
    disp=D;
    cap=C;
    };
    void registrar(){
        System.out.println("ID: "+ID);
        System.out.println("TIPO: "+tipo);
        System.out.println("HORARIO: "+hora);
        System.out.println("DISPONIBILIDAD: "+disp);
        System.out.println("Capacidad: "+cap);
    
    };
}

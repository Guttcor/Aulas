/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.altas;

/**
 *
 * @author Jonathan Beristain
 */
public class Diagrama_de_clases {

   public String ID;
    public String Tipo;
    public String Horario;
    public String Estado;
    
    //--------------------------------------------
    public String Capacidad1;
    public String Registrar;
    public String Reservar;
    public String Bajas;
    public String Altas;
    public String Cambios;
    public String Eventos;
    public String Conferencias;
    public String Exposiciones;
   
    
    //-----------------------------------
    
    public String Capacidad2;
    public String IDcanon;
    public String IDcomp;
    public String IDpant;
    public String expvid;
    public String exptem;
    
    //-------------------------
    
    public String Disponibilidad;
    public String Esplibruido;
    public String Expinfacad;
   //-------------------------
     public String Capacidad;
    public String Asesorias;
    public String Tallerlect;   
    
        Diagrama_de_clases(String I, String T, String H, String E, String C1, String RE, String RES, String BA, String AL, String CA, String EV, String CO, String EX, String C2, String IC, String ICO, String IP, String EXV, String EXP, String D, String ES, String EXPI, String CAP, String AS, String TAL){
        
        ID=I;
        Tipo=T;
        Horario=H;
        Estado=E;
        Capacidad1=C1;
    Registrar=RE;
    Reservar=RES;
    Bajas=BA;
     Altas=AL;
   Cambios=CA;
    Eventos=EV;
    Conferencias=CO;
    Exposiciones=EX;
    
    Capacidad2=C2;
    IDcanon=IC;
    IDcomp=ICO;
    IDpant=IP;
    expvid=EXV;
    exptem=EXP;

    
    Disponibilidad=D;
    Esplibruido=ES;
    Expinfacad=EXPI;
    Capacidad=CAP;
    Asesorias=AS;
    Tallerlect=TAL;
        
        
        }
        
        void visualizar(){
            
            System.out.println("        CLASE MADRE (C. Aula)");
        System.out.println("ID Aula: "+ID);
        System.out.println("Tipo: "+Tipo);
        System.out.println("Horario: "+Horario);
        System.out.println("Estado: "+Estado);  
    //-------------------------------------------------------------------
    System.out.println("\n\n            CLASE HIJA (C. AUDITORIO)");
        System.out.println("Capacidad: "+Capacidad1);
        System.out.println("Registrar: "+Registrar);
        System.out.println("Reservar: "+Reservar);
        System.out.println("Bajas: "+Bajas);  
        System.out.println("Altas: "+Altas);
        System.out.println("Cambios: "+Cambios);
        System.out.println("        METODO");
        System.out.println("Eventos: "+Eventos);
        System.out.println("Conferencias: "+Conferencias);      
        System.out.println("Exposiciones: "+Exposiciones);
        System.out.println("Etc.");
        //------------------------------------------------------
        System.out.println("\n\n            CLASE HIJA (C. Salas de Auditorio)");
        System.out.println("Capacidad: "+Capacidad2);
        System.out.println("ID Cañon: "+IDcanon);
        System.out.println("ID Computadora: "+IDcomp);
        System.out.println("ID pantallas: "+IDpant);  
        System.out.println("        METODO");
        System.out.println("Exponer videos: "+expvid);
        System.out.println("Exponer temas de info: "+exptem);
        //-------------------------------------------------------
        System.out.println("\n\n        CLASE HIJA (C. Cubiculos)");
        System.out.println("Disponibilidad: "+Disponibilidad);
        System.out.println("        METODO");
        System.out.println("Espacio libre de ruido: "+Esplibruido);
        System.out.println("Explicación de informacion academica: "+Expinfacad);
        //-------------------------------------------------------
 System.out.println("\n\n           CLASE HIJA (C. Sala Grupal)");
        System.out.println("Capacidad: "+Capacidad);
        System.out.println("        METODO");
        System.out.println("Asesorias: "+Asesorias);
        System.out.println("Talleres de Lectura: "+Tallerlect);  
       
        
        
    
    
    
    
        }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diagrama_de_casos;

/**
 *
 * @author Jonathan Beristain
 */
public class Diagrama_de_casos {
public String CONDIS;
    public String REAU;
    public String ALSA;
    public String REGAU;
    public String BAAU;
    //----------------------
    public String CAL;
    public String VAUS;
    public String VADI;
    public String VAU;
   
    Diagrama_de_casos(String CO, String R, String A, String RE, String B, String C, String V, String VAD, String VA)
    {
        
        CONDIS=CO;
        REAU=R;
        ALSA=A;
        REGAU=RE;
        BAAU=B;
        //---------------
    CAL=C;
    VAUS=V;
    VADI=VAD;
     VAU=VA;
    
    
    }
    
    void visualizar(){
            
        System.out.println("        ADMINISTRADOR");
        System.out.println("Consultas de disponibilidad---->"+CONDIS);
        System.out.println("<<include>> --------> Calendario (Grafico) \n\n"+CAL);
        System.out.println("Reservacion de aulas"+REAU); 
        System.out.println("<<extend>> -----------> Valorar Usuarios"+VAUS);
   System.out.println("<<extend>> -----------> Valorar Disponibilidad \n\n"+VADI);
        System.out.println("Altas de sanciones ---->"+ALSA);
        System.out.println("<<extend>> ---------> Valorar Usuarios \n\n"+VAU);
        System.out.println("Registro de Aulas"+REGAU);
        System.out.println("Bajas de Aulas"+BAAU);  
    }
    }


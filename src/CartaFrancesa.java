/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Susana
 */
public class CartaFrancesa {

    public int numeroCarta;
    public int palo;
    
    public int uno = 0;
    public int dos = 1;
    public int tres = 2;
    public int cuatro = 3;
    public int cinco = 4;
    public int seis = 5; 
    public int siete = 6;
    public int ocho = 7;
    public int nueve = 8;
    public int diez = 9;
    public int J = 10;
    public int Q = 11;
    public int K = 12;
                                 
    public static final int DIAMANTES = 0;
    public static final int CORAZONES = 1;
    public static final int PICAS = 2;
    public static final int TREBOLES = 3;
    public static final int COMODIN = 4;
    
    public CartaFrancesa (int numeroCarta , int palo){
     
        this.numeroCarta = numeroCarta;
        this.palo = palo;
        
    }
    
    public int getPalo( int palo){
        
        switch (palo){
            
            case 0:
                return DIAMANTES;
            
            case 1:
                return CORAZONES;
            
            case 2:
                return PICAS;
            
            case 3:
                return TREBOLES;
            default:
                return -1;
        }
    }
    public int getNumero( int numeroCarta){
        
        switch (numeroCarta){
            
            case 0:
                return uno;
            
            case 1:
                return dos;
            
            case 2:
                return tres;
            
            case 3:
                return cuatro;
            case 4:
                return cinco;
            case 5:
                return seis;
            case 6:
                return siete;
            case 7:
                return ocho;
            case 8:
                return nueve;
            case 9:
                return diez;
            case 10:
                return J;
            case 11:
                return Q;
            case 12:
                return K;
            default:
                return -1;
        }
    }
    
   public String toString(){
       
        if (numeroCarta == 0){
           switch(palo){
               case 0 :
                   return "As de Diamantes";
               case 1 :
                   return "Dos de Diamantes";
               case 2 :
                   return "Tres de Diamantes";
               case 3 :
                   return "Cuatro de Diamantes";
               case 4 :
                   return "Cinco de Diamantes";
               case 5 :  
                   return "seis de Diamantes";
               case 6 :
                   return "siete de Diamantes";
               case 7 :
                   return "ocho de Diamantes";
               case 8 : 
                   return "nueve de Diamantes";
               case 9 :
                   return "Diez de Diamantes";
               case 10: 
                   return "J de Diamantes";
               case 11:
                   return "Q de Diamantes";
                   
               case 12:
                   return " K de Diamantes";
                      
           }
        
       if (numeroCarta == 1){
           switch(palo){
               case 0 :
                   return "As de Corazones";
               case 1 :
                   return "Dos de Corazones";
               case 2 :
                   return "Tres de Corazones";
               case 3 :
                   return "Cuatro de Corazones";
               case 4 :
                   return "Cinco de Corazones";
               case 5 :  
                   return "seis de Corazones";
               case 6 :
                   return "siete de Corazones";
               case 7 :
                   return "ocho de Corazones";
               case 8 : 
                   return "nueve de Corazones";
               case 9 :
                   return "Diez de Corazones";
               case 10: 
                   return "J de Corazones";
               case 11:
                   return "Q de Corazones";
                   
               case 12:
                   return " K de Corazones";
                      
           }
       
            if (numeroCarta == 2){
           switch(palo){
               case 0 :
                   return "As de Picas";
               case 1 :
                   return "Dos de Picas";
               case 2 :
                   return "Tres de picas";
               case 3 :
                   return "Cuatro de picas";
               case 4 :
                   return "Cinco de picas";
               case 5 :  
                   return "seis de picas";
               case 6 :
                   return "siete de picas";
               case 7 :
                   return "ocho de picas";
               case 8 : 
                   return "nueve de picas";
               case 9 :
                   return "Diez de picas";
               case 10: 
                   return "J de picas";
               case 11:
                   return "Q de picas";
                   
               case 12:
                   return " K de picas";
                      
           }
            
            if (numeroCarta == 3){
           switch(palo){
               case 0 :
                   return "As de Treboles";
               case 1 :
                   return "Dos de Treboles";
               case 2 :
                   return "Tres de Treboles";
               case 3 :
                   return "Cuatro de Treboles";
               case 4 :
                   return "Cinco de Treboles";
               case 5 :  
                   return "seis de Treboles";
               case 6 :
                   return "siete de Treboles";
               case 7 :
                   return "ocho de Treboles";
               case 8 : 
                   return "nueve de Treboles";
               case 9 :
                   return "Diez de Treboles";
               case 10: 
                   return "J de Treboles";
               case 11:
                   return "Q de Treboles";
                   
               case 12:
                   return " K de Treboles";
                      
           }
           }
        }
        }
        }
           return "nada";
       }
   
   public String toCodigo(){
       if (numeroCarta == 0){
           switch(palo){
              case 0 :
                   return "OD";
               case 1 :
                   return "1D";
               case 2 :
                   return "2D";
               case 3 :
                   return "3D";
               case 4 :
                   return "4D";
               case 5 :  
                   return "5D";
               case 6 :
                   return "6D";
               case 7 :
                   return "7D";
               case 8 : 
                   return "8D";
               case 9 :
                   return "9D";
               case 10: 
                   return "JD";
               case 11:
                   return "QD";
                   
               case 12:
                   return " KD";
                      
           }
        
       if (numeroCarta == 1){
           switch(palo){
               case 0 :
                   return "OC";
               case 1 :
                   return "1C";
               case 2 :
                   return "2C";
               case 3 :
                   return "3C";
               case 4 :
                   return "4C";
               case 5 :  
                   return "5C";
               case 6 :
                   return "6C";
               case 7 :
                   return "7C";
               case 8 : 
                   return "8C";
               case 9 :
                   return "9C";
               case 10: 
                   return "JC";
               case 11:
                   return "QC";
                   
               case 12:
                   return " KC";
               
           }
       
            if (numeroCarta == 2){
           switch(palo){
              case 0 :
                   return "OP";
               case 1 :
                   return "1P";
               case 2 :
                   return "2P";
               case 3 :
                   return "3P";
               case 4 :
                   return "4P";
               case 5 :  
                   return "5P";
               case 6 :
                   return "6P";
               case 7 :
                   return "7P";
               case 8 : 
                   return "8P";
               case 9 :
                   return "9P";
               case 10: 
                   return "JP";
               case 11:
                   return "QP";
                   
               case 12:
                   return " KP";
                      
           }
            
            if (numeroCarta == 3){
           switch(palo){
              case 0 :
                   return "OT";
               case 1 :
                   return "1T";
               case 2 :
                   return "2T";
               case 3 :
                   return "3T";
               case 4 :
                   return "4T";
               case 5 :  
                   return "5T";
               case 6 :
                   return "6T";
               case 7 :
                   return "7T";
               case 8 : 
                   return "8T";
               case 9 :
                   return "9T";
               case 10: 
                   return "JT";
               case 11:
                   return "QT";
                   
               case 12:
                   return " KT";
                      
           }
           }
        }
        }
        }
       return "nada";
   }
      
       
    
}
    
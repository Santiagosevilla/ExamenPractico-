/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;
import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 *
 * @author SANTIAGO27
 */
public class ExamenPractico {
   private int [] elementos;
    private String [] nombreP;
    private int [] edadesP;
    private int [] vec;
    private int menor;
    private String []paises;
    private String []nombreA;
    private int []notas;
    private String []paisesC;
    private int [] habitantes; 
// 1.Desarrollar un método que permita ingresar un arreglo de n elementos, ingresar n por teclado
    public void arregloElementos(){
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Cuantos elementos desea Ingresar"));
        elementos = new int[n];
        for (int i = 0; i < elementos.length; i++) {
        elementos[i]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese los elementos"));
        }
        JOptionPane.showMessageDialog(null,Arrays.toString(elementos));
    }
//Imprimir la suma de todos sus elementos
    public void imprimir(){
         int  suma = 0;
         for (int i = 0; i < elementos.length; i++) {
             suma+=elementos[i];
        }
         JOptionPane.showMessageDialog(null,"La suma de los elementos es :"+suma);
    }
//2.Desarrollar un método que permita cargar 5 nombres de personas y sus respectivas edades.
    public void datosPersonas(){
        nombreP=new String[5];
        edadesP=new int[5];
            for(int f=0;f < nombreP.length;f++) 
            {
                nombreP[f]=JOptionPane.showInputDialog("Ingrese nombre:");
                edadesP[f]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad:"));      
            }
             JOptionPane.showMessageDialog(null,"Nombres"+Arrays.toString(nombreP));  
            JOptionPane.showMessageDialog(null,"Notas"+Arrays.toString(edadesP)); 
        }
    
//Imprimir los nombres de las personas mayores de edad (mayores o iguales a 18 años)
        public void mayoresEdad() 
        {
          JOptionPane.showMessageDialog(null,"Personas mayores de edad.");
          for(int f=0;f < nombreP.length;f++) 
            {
                if (edadesP[f] >= 18) 
                {
                   JOptionPane.showMessageDialog(null,nombreP[f]+ " - " + edadesP[f]);
                }
    	    }
        }
//3.Cargar un arreglo de n elementos. 
        public void cargar(){
            int n;
            n=Integer.parseInt(JOptionPane.showInputDialog("Cuantos elementos desea cargar:"));
             vec = new int[n];
             for(int f=0;f<vec.length;f++) {
           vec[f]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese componente:"));     
        }
        JOptionPane.showMessageDialog(null,Arrays.toString(vec));
    }
// Imprimir el menor y un mensaje si se repite dentro del vector.
        public void imprimirMenor(){ 
        menor = vec[0];
        for(int f=1;f<vec.length;f++) {
            if (vec[f]<menor) {
                menor=vec[f];
            }
        }
       JOptionPane.showMessageDialog(null,"El elemento menor es"+menor);       
    }
// y un mensaje si se repite dentro del vector.   
    public void repiteMenor() {
        int cant=0;
        for(int f=0;f<vec.length;f++) {
            if (vec[f]==menor) {
                cant++;
            }
        }
        if (cant>1) {
             JOptionPane.showMessageDialog(null,"Se repite el menor en el vector.");    
        } else {
             JOptionPane.showMessageDialog(null,"No se repite el menor en el vector.");
        }
    }
//4.Definir un arreglo donde almacenar los nombres de 5 países
    public void paìses(){
        paises=new String[5];
         for(int f=0;f < paises.length;f++){
           paises[f]=JOptionPane.showInputDialog("Ingrese el nombre de los paìses:");  
         }
         JOptionPane.showMessageDialog(null,"Paises"+Arrays.toString(paises)); 
    }
//Confeccionar el algoritmo de ordenamiento alfabético.
    public void ordenar() {
        for(int k=0;k<4;k++) {
            for(int f=0;f<4-k;f++) {
                if (paises[f].compareTo(paises[f+1])>0) {
                    String aux;
                    aux=paises[f];
                    paises[f]=paises[f+1];
                    paises[f+1]=aux;
                }
            }
        }
        JOptionPane.showMessageDialog(null,"Paises ordenados en forma alfabética:");
         JOptionPane.showMessageDialog(null,paises);
    }
// 5.	Confeccionar un método que permita cargar los nombres de 5 alumnos y sus notas respectivas. Luego ordenar las notas de mayor a menor. Imprimir las notas y los nombres de los alumnos.
    public void alumnos(){
        nombreA=new String[5];
        notas=new int[5];
            for(int f=0;f < nombreA.length;f++) 
            {
                nombreA[f]=JOptionPane.showInputDialog("Ingrese nombre del estudiente:");
                notas[f]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota:"));      
            }
            JOptionPane.showMessageDialog(null,"Nombres"+Arrays.toString(nombreA));  
            JOptionPane.showMessageDialog(null,"Notas"+Arrays.toString(notas));
    }
//  Luego ordenar las notas de mayor a menor. Imprimir las notas y los nombres de los alumnos.
    public void ordenarN(){
        for(int k=0;k<notas.length;k++) {
            for(int f=0;f<notas.length-1-k;f++) {
                if (notas[f]<notas[f+1]) {
                    int auxnota;
                    auxnota=notas[f];
                    notas[f]=notas[f+1];
                    notas[f+1]=auxnota;
                    String auxnombre;
                    auxnombre=nombreA[f];
                    nombreA[f]=nombreA[f+1];
                    nombreA[f+1]=auxnombre;
                }
            }
        }
        JOptionPane.showMessageDialog(null,"Nombres de alumnos y notas de mayor a menor");
        for(int f=0;f<notas.length;f++) {
            JOptionPane.showMessageDialog(null,nombreA[f]+ " - " + notas[f]);
    }
   }
//6.Cargar en un arreglo los nombres de 5 países y en otro vector paralelo la cantidad de habitantes del mismo
        public void cargarPaises() {
        paisesC=new String[5];
        habitantes=new int[5];
        JOptionPane.showMessageDialog(null,"Carga de paises y habitantes");
        for(int f=0;f<paisesC.length;f++) {
            paisesC[f]=JOptionPane.showInputDialog("Ingese el nombre del pais:");
            habitantes[f]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de habitantes:"));
        }
           JOptionPane.showMessageDialog(null,"Nombres"+Arrays.toString(paisesC));  
            JOptionPane.showMessageDialog(null,"Habitantes"+Arrays.toString(habitantes)); 
    }  
//Ordenar alfabéticamente e imprimir los resultados
    public void ordenarNombres() {
        for(int k=0;k<paisesC.length;k++) {
            for(int f=0;f<paisesC.length-1-k;f++) {
                if (paisesC[f].compareTo(paisesC[f+1])>0) {
                    String auxpais;
                    auxpais=paisesC[f];
                    paisesC[f]=paisesC[f+1];
                    paisesC[f+1]=auxpais;
                    int auxhabitante;
                    auxhabitante=habitantes[f];
                    habitantes[f]=habitantes[f+1];
                    habitantes[f+1]=auxhabitante;
                }
            }
        }
        for(int f=0;f<paisesC.length;f++) {
            JOptionPane.showMessageDialog(null,paisesC[f] + " - " + habitantes[f]);
    } 
    }     
//Por último, ordenar con respecto a la cantidad de habitantes (de mayor a menor) e imprimir nuevamente.
    public void ordenarHabitantes() {
        for(int k=0;k<paisesC.length;k++) {
            for(int f=0;f<paisesC.length-1-k;f++) {
                if (habitantes[f]<habitantes[f+1]) {
                    String auxpais;
                    auxpais=paisesC[f];
                    paisesC[f]=paisesC[f+1];
                    paisesC[f+1]=auxpais;
                    int auxhabitante;
                    auxhabitante=habitantes[f];
                    habitantes[f]=habitantes[f+1];
                    habitantes[f+1]=auxhabitante;
                }
            }
        }
        for(int f=0;f<paisesC.length;f++) {
            JOptionPane.showMessageDialog(null,paisesC[f] + " - " + habitantes[f]);
        }
    }
          
     public  void menu(){
    
    int op;
    
    do {   
        
       op=Integer.parseInt( JOptionPane.showInputDialog("INGRESE EL ITEM \n\n"
               + "  . . . . . . . . . .  MENU  . . . . . . . . . . \n\n"
               + "1.- Arreglo de elementos\n"
               + "2.- Imprimir Elementos\n"
               + "3.- Datos Personas\n"
               + "4.- Mayores de Edad\n"
               + "5.- Cargar Elementos\n"
               + "6.- Imprimir Menor\n"
               + "7.- Repite Menor\n"
               + "8.- Nombre Paises\n"
               + "9.- Ordenar\n"
               + "10.-Alumnos\n"
               + "11.-Ordenar Notas\n"
               + "12.-Cargar Paises\n"
               + "13.-Ordenar Por Nombres\n"
               + "14.-Ordenar por Habitantes\n"
               + "15.- SALIR....\n\n"));
        
       switch(op){
           
           case 1:
               arregloElementos();
               break;
           case 2:
               imprimir();
               break;
           case 3:
               datosPersonas();
               break;
           case 4:
               mayoresEdad();
               break;
           case 5:
               cargar();
               break; 
           case 6:
               imprimirMenor();
               break;
           case 7:
               repiteMenor();
               break;
           case 8:
               paìses();
               break;
           case 9:
               ordenar();
               break;
           case 10:
               alumnos();
               break;
           case 11:
               ordenarN();
               break;
           case 12:
               cargarPaises();
               break;
           case 13:
               ordenarNombres();
               break;
           case 14:
               ordenarHabitantes();
               break;
           
       }       
    }while (op!=15); 
}
    
    
} 


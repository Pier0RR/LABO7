/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7;

import java.util.ArrayList;
import java.util.List;
import lab7.entidades.Estudiante;
import lab7.pantallas.PantallaEstudiantes;

/**
 *
 * @author USUARIO
 */
public class LAB7 {

    public static List<Estudiante> estudianteGlobal= new ArrayList<>();
    
    
    public static void main(String[] args) {
        
        PantallaEstudiantes pantalla= new PantallaEstudiantes();
        pantalla.setVisible(true);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// Peguei informações daqui: https://www.marciocunha.eti.br/java-capturar-horario-do-sistema-idioma-do-sistema-e-resolucao-de-tela/

package informacoessistema;

import java.util.Date;
import java.util.Locale;
import java.awt.Toolkit;
import java.awt.Dimension;
/**
 *
 * @author Daniel
 */
public class InformacoesSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("A hora do sistema é: ");
        System.out.println(relogio.toString());
        
        Locale loc = Locale.getDefault();
        System.out.println("O idioma do sistema é: ");
        System.out.println(loc.getDisplayLanguage());
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A dimensão da tela é: " + d.width + "X" + d.height);
        
    }
    
}

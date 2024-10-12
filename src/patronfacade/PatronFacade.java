/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronfacade;

/**
 *
 * @author Alexander
 */
public class PatronFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Crear la fachada
        BancoFacade bancoFacade = new BancoFacade();
        
        // Usar la fachada para realizar operaciones
        bancoFacade.transferir(500);
        bancoFacade.depositar(1000);
        bancoFacade.retirar(200);
    }
    }
    


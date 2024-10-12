/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronfacade;

/**
 *
 * @author Alexander
 */
public class BancoFacade {

    private Transferencia transferencia;
    private Deposito deposito;
    private Retiro retiro;

    // Constructor
    public BancoFacade() {
        transferencia = new Transferencia();
        deposito = new Deposito();
        retiro = new Retiro();
    }

    // Métodos simplificados para realizar operaciones bancarias
    public void transferir(double monto) {
        transferencia.realizarTransferencia(monto);
    }

    public void depositar(double monto) {
        deposito.realizarDeposito(monto);
    }

    public void retirar(double monto) {
        retiro.realizarRetiro(monto);
    }
}

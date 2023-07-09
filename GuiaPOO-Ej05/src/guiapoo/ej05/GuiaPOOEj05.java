/*
Ejercicios de Aprendizaje N.5
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la restará al saldo actual. 
Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package guiapoo.ej05;

import Entity.Cuenta;
import Service.CuentaService;

/**
 * @author mfoso
 */
public class GuiaPOOEj05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        CuentaService serCta = new CuentaService();
        Cuenta Cta1 = serCta.crearCuenta(); 
        serCta.ingresar(Cta1);
        serCta.retirar(Cta1);
        serCta.extraccionRapida(Cta1);
        serCta.consultarSaldo(Cta1);
        serCta.consultarDatos(Cta1);
    }
    
}

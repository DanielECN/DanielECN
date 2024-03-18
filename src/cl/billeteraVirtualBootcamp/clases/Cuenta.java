package cl.billeteraVirtualBootcamp.clases;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Mi clase principal cuenta, de donde podre manipular los datos del titular(String),
 * numero de cuenta(int), saldo(double)
 */
public class Cuenta {
    /*
    1) Atributos de una clase
    */

    //MODIFICADORES DE ACCESO =  *PUBLIC* *PRIVATE* *PROTECTED*

    private int numeroCuenta;
    private double saldoCuenta;
    private String titularCuenta;

    /*
    2) Constructor
    */
        public Cuenta(){}

    public Cuenta(int numeroCuentaCuenta, String titular, double saldo){
            this.numeroCuenta = numeroCuentaCuenta;
            this.titularCuenta = titular;
            this.saldoCuenta = saldo;
        }

     /*
    3) Metodos de acceso
    */
    ////////////GETTERS Y SETTERS

    /**
     * Getters y setters de mi numero de cuenta, saldo de cuenta y titular de cuenta
     *
     */
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public double getSaldoCuenta() {
        return saldoCuenta;
    }
    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }
    public String getTitularCuenta() {
        return titularCuenta;
    }
    public void setTitularCuenta(String titularCuenta) {
        this.titularCuenta = titularCuenta;
    }

    /*
    4) Metodos de comportamiento
    */

    public void mostrarInformacionCuentaCorriente(){

        String formatoSaldo = formatearSaldo(saldoCuenta);

        System.out.println("------------------------------------");
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Titular de cuenta: " + titularCuenta);
        System.out.println("Saldo de cuenta: $" + formatoSaldo);
        System.out.println("------------------------------------");




    }
    //CrearCuenta

    public static Cuenta CrearCuentaCorrientePorConsola(String nombreCliente){
        Scanner scanner = new Scanner(System.in);
        int numeroCuenta;
        double saldoCuenta;

        System.out.println("Ingrese el numero de cuenta: ");
        numeroCuenta = scanner.nextInt();
        scanner.nextLine(); // va a la siguiente linea

        System.out.println("Ingrese el saldo de la cuenta: ");
        saldoCuenta = scanner.nextDouble();

        return new Cuenta(numeroCuenta,nombreCliente,saldoCuenta);


    }

    //AgregarSaldo
    //RestarSaldo
    //VerSaldo
    //MostrarInformacion
    //ConversorMoneda
    //Menu


    /*
    5) OPCIONAL "Metodos  utilitarios de logica"
    */

    /**
     * Metodo usado para mostrar el saldo en un numero o formato mas legible
     *
     * @return me retorna el saldo con su formato
     */
    private String formatearSaldo(double saldoCuenta){
        DecimalFormat formatoSaldo = new DecimalFormat("#,###");

        return formatoSaldo.format(saldoCuenta);
    }
}

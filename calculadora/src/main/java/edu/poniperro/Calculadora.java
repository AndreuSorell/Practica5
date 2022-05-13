package edu.poniperro;

public class Calculadora implements ICalculadora{

    
    /** devuelve la suma de dos numeros
     * @param num1
     * @param num2
     * @return double
     */
    @Override
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    
    /** devuelve la resta de dos numeros
     * @param num1
     * @param num2
     * @return double
     */
    @Override
    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    
    /** devuelve la multiplicacion de dos numeros
     * @param num1
     * @param num2
     * @return double
     */
    @Override
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    
    /** devuelve la division entre dos numeros
     * @param num1
     * @param num2
     * @return double
     */
    @Override
    public double dividir(double num1, double num2) {
        return num1 / num2;
    }
}
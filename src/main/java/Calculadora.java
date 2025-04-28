/**
 * Classe final que no pot ser heredada ni instanciada.
 * Està pensada per a que s'usin els seus mètodes static.
 */
public final class Calculadora {

    /**
     * Constructor privat per tal d'evitar que es creïn objectes de la classe.
     */
    private Calculadora(){};

    /**
     * Mètode static per a sumar dos valors float
     * @param a Valor 1 a sumar
     * @param b Valor 2 a sumar
     * @return Retorn de la suma de a + b
     */
    public final static float suma(float a, float b){
        return a + b;
    }

    /**
     * Mètode static per a resta dos valors float
     * @param a Valor 1 a sumar
     * @param b Valor 2 a sumar
     * @return Retorn de la resta de a - b
     */
    public final static float resta(float a, float b){
        return a - b;
    }

}

package org.example;

abstract class Moneda implements Comparable<Moneda>{
    public Moneda() {
    }

    /**
     * Compara esta moneda con otra moneda según su serie.
     * @param Moneda la moneda con la que se va a comparar.
     * @return un valor negativo si esta moneda tiene una serie menor que la otra,
     *         cero si son iguales, o un valor positivo si es mayor.
     */
    @Override
    public int compareTo(Moneda Moneda) {
        return this.getSerie().compareTo(Moneda.getSerie());
    }

    /**
     * @return Devuelve en forma de string la direccion de la moneda en la memoria
     */

    public String getSerie() {
        return this.toString();
    }

    /** Metodo abstracto que sirva para que cada clase moneda pueda devolver su valor
     * @return Devuelve el valor de moneda en forma de int
     */
    public abstract int getValor();
}

class Moneda1000 extends Moneda {
    public Moneda1000() {
        super();
    }
    @Override
    public int getValor() {
        return 1000;
    }
}

class Moneda500 extends Moneda {
    public Moneda500() {
        super();
    }
    @Override
    public int getValor() {
        return 500;
    }
}

class Moneda100 extends Moneda {
    public Moneda100() {
        super();
    }
    @Override
    public int getValor() {
        return 100;
    }
}
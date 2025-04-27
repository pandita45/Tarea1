package org.example;
import java.util.ArrayList;

abstract class DepositoBase<item> {
    protected ArrayList<item> Deposito;

    public DepositoBase() {
        Deposito = new ArrayList<>();
    }

    /**
     * add agrega el item (Bebida, Moneda o Dulce) a su deposito correspondiente.
     * @param a item que se agregara al deposito.
     */
    public void add(item a) {
        Deposito.add(a);
    }

    /**
     * get saca un item de su respectivo deposito
     * @return devuelve el ultimo item que se agrego al deposito, en caso de que este vacio, devuelve null.
     */
    public item get() {
        if (Deposito.size() != 0) {
            return Deposito.remove(0);
        } else {
            return null;
        }
    }

    /**
     * getStock es para saber cuantos items hay en cierto deposito
     * @return devuelve el tamaño del array en donde se almacena cierto item
     */
    public int getStock() {
        return Deposito.size();
    }
}

/**
 * Depositos especificos heredados de DepositoBase
 */
class DepositoBebida extends DepositoBase<Bebida> {
}

class DepositoMoneda extends DepositoBase<Moneda> {
}

class DepositoDulce extends DepositoBase<Dulce> {
}

package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        //prueba de excepciones
        System.out.println("--------Prueba de errores--------");
        Expendedor exp = new Expendedor(2);
        Moneda m = null;
        try {
            Comprador c = new Comprador(m,ProductoYPrecios.COCACOLA,exp);
        } catch (PagoIncorrectoException b) {
            System.out.println("No se ingreso moneda");
        }
        Moneda n = new Moneda1000();
        Expendedor exp2 = new Expendedor(0);
        try {
            Comprador c = new Comprador(n, ProductoYPrecios.COCACOLA, exp2);
        } catch (NoHayProductoException b){
            System.out.println("No hay stock");
        }
        Moneda mon = new Moneda500();
        Expendedor exp3 = new Expendedor(2);
        try {
            Comprador c = new Comprador(mon, ProductoYPrecios.COCACOLA, exp3);
        } catch (PagoInsuficienteException b){
            System.out.println("Pago insuficiente");
        }
        System.out.println("");
        //termina prueba de excepcion

        //empieza prueba de compareTo de las monedas
        System.out.println("--------Prueba de compareTo--------");
        Moneda mon100 = new Moneda100();
        Moneda mon500 = new Moneda500();
        Moneda mon1000 = new Moneda1000();
        System.out.println("menor numero de serie: " + mon100.compareTo(mon500));
        System.out.println("mayor numero de serie: " + mon500.compareTo(mon100));
        System.out.println("igual numero de serie: " + mon1000.compareTo(mon1000));
        System.out.println("");
        //se termina prueba de CompareTo

        //prueba sort de monedas
        ArrayList<Moneda> arrayDeMonedas = new ArrayList<>();
        arrayDeMonedas.add(mon500);
        arrayDeMonedas.add(mon1000);
        arrayDeMonedas.add(mon100);
        System.out.println(arrayDeMonedas);
        arrayDeMonedas.sort(Moneda::compareTo);
        System.out.println(arrayDeMonedas);
        System.out.println("");
        //los ordena por el lugar en memoria
        //se termina prueba de sort

        //prueba de cambio de precios en los productos
        System.out.println("--------Prueba de cambio de precios de productos--------");
        System.out.println("Precio inicial: " + ProductoYPrecios.COCACOLA.getPrecio());
        ProductoYPrecios.COCACOLA.setPrecio(700);
        System.out.println("Precio nuevo: " + ProductoYPrecios.COCACOLA.getPrecio());
        System.out.println("");
        //se termina la prueba de cambio de precios

        //Prueba comprar productos
        System.out.println("--------Prueba de compras de distintos productos--------");
        Expendedor expendedor = new Expendedor(5);
        //Pago insuficiente
        Comprador cocaCola;
        System.out.println("compra de cocacola valor = " + ProductoYPrecios.COCACOLA.getPrecio() + " moneda de 100");

        try {
            cocaCola = new Comprador(mon100, ProductoYPrecios.COCACOLA, exp3);
            //aqui si el pago se acepta sigue este codigo(se usara mas en el Main Interactivo)
            System.out.println("Vuelto: " + cocaCola.cuantoVuelto());
            System.out.println("Que Compraste: " + cocaCola.queBebiste());
        } catch (PagoInsuficienteException b){
            System.out.println("Pago insuficiente");
            System.out.println("Moneda rechazada: " + mon100.getValor());
        }
        System.out.println("compra de sprite, Valor = " + ProductoYPrecios.SPRITE.getPrecio() + " moneda de 1000");

        Comprador sprite = new Comprador(mon1000, ProductoYPrecios.SPRITE,expendedor);
        System.out.println("Vuelto: "+ sprite.cuantoVuelto());
        System.out.println("Que Compraste: " + sprite.queBebiste());

        System.out.println("compra de fanta, Valor = " + ProductoYPrecios.FANTA.getPrecio() + " moneda de 1000");
        Comprador fanta = new Comprador(mon1000, ProductoYPrecios.FANTA,expendedor);
        System.out.println("Vuelto: "+ fanta.cuantoVuelto());
        System.out.println("Que Compraste: " + fanta.queBebiste());

        System.out.println("compra de snicker, Valor = " + ProductoYPrecios.SNICKER.getPrecio() + " moneda de 1000");
        Comprador snicker = new Comprador(mon1000, ProductoYPrecios.SNICKER,expendedor);
        System.out.println("Vuelto: "+ snicker.cuantoVuelto());
        System.out.println("Que Compraste: " + snicker.queBebiste());

        System.out.println("compra de super8, Valor = " + ProductoYPrecios.SUPER8.getPrecio() + " moneda de 1000");
        Comprador super8 = new Comprador(mon1000, ProductoYPrecios.SUPER8,expendedor);
        System.out.println("Vuelto: "+ super8.cuantoVuelto());
        System.out.println("Que Compraste: " + super8.queBebiste());
    }
}
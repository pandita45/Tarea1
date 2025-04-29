package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        //prueba de excepciones
        System.out.println("--------Prueba de errores--------");
        Expendedor exp = new Expendedor(2);
        Moneda monNull = null;
        Moneda monedaMil = new Moneda1000();
        Moneda monCien = new Moneda100();
        System.out.println("CocaCola");
        ProductoYPrecios cocaCola1 = ProductoYPrecios.COCACOLA;
        try {
            Comprador c = new Comprador(monNull,cocaCola1,exp);
        } catch (PagoIncorrectoException b) {
            System.out.println("No se ingreso moneda");
        }
        Expendedor exp2 = new Expendedor(0);
        try {
            Comprador c = new Comprador(monedaMil, cocaCola1, exp2);
        } catch (NoHayProductoException b){
            System.out.println("No hay stock");
        }
        Expendedor exp3 = new Expendedor(2);
        try {
            Comprador c = new Comprador(monCien, cocaCola1, exp3);
        } catch (PagoInsuficienteException b){
            System.out.println("Pago insuficiente");
        }
        System.out.println();
        System.out.println("Sprite");
        ProductoYPrecios sprite1 = ProductoYPrecios.SPRITE;
        try {
            Comprador c = new Comprador(monNull,sprite1,exp);
        } catch (PagoIncorrectoException b) {
            System.out.println("No se ingreso moneda");
        }
        try {
            Comprador c = new Comprador(monedaMil, sprite1, exp2);
        } catch (NoHayProductoException b){
            System.out.println("No hay stock");
        }
        try {
            Comprador c = new Comprador(monCien, sprite1, exp3);
        } catch (PagoInsuficienteException b){
            System.out.println("Pago insuficiente");
        }
        System.out.println();
        System.out.println("Fanta");
        ProductoYPrecios fanta1 = ProductoYPrecios.FANTA;
        try {
            Comprador c = new Comprador(monNull,fanta1,exp);
        } catch (PagoIncorrectoException b) {
            System.out.println("No se ingreso moneda");
        }
        try {
            Comprador c = new Comprador(monedaMil, fanta1, exp2);
        } catch (NoHayProductoException b){
            System.out.println("No hay stock");
        }
        try {
            Comprador c = new Comprador(monCien, fanta1, exp3);
        } catch (PagoInsuficienteException b){
            System.out.println("Pago insuficiente");
        }
        System.out.println();
        System.out.println("Super8");
        ProductoYPrecios super81 = ProductoYPrecios.SUPER8;
        try {
            Comprador c = new Comprador(monNull,super81,exp);
        } catch (PagoIncorrectoException b) {
            System.out.println("No se ingreso moneda");
        }
        try {
            Comprador c = new Comprador(monedaMil, super81, exp2);
        } catch (NoHayProductoException b){
            System.out.println("No hay stock");
        }
        try {
            Comprador c = new Comprador(monCien, super81, exp3);
        } catch (PagoInsuficienteException b){
            System.out.println("Pago insuficiente");
        }
        System.out.println();
        System.out.println("Snicker");
        ProductoYPrecios snicker1 = ProductoYPrecios.SNICKER;
        try {
            Comprador c = new Comprador(monNull,snicker1,exp);
        } catch (PagoIncorrectoException b) {
            System.out.println("No se ingreso moneda");
        }
        try {
            Comprador c = new Comprador(monedaMil, snicker1, exp2);
        } catch (NoHayProductoException b){
            System.out.println("No hay stock");
        }
        try {
            Comprador c = new Comprador(monCien, snicker1, exp3);
        } catch (PagoInsuficienteException b){
            System.out.println("Pago insuficiente");
        }
        System.out.println();
        //termina prueba de excepcion


        //empieza prueba de compareTo de las monedas
        System.out.println("--------Prueba de compareTo--------");
        Moneda mon100 = new Moneda100();
        Moneda mon500 = new Moneda500();
        Moneda mon1000 = new Moneda1000();
        System.out.println("Menor numero de serie: " + mon100.compareTo(mon500));
        System.out.println("Mayor numero de serie: " + mon500.compareTo(mon100));
        System.out.println("Igual numero de serie: " + mon1000.compareTo(mon1000));
        System.out.println();
        //se termina prueba de CompareTo

        //prueba sort de monedas
        ArrayList<Moneda> arrayDeMonedas = new ArrayList<>();
        arrayDeMonedas.add(mon500);
        arrayDeMonedas.add(mon1000);
        arrayDeMonedas.add(mon100);
        System.out.println(arrayDeMonedas);
        arrayDeMonedas.sort(Moneda::compareTo);
        System.out.println(arrayDeMonedas);
        System.out.println();
        //los ordena por el lugar en memoria
        //se termina prueba de sort

        //prueba de cambio de precios en los productos
        System.out.println("--------Prueba de cambio de precios de productos--------");
        System.out.println("Precio inicial Cocacola: " + ProductoYPrecios.COCACOLA.getPrecio());
        ProductoYPrecios.COCACOLA.setPrecio(700);
        System.out.println("Precio nuevo Cocacola: " + ProductoYPrecios.COCACOLA.getPrecio());
        System.out.println();
        System.out.println("Precio inicial Sprite: " + ProductoYPrecios.SPRITE.getPrecio());
        ProductoYPrecios.SPRITE.setPrecio(300);
        System.out.println("Precio nuevo Sprite: " + ProductoYPrecios.SPRITE.getPrecio());
        System.out.println();
        System.out.println("Precio inicial Fanta: " + ProductoYPrecios.FANTA.getPrecio());
        ProductoYPrecios.FANTA.setPrecio(500);
        System.out.println("Precio nuevo Fanta: " + ProductoYPrecios.FANTA.getPrecio());
        System.out.println();
        System.out.println("Precio inicial Super8: " + ProductoYPrecios.SUPER8.getPrecio());
        ProductoYPrecios.SUPER8.setPrecio(500);
        System.out.println("Precio nuevo Super8: " + ProductoYPrecios.SUPER8.getPrecio());
        System.out.println();
        System.out.println("Precio inicial Snickers: " + ProductoYPrecios.SNICKER.getPrecio());
        ProductoYPrecios.SNICKER.setPrecio(700);
        System.out.println("Precio nuevo Snickers: " + ProductoYPrecios.SNICKER.getPrecio());
        System.out.println();

        //se termina la prueba de cambio de precios

        //Prueba comprar productos
        System.out.println("--------Prueba de compras de distintos productos--------");
        Expendedor expendedor = new Expendedor(5);
        //Pago insuficiente
        Comprador cocaCola;
        System.out.println("Compra de cocacola valor = " + ProductoYPrecios.COCACOLA.getPrecio() + " moneda de 100");

        try {
            cocaCola = new Comprador(mon100, ProductoYPrecios.COCACOLA, exp3);
            //aqui si el pago se acepta sigue este codigo(se usara mas en el Main Interactivo)
            System.out.println("Vuelto: " + cocaCola.cuantoVuelto());
            System.out.println("Que Compraste: " + cocaCola.queCompraste());
        } catch (PagoInsuficienteException b){
            System.out.println("Pago insuficiente");
            System.out.println("Moneda rechazada: " + mon100.getValor());
        }
        System.out.println("Compra de CocaCola, Valor = " + ProductoYPrecios.COCACOLA.getPrecio() + " moneda de 1000");

        Comprador cocacola = new Comprador(mon1000, ProductoYPrecios.COCACOLA,expendedor);
        System.out.println("Vuelto: "+ cocacola.cuantoVuelto());
        System.out.println("Que Compraste: " + cocacola.queCompraste());

        System.out.println("Compra de sprite, Valor = " + ProductoYPrecios.SPRITE.getPrecio() + " moneda de 1000");

        Comprador sprite = new Comprador(mon1000, ProductoYPrecios.SPRITE,expendedor);
        System.out.println("Vuelto: "+ sprite.cuantoVuelto());
        System.out.println("Que Compraste: " + sprite.queCompraste());

        System.out.println("compra de fanta, Valor = " + ProductoYPrecios.FANTA.getPrecio() + " moneda de 1000");
        Comprador fanta = new Comprador(mon1000, ProductoYPrecios.FANTA,expendedor);
        System.out.println("Vuelto: "+ fanta.cuantoVuelto());
        System.out.println("Que Compraste: " + fanta.queCompraste());

        System.out.println("Compra de snicker, Valor = " + ProductoYPrecios.SNICKER.getPrecio() + " moneda de 1000");
        Comprador snicker = new Comprador(mon1000, ProductoYPrecios.SNICKER,expendedor);
        System.out.println("Vuelto: "+ snicker.cuantoVuelto());
        System.out.println("Que Compraste: " + snicker.queCompraste());

        System.out.println("Compra de super8, Valor = " + ProductoYPrecios.SUPER8.getPrecio() + " moneda de 1000");
        Comprador super8 = new Comprador(mon1000, ProductoYPrecios.SUPER8,expendedor);
        System.out.println("Vuelto: "+ super8.cuantoVuelto());
        System.out.println("Que Compraste: " + super8.queCompraste());
    }
}
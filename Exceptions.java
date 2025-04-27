package org.example;

abstract class Errores extends Exception{
  public Errores(String msg){
    super(msg);
  }
}

class PagoIncorrectoException extends Errores{
  public PagoIncorrectoException(){
    super("Pago incorrecto: No se ingreso ningun moneda");
  }
}

class NoHayProductoException extends Errores{
  public NoHayProductoException(){
    super("No hay producto: No queda stock del producto solicitado");
  }
}

class PagoInsuficienteException extends Errores{
  public PagoInsuficienteException(){
    super("Pago insuficiente: Ingrese moneda de más valor");
  }
}
package com.trybe.simuladordepix;

public abstract class ErroSaldoInsuficiente extends ErroDePix {

  public ErroSaldoInsuficiente() {
    super(mensagens.SALDO_INSUFICIENTE);
  }
}

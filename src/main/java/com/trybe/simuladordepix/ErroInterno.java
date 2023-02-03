package com.trybe.simuladordepix;

public abstract class ErroInterno extends ErroDePix {

  public ErroInterno() {
    super(mensagens.ERRO_INTERNO);
  }
}

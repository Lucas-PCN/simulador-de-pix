package com.trybe.simuladordepix;

public abstract class ErroChaveNaoEncontrada extends ErroDePix {

  public ErroChaveNaoEncontrada() {
    super(mensagens.CHAVE_NAO_ENCONTRADA);
  }
}

package com.trybe.simuladordepix;

public abstract class ErroValorNaoPositivo extends ErroDePix {

  public ErroValorNaoPositivo() {
    super(Mensagens.VALOR_NAO_POSITIVO);
  }
}

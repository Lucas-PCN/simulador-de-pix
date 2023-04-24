# Projeto Simulador de pix

<p>Projeto entregue durante o curso de desenvolvimento Web ministrado pela <a href="https://www.betrybe.com" targe="_blank" rel="nofollow">Trybe</a>.</p>

<p>Obtive a aprovação no projeto completando 100% dos requisitos obrigatórios e opcionais. Efetivando, assim, a conclusão do Bloco 4 (Tratamento de erros) referente a Aceleração em Java.</p>

## Descrição
O projeto simula um processo de transferência bancária via Pix, realizado por meio de um aplicativo mobile.
  
  O processo é muito simples: a pessoa usuária do aplicativo preenche um valor e uma chave Pix e ele envia essas informações para o servidor do banco na nuvem. 
  
  - O objetivo foi **tratar os erros que podem acontecer** ao longo desta operação.

### :memo: Foram escritos dois componentes em Java:
  :pushpin: 1. **Processador de Pix:** é o componente que contém a lógica de negócio da operação.
   
   Dadas as entradas (valor e chave Pix), o simulador é responsável por validá-las e enviá-las ao servidor na nuvem, interpretando a resposta recebida.
   
   - O processador de Pix interage com outros dois componentes que foram implementados pela Trybe:
     1. **Conexão:** representa um canal de comunicação entre o aplicativo mobile e o servidor na nuvem. O processador de Pix usou uma conexão para enviar os dados de entrada (valor e chave Pix).
     2. **Servidor:** é o componente que foi utilizado pelo processador de Pix para abrir uma nova conexão com o servidor na nuvem.


  :pushpin: 2. **Controlador de Pix:** é o componente que contém a lógica de apresentação deste fluxo.
   - Ele é responsável por invocar o processador de Pix, passando as informações preenchidas pela pessoa usuária na tela do aplicativo. 
   - Também é responsabilidade do componente capturar qualquer erro que possa acontecer durante o processo e informar a pessoa usuária sobre o resultado da operação.


### Tratamento de erros

  Durante a operação do Pix, pode ocorrer uma série de erros:

:pushpin: - Erros de aplicação validados localmente
    - Valor a ser transferido menor ou igual a zero
    - Chave Pix em branco

:pushpin: - Erros de aplicação validados pelo servidor
    - Saldo insuficiente
    - Chave Pix não encontrada
    - Erro interno (por exemplo, falha no servidor)

:pushpin: - Erros de comunicação (por exemplo, timeout de conexão)

:pushpin: Quanto aos erros da aplicação, não existem exceções que os representem na biblioteca padrão. Por isso foram criados _exceções customizadas_. 


## Rodando o projeto localmente
  1. Clone o repositório
   
     `git@github.com:Lucas-PCN/simulador-de-pix.git`
    
  2. Entre no diretório do repositório que você acabou de clonar:
  
     `cd simulador-de-pix`

  3. Instale as dependências:
    
     `mvn install`

---

Projeto desenvolvido por Lucas Castanheira, para fins didáticos. 2023

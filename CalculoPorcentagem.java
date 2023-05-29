public class CalculoPorcentagem {
  public void calculaPorcentagem(Pessoa pessoa) {
    if (pessoa.estaRetornandoViagem.equals("SIM")) {
      pessoa.porcentagemInfeccao += 30;
      pessoa.orientacaoFinal = "Você ficará sob observação por 05 dias.";
    }

    else if (pessoa.cartaoVacinaEmDia.equals("NAO")) {
      pessoa.porcentagemInfeccao += 10;
    }

    else if (pessoa.teveSintomasRecentemente.equals("SIM")) {
      pessoa.porcentagemInfeccao += 30;
    }

    else if (pessoa.teveContatoComPessoasSintomaticas.equals("SIM")) {
      pessoa.porcentagemInfeccao += 30;
    }
  }
}

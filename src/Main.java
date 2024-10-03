import modal.Endereco;
import modal.Pessoa;
import modal.Telefone;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArquivoBD arquivoBD = new ArquivoBD("src/resources/clients.csv");

        List<Pessoa> pessoas = arquivoBD.getPessoasCSV();
        List<Endereco> enderecos = arquivoBD.getEnderecosCSV();
        List<Telefone> telefones = arquivoBD.getTelefonesCSV();

       int tamanho = pessoas.size();
       int umTerco = pessoas.size() / 3;


        Thread executar01 = new Thread(new Execution(arquivoBD, 0, umTerco));
        Thread executar02 = new Thread(new Execution(arquivoBD, umTerco, tamanho - umTerco));
        Thread executar03 = new Thread(new Execution(arquivoBD, tamanho - umTerco, tamanho));

        executar01.start();
        executar02.start();
        executar03.start();
    }
}
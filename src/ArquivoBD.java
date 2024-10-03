import modal.Endereco;
import modal.Pessoa;
import modal.Telefone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArquivoBD {
    private String filePath;

    public ArquivoBD(String filePath) {
        this.filePath = filePath;
    }

    public List<Pessoa> getPessoasCSV() {
        List<Pessoa> pessoas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                if (data.length >= 5) {
                    Pessoa pessoa = new Pessoa(data[0], data[1], data[2], Integer.parseInt(data[3]));
                    pessoas.add(pessoa);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pessoas;
    }

    public List<Endereco> getEnderecosCSV() {
        List<Endereco> enderecos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                if (data.length >= 5) {
                    Endereco endereco = new Endereco(data[4], Integer.parseInt(data[5]), data[6], data[7], data[8]);
                    enderecos.add(endereco);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return enderecos;
    }

    public List<Telefone> getTelefonesCSV() {
        List<Telefone> telefones = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                if (data.length >= 5) {
                    Telefone telefone = new Telefone(data[9]);
                    telefones.add(telefone);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return telefones;
    }


//    public void ApresentarClientesCSV(int Start, int end) {
//        List<Pessoa> clients = LerClientesCSV();
//        for (int i = Start; i < end; i++) {
//            System.out.println(clients.get(i).toString());
//        }
//    }


//    public void editarClientes(String id, Pessoa newClient) {
//        List<Pessoa> clients = LerClientesCSV(); // Carregar todos os clientes
//        boolean updated = false; // Flag para verificar se a edição ocorreu
//
//        try (PrintWriter pw = new PrintWriter(new FileWriter(filePath))) {
//            for (Pessoa client : clients) {
//                if (client.getId().equals(id)) {
//                    client = newClient; // Atualiza o cliente com o ID correspondente
//                    updated = true;
//                }
//                pw.println(client.toString()); // Escreve todos os clientes de volta no arquivo
//            }
//
//            if (!updated) {
//                System.out.println("modal.Cliente com ID " + id + " não foi encontrado.");
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Buscar e exibir cliente pelo ID
//    public void getClientePorId(String id) {
//        List<Pessoa> clients = LerClientesCSV();
//        boolean Localizado = false;
//
//        for (Pessoa client : clients) {
//            if (client.getId().equals(id)) {
//                System.out.println("modal.Cliente encontrado: " + client.toString());
//                Localizado = true;
//                break;
//            }
//        }
//
//        if (!Localizado) {
//            System.out.println("modal.Cliente com ID " + id + " não existe.");
//        }
//    }

//    // Excluir um cliente pelo ID
//    public void deletarClientes(String id) {
//        List<Pessoa> clients = LerClientesCSV();
//        try (PrintWriter pw = new PrintWriter(new FileWriter(filePath))) {
//            for (Pessoa client : clients) {
//                if (!client.getId().equals(id)) {
//                    pw.println(client.toString());
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    public void adicionarCliente(Pessoa cliente) {
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
//            String novaLinha = cliente.getId() + ";" + cliente.getNome() + ";" + cliente.getEndereco() + ";" + cliente.getIdade() + ";" + cliente.getSexo();
//            bw.write(novaLinha);
//            bw.newLine(); // Adiciona uma nova linha ao final
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


//    public String proximoId() {
//        List<Pessoa> clientes = LerClientesCSV();
//        int maiorId = 0;
//        String MaiorIDString= null;
//
//        // Percorre todos os clientes e encontra o maior ID
//        for (Pessoa cliente : clientes) {
//            int idAtual = Integer.parseInt(cliente.getId());
//            if (idAtual > maiorId) {
//                maiorId = idAtual;
//            }
//        }
//        maiorId =  maiorId+1;
//        MaiorIDString = String.valueOf(maiorId);
//
//        // Retorna o próximo ID disponível (maior ID + 1)
//        return MaiorIDString;
//    }
}

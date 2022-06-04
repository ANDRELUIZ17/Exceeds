package br.comgft.mainprincipal;
import br.comgft.mainprincipal.Exercicio1.Veiculo;
import br.comgft.mainprincipal.Exercicio2.Livro;
import br.comgft.mainprincipal.Exercicio2.Loja;
import br.comgft.mainprincipal.Exercicio2.VideoGame;
import br.comgft.mainprincipal.Exercicio3.Guerreiro;
import br.comgft.mainprincipal.Exercicio3.Mago;
import br.comgft.mainprincipal.Exercicio3.Personagem;
import br.comgft.mainprincipal.Exercicio4.Pessoas;
import br.comgft.mainprincipal.Exercicio7.Gerente;
import br.comgft.mainprincipal.Exercicio7.Supervisor;
import br.comgft.mainprincipal.Exercicio7.Vendedor;
import br.comgft.mainprincipal.exercicio6.Pessoas3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class MainPrincipalApplication {
    public static void main(String[] args) {

        System.out.println("Digite o exercicio que deseja executar: ");
        System.out.println("1 - Exercicio 1");
        System.out.println("2 - Exercicio 2");
        System.out.println("3 - Exercicio 3");
        System.out.println("4 - Exercicio 4");
        System.out.println("5 - Exercicio 5");
        System.out.println("6 - Exercicio 6");
        System.out.println("7 - Exercicio 7");

        int opcao = new Scanner(System.in).nextInt();
        switch (opcao) {
            case 1:
                System.out.println("-------------");
                Veiculo veiculo = new Veiculo();
                System.out.println("Dados do veiculo: ");
                System.out.println("Acelerando o veiculo: de 50 foi á: ");
                veiculo.setVelocidade(50);
                veiculo.acelerar();
                System.out.println(veiculo.getVelocidade() + " Km ");

                System.out.println("--------------");
                System.out.println("Combustivel: ");
                veiculo.abastecer(79);
                System.out.println(veiculo.getLitrosCombustivel());

                System.out.println("---------------");
                System.out.println("Diminuindo a velocidade: ");
                veiculo.setVelocidade(20);
                veiculo.frear();
                System.out.println(veiculo.getVelocidade());

                System.out.println("--------------");
                System.out.println("Cor do veiculo: ");
                veiculo.pintar("Vermelho");
                System.out.println(veiculo.getCor());

                System.out.println("-------------");
                System.out.println("Velocidade atual: ");
                System.out.println(veiculo.getVelocidade() + " km ");

                System.out.println("-------------");
                System.out.println("O veiculo está ligado? ");
                System.out.println("Sua velocidade é de 30 km");
                veiculo.ligar();
                System.out.println(veiculo.isLigado());

                System.out.println("-------------");
                System.out.println("Desligar o veículo! ");
                veiculo.setVelocidade(0);
                veiculo.isLigado();
                veiculo.desligar();
                System.out.println(veiculo.isLigado() + "\n" + "Veículo desligado!!!");
                break;
            case 2:
                System.out.println("Exercicio 2: ");
                Locale.setDefault(Locale.US);

                Livro l1 = new Livro("Java", 100.0, 10, "Paulo Silveira", "Educativo", 1000);
                Livro l2 = new Livro("Senhor dos Aneis", 200.0, 2, "J.R.R Tolkien", "Fantasia", 400);
                Livro l3 = new Livro("Javascript", 50.0, 2, "Mozilla", "Educativo", 100);

                System.out.println();
                VideoGame ps4 = new VideoGame("PS4", 1800.0, 40, "SONY", "PS4", false);
                VideoGame ps4Usado = new VideoGame("PS4_Usado", 400.0, 1, "SONY", "Diversão", true);
                VideoGame xbox = new VideoGame("Xbox", 2000.0, 40, "Microsoft", "Diversão", false);

                List<Livro> livros = new ArrayList<>();
                livros.add(l1);
                livros.add(l2);
                livros.add(l3);

                List<VideoGame> videoGames = new ArrayList<>();
                videoGames.add(ps4);
                videoGames.add(ps4Usado);
                videoGames.add(xbox);

                Loja americanas = new Loja("Americanas", "123456789", livros, videoGames);
                l1.calcularImposto();
                l2.calcularImposto();
                l3.calcularImposto();


                ps4.calcularImposto();
                ps4Usado.calcularImposto();
                xbox.calcularImposto();

                americanas.listaLivros();
                americanas.listaVideoGame();
                americanas.calcularPatrimonio();
                System.out.println("Livros");
                System.out.println("Quantidade a pagar R$: " + l1.getQuantidadeAPagar() + " Reais");
                System.out.println("Quantidade a pagar R$: " + l2.getQuantidadeAPagar() + " Reais");
                System.out.println("Quantidade a pagar R$: " + l3.getQuantidadeAPagar() + " Reais");
                System.out.println();
                System.out.println("Video Games");
                System.out.println("Quantidade a pagar R$: " + ps4.getPreco() + " Reais");
                System.out.println("Quantidade a pagar R$: " + ps4Usado.getPreco() + " Reais");
                System.out.println("_______________");
                System.out.println("Preço e o imposto do console Xbox: ");
                System.out.println("Quantidade a pagar R$: " + xbox.getPreco() + " Reais");
                System.out.println("Quantidade de imposto: R$: " + xbox.calcularImposto() + " Reais");
                System.out.println("---------------");
                System.out.println("Preço e o imposto do console PS4: ");
                System.out.println("Quantidade a pagar R$: " + ps4.getPreco() + " Reais");
                System.out.println("Quantidade de imposto: R$: " + ps4.calcularImposto() + " Reais");
                System.out.println("---------------");
                System.out.println("Preço e o imposto do console PS4 usado: ");
                System.out.println("Quantidade a pagar R$: " + ps4Usado.getPreco() + " Reais");
                System.out.println("Quantidade de imposto: R$: " + ps4Usado.calcularImposto() + " Reais");

                System.out.println("O valor total do patrimonio da loja é R$: " + americanas.calcularPatrimonio());
                break;
            case 3:
                System.out.println("Exercicio 3: ");
                Scanner scanner = new Scanner(System.in);
                List<Personagem> personagens = new ArrayList<>();

                System.out.println("Escolha a opção desejada (m/g):");
                char opcao1 = scanner.next().charAt(0);
                for (int i = 1; i <= opcao1; i++) {
                    if (opcao1 == 'm') {
                        Mago mago = new Mago();
                        System.out.println("Digite o nome do mago: ");
                        mago.setNome(scanner.next());
                        System.out.println("Digite o level do mago: ");
                        mago.setLevel(scanner.nextInt());
                        System.out.println("Digite a inteligencia do mago: ");
                        mago.setInteligencia(scanner.nextInt());
                        System.out.println("Digite o mana do mago: ");
                        mago.setMana(scanner.nextInt());
                        System.out.println("Digite a vida do mago: ");
                        mago.setVida(scanner.nextInt());
                        personagens.add(mago);
                        mago.attack();
                        System.out.println("Nome: " + mago.getNome() + " Level: "
                                + mago.getLevel() + " Inteligencia: "
                                + mago.getInteligencia() + " Mana: "
                                + mago.getMana() + " Forca: "
                                + mago.getVida());
                        System.out.println(mago.attack());
                        System.out.println(mago.aprenderMagia("Sim"));
                        break;

                    } else if (opcao1 == 'g') {
                        Guerreiro guerreiro = new Guerreiro();
                        System.out.println("Digite o nome do guerreiro: " + "\n");
                        scanner.nextLine();
                        guerreiro.setNome(scanner.next());
                        System.out.println("Digite o level do guerreiro: ");
                        guerreiro.setLevel(scanner.nextInt());
                        System.out.println("Digite a forca do guerreiro: ");
                        guerreiro.setForca(scanner.nextInt());
                        System.out.println("Digite a vida do guerreiro: ");
                        guerreiro.setVida(scanner.nextInt());
                        personagens.add(guerreiro);
                        guerreiro.attack();
                        System.out.println("Nome: " + guerreiro.getNome() + " Level: "
                                + guerreiro.getLevel() + " Forca: "
                                + guerreiro.getForca() + " Vida: "
                                + guerreiro.getMana() + " Mana: "
                                + guerreiro.getVida());
                        System.out.println(guerreiro.attack());
                        System.out.println(guerreiro.aprenderHabilidade("Sim"));
                        break;
                    } else {
                        System.out.println("Opção inválida");
                    }
                }
                scanner.close();
                break;
            case 4:
                System.out.println("Exercicio 4: ");
                List<Pessoas> pessoas = new ArrayList<>();
                pessoas.add(new Pessoas("João", 15));
                pessoas.add(new Pessoas("Leandro", 21));
                pessoas.add(new Pessoas("Paulo", 17));
                pessoas.add(new Pessoas("Jessica", 18));
                System.out.println(pessoas);
                while (pessoas.size() > 0) {
                    for (int i = 0; i < pessoas.size(); i++) {
                        if (pessoas.get(i).getIdade() > 18) {
                            System.out.println(pessoas.get(i).getNome() + " é maior de idade: " + pessoas.get(i).getIdade());
                            pessoas.remove(i);
                        }
                    }
               }
                break;
            case 5:
                System.out.println("Exercicio 5: ");
                List<Pessoas> pessoas2 = new ArrayList<>();
                pessoas2.add(new Pessoas("João", 15));
                pessoas2.add(new Pessoas("Leandro", 21));
                pessoas2.add(new Pessoas("Paulo", 17));
                pessoas2.add(new Pessoas("Jessica", 18));
                System.out.println(pessoas2);
                while (pessoas2.size() > 0) {
                    for (int i = 0; i < pessoas2.size(); i++) {
                        if (pessoas2.get(i).getIdade() >= 18) {
                            System.out.println(pessoas2.get(i).getNome() + " é maior de idade ou igual a 18: " + pessoas2.get(i).getIdade());
                            pessoas2.remove(i);
                        }
                    }
                }
                break;
            case 6:
                System.out.println("Exercicio 6: ");
                List<Pessoas3> pessoas3 = new ArrayList<>();
                pessoas3.add(new Pessoas3("João: ", 15));
                pessoas3.add(new Pessoas3("Leandro: ", 21));
                pessoas3.add(new Pessoas3("Paulo: ", 17));
                pessoas3.add(new Pessoas3("Jessica: ", 18));

                while (pessoas3.size() > 0) {
                    for (int i = 0; i < pessoas3.size(); i++) {
                        if (pessoas3.get(i).getIdade() == 18) {
                            System.out.println(pessoas3.get(i).getNome() + " Sim esta na lista!");
                            pessoas3.remove(i);
                        }
                    }
                }
                break;
            case 7:
                System.out.println("Exercicio 7: ");
                Gerente gerente = new Gerente();
                gerente.setNome("João");
                gerente.setIdade(30);
                gerente.setSalario(15000.00);
                gerente.setGratificacao(10000.00);
                System.out.println("Ganho do Gerente: ");
                System.out.println("O gerente: " + gerente.getNome()
                        + "\n"
                        + "Recebeu o Salário de: " +  gerente.getSalario() + " Reais"
                        + "\n"
                        + "Recebeu " + gerente.getGratificacao() + " de bonificação.");
                gerente.bonificacao();
                System.out.printf("Total do salario: %.2f", gerente.getSalario() + gerente.getGratificacao());

                System.out.println("\n");
                Supervisor supervisor = new Supervisor();

                supervisor.setNome("Maria");
                supervisor.setIdade(37);
                supervisor.setSalario(7500.00);
                supervisor.setBonus(5000.00);

                System.out.println("Ganho do Supervisor: ");
                System.out.println("O Supervisor: " + supervisor.getNome()
                        + "\n"
                        + "Recebeu o Salário de: " +  supervisor.getSalario() + " Reais"
                        + "\n"
                        + "Recebeu " + supervisor.getBonus()+ " de bonificação.");
                supervisor.bonificacao();
                System.out.printf("Total do salario: %.2f", supervisor.getSalario() + supervisor.getBonus());

                System.out.println("\n");
                Vendedor vendedor = new Vendedor();
                vendedor.setNome("Pedro");
                vendedor.setIdade(25);
                vendedor.setSalario(5000.00);
                vendedor.setComissao(3000.00);
                System.out.println("Ganho do Vendedor: ");
                System.out.println("O Vendedor: " + vendedor.getNome()
                        + "\n"
                        + "Recebeu o Salário de: " +  vendedor.getSalario() + " Reais"
                        + "\n"
                        + "Recebeu " + vendedor.getComissao() + " de bonificação.");
                vendedor.bonificacao();
                System.out.printf("Total do salario: %.2f", vendedor.getSalario() + vendedor.getComissao());
                break;
            case 8:
            default:
                System.out.println("Opção inválida");
                break;
            }
        }


    }












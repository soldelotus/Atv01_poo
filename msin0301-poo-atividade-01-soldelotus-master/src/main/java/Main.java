import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Zoo zoo = new Zoo();
        Scanner dado = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("(1)Cadastrar Animal");
            System.out.println("(2)Adicionar alimentos");
            System.out.println("(3)Listar os Animais");
            System.out.println("(4)Buscar Animal");
            System.out.println("(5)Sair");
            int opcao = dado.nextInt();

        switch(opcao){{
            case 1: 
                System.out.println("Digite o nome do animal: ");
                String nome = dado.next();

                System.out.println("\n Digite a espécie do animal: ");
                String especie = dado.next();

                System.out.println("\n Digite a idade do animal: ");
                int idade = dado.next();

                 Animal a1 = new Animal(nome, especie, idade);
                    zoo.addAnimal(a1);
                    break;

            case 2:
                
                 System.out.println("Digite a espécie do animal");
                String especieConsulta = dado.next(); 
                Animal animalConsulta = zoo.pesquisaAnimal(especieConsulta);
                    if(animalConsulta == null){
                        System.out.println("Especie não encontrado");
                    }else{
                    System.out.println(animalConsulta.toString());
                    }
                    break;

            case 3: 
                zoo.exibeAnimal();
                break;
            case 4:
                System.out.println("Digite a especie");
                String especieConsulta = dado.next(); 
                Animal animalConsulta = zoo.pesquisaAnimal(especieConsulta);
                    if(animalConsulta == null){
                        System.out.println("Especie não encontrado");
                    }else{
                    System.out.println(animalConsulta.toString());
                    }
                    break;
            case 5:
                System.out.println("Até a próxima");
                continuar = false;
                break;
                default:
                System.out.println("Opção invalida!");
                    break;


        }}




    }
}

//Implemente uma classe Menu com um método main que ofereça ao usuário as opções de cadastrar um novo animal, 
//listar todos os animais ou buscar animais por espécie. Utilize a classe Scanner 
//para ler a entrada do usuário e chame os métodos apropriados da classe Zoologico.
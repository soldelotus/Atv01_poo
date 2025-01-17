[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/HfDD090p)
# Lista de Exercícios
<img src="assets/images/Unicap_Icam_Tech-01.png" alt="drawing" width="200"/>

## Identificação
**Professor**: MSc. Iago Rodrigues

**Disciplina**: Programação Orientada a Objetos

**Atividade**: Atividade 01 - Conceitos de POO

**Aluno**: Sol de Lótus

## Instruções 
> 1. Sua implementação deve estar dentro da pasta src/**main**/java 
> 2. Não modifique nenhum código dentro da pasta src/**test**/java).
> 3. A submissão **não deve ser feita após o prazo** (nem 1 minuto a mais)

## Descrição da Atividade

> Você foi contratado para desenvolver um sistema para gerenciar um zoológico. O zoológico possui diversos animais, e cada animal possui características como nome, espécie, idade e uma lista de alimentos que ele consome. Além disso, o zoológico precisa ter a capacidade de cadastrar novos animais, listar todos os animais cadastrados e buscar animais por espécie.

> Siga as instruções abaixo para implementar o sistema:

> Crie uma classe Animal com os atributos nome, especie, idade e alimentos (que será um ArrayList de String).

> Implemente métodos getters e setters para cada atributo, um método adicionarAlimento(String alimento) para adicionar um novo alimento à lista de alimentos do animal e um método toString() que retorna uma representação em string do animal.

> Na classe Animal, crie um construtor que receba como parâmetros o nome, a espécie e a idade do animal. Inicialize a lista de alimentos como uma lista vazia.

> Sobrecarregue o construtor para que ele também possa receber uma lista inicial de alimentos.

> Garanta que todos os atributos da classe Animal sejam privados e só possam ser acessados e modificados através dos métodos getters e setters.

> Utilize um ArrayList para armazenar a lista de alimentos de cada animal e também para armazenar a lista de animais no zoológico.
Associação entre classes (1-N):

> Crie uma classe Zoologico que possui um ArrayList de Animal. Implemente métodos para adicionar um novo animal ao zoológico, listar todos os animais e buscar animais por espécie.


> Implemente uma classe Menu com um método main que ofereça ao usuário as opções de cadastrar um novo animal, listar todos os animais ou buscar animais por espécie. Utilize a classe Scanner para ler a entrada do usuário e chame os métodos apropriados da classe Zoologico.

## Critérios de Avaliação

> Correta implementação da abstração por classes, atributos e métodos.

> Implementação e uso adequado de construtores e sobrecarga de construtores.

> Aplicação correta do princípio de encapsulamento.

> Uso adequado de ArrayLists para gerenciar as listas de animais e alimentos.

> Implementação correta da associação 1-N entre as classes Zoologico e Animal.

> Funcionamento adequado do menu de cadastro com as opções de adicionar, listar e buscar animais.

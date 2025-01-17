package br.unicap.poo.atividade03;

import java.util.ArrayList;

public class Zoo {
      private ArrayList<Animal> listaAnimal;
    
    public Zoo(){
        this.listaAnimal = new ArrayList<>();
    }
}

// GET E SET
public ArrayList<Animal> getlistaAnimal(){
        return this.listaAnimal;
    } 

public void setAnimal(ArrayList<Animal> listaAnimal){
        this.listaAnimal = listaAnimal;
    }

// MÉTODOS

// ADD ANIMAL

public void addAnimal(Animal animal){
        listaAnimal.add(animal);
    }


// LISTAR ANIMAIS

      public void exibeAnimal(){
        for(int i = 0; i<listaAnimal.size(); i++){
            System.out.println(listaAnimal.get(i).toString());
        }
    }


// BUSCAR ANIMAIS

   public Animal pesquisaAnimal(String especie){
        for(int i = 0; i<listaAnimal.size(); i++){
            if(especie.equals(listaAnimal.get(i).getEspecie())){
                return listaAnimal.get(i);
            }
        }
        return null;
    }





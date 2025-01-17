package br.unicap.poo.atividade03;

import java.util.ArrayList;

public class Animal {
    private String nome;
    private String especie;
    private int idade
    private ArrayList<String> alimentos = new ArrayList<>();

    Animal(String nome, String especie, int idade){
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        alimentos = new ArrayList<>();
    }

    Animal(String nome, String especie, int idade){
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }


// Getters
    public String getNome(){
        return nome;
    }

    public int getEspecie(){
        return especie;
    }

    public String getIdade(){
        return idade;
    }

    public ArrayList<String> getAlimentos(){
        return alimentos;
    }


// Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setAlimentos(ArrayList<String> alimentos){
        this.alimentos = alimentos;
    }


// Métodos
    public void addAlimentos(String alimentos){
        alimentos.add(alimentos);
    }

// exibe construtor
    public String toString(){
        return "Animal: [Nome:" + nome +"Especie:" + especie + "Alimentos:" + listaAlimentos +"]";
    }
}



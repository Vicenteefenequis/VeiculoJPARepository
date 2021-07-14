package com.example.veiculo.Model;


import javax.persistence.*;
import java.io.Serializable;


@Entity(name = "automovel")
public class Automovel implements Serializable {

    @Id
    @Column(name = "id_automovel")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int anoFabricacao;


    private int anoModelo;

    private String observacoes;

    private float preco;

    private int kilometragem;


    public Automovel(int anoFabricacao, int anoModelo, String observacoes, float preco, int kilometragem, Modelo modelo) {
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.observacoes = observacoes;
        this.preco = preco;
        this.kilometragem = kilometragem;
        this.modelo = modelo;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_modelo")
    private Modelo modelo;

    public Automovel(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(int kilometragem) {
        this.kilometragem = kilometragem;
    }


}

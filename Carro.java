/*
Pequena classe para classificar carros indentificando seu modelo seu chassi e ano do carro em questão
 */

public class Carro {
    private String modelo;

    private int chassi;

    private int ano;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getChassi() {
        return chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}

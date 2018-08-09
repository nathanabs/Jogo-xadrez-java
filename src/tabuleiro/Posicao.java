/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabuleiro;

/**
 *
 * @author Nathan
 */
public class Posicao {

    private int linha;
    private int coluna;

    public Posicao(int linha, int color) {
        this.linha = linha;
        this.coluna = color;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColor() {
        return coluna;
    }

    public void setColor(int color) {
        this.coluna = color;
    }

    @Override
    public String toString() {
        return linha + ", " + coluna;
    }

}

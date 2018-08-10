/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

/**
 *
 * @author Nathan
 */
public class PartidaDeXadrez {
    Tabuleiro tabuleiro;

    public PartidaDeXadrez() {
        tabuleiro = new Tabuleiro(8, 8);
        ConfiguracaoInicial();
    }    
    
    public PecaDeXadrez[][] getPecas(){
        PecaDeXadrez[][] mat = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int i = 0; i < tabuleiro.getLinhas(); i++) {
            for (int j = 0; j < tabuleiro.getColunas(); j++) {
                mat[i][j] = (PecaDeXadrez)tabuleiro.peca(i, j);
            }
        }
        return mat;
    }
    private void ConfiguracaoInicial(){
        tabuleiro.lugarDaPeca(new Torre(Cor.PRETO, tabuleiro), new Posicao(0, 0));
        tabuleiro.lugarDaPeca(new Rei(Cor.PRETO, tabuleiro), new Posicao(0, 4));
        tabuleiro.lugarDaPeca(new Rei(Cor.BRANCO, tabuleiro), new Posicao(7, 4));
    }
}

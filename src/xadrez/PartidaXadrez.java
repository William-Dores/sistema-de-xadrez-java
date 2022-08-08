package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		configuracaoInicial();
	}
	
	public XadrezPeca[][] getPecas(){
		XadrezPeca[][] mat = new XadrezPeca[tabuleiro.getFileiras()][tabuleiro.getColunas()];
		for (int i = 0; i <tabuleiro.getFileiras() ; i++) {
			for (int j = 0; j<tabuleiro.getColunas() ; j++) {
				mat[i][j] = (XadrezPeca)tabuleiro.peca(i, j);
			}
		}
		return mat;
	}
	
	private void configuracaoInicial() {
		tabuleiro.lugarPeca(new Torre(tabuleiro, Cor.WHITE), new Posicao(2, 1));
		tabuleiro.lugarPeca(new Rei(tabuleiro, Cor.BLACK), new Posicao(7, 4));
	}
}

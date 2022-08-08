package xadrez;

import tabuleiro.Tabuleiro;

public class PartidaXadrez {
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
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
}

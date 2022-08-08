package xadrez;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class XadrezPeca extends Peca {
	private Cor cor;

	public XadrezPeca(Tabuleiro quadro, Cor cor) {
		super(quadro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}
	
	
	

}

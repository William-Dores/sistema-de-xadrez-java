package xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.XadrezPeca;

public class Torre extends XadrezPeca{

	public Torre(Tabuleiro quadro, Cor cor) {
		super(quadro, cor);
	}
	
	@Override
	public String toString() {
		return "T";
	}
	
}

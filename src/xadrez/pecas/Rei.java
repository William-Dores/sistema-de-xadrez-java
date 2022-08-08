package xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.XadrezPeca;

public class Rei extends XadrezPeca{

	public Rei(Tabuleiro quadro, Cor cor) {
		super(quadro, cor);
	}
	
	@Override
	public String toString() {
		return "R";
	}

}

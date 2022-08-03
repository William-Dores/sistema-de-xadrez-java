package tabuleiro;

public class Peca {
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	
	public Peca(Tabuleiro quadro) {
		this.tabuleiro = quadro;
		posicao = null;
	}


	protected Tabuleiro getQuadro() {
		return tabuleiro;
	}
	
	
	
	
	
	
	

}

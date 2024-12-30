package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel {

    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporadas;
    private int minutosPorEpisodio;

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporadas * minutosPorEpisodio;
    }

    @Override
    public void exibeFichaTecnica() {
        System.out.println("Nome da série: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Incluido no plano? " + getIncluidoNoPlano());
        System.out.println("Episódios por temporada: " + getEpisodiosPorTemporadas());
        System.out.println("Ainda está em lançamento? " + isAtiva());
        System.out.println("Temporadas: " + getTemporadas());
        System.out.println("Minutos por epísodios: " + getMinutosPorEpisodio());
    }


    @Override
    public int getClassificacao() {
        return getPegarMedia() / 2;
    }
}

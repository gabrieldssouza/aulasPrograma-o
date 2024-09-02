package AulaHeranca;

public class testeLampada {
    public static void main(String[] args) {
        Lampada lampadaUm = new Lampada();
        lampadaUm.marca = "avant";
        lampadaUm.modelo = "led";
        lampadaUm.cor = "roxo";
        lampadaUm.ligar();

        Lampada lampadaDois = new Lampada();
        lampadaDois.marca = "taschibra";
        lampadaDois.modelo = "fluorescente";
        lampadaDois.cor = "branco";
        lampadaDois.desligar();

        Lampada lampadaTres = new Lampada();
        lampadaTres.marca = "foxlux";
        lampadaTres.modelo = "led";
        lampadaTres.cor = "azul";
        lampadaTres.desligar();

        Lampada lampadaQuatro = new Lampada();
        lampadaQuatro.marca = "osram";
        lampadaQuatro.modelo = "fluorescente";
        lampadaQuatro.cor = "amarelo";
        lampadaQuatro.ligar();

        Lampada lampadaCinco = new Lampada();
        lampadaCinco.marca = "philips";
        lampadaCinco.modelo = "led";
        lampadaCinco.cor = "vermelho";
        lampadaCinco.ligar();
        if(lampadaQuatro.isEstaLigada()){
            System.out.println(lampadaQuatro.modelo+" está ligada");
        }
        else{
            System.out.println("desligada");
        }

    }
}

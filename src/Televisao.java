public class Televisao {
    public static void main(String[] args) {
        ControleRemoto controleRemoto = new ControleRemoto(2,10,20,"H");
        controleRemoto.diminuir();
        controleRemoto.aumentar();
        controleRemoto.setaParaCima();
        controleRemoto.setaParaBaixo();
        controleRemoto.trocaCanal();
        controleRemoto.consultar();


    }
}

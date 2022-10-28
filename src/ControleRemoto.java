public class ControleRemoto {
    /*
 aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
 aumentar e diminuir o número do canal em uma unidade
 trocar para um canal indicado;
 consultar o valor do volume de som e o canal selecionado.
     */
    //Aumentar e diminuir volume.
    private int volume;
    //Aumentar e dimiuir os canais.
    private int canal;

    public ControleRemoto(int volume, int canal, int trocarCanal, String consultar) {
        this.volume = volume;
        this.canal = canal;
        this.trocarCanal = trocarCanal;
        this.consultar = consultar;
    }

    //Trocar para um canl indicado.
    private int trocarCanal;
    //Consultar o canal.
    private String consultar;
    //Diminuir e aumentar volume usando a int aumentarVolume e baixarVolume.
    private int volumeAumen;
    private int volumeDimi;
    //Diminuir e aumentar canal usando a int aumentarVolume e baixarVolume.
    private int canalAumen;
    private int canalDimi;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getTrocarCanal() {
        return trocarCanal;
    }

    public void setTrocarCanal(int trocarCanal) {
        this.trocarCanal = trocarCanal;
    }

    public String getConsultar() {
        return consultar;
    }

    public void setConsultar(String consultar) {
        this.consultar = consultar;
    }

    public int getVolumeAumen() {
        return volume = volume + 1;
    }

    public void setVolumeAumen(int volumeAumen) {
        this.volumeAumen = volumeAumen;
    }

    public int getVolumeDimi() {
        return volume = volume - 1;
    }

    public void setVolumeDimi(int volumeDimi) {
        this.volumeDimi = volumeDimi;
    }

    public int getCanalAumen() {
        return canal = canal + 1;
    }

    public void setCanalAumen(int canalAumen) {
        this.canalAumen = canalAumen;
    }

    public int getCanalDimi() {
        return canal = canal - 1;
    }

    public void setCanalDimi(int canalDimi) {
        this.canalDimi = canalDimi;
    }



    public void aumentar(){
        if (volume<100)System.out.println("Volume " + getVolumeAumen());
        else System.out.println("Limite atingido!");
    }
    public void diminuir(){
        if (volume>0) System.out.println("Volume " + getVolumeDimi());
        if (volume==0) System.out.println("Está no mudo");
    }
    public void setaParaCima(){
        System.out.println("Canal " + getCanalAumen());
    }
    public void setaParaBaixo(){
        System.out.println("Canal "+ getCanalDimi());
    }
    public void trocaCanal(){
        System.out.println("Canal " + getTrocarCanal());
    }
    public void consultar(){
        System.out.println("Canal " + getCanal() + " Volume "+ getVolume());
    }
}
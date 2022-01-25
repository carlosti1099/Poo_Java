package televisao;

public class TesteTelevisao {
    public static void main(String[] args){
        Televisao tv = new Televisao();
        tv.reduzirVolume();
        tv.subirCanal();
        tv.ligarTv();
        tv.exibirStatus();
    }
}
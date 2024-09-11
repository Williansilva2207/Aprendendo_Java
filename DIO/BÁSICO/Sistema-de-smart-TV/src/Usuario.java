public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv.ligado);
        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);

        smartTv.ligar();
        System.out.println(smartTv.ligado);

        smartTv.aumentarCanal();
        System.out.println(smartTv.canal);
        
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println(smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);
    }
}

public class Main {
    public static void main(String[] args) {

        //El constructor no lleva parametros
        Reloj r1 = new Reloj();
        r1.visualizar();
        r1.ponerhora(30,35,12);
        r1.tic();
        r1.visualizar();


        RelojConParametroYSin r2 = new RelojConParametroYSin();//El constructor no lleva parametros
        RelojConParametroYSin r3 = new RelojConParametroYSin(11, 24,59); //Este constructo con parametros
        r2.visualizar();
        r2.tic();
        r2.visualizar();
        r3.tic();
        r3.visualizar();

    }
}
public class Reloj {
    int h;
    int m;
    int s;
    //Método constructor (Se llama igual que la clase) y este constructor no acepta parametros
    public Reloj(){
        h=0;
        m=0;
        s=0;
    }
    public void visualizar(){
        System.out.println( h  + ":" + m + ":" + s);
    }
    //Metodo para general segundo por segundo
    public void tic(){
        s++;
        if(s>=60){
            s=0;
            m++;
            if(m>=60){
                m=0;
                h++;
                if(h>=12){
                    h=0;
                }
            }
        }
    }

    public void ponerhora(int segundo, int minutos, int hora){
        s = segundo;
        m = minutos;
        h = hora;
    }


}

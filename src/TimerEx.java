import java.util.Timer;
import java.util.TimerTask;

class TimerEx {
	
    public static void iniciar() {
    System.out.println("eooo");
    Timer timer;
    timer = new Timer();

    TimerTask task = new TimerTask() { //aqui se declara la tarea que se va a realizar cada cierto tiempo
    	int i=0;
        public void run(){
        	System.out.println(i);
        	i++;
        	if (i==11){System.out.print("termino");timer.cancel();}
        }
    };
    
    timer.schedule(task,0,1000); //task es la tarea a realizar, 0 son los milisegundos que espera antes de realizar la tarea y 1000 es la cantidad de milisegundos que espera antes de volver a hacer la tarea especificada
    }
}
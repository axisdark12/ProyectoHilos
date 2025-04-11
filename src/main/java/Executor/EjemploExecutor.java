
package Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class EjemploExecutor {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        
        Runnable tarea= ()->{
        System.out.println("inicio de la tarea");
        try{
            System.out.println("nombre del thread" 
                    + Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(5);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
            System.out.println(e);
        }
    };
        //ejecutar la tarea
        executor.submit(tarea);
        //cerrar la entrada de tareas
        executor.shutdown();
        System.out.println("Metodo main se esta ejecutando 1");
        executor.awaitTermination(2, TimeUnit.SECONDS);
        System.out.println("Metodo main se sigue ejecutando 1");
        
        
    }
    
}

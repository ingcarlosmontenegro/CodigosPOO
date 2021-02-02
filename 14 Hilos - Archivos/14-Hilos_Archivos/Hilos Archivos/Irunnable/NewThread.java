package Irunnable;


// Crea un segundo hilo
class NewThread implements Runnable {
    Thread t;

    NewThread() {
	// Crea un nuevo hilo
	t = new Thread(this,"Hilo Hijo");
       	System.out.println("Hilo Hijo: " + t);
	t.start();
	t.setPriority(10);
    }
// este es el punto de entrada del segundo hijo
    public void run() {
	try {
	           for (int i=5;i>0;i--) {
	           System.out.println("Hilo hijo: " + i);
	           Thread.sleep(1000);
	           }
	} catch (InterruptedException e){
		System.out.println("Interrupcion del hilo hijo");
	}
	 System.out.println("Sale de hilo hijo.");
    }
}

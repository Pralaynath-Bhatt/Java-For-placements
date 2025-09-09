package Basic.MultiThreading;

public class RunnableImplimentation implements Runnable{
    @Override
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }


    public static void main(String[] args) {
        RunnableImplimentation m = new RunnableImplimentation();
        Thread t = new Thread(m);
        t.start();
        int i=1;
        while(true){
            System.out.println(i+" world");
            i++;
        }
    }
}

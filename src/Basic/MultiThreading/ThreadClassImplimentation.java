package Basic.MultiThreading;

class ThreadClassImplimentation extends Thread {
    @Override
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }


    public static void main(String[] args) {
        ThreadClassImplimentation m = new ThreadClassImplimentation();
        Thread t = new Thread(m);
        t.start();
        int i=1;
        while(true){
            System.out.println(i+" world");
            i++;
        }
    }
}

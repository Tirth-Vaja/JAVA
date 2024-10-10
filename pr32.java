class HelloRunnable implements Runnable {
    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        HelloRunnable helloRunnable = new HelloRunnable();
        Thread thread = new Thread(helloRunnable);
        thread.start();
    }
}

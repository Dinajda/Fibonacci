public class Main {
    public static void main(String[] args) {
        boolean useManyThreads = true;

        FibonacciLike brr = new FibonacciLike("Sequence 1: ", 5,0,1);

        FibonacciLike wee = new FibonacciLike("Sequence 2: ",5, 2, 3);

        if(useManyThreads) {
            Thread numLaunchingThread = new Thread(brr);
            Thread num2LaunchingThread = new Thread(wee);
            numLaunchingThread.start();
            num2LaunchingThread.start();

        }
        else {
            brr.run();
            wee.run();
        }
    }
}
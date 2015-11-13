public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            if (Integer.parseInt(args[0]) < 0) {
                System.err.println("error found");
            } else {
                sum sumObject = new sum();
                int upper = Integer.parseInt(args[0]);
                Thread t1 = new Thread(new summation(upper, sumObject));
                t1.start();
                try {
                    t1.join();
                    System.out.println("the sum of" + upper + ":" + sumObject.getSum());
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }else{
            System.err.println("too les args");
        }
    }
}

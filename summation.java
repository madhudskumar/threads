/**
 * Created by madhu on 10/25/2015.
 */
public class summation implements Runnable {
    private int upper;
    private sum sumValue;

    public summation (int upper,sum sumValue){
        this.upper = upper;
        this.sumValue = sumValue;
    }

    @Override
    public void run(){
        int sum = 0;
        for (int i = 0; i<= upper; i++){
            sum += i;
        }
        sumValue.setSum(sum);
    }
}

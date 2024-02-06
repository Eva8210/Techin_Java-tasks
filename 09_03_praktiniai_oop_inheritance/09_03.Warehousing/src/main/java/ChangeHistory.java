import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {

    private ArrayList<Double> history;
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }
    public void add(double status) {
        history.add(status);
    }
    public void clear() {
        this.history.clear();
    }
    public String toString(){
        return  this.history.toString();
    }
    public double maxValue() {
//        double max=0.0;
//        if (this.history.size() >0.0) {
//            for (double result: history) {
//                if(result > max) {
//                    max =result;
//                }
//            }
//        }
//        return max;
        return Collections.max(history);
    }
    public double minValue() {
//        if (!this.history.isEmpty()) {
//            double min = history.get(0);
//            for (double result: history) {
//                if(result < min) {
//                    min = result;
//                }
//            }
//            return min;
//        }
//        return 0;

        return Collections.min(history);
    }
    public double sum(){
//        double sum=0.0;
//        for(Double one:this.history){
//            sum +=one;
//        }
//        return sum;
        return history.stream().mapToDouble(Double::doubleValue).sum();
    }
    public double average() {
//        double sum = this.sum();
//        int size = this.history.size();
//        if(size>0){
//            return (double)sum/size;
//        }
//        return 0.0;
        return history.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }
}

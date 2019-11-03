package kata2;

public class Main {

    public static void main(String[] args) {
        Histogram histogram = new Histogram(1,2,4,1,3,2,1,5,4);
        HistogramDisplay display= new HistogramDisplay(histogram);
        display.execute();
    }
    
}

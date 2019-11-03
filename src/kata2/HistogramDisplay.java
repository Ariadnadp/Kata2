package kata2;

class HistogramDisplay {
    private final Histogram histogram;
    
    public HistogramDisplay(Histogram histogram) {
        this.histogram=histogram;
    }
    
    public void execute (){
        for(int values : histogram.getValues()){
            System.out.println("Valor: " + values + " se repite " + histogram.getCount(values));
        }
    }
    
}

public class CircularProblem {
    private int yourNum;


    public CircularProblem(int youNum){
        this.yourNum = youNum;
    }
    public int onlyOdds(int theLastDandelion){
        int num = 0;
        while(Math.pow(2, num) < yourNum){
            num++;
        }
        theLastDandelion = (int)Math.pow(2, num-1);
        return theLastDandelion;
    }
}

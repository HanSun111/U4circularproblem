public class CircularProblem {
    private int yourNum;


    public CircularProblem(int youNum){
        this.yourNum = youNum;
    }
    public int onlyOdds(){
        int num = 0;
        int x;
        while(Math.pow(2, num) < yourNum){
            x = (int)Math.pow(2, num);
            num++;
        }

        return (yourNum-x) * 2 + 1;
    }
}


/************
 
 * *
 * * Description: This program show you chessboard.
 */
public class Chesss {
    public static void main(String[] args) {
    StdDraw.setXscale(-9,9);
    StdDraw.setYscale(-9,9);
        for(int j=5; j>-3; j--) {
            int i=-4;
            if(j%2==0)
                i++;
            for( ; i<4; i+=2)
                StdDraw.filledSquare(i, j, 0.5);
        }

        StdDraw.setPenColor(StdDraw.RED);
        for(int j=5; j>-3; j--) {
            int i=-4;
            if((j%2==1) || (j%2==-1))
                i++;
            for( ; i<4; i+=2)
                StdDraw.filledSquare(i, j, 0.5);

        }

    }

}

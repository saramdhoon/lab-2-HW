import java.util.Arrays;
public class Revers {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6};
        int [] b=a;
        System.out.println("x ="+Arrays.toString(a));
        System.out.println( "y ="+Arrays.toString(revers(b)));
    }

    public static int[] revers(int[] r)
    {
        int s = r.length-1;
        for (int i = 0; i <r.length/2 ; i++) {
            int t = r[i];
            r[i] = r[s-i];
            r[s-i] = t;
        }
        return r;
    }


}



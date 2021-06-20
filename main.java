import java.util.ArrayList;
import java.lang.Math;

public class main{

    public static void main(String[] x){

    mlr nuevomlr = new mlr();
    nuevomlr.getData();
    nuevomlr.getBetas();
    nuevomlr.calculate(Double.valueOf(x[0]), Double.valueOf(x[1]));

  }
}

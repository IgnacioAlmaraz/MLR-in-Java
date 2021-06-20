import java.util.ArrayList;
import java.lang.Math;

public class mlr extends cramer{

  public mlr(){
  }

  public void calculate(double x1, double x2){
    double result = B0()+B1()*x1+B2()*x2;

    System.out.println("\n\n  MLR Result \n");
    System.out.println("| y = \u03D00 + \u03D01x1 + \u03D02x2  ");
    System.out.println("| y = "+B0()+" + "+B1()*x1+" + "+B2()*x2);
    System.out.println("| y = "+result+"\n\n");
  }


}

import java.util.ArrayList;
import java.lang.Math;

public class cramer extends data{
  public cramer(){

  }

  //determinate del sistema
  public double DS(){
      return ((ds_Xi1.size()*sumX2i1()*sumX2i2())+(sumXi1()*sumXi1Xi2()*sumXi2())+(sumXi2()*sumXi1()*sumXi1Xi2()))-((sumXi2()*sumX2i1()*sumXi2())+(sumXi1Xi2()*sumXi1Xi2()*ds_Xi1.size())+(sumX2i2()*sumXi1()*sumXi1()));
  }

  public double B0(){
      double result=0;
      double numerator=0;
      double denominator=0;
      numerator=((sumYi()*sumX2i1()*sumX2i2())+(sumXi1()*sumXi1Xi2()*sumXi2Yi())+(sumXi2()*sumXi1Yi()*sumXi1Xi2()))-((sumXi2Yi()*sumX2i1()*sumXi2())+(sumXi1Xi2()*sumXi1Xi2()*sumYi())+(sumX2i2()*sumXi1Yi()*sumXi1()));
      denominator=DS();
      result=numerator/denominator;
      return result;
  }

  public double B1(){
      double result=0;
      double numerator=0;
      double denominator=0;
      numerator=((ds_Xi1.size()*sumXi1Yi()*sumX2i2())+(sumYi()*sumXi1Xi2()*sumXi2())+(sumXi2()*sumXi1()*sumXi2Yi()))-((sumXi2()*sumXi1Yi()*sumXi2())+(sumXi2Yi()*sumXi1Xi2()*ds_Xi1.size())+(sumX2i2()*sumXi1()*sumYi()));
      denominator=DS();
      result=numerator/denominator;
      return result;
  }
  public double B2(){
      double result=0;
      double numerator=0;
      double denominator=0;
      numerator=((ds_Xi1.size()*sumX2i1()*sumXi2Yi())+(sumXi1()*sumXi1Yi()*sumXi2())+(sumYi()*sumXi1()*sumXi1Xi2()))-((sumXi2()*sumX2i1()*sumYi())+(sumXi1Xi2()*sumXi1Yi()*ds_Xi1.size())+(sumXi2Yi()*sumXi1()*sumXi1()));
      denominator=DS();
      result=numerator/denominator;
      return result;
  }

  public void getBetas(){
      System.out.println("\n\n  Calculated Betas\n");
      System.out.println("|  \u03D00  = "+B0());
      System.out.println("|  \u03D01  = "+B1());
      System.out.println("|  \u03D02  = "+B2());
  }



}

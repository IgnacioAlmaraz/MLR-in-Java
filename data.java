import java.util.ArrayList;
import java.lang.Math;

public class data{
  ArrayList<Double> ds_Xi1=new ArrayList<Double>();
  ArrayList<Double> ds_Xi2=new ArrayList<Double>();
  ArrayList<Double> ds_Yi=new ArrayList<Double>();

  public data(){
      addData();
  }

  //Carga los datos
  public void addData (){

        ds_Xi1.add(41.9);
        ds_Xi1.add(43.4);
        ds_Xi1.add(43.9);
        ds_Xi1.add(44.5);
        ds_Xi1.add(47.3);
        ds_Xi1.add(47.5);
        ds_Xi1.add(47.9);
        ds_Xi1.add(50.2);
        ds_Xi1.add(52.8);
        ds_Xi1.add(53.2);
        ds_Xi1.add(56.7);
        ds_Xi1.add(57.0);
        ds_Xi1.add(63.5);
        ds_Xi1.add(65.3);
        ds_Xi1.add(71.1);
        ds_Xi1.add(77.0);
        ds_Xi1.add(77.8);

        ds_Xi2.add(29.1);
        ds_Xi2.add(29.3);
        ds_Xi2.add(29.5);
        ds_Xi2.add(29.7);
        ds_Xi2.add(29.9);
        ds_Xi2.add(30.3);
        ds_Xi2.add(30.5);
        ds_Xi2.add(30.7);
        ds_Xi2.add(30.8);
        ds_Xi2.add(30.9);
        ds_Xi2.add(31.5);
        ds_Xi2.add(31.7);
        ds_Xi2.add(31.9);
        ds_Xi2.add(32.0);
        ds_Xi2.add(32.1);
        ds_Xi2.add(32.5);
        ds_Xi2.add(32.9);

        ds_Yi.add(251.3);
        ds_Yi.add(251.3);
        ds_Yi.add(248.3);
        ds_Yi.add(267.5);
        ds_Yi.add(273.0);
        ds_Yi.add(276.5);
        ds_Yi.add(270.3);
        ds_Yi.add(274.9);
        ds_Yi.add(285.0);
        ds_Yi.add(290.0);
        ds_Yi.add(297.0);
        ds_Yi.add(302.5);
        ds_Yi.add(304.5);
        ds_Yi.add(309.3);
        ds_Yi.add(321.7);
        ds_Yi.add(330.7);
        ds_Yi.add(349.0);
  }

  public double sumX2i1(){
        double val=0;
        for(int it=0;it<ds_Xi1.size();it++){      val +=Math.pow(ds_Xi1.get(it),2);}
      return val;
  }

  public double sumX2i2(){
      double val=0;
      for(int it=0;it<ds_Xi2.size();it++){
          val +=Math.pow(ds_Xi2.get(it),2);
      }
      return val;
  }
  public double sumXi1Xi2(){
     double val=0;
      for(int it=0;it<ds_Xi1.size();it++){
          val+=ds_Xi1.get(it)*ds_Xi2.get(it);
      }
      return val;
  }

  public double sumXi2Yi(){
      double val=0;
      for(int it=0;it<ds_Xi2.size();it++){
          val+=ds_Xi2.get(it)*ds_Yi.get(it);
      }
      return val;
  }

  public double sumXi1Yi(){
      double val=0;
      for(int it=0;it<ds_Xi1.size();it++){
          val+=ds_Xi1.get(it)*ds_Yi.get(it);
      }
      return val;
  }

  public double sumXi1(){
      double val=0;
      for(int it=0;it<ds_Xi1.size();it++){
          val+=ds_Xi1.get(it);
      }
      return val;
  }

  public double sumXi2(){
      double val=0;
      for(int it=0;it<ds_Xi2.size();it++){
          val+=ds_Xi2.get(it);
      }
      return val;
  }
  public double sumYi(){
      double val=0;
      for(int it=0;it<ds_Yi.size();it++){
          val+=ds_Yi.get(it);
      }
      return val;
  }

////////////////////////////////////////////////////////////////////////////////////////////////////
public void getData(){
  System.out.println("\n  Data Summation \n");
  System.out.println("| \u03A3x1i     = "+sumXi1());
  System.out.println("| \u03A3x2i     = "+sumXi2());
  System.out.println("| \u03A3yi      = "+sumYi());
  System.out.println("| \u03A3x1i²    = "+sumX2i1());
  System.out.println("| \u03A3x2i²    = "+sumX2i2());
  System.out.println("| \u03A3x1ix2i  = "+sumXi1Xi2());
  System.out.println("| \u03A3x1iyi   = "+sumXi1Yi());
  System.out.println("| \u03A3x2iyi   = "+sumXi2Yi());

}
}

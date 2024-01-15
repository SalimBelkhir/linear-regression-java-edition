package com.test;
import java.util.ArrayList;
public class regression {
    private float slope ;
    private float intercept ;
    private float correlation ;




    public regression(ArrayList<Point> vector){
        int n = vector.size();
        if(n<2){
            System.out.println("number of points aren't suffisant");
            return;
        }
        float sumX=0 , sumY=0 , sumXY=0 ,sumX2=0 , sumY2=0;
        for( Point p :vector){
            sumX += p.getX();
            sumY += p.getY();
            sumXY += p.getX()*p.getY();
            sumX2 +=p.getX()*p.getX() ;
            sumY2 +=p.getY()*p.getY();
        }
        float moyX =sumX/n ;
        float moyY =sumY/n ;
        float d =(sumX2-n*moyX*moyX);
        if(d!=0){
            slope=(sumXY-n*moyX*moyY)/d ;
        }
        intercept=moyY-slope*moyX ;
        correlation =(n*sumXY-sumX*sumY)/(float)Math.sqrt((n*sumX2-sumX*sumX)*(n*sumY2-sumY*sumY)) ;
        if(1-correlation<0.25){
            System.out.println("your regression is cool bruh");
        }else{
            System.out.println("your regression is bad bruh");
        }
    }
    public void showslope(){
        System.out.println("slope ="+ slope);
    }
    public void showintercept(){
        System.out.println("intercept ="+intercept);
    }
    public void showcorrelation(){
        System.out.println("correlation="+correlation);
    }
    public float predict_y(float x){
        return slope*x + intercept;
    }

}

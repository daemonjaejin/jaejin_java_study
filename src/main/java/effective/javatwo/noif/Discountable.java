package effective.javatwo.noif;

/**
 * Created by Administrator on 2017-10-18.
 */
public interface Discountable {

    Discountable NONE = new Discountable() {
        public double getDiscountAmt(double originAmt){
            return 0;
        }
    };

}

class NaverDiscountPolicy implements Discountable{
    public double getDiscountAmt(double originAmt){
        return originAmt * 0.1;
    }
}

class DanawaDiscountPolicy implements Discountable{
    public double getDiscountAmt(double originAmt){
        return originAmt * 0.15;
    }
}

class FancafeDiscountPolicy implements Discountable{

    private double discountAmt = 1000D;

    public double getDiscountAmt(double originAmt){
        if(originAmt < discountAmt){
            return originAmt;
        }
        return discountAmt;
    }
}
package effective.javatwo.noif;

/**
 * Created by Administrator on 2017-10-18.
 */
public class PaymentService {

    private Discountable getDiscounter(String discountCode){
        if("NAVER".equals(discountCode)){
            return new NaverDiscountPolicy();
        }else if("DANAWA".equals(discountCode)){
            return new DanawaDiscountPolicy();
        }else if("FANCAFE".equals(discountCode)){
            return new FancafeDiscountPolicy();
        }else{
            return Discountable.NONE;
        }
    }

}

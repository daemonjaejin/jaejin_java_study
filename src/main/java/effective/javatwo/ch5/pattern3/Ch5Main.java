package effective.javatwo.ch5.pattern3;

/**
 * Created by jin on 17. 4. 17.
 */
public class Ch5Main {

    public static void main(String [] args){
        //객체 표현형 대신 기본 자료형을 사용하고, 생각지도 못한 자동 객체화가 발생하지 않도록 유의하라는 것이다.
//        Long sum = 0L;
        long sum = 0L;
        for (long i=0; i<Integer.MAX_VALUE; i++){
            sum += i;
        }
        System.out.println(sum);
    }

}

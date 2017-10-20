package effective.javatwo.noif;

/**
 * Created by Administrator on 2017-10-17.
 */
public class test1 implements Number{

    public static void main(String [] args){
        test1 t = new test1();

    }

    public int checkNumber1(int inputNumber){
        if(inputNumber == 1){

        }else if(inputNumber == 2){

        }else if(inputNumber == 3){

        }else if(inputNumber == 4){

        }
        return inputNumber;
    }

    public int checkNumber2(int inputNumber){
        if(inputNumber == 1){

        }
        if(inputNumber == 2){

        }
        if(inputNumber == 3){

        }
        if(inputNumber == 4){

        }
        return inputNumber;
    }

    public int checkNumber3(int inputNumber){
        if(inputNumber == 1){
            return inputNumber;
        }
        if(inputNumber == 2){
            return inputNumber;
        }
        if(inputNumber == 3){
            return inputNumber;
        }
        if(inputNumber == 4){
            return inputNumber;
        }
        return inputNumber;
    }

    public int checkNumber(Number number){
        return number.check();
    }

    @Override
    public int check(){
        return 0;
    }

}

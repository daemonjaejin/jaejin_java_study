package effective.javatwo.ch3.pattern2;

/**
 * Created by jin on 17. 4. 17.
 */
public class Elvis {

    private static final Elvis INSTANCE = new Elvis();
    private Elvis(){

    }
    public static Elvis getInstance () {
        return INSTANCE;
    }

    public void leaveTheBuilding(){

    }

}

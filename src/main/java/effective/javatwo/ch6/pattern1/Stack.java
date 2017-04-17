package effective.javatwo.ch6.pattern1;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by jin on 17. 4. 17.
 */
public class Stack {

    private Object [] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e){
        elements[size++] = e;
    }

    public Object pop(){
        if(size == 0){
            throw new EmptyStackException();
        }
        Object results = elements[--size];
        elements[size] = null;
        return results;
    }

    /**
     * 적어도 하나 이상의 원소를 담을 공간을 보장한다.
     * 배열의 길이를 늘려야 할 때마다 대략 두 배씩 늘인다.
     * */
    private void ensureCapacity(){
        if(elements.length == size){
            elements = Arrays.copyOf(elements, 2 * size +1);
        }
    }


}

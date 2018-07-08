package effective.javatwo.ch7;

public class pattern1 {

    public static void main(String [] args){
        Foo foo = new Foo();
        try {
            for (int i=0; i< 10; i++){
                foo.setName("name");
                foo.setId("id");
            }
        }finally {
            foo.terminate(); // 명시적 종료 메서드 호출
        }
    }

}

class Foo{
    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void terminate(){
        System.out.println("명시적 종료");
    }

    private final Object finalizerGuardian = new Object(){
      @Override
      protected void finalize() throws Throwable{

      }
    };

}

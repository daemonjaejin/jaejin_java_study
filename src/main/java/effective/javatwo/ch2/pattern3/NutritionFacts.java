package effective.javatwo.ch2.pattern3;

/**
 * Created by jin on 17. 4. 14.
 */
public class NutritionFacts {

    private final int servingSize; // 필수
    private final int servings; // 필수
    private final int calories; // 선택
    private final int fat; // 선택
    private final int sodium; // 선택
    private final int carbohydrate; // 선택

    public static class Builder{
        //필수 인자
        private final int servingSize;
        private final int servings;
        //선택적 인자 - 기본값으로 초기화
        private int calories = 0;
        private int fat = 0;
        private int carbohydrate = 0;
        private int sodium = 0;

        public Builder(int servingSize, int servings){
            System.out.println("test1");
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val){
            System.out.println("test2");
            calories = val;
            return this;
        }

        public Builder fat(int val){
            fat = val;
            return this;
        }

        public Builder carbohydrate(int val){
            System.out.println("test4");
            carbohydrate = val;
            return this;
        }

        public Builder sodium(int val){
            System.out.println("test3");
            sodium = val;
            return this;
        }

        public NutritionFacts build(){
            System.out.println("test5");
            return new NutritionFacts(this);
        }

    }

    private NutritionFacts(Builder builder){
        System.out.println("test6");
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    public static void main(String [] args){
        NutritionFacts cocaCola = new Builder(240, 8).
                calories(100).sodium(35).carbohydrate(27).build();
        System.out.println(cocaCola.toString());

    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}

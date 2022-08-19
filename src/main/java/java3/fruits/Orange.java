package java3.fruits;

public class Orange extends Fruit {
    protected Orange(int weigth) {
        super(weigth);
    }

    @Override
    public String toString() {
        return "orange{" +
                "weigth=" + weigth +
                '}';
    }
}


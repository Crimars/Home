package homework2;

public class Cat {
    private String name;
    private int apettite;

    public Cat(String name, int apettite) {
        this.name = name;
        this.apettite = apettite;
    }

    public void eat(Plate p) {
        p.decreaseFood(apettite);
    }

    public Object getAppetite() {

        return null;
    }

}


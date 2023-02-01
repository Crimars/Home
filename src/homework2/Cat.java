package homework2;

public class Cat {
    private String name;
    private int apettite;
    private boolean satiety;


    public Cat(String name, int apettite) {
        this.name = name;
        this.apettite = apettite;
        this.satiety = true;
    }

    public void eat(Plate p) {
        if p.decreaseFood(apettite);
    }
    public boolean hungry() {
        if (!satiety) {
            System.out.println("cыт");
        } else {
            System.out.println("голоден");
        }
        return false;
    }


    public Object getAppetite() {

        return null;
    }

}


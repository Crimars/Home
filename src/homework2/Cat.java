package homework2;

public class Cat {
    private String name;
    private int apettite;
    private boolean isSatiety;


    public Cat(String name, int apettite) {
        this.name = name;
        this.apettite = apettite;
        this.isSatiety = false;//сытость все таки тогда лучше фалсе, сыта?-нет, но ябы заводил поле hungry и его делал тру, голодна-да, но это дело вкуса
    }

    public void eat(Plate p) {
        if (!isSatiety && p.decreaseFood(apettite)) {
            System.out.println("Кошка " + this.name + " наелась");
            isSatiety = true;
        } else {
            System.out.println("кошка " + this.name + " голодная");
        }
    }

    //вот это я бы не юзал вообще
    public boolean hungry() {
        if (isSatiety) {
            System.out.println("cыт");
        } else {
            System.out.println("голоден");
        }

        return !isSatiety;
    }


    public Object getAppetite() {

        return null;
    }

}


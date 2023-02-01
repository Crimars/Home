package homework2;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood () {
        return food;
    }

    public void setFood ( int food){
        this.food = food;
    }


    public boolean decreaseFood(int n) {
        //food -= n;
        if (food == n) {
            System.out.println("еда полностью съедена");}
        else if (n <= 0){
            System.out.println("еда съедена");
        } else {
            System.out.println("в миске нет еды");
        }


        return true;
    }
}

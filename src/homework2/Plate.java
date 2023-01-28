package homework2;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }


    public void decreaseFood(int n) {
        food -= n;
        if (food <= n) {
            System.out.println("кот съел" + n + " еды");

        } else {
            System.out.println("в миске нет еды");
        }

        public void info () {
            System.out.println("plate: " + food);
        }

        public int getFood () {
            return food;
        }

        public void setFood ( int food){
            this.food = food;
        }

    }
}

import java.util.Random;

public class game {

    public static int getRandomNum(int num){
        Random random = new Random();
        int randNo;

        randNo = random.nextInt(1, num + 1);
        return randNo;
    }

    public static void sleep(){
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {

        game g = new game();

        System.out.println("hello");
        g.sleep();
        System.out.println("world");
        
    }
}

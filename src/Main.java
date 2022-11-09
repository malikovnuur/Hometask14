public class Main {
    public static void main(String[] args) {
Programmer programmer=new Programmer("Jackson","Linux","SecurityTime");
        System.out.println(programmer);
        programmer.coding();
        programmer.learn();
        programmer.walk();
        programmer.eat();
        System.out.println(" ");

        Dancer dancer=new Dancer("Andrew","classic","Mads in Top");
        System.out.println(dancer);
        dancer.dancing();
        dancer.learn();
        dancer.walk();
        dancer.eat();
        System.out.println("  ");
        Singer singer=new Singer("Tom Hard","pop","RockenRolls");
        System.out.println(singer);
        singer.singing();
        singer.playGuitar();
        singer.learn();
        singer.walk();
        singer.eat();
    }
}
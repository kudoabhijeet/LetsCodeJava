// Exp-04 part 1 :Inheritance
import java.io.*;

//Super Class
class Player {
    String country = new String("India");
}
//Sub Class 1
class CricketPlayer extends Player {
    String sport = new String("Cricket");
}
//Sub Class 1
class FootballPlayer extends Player {
    String sport = new String("Football");
}
//Sub Class 1
class HockeyPlayer extends Player {
    String sport = new String("Hockey");
}

public class Exp4_2 extends Fruit {
	public static void main (String[] args) {
        CricketPlayer obj = new CricketPlayer();
        FootballPlayer obj2 = new FootballPlayer();
        HockeyPlayer obj3 = new HockeyPlayer();

        System.out.println(obj.sport);
        System.out.println(obj.country);
        System.out.println(obj2.sport);
        System.out.println(obj2.country);
        System.out.println(obj3.sport);
        System.out.println(obj3.country);

	}//main
}//test
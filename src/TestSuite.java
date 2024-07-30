import com.learning.designpatterns.singleton.EagerSingleton;
import com.learning.designpatterns.singleton.LazyHolderSingleton;
import com.learning.designpatterns.singleton.LazySingleton;
import com.learning.designpatterns.strategy.*;
import com.learning.designpatterns.strategy.Character;

public class TestSuite {
    // Singleton testing
    public static void main(String[] args) {
        LazySingleton lazy = LazySingleton.getInstance();
        System.out.println(lazy);

        EagerSingleton eager = EagerSingleton.getInstance();
        System.out.println(eager);

        LazyHolderSingleton lazyholder = LazyHolderSingleton.getInstance();
        System.out.println(lazyholder);

        // strategy testing
        MovementBehavior walk = new WalkBehavior();
        MovementBehavior walkfast = new WalkFastBehavior();
        MovementBehavior walkslow = new WalkSlowBehavior();

        Character character = new Character();
        character.setBehavior(walkfast);

        character.walk();

    }
}

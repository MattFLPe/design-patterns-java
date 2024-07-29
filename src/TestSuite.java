import com.learning.designpatterns.singleton.EagerSingleton;
import com.learning.designpatterns.singleton.LazyHolderSingleton;
import com.learning.designpatterns.singleton.LazySingleton;

public class TestSuite {
    public static void main(String[] args) {
        LazySingleton lazy = LazySingleton.getInstance();
        System.out.println(lazy);

        EagerSingleton eager = EagerSingleton.getInstance();
        System.out.println(eager);

        LazyHolderSingleton lazyholder = LazyHolderSingleton.getInstance();
        System.out.println(lazyholder);
    }
}

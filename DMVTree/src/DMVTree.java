import java.util.*;

public class DMVTree {
    public static void main(String[] args) {
        Queue<String> info1 = new LinkedList<>(Arrays.asList("in", "notlate", "motorcycle"));
        User user1 = new User(info1);

        Queue<String> info2 = new LinkedList<>(Arrays.asList("out", "late1", "car"));
        User user2 = new User(info2);

        FeeTree tree = new FeeTree();
        
        tree.traverse(tree.baseFee, user1);
        user1.displayReceipt();
        tree.traverse(tree.baseFee, user2);
        user2.displayReceipt();
    }
}
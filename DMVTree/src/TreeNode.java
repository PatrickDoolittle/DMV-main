import java.util.ArrayList;
import java.util.List;

public class TreeNode implements Nodes {
    private double value;
        private String name;
        private List<Nodes> children;
        
        public TreeNode(double value, String name) {
            this.value = value;
            this.name = name;
            children = new ArrayList<>();
        }
        public void addChild(Nodes child) {
            children.add(child);
        }
        public double getValue() {
            return value;
        }
        public String getName()
        {
            return name;
        }
        public List<Nodes> getChildren() {
            return children;
        }

        @Override
        public double addFee(double sum) {
            return sum + value;
        }
}

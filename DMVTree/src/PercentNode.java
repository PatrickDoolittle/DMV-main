

import java.util.List;

public class PercentNode implements Nodes  {
    private float percentage;
    private String name;
    private List<Nodes> children;
    public void addChild(Nodes child) {
        children.add(child);
    }
    public float getValue() {
        return this.percentage;
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
        return sum + (sum * percentage);
    }
}

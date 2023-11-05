

import java.util.List;
import java.util.ArrayList;

public class PercentNode implements Nodes  {
    private float percentage;
    private String name;
    private List<Nodes> children;
    
    public PercentNode(float percentage, String name) {
        this.percentage = percentage;
        this.name = name;
        children = new ArrayList<>();
    }   
    
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

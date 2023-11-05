import java.util.ArrayList;
import java.util.List;

import dmvtree.Nodes;

import java.util.*;
import java.text.*;

public class PercentNode implements Nodes  {
    private float percentage;
    private String name;
    private List<Nodes> children;
    public void addChild(Nodes child) {
        children.add(child);
    }
    public float getValue() {
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

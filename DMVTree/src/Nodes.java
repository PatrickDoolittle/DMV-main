import java.util.List;


public interface Nodes{ 
    public double addFee(double sum);
    public String getName();
    public List<Nodes> getChildren();
}


public class FeeTree {
    TreeNode baseFee;

    TreeNode inState;
    TreeNode outState;
    TreeNode firstReg;

    PercentNode notLate;
    PercentNode late1;
    PercentNode late2;
    

    TreeNode car;
    TreeNode commercial;
    TreeNode motorcycle;
    

    
    public FeeTree() {

        TreeNode baseFee = new TreeNode(33.00, "base");

        TreeNode inState = new TreeNode(0.00, "in");
        TreeNode outState = new TreeNode(10.00, "out");
        TreeNode firstReg = new TreeNode(15.00, "first");

        PercentNode notLate = new PercentNode(0.00f, "notlate");
        PercentNode late1percent = new PercentNode(0.10f, "late1p");
        PercentNode late2percent = new PercentNode(0.20f, "late2p");

        TreeNode late1flat = new TreeNode(10.00, "late1f");
        TreeNode late2flat = new TreeNode(20.00, "late2f");

        TreeNode car = new TreeNode(20.00, "car");
        TreeNode commercial = new TreeNode(50.00, "commercial");
        TreeNode motorcycle = new TreeNode(10.00, "motorcycle");

        baseFee.addChild(inState);
        baseFee.addChild(outState);
        baseFee.addChild(firstReg);

        inState.addChild(notLate);
        inState.addChild(late1);
        inState.addChild(late2);

        outState.addChild(notLate);
        outState.addChild(late1);
        outState.addChild(late2);

        firstReg.addChild(notLate);
        firstReg.addChild(late1);
        firstReg.addChild(late2);

        notLate.addChild(car);
        notLate.addChild(commercial);
        notLate.addChild(motorcycle);

        late1percent.addChild(late1flat);
        late2percent.addChild(late2flat);

        late1flat.addChild(car);
        late1flat.addChild(commercial);
        late1flat.addChild(motorcycle);

        late2flat.addChild(car);
        late2flat.addChild(commercial);
        late2flat.addChild(motorcycle);

        this.baseFee = baseFee;
    }
     
    public void traverse(Nodes node, User user) {
        if (node == null) return;
        user.addFee(node);
        
        String nextStep = user.getInfo().poll();
        Nodes nextNode = null;
        for (Nodes child : this.baseFee.getChildren()) {
            if (child.getName().equals(nextStep)) {
                nextNode = child;
                break;
            }
        }
        
        traverse(nextNode, user);
    }
    
    
}
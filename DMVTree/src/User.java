

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class User {
        private Queue<String> info;
        private List<Nodes> receipt;
        private double sum;
        private NumberFormat currency;
        
        public User(Queue<String> info) {
            this.sum = 0;
            this.info = info;
            this.receipt  = new ArrayList<>();
        }
        
        public void addFee(Nodes transaction) {
            this.sum = transaction.addFee(this.sum);
            receipt.add(transaction);
        }
        
        public Queue<String> getInfo(){
        return info;
        }
        
        public void displayReceipt() {
            currency = NumberFormat.getCurrencyInstance();
            for (Nodes f : receipt) {
                if (f instanceof TreeNode) {
                    TreeNode thisNode = (TreeNode) f;
                    System.out.println(thisNode.getName() + ": " + currency.format(thisNode.getValue()));
                }
                //else {
                //    PercentNode thisNode = (PercentNode) f;
                //    System.out.println(thisNode.getName() + ": " + (int)(thisNode.getValue() * 100) + "%");
                //}
            }
            System.out.println("Total: " + currency.format(this.sum) + "\n");
        }
    }

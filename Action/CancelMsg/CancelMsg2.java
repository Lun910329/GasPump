package Action.CancelMsg;

public class CancelMsg2 extends CancelMsg {
    @Override
    public void cancelMsg() {
        System.out.println("Transaction canceled.");
        System.out.println("Select 1 to restart.");
    }
}

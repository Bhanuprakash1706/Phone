public class SmartPhone implements Telephone{
    @Override
    public void power() {
        System.out.println("Phone is ON");
    }

    @Override
    public void dail(String PhoneNo) {
        System.out.println("Dialing "+PhoneNo);
    }

    @Override
    public void call() {
        System.out.println("Calling...");
    }

    @Override
    public void isCalling() {
        System.out.println("Ringing...");
    }

    @Override
    public void cancel() {
        System.out.println("Call Cancelled...");
    }
}

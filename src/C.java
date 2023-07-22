public class C extends  Bank{
    private String bal ;

    public C(String bal) {
        this.bal = bal;
    }

    @Override
    public void getBalance() {
        System.out.println("300 $$");

    }

    public String getBal() {
        return bal;
    }

    public void setBal(String bal) {
        this.bal = bal;
    }

    @Override
    public String toString() {
        return "C{" +
                "bal='" + bal + '\'' +
                '}';
    }
}

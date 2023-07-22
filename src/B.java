public class B extends  Bank{
    private  String bal ;

    public B(String bal) {
        this.bal = bal;
    }

    @Override
    public void getBalance() {
        System.out.println("200 $$");

    }

    public String getBal() {
        return bal;
    }

    public void setBal(String bal) {
        this.bal = bal;
    }

    @Override
    public String toString() {
        return "B{" +
                "bal='" + bal + '\'' +
                '}';
    }
}

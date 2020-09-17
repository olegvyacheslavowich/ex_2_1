package git_ex_2_1;

public class Home implements Building{

    private String street;

    public Home(String street) {
        this.street = street;
    }

    @Override
    public void build() {
        System.out.println("Home builded");
    }
}

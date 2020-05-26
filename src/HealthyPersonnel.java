public abstract class HealthyPersonnel {


    private int id;
    private String name;
    private int count = 0;

    public void getId() {
        System.out.println(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String input) {
        count++;
        name = input;
    }
}

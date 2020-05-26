public class Doctor extends HealthyPersonnel {


    @Override
    public String getName() {
        return "Dr." + super.getName();
    }
}

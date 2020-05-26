import java.util.*;

public class HealthyPersonnelAPP {
    //forkortes psvm
    public static void main(String[] args) {

        HealthyPersonnel johnny = new Doctor();
        HealthyPersonnel doc = new Doctor();
        HealthyPersonnel rachel = new Nurse();

        johnny.setName("Æsel");
        doc.setName("Abe");
        rachel.setName("Ko");

        List<HealthyPersonnel> healthyPersonnel = new ArrayList<>();
        healthyPersonnel.addAll(Arrays.asList(johnny, doc, rachel));
        //forkortes fori
        for (int i = 0; i < healthyPersonnel.size(); i++) {

            if (healthyPersonnel.get(i).getName().contains("Nurse")) {
                System.out.println(healthyPersonnel.get(i).getName());
            }
        }
        /*
        for (HealthyPersonnel hp : healthyPersonnel
        ) {
            System.out.println(hp.getName());
        }
         */
    }
}

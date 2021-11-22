public class Main {
    public static void main(String[] args) {
        Departement dept= new Departement("GBS",new Dezvoltare());
        Departement dept2=new Departement("Design",new Logistica());

        PersonalIT ionel= new PersonalIT("Ionel Poepscu","Timisoara",2500,"Frontend");
        PersonalHR marcel= new PersonalHR("Marcel Poepscu","Timisoara",2500,25);
        Manageri ana= new Manageri("Ana Poepscu","Timisoara",2500,30);

        dept.add(ionel);
        dept.add(marcel);
        dept.add(ana);
        dept2.add(dept);
        dept2.print();

    }
}

public class PersonalIT extends Angajat {
 private String post;

    public PersonalIT(String nume, String adresa, int salariu) {
        super(nume, adresa, salariu);
    }
    public PersonalIT(String nume, String adresa, int salariu,String post) {
        super(nume, adresa, salariu);
        this.post=post;
    }

    public void print(){
        String mesaj = adresa+" "+nume+" "+salariu+ " "+ post;
    }

    @Override
    public void accept(Visitor visitor) {

    }
}

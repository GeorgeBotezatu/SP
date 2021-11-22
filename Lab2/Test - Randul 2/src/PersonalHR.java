public class PersonalHR extends Angajat{
    private int nrOreLucrate;
    public PersonalHR(String nume, String adresa, int salariu) {
        super(nume, adresa, salariu);
    }
    public PersonalHR(String nume, String adresa, int salariu,int nrOreLucrate) {
        super(nume, adresa, salariu);
        this.nrOreLucrate=nrOreLucrate;
    }

   public void print(){
        String mesaj = adresa+" "+nume+" "+salariu+ " "+ nrOreLucrate;
    }

    @Override
    public void accept(Visitor visitor) {

    }
}

public class Manageri extends Angajat{
    private int nrSubalterni;

    public Manageri(String nume, String adresa, int salariu) {
        super(nume, adresa, salariu);
    }

    public Manageri(String nume, String adresa, int salariu ,int nrSubalterni) {
        super(nume, adresa, salariu);
        this.nrSubalterni=nrSubalterni;
    }

    public void print(){
        String mesaj = adresa+" "+nume+" "+salariu+ " "+ nrSubalterni;
    }

    @Override
    public void accept(Visitor visitor) {

    }
}

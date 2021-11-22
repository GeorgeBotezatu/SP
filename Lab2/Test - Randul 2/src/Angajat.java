public abstract class Angajat extends Visitee implements Element  {
 protected String nume;
 protected String adresa;
 protected int salariu;

    public Angajat(String nume,String adresa, int salariu)
    {
     this.nume=nume;
     this.adresa=adresa;
     this.salariu=salariu;
    }

}

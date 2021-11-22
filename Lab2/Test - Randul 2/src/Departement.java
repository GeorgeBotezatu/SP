import java.util.ArrayList;

public class Departement  implements Element {
    private String NumeDepartament;
    private ArrayList<Element> elements;
    private Categorie categorie;

    public Departement(){
        this.NumeDepartament="";
        this.elements= new ArrayList<Element>();

    }
    public Departement(String numeDepartament,Categorie categorie){
        this.NumeDepartament=numeDepartament;
        this.elements= new ArrayList<Element>();
        this.categorie=categorie;
    }
    public Departement(String numeDepartament,ArrayList<Element> angajati,Categorie categorie){
        this.NumeDepartament=numeDepartament;
        this.elements= angajati;
        this.categorie=categorie;
    }
    public void add(Element element){
        elements.add(element);
    }
     public void print(){
        String msg="Departament" + this.NumeDepartament+"\n";
        if(elements!=null){
            for(Element i: elements){
                msg=msg+i+"\n";
            }
        }
        if(categorie!=null){
            this.categorie.print(msg);
        }else{
            System.out.println(msg);
        }
     }


}

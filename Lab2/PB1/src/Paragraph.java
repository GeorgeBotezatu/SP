public class Paragraph implements Element{
    public String paragraphName;

    public Paragraph(String paragraphName){
        this.paragraphName=paragraphName;
    }
    @Override
    public void print(){
        System.out.println(this.paragraphName);
    }
}

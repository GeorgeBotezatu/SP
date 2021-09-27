import java.util.*;

public class Book {


    public List<String> paragraphs = new ArrayList<>();
    public List<String> images = new ArrayList<>();
    public List<String> tables = new ArrayList<>();


    public void createNewParagraf(String paragraf){
        paragraphs.add(paragraf);
    }
    public void createNewImage(String image){
        images.add(image);
    }
    public void createNewTable(String tabel){
        tables.add(tabel);
    }

    public void print(){
        System.out.println(paragraphs);
        System.out.println(images);
        System.out.println(tables);
    }

}

import java.util.*;

public class Book {

    private String title;
    private ArrayList<Chapter> chapters;
    private ArrayList<Author> author;
    private TableOfContent toc;


    public Book(String title){
        this.title=title;
        this.chapters=new ArrayList<Chapter>();
        this.author=new ArrayList<Author>();
        this.toc=new TableOfContent();

    }

    public int addChapter(String chapter){
       this.chapters.add(new Chapter(chapter));
       return this.chapters.size()-1;
    }

    public Chapter getChapterByIndex(int index) {
        return this.chapters.get(index);
    }

    public void addAuthor(Author author){
        this.author.add(author);
    }


    public void print() {
        System.out.println("Carte" + this.title);
        this.toc.print();

        System.out.println("Autori: ");
        for (Author i : this.author)
            i.print();

        for (Chapter i : this.chapters)
            i.print();
    }

}

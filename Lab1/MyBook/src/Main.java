public class Main {

    public static void main(String[] args) {
        Book discoTitanic = new Book();
        discoTitanic.createNewParagraf("Paragraph 1");
        discoTitanic.createNewParagraf("Paragraph 2");
        discoTitanic.createNewParagraf("Paragraph 3");
        discoTitanic.createNewImage("Image 1");
        discoTitanic.createNewParagraf("Paragraph 4");
        discoTitanic.createNewTable("Table 1");
        discoTitanic.createNewParagraf("Paragraph 5");
        discoTitanic.print();


    }
}

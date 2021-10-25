import java.util.concurrent.TimeUnit;

public class Image implements Element,Picture {
    private String imageName;
    private ImageLoader lodaer;
    private ImageLoaderFactory imageLoaderFactory = new ImageLoaderFactory();
    private Dimension dim = new Dimension(400,400);

    public Image(String imageName){
        this.imageName=imageName;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Override
    public void print(){
        System.out.println(this.imageName);
    }

    @Override
    public void add(Element element) throws Exception {

    }
    public void loadContent() throws Exception {
        lodaer = ImageLoaderFactory.create(imageName);
    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public boolean find(Element element) {
        if (!(element instanceof Image))
            return false;
        else {
            return ((Image) element).imageName.equals(this.imageName);
        }
    }

    @Override
    public String url() {
        return this.imageName;
    }

    @Override
    public Dimension dim() {
       return this.dim;
    }
}

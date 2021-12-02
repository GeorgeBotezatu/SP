package services;

public class StatisticsCommand implements Command{
    @Override
    public void execute() throws Exception {
        RenderContentVisitor stats = new RenderContentVisitor();
        DocumentManager.getInstance().getBook().accept(stats);

        Counter counter = new Counter();
        DocumentManager.getInstance().getBook().accept(counter);
        counter.showCountStatistics();
    }
}

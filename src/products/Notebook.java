package products;

public class Notebook extends Product {
    private int pageCount;
    private boolean isHardCover;
    private static int UUID = 2000;

    public Notebook(String title, double price, int pageCount, boolean isHardCover) {
        super(title, price);
        this.pageCount = pageCount;
        this.isHardCover = isHardCover;
    }

    public int getPageCount() {
        return pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    public boolean isHardCover() {
        return isHardCover;
    }
    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }

    @Override
    protected String generateId() {
        UUID++;
        return String.valueOf(UUID);
    }

    @Override
    public String toString() {
        return super.toString() + ", pageCount: " + pageCount + ", isHardCover: " + isHardCover;
    }
}

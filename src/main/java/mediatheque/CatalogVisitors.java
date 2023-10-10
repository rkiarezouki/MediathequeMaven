package mediatheque;

public class CatalogVisitors implements ItemVisitors {
    public void visit(CD item){
        //System.out.println("CD : " + item.getTitle());
    }
    public void visit(Book item) {
        System.out.println("VISITING Book : " + item);
    }
}

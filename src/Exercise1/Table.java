package Exercise1;

public class Table {

    private List list;

    public Table(List list) {
        this.list = list;
    }

    public String toString() {
        String s = list.title() + "\n\n";
        s+= list.header()+"\n";

        String[] rows = list.rows();

        for(int i =0; i<rows.length; i++) {
            s += rows[i];
        }
        return s;
    }
}
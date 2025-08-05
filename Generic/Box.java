package Generic;

public class  Box <T>{
    private T item;

    public void setitem(T item){
        this.item = item;
    }

    public T getitem(){
        return item;
    }

    public static void main(String[] args) {
        Box<String> string = new Box<>();
        
        string.setitem("niggga");

        Box<Double> doubleBox = new Box<Double>();

        doubleBox.setitem(12.66);

        Box<Integer> intigerBox = new Box<>();

        intigerBox.setitem(23);

        System.out.println(string.getitem());
        System.out.println(intigerBox.getitem());

    }
}

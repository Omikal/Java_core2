package Java2;

import org.w3c.dom.Node;

public class MyList <T>{
    private Object[] a;
    public MyList(int size){
        a = new Object[size];
    }
    public void add (int index, T item){
        a[index] = item;
    }
    public T get(int index){
        return (T)a[index];
    }
    public int length(){
        int length = a.length;
        return length;
    }
}

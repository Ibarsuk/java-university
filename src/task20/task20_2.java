package task20;

public class task20_2<E> {
    private E [] arr;
    private int h;

    public E getArrIndex(int i){
        return  arr[i] ;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getH() {
        return h;
    }

    public void setArr(E [] arr){
        this.arr =  arr;
    }

    public int getLength(){
        return  arr.length ;
    }

    public E[] getArr() {
        return arr;
    }
    public int printer() {
        for (Object str : arr) {
            System.out.print(str + " ");
        }
        return 0;
    }
    public void replace(int i, E h) {
        arr[i] = h;
    }


    public static void main(String [] args){

        String [] s = {"Hello", "World","!"};

        Integer [] intr = new Integer[]{ 1,2,3,4,5,6,7,8};

        Double [] ad = {1.2,1.5,6.7};
        intr[0] = 5;
        task20_2<String> s1 = new task20_2<String>();
        task20_2<Integer> s2 = new task20_2<Integer>();
        task20_2<Double> s3 = new task20_2<Double>();

        s1.setArr(s);
        s1.printer();
        s2.setArr(intr);
        s2.printer();
        s3.setArr(ad);
        s3.printer();
    }
}
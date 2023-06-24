package Sem6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Sem6_1 {
    public static void main(String[] Args){
        SetImitation setImit = new SetImitation();
        System.out.println(setImit.add(12));
        System.out.println(setImit.add(9));
        System.out.println(setImit.add(12));
        System.out.println(setImit.size());
        System.out.println(setImit.delete(12));
        System.out.println(setImit.size());
        System.out.println(setImit.isEmpty());
        System.out.println(setImit.contains(12));
        System.out.println(setImit.contains(2));
        for (int i = 0; i < 10; i++) {
            setImit.add(new Random().nextInt(1000));
        }
        Iterator<Integer> iterator = setImit.iterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println(setImit.getElemByIndex(3));

    }

}
class SetImitation<E> {
    private HashMap<E, Object> map = new HashMap<>();
    private static final Object OBJECT = new Object();
    public boolean add(E num) {
        return map.put(num, OBJECT) == null;
    }
    public boolean delete(E num){
        return map.remove(num,OBJECT);
    }
    public int size(){
        return map.size();
    }
    public boolean isEmpty(){
        return map.isEmpty();
    }
    public boolean contains(Object num){
        return map.containsKey(num);
    }
    public Iterator<E> iterator(){
        return map.keySet().iterator();
    }

    public E getElemByIndex(int index){
        E[] mapArray = (E[]) map.keySet().toArray();
        return mapArray[index];
    }
}

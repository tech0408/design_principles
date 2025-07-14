package gang_of_four_design_patterns.creational;

import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

class ObjectPool1<T> {

    private ConcurrentLinkedQueue<T> pool;
    public ObjectPool1(int size, ObjectFactory<T> factory){

        pool = new ConcurrentLinkedQueue<>();
        for(int i=1;i<=size;i++){
            pool.add(factory.createObject());
        }
    }

    public T borrow(){
        return pool.poll();
    }

    public void returnObject(T object){
        pool.add(object);
    }
}

interface ObjectFactory<T>{
    T createObject();
}

public class ObjectPool {

    public static void main(String[] args) {

        ObjectPool1<StringBuffer> pool = new ObjectPool1<>(10, StringBuffer::new);

        System.out.println(pool);
        StringBuffer s1 = pool.borrow();
        s1.append("Hello pool object");
        System.out.println(s1.toString());

        pool.returnObject(s1);
    }
}

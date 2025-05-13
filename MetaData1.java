class MyClass{
    public void sayHello(){
        System.out.println("Hello,World");
    }
}

public class MetaData1{
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        Class<?> cls = obj.getClass();

        System.out.println("Class Name:" + cls.getName());
        System.out.println("Simple Name:" + cls.getSimpleName());
        System.out.println("Is Interface:" + cls.isInterface());
    }
}
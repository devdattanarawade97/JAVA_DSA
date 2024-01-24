public class CallByReferenceExample {
    public static void main(String[] args) {
        MyClass obj = new MyClass(5);
        System.out.println("Before: obj.value = " + obj.getValue());
        modifyObject(obj);
        System.out.println("After: obj.value = " + obj.getValue());
    }

    static void modifyObject(MyClass myObject) {
        myObject.setValue(10);
        System.out.println("Inside method: obj.value = " + myObject.getValue());
    }
}

class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

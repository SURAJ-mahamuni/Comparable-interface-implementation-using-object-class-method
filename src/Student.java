public class Student implements Compare{
    private int roll;
    private String name;
    private int id;

    public Student(int roll, String name, int id) {
        this.roll = roll;
        this.name = name;
        this.id = id;
    }

    public boolean compare(Object obj, Object obj1){
        boolean rt = obj.equals(obj1);
        return rt;

    }
}

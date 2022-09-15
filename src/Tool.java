public class Tool {
    public static void main(String [] args){
        Student s1 = new Student(22, "suraj", 101);
        Student s2 = s1;
        Student s3 = new Student(33, "mahesh", 202);

        System.out.println("compare copy object reference (s2 and s1) : "+s1.compare(s2,s1));
        System.out.println();
        System.out.println("compare same class but difference object reference (s2 and s3) : "+s1.compare(s2, s3));
    }
}

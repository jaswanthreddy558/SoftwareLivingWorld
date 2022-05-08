package lamdaConcept;


interface subject {
    int addition(int a, int b);
}

class book implements subject {
    @Override
    public int addition(int a, int b) {
        return a + b;
    }
}


public class LamdaExampleWithMultipleParams {
    public static void main(String[] args) {
        subject subject2 = new book();
        subject subject = (age, height) -> (age + height);
        int value = subject.addition(32, 78);
        System.out.println(value);
        System.out.println(subject2.addition(12,45));
    }


}

package OOPSCore1;
class  students{
    int rNo;
    String name;
    int marks;
}
public class ArraysOfObjects {
    public static void main(String[] args) {
        students s1 = new students();
        s1.rNo = 1;
        s1.name = "Subhomoy";
        s1.marks = 78;

        students s2 = new students();
        s2.rNo = 2;
        s2.name = "Shyam";
        s2.marks = 98;

        students s3 = new students();
        s3.rNo = 3;
        s3.name = "Purav";
        s3.marks = 90;

        students stud [] = new students[3]; // array which holds students references!
        stud[0] = s1;
        stud[1] = s2;
        stud[2] = s3;

        for(students st : stud){
            System.out.println(st.name + " : " + st.marks);
        }
        // for (int i = 0; i < stud.length; i++) {
        //     System.out.println(stud[i].name + " got : " + stud[i].marks);
        // }

    }
}

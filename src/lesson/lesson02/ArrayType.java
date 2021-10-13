package lesson.lesson02;

public class ArrayType {
    public static void main(String[] args) {
        // |a| |b| |c|

//        int[] myIntArr = new int[3]{1,2,3};
        int[] myIntArr = new int[3];

        // Assign value into array element(s)

        myIntArr[0] = 1;
        myIntArr[1] = 2;
        myIntArr[2] = 3;

//        for (int i : myIntArr) {
//            System.out.println(i);
//        }

        for(int i : myIntArr){
            i = i * 2;
            System.out.println(i);
        }
    }
}

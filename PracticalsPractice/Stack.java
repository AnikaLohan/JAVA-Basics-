import java.util.Scanner;

public class Stack{
    int arr[];
    int tos = -1;
    static int size;

    Stack() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Stack: ");
        size = sc.nextInt();
        arr = new int[size];
    }

    int pop() {
        try {
            if ((tos - 1) == -2)
                throw new ArrayIndexOutOfBoundsException();
            return arr[tos--];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
            return -1;
        }
    }

    void push(int num) {
        try {
            if ((tos + 1) == size)
                throw new ArrayIndexOutOfBoundsException();
            arr[++tos] = num;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }
    public static void main(String args[]) {
        Scanner sc1 = new Scanner(System.in);
        Stack s = new Stack();
        for (int i = 1; i <= size; i++) {
            System.out.print("Enter the number:");
            s.push(sc1.nextInt());
        }
        for (int i = 0; i < size; i++) {
            System.out.println(s.pop());
        }
    }
}
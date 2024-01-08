public class MyStack {
    int array1[]=new int[5];
    int t=0;
    public void push(int data){
        array1[t]=data;
        t++;
    }
    public void show(){
        for(int n:array1){
            System.out.println(n);

        }
    }

    public int pop(){
        t--;
        int data;
        data=array1[t];
        array[t]=0;
    }

    public static void main(String[] args){
        Stack nums=new Stack();
        nums.push(15);
        nums.push(20);


    }
}

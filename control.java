public class control {
    
   
    //while

    public static void main(String args[] ){
        //if else
    	System.out.print("1. if else \n");
        int month =4;
        String season;
    if(month==12 || month == 1 || month ==2)
		season = "Winter";
	else if(month== 3 || month == 4 || month == 5)
		season = "Spring";
	else if(month==6 || month == 7 || month == 8)
		season ="Summer";
	else if(month==9 || month == 10 || month == 11)
		season = "Autumn";
	else
	season = "Bogus Month";

	System.out.println("April is in the " + season + ".");
    
     //switch
   
    System.out.print("2. switch \n");

    for(int i=0;i<6;i++)
       switch(i){
            case 0:
                System.out.println("i is zero");   
                break;        
            case 1:
                System.out.println("i is one");
                break;
            case 2:
                System.out.println("i is two");
                break;
            case 3:
                System.out.println("i is three");
                break;
            default:
                System.out.println("i is greater than 3.");
                

       }

    //while
    System.out.println("3. while:");
    int a=10;
    while(a>0){
        System.out.println("tick"+ a);
        a--;
    }
    //do while
    System.out.println("4. do while :");
        int v=10;   
         do{
             System.out.println("tick:"+ v);
             v--;

         }
         while(v>0);

    //nested
    System.out.println("nested");
    int num;
    boolean isPrime;
    num=14;
    if(num<2) isPrime=false;
    else isPrime=true;
    for(int i=2;i<=num/i;i++){
        if((num%i)==0){
            isPrime=false;
            break;
        }
    }
    if(isPrime)System.out.println("Prime");
    else System.out.println("Not Prime");

    
    //for each
    int nums[]={1,2,3,4,5,6,7,8,9,10};
    int sum=0;
    for(int x:nums){
        System.out.println("value is:"+ x);
        sum+=x;
    }
    System.out.println("summation:"+ sum);
    }
}

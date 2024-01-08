class Book{
    int isbn;
	String name;
	int price;
    Book(int isbn, String name,int price){
        this.isbn=isbn;
        this.name=name;
        this.price=price;
    }
    public String toString(){
        return isbn+" "+name+" "+price;

    }

}


class MyException extends Exception{
    MyException(String s){
        super(s);
    }
}


class Books{
    Book arr[]= new Book[5];
    int tos;
    Books(){
        tos=-1;
    }
    void push(Book b) throws MyException
	{
		if(tos==4)
			throw new MyException("overflow");
		else
			arr[++tos]=b;
	}
	Book pop() throws MyException
	{
		if(tos<0)
			throw new MyException("underflow");
		else 		
			return arr[tos--];
	}
	
	public static void main(String args[]){
	 try{	
		BookDemo b=new BookDemo();
		Book b1=new Book(1,"abc",10);
		Book b2=new Book(2,"def",10);
		Book b3=new Book(3,"ghi",10);
		Book b4=new Book(4,"jkl",10);
		Book b5=new Book(5,"mno",10);	
		b.push(b1);
		b.push(b2);
		b.push(b3);
		b.push(b4);
		b.push(b5);
		for(int i=0;i<5;i++)
		{
			System.out.println(b.pop());
		}
	    }
 	catch(MyException e){
		System.out.println(e);
	  }
	}
}

}
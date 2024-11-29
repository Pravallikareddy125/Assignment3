package assignment3;

public class Library {
	  String []books;
	  void Toaddbooks(String[] books) {
		this.books=books;
	}
	  void Toremovebooks(Library s,String bookname) {
		  String []removebook= new String[s.books.length];
		  int count=0;
		  for(int i=0;i<s.books.length;i++) {
			  if(s.books[i].equals(bookname)) {
				  continue;
			  }else {
				  removebook[count]=s.books[i];
				  count++;
			  }
		  }
			  s.books=removebook;
		  }
		  public static void main(String [] args) {
			  Library T1= new Library();
			  String [] book11= {"pravs","bhai","me","time"};
			  T1.Toaddbooks(book11);
			  for(int i=0;i<T1.books.length;i++) {
				  System.out.println("books in library  :  "+T1.books[i]);
			  }
			  T1.Toremovebooks(T1, "bhai");
			  for(int i=0;i<T1.books.length;i++) {
				 System.out.println("books after removing:   "+ T1.books[i]); 
			  }
		  }
	}
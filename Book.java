class Book {
   String title;
   String author;
   int pages;
   double price;
   String publisher;
   String language;
   String genre;
   int edition;
   String coverType;
   double weight;
   long isbn;
   boolean ebook;
   
   
   Book(String title,String author,int pages,double price,String publisher,
   String language,String genre, int edition,String coverType,double weight,
   long isbn,boolean ebook){
   this.title=title;
   this.author=author;
   this.pages=pages;
   this.price=price;
   this.publisher=publisher;
   this.language=language;
   this.genre=genre;
   this.edition=edition;
   this.coverType=coverType;
   this.weight=weight;
   this.isbn=isbn;
   this.ebook=ebook;
   
      System.out.println("title is " + title);
	  System.out.println("author name is " + author);
	  System.out.println("publisher name is " + publisher);
	  System.out.println("editionis " + edition);
	  System.out.println("language is "+ language);
	  System.out.println("total pages are " + pages);
	  System.out.println("price is " + price);
	  System.out.println(" genre is " + genre);
	  System.out.println("is bn num is " + isbn);
	  System.out.println("coverType is " + coverType);
	  System.out.println("weight is " + weight);
	  System.out.println("is this ebook" + ebook);
 }
}
   
public class Novels extends Books{
   private String NovelsType;
    private  Integer PageNumber;
    private String BookName;
    Novels(int PageNumber, String BooksName, String NovelsType){
        this.NovelsType=NovelsType;
        this.BookName=BooksName;
        this.PageNumber=PageNumber;
    }

    @Override
    public String toString() {
        return "Novels{" +
                "NovelsType:" + NovelsType + '\'' +
                ", PageNumber: " + PageNumber +
                ", BookName:" + BookName + '\'' +
                '}';
    }
}


public class Albums extends Books {
    private String PaperQality;
    private  Integer PageNumber;
    private String BookName;
    Albums(int PageNumber, String BooksName, String PaperQality){
        this.PaperQality=PaperQality;
        this.BookName=BooksName;
        this.PageNumber=PageNumber;

    }

    @Override
    public String toString() {
        return "Albums{" +
                "PaperQality: " + PaperQality + '\'' +
                ", PageNumber: " + PageNumber +
                ", BookName: " + BookName + '\'' +
                '}';
    }
}


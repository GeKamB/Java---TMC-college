import java.time.LocalDate;

class Dvd implements LibraryItem {
    private String title;
    private boolean available;
    LocalDate borrowDate;
    LocalDate returnDate;
    
    public Dvd(String title) {
        this.title = title;
        this.available = true;
        this.borrowDate = null;
        this.returnDate = null;
    }
    
    @Override
    public void borrow() {
        if(available) {
            available = false;
            System.out.println("You have borrowed the " + this.title);
            borrowDate = LocalDate.now();
            returnDate = borrowDate.plusDays(21);
        }
        else System.out.println(this.title + " has been borrowed already but will be available on " + returnDate);
    }
    @Override
    public void returnItem() {
        if(!available) {
            available = true;
            System.out.println("You returned " + this.title + " to library.");
            borrowDate = null;
            
        }
        else System.out.println("Are you sure?");
    }
    @Override 
    public boolean isAvailable() {
        
        return available;
}
    @Override
    public void display(){
        System.out.println("Title: " + title );
        System.out.println("Available: " + isAvailable());
        System.out.println("Borrow Date: " + borrowDate);
        System.out.println("Return Date: " + returnDate);
    }
}
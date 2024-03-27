public class App {
    public static void main(String[] args) throws Exception {
        Book JavaProgramming = new Book("Java Programming");

        JavaProgramming.borrow();
        JavaProgramming.display();
        JavaProgramming.borrow();
        System.out.println("\t * * * * *");
        Dvd LordofTherings = new Dvd("Lord of The Rings: Two Towers");
        LordofTherings.borrow();
        LordofTherings.display();


    }
}

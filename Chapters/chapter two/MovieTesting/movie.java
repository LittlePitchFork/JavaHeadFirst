public class movie {
    //object creation superclass
    class Movie {
        String title;
        String genre;
        int rating;
        
        void playIt() {
            System.out.println("Playing the movie");
        }
    }
    //subclass
    public class MovieTestDrive {
        public void main(String[] args) {
            Movie one = new Movie();
            one.title = "Gone with teh stock";
            one.genre = "Tragic";
            one.rating = -2;
            Movie two = new Movie();
            two.title = "Lost in Cubible Space";
            two.genre = "Comedy";
            two.rating = 5;
            two.playIt();
            Movie three = new Movie();
            three.title = "Byte Club";
            three.genre = "Tragic but ultimately uplifting";
            three.rating = 127;
        }
    }
}
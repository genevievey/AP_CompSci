package pkg;

public class Movie{
    String movieName;
    double rating;
    int numRating;
    int revenue;


public Movie(){
    movieName = new String("Avengers");
    rating = 8.0;
    numRating = 33;
    revenue = 623357910;
}
    
public Movie(String n, double r, int nr, int re){
    movieName = n;
    rating = r;
    numRating = nr;
    revenue = re;
}

public void movieToString(){
    System.out.println("Movie:" + movieName);
    System.out.println("Rating:" + rating);
    System.out.println("Number of Ratings:" + numRating);
    System.out.println("Revenue:" + revenue);
    System.out.println("-------------------------------------");
}

public String getMovieName(){
    return movieName;
}

public double getRating(){
    return rating;
}

public int getNumRating(){
    return numRating;
}

public int getRevenue(){
    return revenue;
}

public void addRating(double addrate){
rating = (rating*numRating)+addrate;
numRating++;
rating = rating/numRating;
return;
}

}

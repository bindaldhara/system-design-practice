public class Movie {
    int movie_id;
    String movie_name;

    public Movie(int movie_id, String movie_name) {
        this.movie_id = movie_id;
        this.movie_name = movie_name;
    }
    public int getMovie_id() {
      return this.movie_id;
    }
    public void setMovie_id(int value) {
      this.movie_id = value;
    }

    public String getMovie_name() {
      return this.movie_name;
    }
    public void setMovie_name(String value) {
      this.movie_name = value;
    }
}

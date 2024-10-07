public class Screen {
     String screenId;
     String screenName;
     int totalSeats;
     
    public Screen(String screenId, String screenName, int totalSeats) {
        this.screenId = screenId;
        this.screenName = screenName;
        this.totalSeats = totalSeats;
    }
    public String getScreenId() {
        return screenId;
    }
    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }
    public String getScreenName() {
        return screenName;
    }
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }
    public int getTotalSeats() {
        return totalSeats;
    }
    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

}
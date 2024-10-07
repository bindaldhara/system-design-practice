package book_my_show;
import java.util.ArrayList;
import java.util.List;

public class theater {
    private String theaterId;
    private String name;
    private List<Screen> screens;

    public theater(String theaterId, String name) {
        this.theaterId = theaterId;
        this.name = name;
        this.screens = new ArrayList<>();
    }

    public String getTheaterId() {
        return theaterId;
    }
    public void setTheaterId(String theaterId) {
        this.theaterId = theaterId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Screen> getScreens() {
        return screens;
    }
    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }
public void addScreen(Screen screen) {
        screens.add(screen);
    }
}

/**
 * Created by Damian on 31.10.2017.
 */
public class Mem {

    private String name;
    private String url;
    private String description;
    private boolean isFavourite;

    public Mem(String name, String url, String description, boolean isFavourite) {
        this.name = name;
        this.url = url;
        this.description = description;
        this.isFavourite = isFavourite;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        if (url.startsWith("http://") && url.startsWith("www.") && url.startsWith("https://wwww.")) {
            this.url = url;
        } else {
            System.out.println("Podano niepoprawny adres url");
        }
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }

    @Override
    public String toString() {
        return "Mem{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", isFavourite=" + isFavourite +
                '}';
    }
}

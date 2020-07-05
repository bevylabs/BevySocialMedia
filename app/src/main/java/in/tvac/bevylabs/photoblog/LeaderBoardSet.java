package in.tvac.bevylabs.photoblog;

public class LeaderBoardSet {

    public String uname,image;

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LeaderBoardSet(String uname, String image) {
        this.uname = uname;
        this.image = image;
    }

    public String getUname() {
        return uname;
    }

    public String getImage() {
        return image;
    }



}

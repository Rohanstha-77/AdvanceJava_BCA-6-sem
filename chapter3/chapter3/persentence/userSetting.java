package chapter3.persentence;

public class userSetting {
    private static final long serialVersionID = 11;
    private String themeColor;
    private int fontSize;

    public userSetting(){};

    public userSetting(String themeColor, int fontSize){
        this.fontSize = fontSize;
        this.themeColor = themeColor;
    }

    public String getThemeColor(){
        return themeColor;
    }

    public void setThemeColor(String themeColor){
        this.themeColor = themeColor;
    }

    public int getFontSize(){
        return fontSize;
    }

    public void getFontSize(int fontSize){
        this.fontSize = fontSize;
    }

    @Override
    public String toString(){
        return "user setting" ["theme color"+ themeColor + "font size" + fontSize];
    }
}

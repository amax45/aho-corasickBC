public class Data {
    private String original;
    private String working;
    private Integer xpos;
    private Integer ypos;

    public Data(String original, String working, Integer xpos, Integer ypos) {
        this.original = original;
        this.working = working;
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getWorking() {
        return working;
    }

    public void setWorking(String working) {
        this.working = working;
    }

    public Integer getXpos() {
        return xpos;
    }

    public void setXpos(Integer xpos) {
        this.xpos = xpos;
    }

    public Integer getYpos() {
        return ypos;
    }

    public void setYpos(Integer ypos) {
        this.ypos = ypos;
    }
}

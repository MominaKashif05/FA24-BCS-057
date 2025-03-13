public class PC {

    private int id;
    private final String VERSION = "i7";
    private final int RAM = 32;
    private final int DISCSIZE = 500;



    public PC (int id) {

        this.id = id;
        
    }


//display function 
    public void showPCDetails() {
        System.out.println("ID: " + id + ", Version: " + VERSION + ", RAM: " + RAM + " GB, Disc Size: " + DISCSIZE + " GB");
    }




//setter
    public void setId(int id) {
        this.id = id;
    }

    

//getter
    public int getId() {
        return id;
    }

    public String getVersion() {
        return VERSION;
    }

    public int getRAM() {
        return RAM;
    }

    public int getDiscSize() {
        return DISCSIZE;
    }
}

public class MyEventSite {
    
    private int siteNumber;
    double hrlyFee;
    String siteName;

    public MyEventSite() {
        siteNumber = 999;
        hrlyFee = 130;
        siteName = "Beautiful Place";
    }

    public int getSiteNumber() {
        
        return siteNumber;
    }

    public void setSiteNumber(int n) {

        siteNumber = n;
    }
}

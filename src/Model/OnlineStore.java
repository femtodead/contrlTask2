package Model;

public class OnlineStore {
    Stock stosk;
    Website website;
    PointOfIssue pointOfIssue;
    public OnlineStore(Stock stosk, Website website, PointOfIssue pointOfIssue) {
        this.stosk = stosk;
        this.website = website;
        this.pointOfIssue = pointOfIssue;
    }
    public Stock getStosk() {
        return stosk;
    }
    public void setStosk(Stock stosk) {
        this.stosk = stosk;
    }
    public Website getWebsite() {
        return website;
    }
    public void setWebsite(Website website) {
        this.website = website;
    }
    public PointOfIssue getPointOfIssue() {
        return pointOfIssue;
    }
    public void setPointOfIssue(PointOfIssue pointOfIssue) {
        this.pointOfIssue = pointOfIssue;
    } 
}

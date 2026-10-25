package lk.ac.iit;

public class DigitalProduct extends Product{

    //These are inherited from the parent class automatically by extends
//    private Long id;
//    private String name;
//    private Double price;
    private String downloadUrl; // new field
    private double fileSizeMB; // new field

//    public void test(){
//        getId();
//        getName();
//        getPrice();
//    }

    public DigitalProduct(){

    }

    public DigitalProduct(Long id, String name, double price, String downloadUrl, double fileSizeMB){
        super(id, name, price);
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
    public double getFileSizeMB() {
        return fileSizeMB;
    }
    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }


}

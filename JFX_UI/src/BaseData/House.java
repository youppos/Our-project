package BaseData;

public class House {
    private String address;
    private String price;
    private String area;
    private String floor;
    private String state;
    private String client;
    private String clientId;
    private String decoration;
    private String hostName;
    private String hostSex;
    private String hostId;
    private String hostPhone;

    public House(){

    }

    public House(String address, String price, String area, String floor, String state, String client, String clientId, String decoration, String hostName, String hostSex, String hostId, String hostPhone) {

        this.address = address;
        this.price = price;
        this.area = area;
        this.floor = floor;
        this.state = state;
        this.client = client;
        this.clientId = clientId;
        this.decoration = decoration;
        this.hostName = hostName;
        this.hostSex = hostSex;
        this.hostId = hostId;
        this.hostPhone = hostPhone;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public void setHostSex(String hostSex) {
        this.hostSex = hostSex;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public void setHostPhone(String hostPhone) {
        this.hostPhone = hostPhone;
    }


    public String getAddress() {
        return address;
    }

    public String getPrice() {
        return price;
    }

    public String getArea() {
        return area;
    }

    public String getFloor() {
        return floor;
    }

    public String getState() {
        return state;
    }

    public String getClient() {
        return client;
    }

    public String getClientId() {
        return clientId;
    }

    public String getDecoration() {
        return decoration;
    }

    public String getHostName() {
        return hostName;
    }

    public String getHostSex() {
        return hostSex;
    }

    public String getHostId() {
        return hostId;
    }

    public String getHostPhone() {
        return hostPhone;
    }
}

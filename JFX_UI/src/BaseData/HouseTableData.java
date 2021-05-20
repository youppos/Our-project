package BaseData;

import javafx.beans.property.SimpleStringProperty;

public class HouseTableData {
    private SimpleStringProperty address;
    private  SimpleStringProperty price;
    private  SimpleStringProperty area;
    private  SimpleStringProperty floor;
    private  SimpleStringProperty state;
    private  SimpleStringProperty client;
    private  SimpleStringProperty clientId;
    private  SimpleStringProperty decoration;
    private  SimpleStringProperty hostName;
    private  SimpleStringProperty hostSex;
    private  SimpleStringProperty hostId;
    private  SimpleStringProperty hostPhone;

    public HouseTableData() {
    }

    public HouseTableData(String address, String price, String area, String floor, String state, String client, String clientId, String decoration, String hostName, String hostSex, String hostId, String hostPhone) {
        this.address = new SimpleStringProperty(address);
        this.price = new SimpleStringProperty(price);
        this.area = new SimpleStringProperty(area);
        this.floor = new SimpleStringProperty(floor);
        this.state = new SimpleStringProperty(state);
        this.client = new SimpleStringProperty(client);
        this.clientId = new SimpleStringProperty(clientId);
        this.decoration = new SimpleStringProperty(decoration);
        this.hostName = new SimpleStringProperty(hostName);
        this.hostSex = new SimpleStringProperty(hostSex);
        this.hostId = new SimpleStringProperty(hostId);
        this.hostPhone = new SimpleStringProperty(hostPhone);
    }

    public String getAddress() {
        return address.get();
    }

    public SimpleStringProperty addressProperty() {
        return address;
    }

    public String getPrice() {
        return price.get();
    }

    public SimpleStringProperty priceProperty() {
        return price;
    }

    public String getArea() {
        return area.get();
    }

    public SimpleStringProperty areaProperty() {
        return area;
    }
//
    public String getFloor() {
        return floor.get();
    }

    public SimpleStringProperty floorProperty() {
        return floor;
    }
//
    public String getState() {
        return state.get();
    }

    public SimpleStringProperty stateProperty() {
        return state;
    }
//
    public String getClient() {
        return client.get();
    }

    public SimpleStringProperty clientProperty() {
        return client;
    }
//
    public String getClientId() {
        return clientId.get();
    }

    public SimpleStringProperty clientIdProperty() {
        return clientId;
    }
//
    public String getDecoration() {
        return decoration.get();
    }

    public SimpleStringProperty decorationProperty() {
        return decoration;
    }
//
    public String getHostName() {
        return hostName.get();
    }

    public SimpleStringProperty hostNameProperty() {
        return hostName;
    }
//
    public String getHostSex() {
        return hostSex.get();
    }

    public SimpleStringProperty hostSexProperty() {
        return hostSex;
    }
//
    public String getHostId() {
        return hostId.get();
    }

    public SimpleStringProperty hostIdProperty() {
        return hostId;
    }
   //
    public String gethostPhone() {
        return hostPhone.get();
    }

    public SimpleStringProperty hostPhoneProperty() {
        return hostPhone;
    }

}

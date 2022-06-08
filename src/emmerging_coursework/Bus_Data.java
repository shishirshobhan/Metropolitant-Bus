/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emmerging_coursework;

/**
 *
 * @author bivek
 */
public class Bus_Data {
    
    private String vehical_number, destination, category, route, driver;
    private int price;
    private Long phone;
    
    public Bus_Data(String vehical_number, String destination, String category, String route, String driver, String price, String phone){
        this.vehical_number = vehical_number;
        this.destination = destination;
        this.category = category;
        this.route = route;
        this.driver = driver;
        this.price = Integer.parseInt(price);
        this.phone = Long.parseLong(phone);
    }

    Bus_Data(String vehicle_Number, String string, String string0, String string1, String string2, int price, long phone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getVehical_number(){
        return vehical_number;
    }
    
    public String getDestination(){
        return destination;
    }
    
    public String getCategory(){
        return category;
    }
    
    public String getRoute(){
        return route;
    }
    
    public String getDriver(){
        return driver;
    }
    
    public int getPrice(){
        return price;
    }
    
    public Long getPhone(){
        return phone;
    }

    @Override
    public String toString() {
        return "Bus_Data{" + "vehical_number=" + vehical_number + ", destination=" + destination + ", category=" + category + ", route=" + route + ", driver=" + driver + ", price=" + price + ", phone=" + phone + '}';
    }
    
}

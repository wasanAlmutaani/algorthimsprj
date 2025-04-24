/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirFreightApp;



import GraphFramework.Vertex;

//Location is a subclass of Vertex, it inherits all attributes, operations & relationships. 
public class Location extends Vertex {

    // Data filed
    private String city;

    // Contructors
    public Location(int id) {
        // Call a super class "Vertex"
        super(id);

    }

    public Location() {
        // Call a super class "Vertex"
        super();
    }

    /*
     * Override method that responsible for displaying
     * the information of the class attributes
     */
    @Override
    public String displyInfo() {
        city = "Loc." + getLabel() + ": city " + getID() + " ";
        return city;
    }

}
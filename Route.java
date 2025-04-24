package AirFreightApp;



import GraphFramework.Edge;
import GraphFramework.Vertex;

// Route it is a subclass of Edge, it inherits all attributes, operations & relationships.
public class Route extends Edge {

    // Contructors

    public Route(Vertex v, Vertex u, int w) {
        // Call a super class "Edge"
        super(v, u, w);
    }

    public Route(int w) {
        // Call a super class "Edge"
        super(w);
    }

    public Route() {
        // Call a super class "Edge"
        super();
    }
    /*
     * Override method that responsible for displaying
     * the information of the class attributes
     */

    @Override
    public String displyInfo() {

        return "--- route length: " + getWeight();
    }

}
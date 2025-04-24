/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphFramework;

import java.util.LinkedList;

// Vertex is a class that represents a graph vertex
public abstract class Vertex {

    // Data filed

    // Represents the vertex label
    char label;
    // Check if vertex is visited or not
    boolean isVisited;
    // Represents the vertex ID
    int ID;
    // Store adjacency list in LL (from association relationship)
    LinkedList<Edge> adjList;

    // Contructors
    public Vertex() {

    }

    public Vertex(int ID) {
        this.ID = ID;
        adjList = new LinkedList<>();
    }

    // Check if this vertex is adjacent to another vertex
    public boolean isAdjacent(Vertex adj) {
        for (Edge edge : adjList) {
            if (edge.target == adj) {
                return true;
            }
        }
        return false;
    }

    // Setteers and Getters
    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

    public LinkedList<Edge> getAdjList() {
        return adjList;
    }

    public void setAdjList(LinkedList<Edge> adjList) {
        this.adjList = adjList;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    // Method is responsible for displaying the information of the class attributes.
    public abstract String displyInfo();

}
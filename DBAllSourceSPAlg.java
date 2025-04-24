/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphFramework;

/* DBAllSourceSPAlg class represents the implementation of the Dijkstra-based shortest path algorithm for
    computing the shortest path from each vertex to the rest of the vertices, which is located in the
    computeDijkstraBasedSPAlg() method.  */
public class DBAllSourceSPAlg extends ShortestPathAlgorithm {

    // Constructor
    public DBAllSourceSPAlg(Graph graph) {
        // Call a super class "ShortestPathAlgorithm"
        super(graph);
    }

    // For computing the shortest path from each vertex to the rest of the vertices.
    public void computeDijkstraBasedSPAlg(Boolean isFile) {
        // Create object of SingleSourceSPAlg to compute the shortest path for a
        // specified source
        SingleSourceSPAlg DijkstraAlg = new SingleSourceSPAlg(graph);
        // Print the result
        System.out.println("Shortest paths from all location:\n");
        // Loop for aal vertex
        for (int i = 0; i < graph.verticesNo; i++) {
            // Call computeDijkstraAlg() method
            DijkstraAlg.computeDijkstraAlg(graph.vertices[i], isFile);
        }
    }
}
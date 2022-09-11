

package sdnl_laporan_9;
public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');
        graph.addEdge('A', 'B', 1);
        graph.addEdge('A', 'C', 1);
        graph.addEdge('A', 'D', 1);
        graph.addEdge('B', 'A', 1);
        graph.addEdge('B', 'C', 1);
        graph.addEdge('B', 'E', 1);
        graph.addEdge('C', 'A', 1);
        graph.addEdge('C', 'B', 1);
        graph.addEdge('C', 'D', 1);
        graph.addEdge('C', 'E', 1);
        graph.addEdge('C', 'F', 1);
        graph.addEdge('D', 'A', 1);
        graph.addEdge('D', 'C', 1);
        graph.addEdge('D', 'F', 1);
        graph.addEdge('E', 'B', 1);
        graph.addEdge('E', 'C', 1);
        graph.addEdge('F', 'C', 1);
        graph.addEdge('F', 'D', 1);
        System.out.println("Graph 1");
        graph.printAdjacencyMatrix();
        System.out.print("BFS : ");
        graph.bfs();
        System.out.println("\n");
        Graph gra = new Graph();
        gra.addVertex('A');
        gra.addVertex('B');
        gra.addVertex('C');
        gra.addVertex('D');
        gra.addVertex('E');
        gra.addVertex('F');
        gra.addVertex('G');
        gra.addVertex('H');
        gra.addVertex('I');
        gra.addEdge('A', 'I', 1);
        gra.addEdge('A', 'B', 1);
        gra.addEdge('A', 'F', 1);
        gra.addEdge('B', 'A', 1);
        gra.addEdge('B', 'C', 1);
        gra.addEdge('B', 'E', 1);
        gra.addEdge('E', 'B', 1);
        gra.addEdge('E', 'C', 1);
        gra.addEdge('E', 'G', 1);
        gra.addEdge('C', 'B', 1);
        gra.addEdge('C', 'E', 1);
        gra.addEdge('C', 'D', 1);
        gra.addEdge('D', 'C', 1);
        gra.addEdge('D', 'G', 1);
        gra.addEdge('D', 'H', 1);
        gra.addEdge('F', 'A', 1);
        gra.addEdge('F', 'G', 1);
        gra.addEdge('G', 'E', 1);
        gra.addEdge('G', 'D', 1);
        gra.addEdge('G', 'F', 1);
        gra.addEdge('H', 'D', 1);
        gra.addEdge('I', 'A', 1);
        System.out.println("Graph 2");
        gra.printAdjacencyMatrix();
        System.out.print("BFS: ");
        gra.bfs();
    }
}

package sdnl_laporan_9;
import java.util.Stack;
public class Graph {
    private int[][] adjMatriks;
    private Vertex[] vertexList;
    private int MAX_VERTEX = 10;
    private int COUNT_VERTEX = 0;
    public int[][] getAdjMatriks() {
        return adjMatriks;
    }
    public void setAdjMatriks(int[][] adjMatriks) {
        this.adjMatriks = adjMatriks;
    }
    public Vertex[] getVertexList() {
        return vertexList;
    }
    public void setVertexList(Vertex[] vertexList) {
        this.vertexList = vertexList;
    }
    public Graph() {
        vertexList = new Vertex[MAX_VERTEX];
        adjMatriks = new int[MAX_VERTEX][MAX_VERTEX];
        for (int i = 0; i < MAX_VERTEX; i++) {
            for (int j = 0; j < MAX_VERTEX; j++) {
                if (i == j) {
                    adjMatriks[i][j] = 0;
                } else {
                    adjMatriks[i][j] = -1;
                }
            }
        }
    }
    public void addVertex(char node) {

        vertexList[COUNT_VERTEX++] = new Vertex(node);
    }
    public void addEdge(int a, int b, int c) {
        adjMatriks[a][b] = c;
        adjMatriks[b][a] = c;
    }
    public void addEdge(char a, char b, int c) {
        adjMatriks[indexVertex(a)][indexVertex(b)] = c;
        adjMatriks[indexVertex(b)][indexVertex(a)] = c;
    }
    public int indexVertex(char label) {
        for (int j = 0; j < COUNT_VERTEX; j++) {
            if (vertexList[j].label == label) {
                return j;
            }
        }
        return -1;
    }
    public void printAdjacencyMatrix() {
        for (int i = 0; i < COUNT_VERTEX; i++) {
            for (int j = 0; j < COUNT_VERTEX; j++) {
                System.out.print(adjMatriks[i][j] + " \t");
            }
            System.out.println("");
        }
    }
    @Override
    public String toString() {
        return "Graph{" + "maxVertex=" + MAX_VERTEX + ", vertexList=" + vertexList
                + ", adjacencyMatrix=" + adjMatriks + ", countVertex="
                + COUNT_VERTEX + '}';
    }
    public void dfs() {
        int seed = 0;
        Stack stack = new Stack();
        stack.push(seed);

        while (!stack.isEmpty()) {
            int x = (int) stack.pop();
            if (vertexList[x].flagVisited) {

            } else {
                System.out.print(vertexList[x].label + " ");
                vertexList[x].flagVisited = true;
                for (int i = COUNT_VERTEX - 1; i >= 0; i--) {
                    if (adjMatriks[x][i] >= 1 && !vertexList[i].flagVisited) {
                        stack.push(i);
                    }
                }
            }
        }
    }
    public void dfs(int seed) {
        Stack stack = new Stack();
        stack.push(seed);
        while (!stack.isEmpty()) {
            int x = (int) stack.pop();
            if (vertexList[x].flagVisited) {
            } else {
                System.out.println(vertexList[x].label + " ");
                vertexList[x].flagVisited = true;
                for (int i = COUNT_VERTEX - 1; i >= 0; i--) {
                    if (adjMatriks[x][i] >= 1 && !vertexList[i].flagVisited) {
                        stack.push(i);
                    }
                }
            }
        }
    }
    public void bfs(){
        bfs(vertexList[0]);
    }
    public void bfs(Vertex seed1) {
        Queue<Vertex> queue = new Queue<>();
        queue.add(seed1);
        while (!queue.isEmpty()) {
            Vertex bantu = queue.remove();
            int x = indexVertex(bantu.label);
            if (!bantu.flagVisited) {
                System.out.print(bantu.label + " ");
                bantu.flagVisited = true;
                for (int i = 0; i <= COUNT_VERTEX - 1; i++) {
                    if (adjMatriks[x][i] == 1 && !vertexList[i].flagVisited) {
                        queue.add(vertexList[i]);
                    }
                }
            } else {       
            }
        }
    }
}

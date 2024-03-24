package DataStructure.Graphh;

public class GraphFirst {


    // A variable to store the number of vertices in the graph
    int vertexCount;
    // A variable to store the adjacency matrix of the graph
    int matrix[][];

    // Constructor to create an adjacency matrix
    // of dimensions vertexCount*vertexCount
    GraphFirst(int vertexCount) {
        this.vertexCount = vertexCount;
        matrix = new int[vertexCount][vertexCount];
        /*
         * The matrix[][] for vertexCount = 4 will look like this upon initialization
         * '-' indicates 0
         * [-, -, -, -]
         * [-, -, -, -]
         * [-, -, -, -]
         * [-, -, -, -]
         */
    }

    // Function to add an edge from source to destination
    // i.e. there is an edge from source to destination
    // O(1) time complexity
    public void addEdgeInMatrix(int source, int destination) {
        // Add a link from source to destination
        matrix[source][destination] = 1;

        // Add a link from destination to source
        matrix[destination][source] = 1;
    }

    // Function to delete an edge from source to destination
    // O(1) time complexity
    public void deleteEdgeInMatrix(int source, int destination)
    {
        // Deleting an edge from source to destination
        matrix[source][destination] = 0;

        // Deleting edge from destination to source
        matrix[destination][source] = 0;
    }

    // Utility function to print a graph
    public void printGraph() {
        System.out.println("Representation of Graph in the form of Adjacency Matrix: ");
        for (int i = 0; i < vertexCount; i++) {
            for (int j = 0; j < vertexCount; j++) {
                System.out.print(matrix[i][j] + "   ");
            }

            System.out.println();
        }

        for (int i = 0; i < vertexCount; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (int j = 0; j < vertexCount; j++) {
                if (matrix[i][j] == 1) {
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphFirst adj = new GraphFirst(10);
        // 0 ----- 1
        adj.addEdgeInMatrix(0, 1);

        // 0 ----- 1
        // |
        // |
        // |
        // 4
        adj.addEdgeInMatrix(0, 4);

        // 0 ----- 1 ---- 2
        // |
        // |
        // |
        // 4
        adj.addEdgeInMatrix(1, 2);

        // 0 ----->1 ---> 2
        // |       |
        // |       |
        // |       |
        // 4       3
        adj.addEdgeInMatrix(1, 3);

        // 0 ----->1 ---> 2
        // |     / |
        // |    /  |
        // |   /   |
        // 4  /    3
        adj.addEdgeInMatrix(1, 4);

        // 0 ----->1----2
        // |    / |   /
        // |   /  |  /
        // |  /   | /
        // 4       3
        adj.addEdgeInMatrix(2, 3);
        // 0 ----->1----2
        // |    / |   /
        // |   /  |  /
        // |  /   | /
        // 4  ----3
        adj.addEdgeInMatrix(3, 4);

        adj.printGraph();
        System.out.println("\nDeleting an edge from 3 to 4");
        adj.deleteEdgeInMatrix(3, 4);
        adj.printGraph();

    }

    }

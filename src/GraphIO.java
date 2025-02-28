import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class GraphIO {

    public static void readFile(Graph g, String filename) throws IOException {
        File file = new File(filename);
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);

            // Read number of nodes
            int numberOfNodes = scanner.nextInt();

            // Read node information
            for (int i = 0; i < numberOfNodes; i++) {
                int nodeId = scanner.nextInt();
                int xCoord = scanner.nextInt();
                int yCoord = scanner.nextInt();

                // Add node to the graph
                g.addNode(nodeId, xCoord, yCoord);
            }

            // Read edges until end of file
            while (scanner.hasNext()) {
                int sourceNodeId = scanner.nextInt();
                int targetNodeId = scanner.nextInt();
                int weight = scanner.nextInt();

                // Add edge to the graph
                g.addEdge(sourceNodeId, targetNodeId, weight);
            }
        } finally {
            // Close the scanner in the finally block to ensure it's always closed
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
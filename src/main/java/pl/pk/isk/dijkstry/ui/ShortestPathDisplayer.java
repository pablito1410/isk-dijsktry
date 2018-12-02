package pl.pk.isk.dijkstry.ui;

import org.graphstream.graph.Edge;
import pl.pk.isk.dijkstry.algh.GraphNode;

import java.util.ListIterator;

public class ShortestPathDisplayer implements PathDisplayer {

    private final long sleep;

    public ShortestPathDisplayer(long sleep) {
        this.sleep = sleep;
    }

    @Override
    public void show(GraphNode dest) {
        GraphNode prev = null;
        for (ListIterator<GraphNode> it = dest.getShortestPath().listIterator(); it.hasNext(); ) {
            GraphNode node = it.next();
            if (prev != null) {
                Edge edge = node.getEdgeFrom(prev);
                edge.addAttribute("ui.class", "marked");
            }

            node.setAttribute("ui.class", "marked");
            sleep();
            prev = node;

        }
        if (prev != null) {
            Edge edge = dest.getEdgeFrom(prev);
            edge.addAttribute("ui.class", "marked");
        }
        dest.setAttribute("ui.class", "marked");
    }

    private void sleep() {
        try { Thread.sleep(sleep); } catch (InterruptedException e) { }
    }
}

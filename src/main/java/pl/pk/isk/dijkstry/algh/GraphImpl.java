package pl.pk.isk.dijkstry.algh;

import org.graphstream.graph.Graph;
import org.graphstream.graph.NodeFactory;
import org.graphstream.graph.implementations.AbstractGraph;
import org.graphstream.graph.implementations.SingleGraph;

public class GraphImpl extends SingleGraph {

    private boolean strictChecking;

    public GraphImpl(String id) {
        super(id, true, false);
        this.setNodeFactory(new NodeFactory<GraphNode>() {
            public GraphNode newInstance(String id, Graph graph) {
                GraphNode node = new GraphNode((AbstractGraph) graph, id);
                node.addAttribute("ui.label", id);
                return node;
            }
        });
    }
}

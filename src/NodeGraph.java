import java.util.List;

public class NodeGraph {
    List<NodeGraph> link;
    String value;

    public NodeGraph(List<NodeGraph> link, String value) {
        this.link = link;
        this.value = value;
    }

    public List<NodeGraph> getLink() {
        return link;
    }

    public void setLink(List<NodeGraph> link) {
        this.link = link;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

package twelve_composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic extends Graphic {
    private List<Graphic> children = new ArrayList<>();

    @Override
    public void add(Graphic graphic) {
        children.add(graphic);
    }

    @Override
    public void remove(Graphic graphic) {
        children.remove(graphic);
    }

    @Override
    public List<Graphic> getChildren() {
        return children;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a CompositeGraphic:");
        for (Graphic child : children) {
            child.draw();
        }
    }
}

package twelve_composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Graphic {
    public void add(Graphic graphic) {
        throw new UnsupportedOperationException("Cannot add to a leaf component.");
    }

    public void remove(Graphic graphic) {
        throw new UnsupportedOperationException("Cannot remove from a leaf component.");
    }

    public List<Graphic> getChildren() {
        throw new UnsupportedOperationException("Leaf component does not have children.");
    }

    public abstract void draw();
}

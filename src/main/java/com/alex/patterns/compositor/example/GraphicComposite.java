package com.alex.patterns.compositor.example;

import java.util.ArrayList;
import java.util.List;

/* composite object that have childs */
public class GraphicComposite implements Graphic {
    private List<Graphic> list = new ArrayList<>();;

    public void add(Graphic graphic) {
        list.add(graphic);
    }

    public void remove(Graphic graphic) {
        list.remove(graphic);
    }

    @Override
    public void draw() {
        // a logic can be more complex, drawing itself and etc

        for(Graphic g : list) {
            g.draw();
        }
    }
}

package com.alex.patterns.compositor.example;

public class Main {
    public static void main(String[] args) {
        GraphicComposite dots = new GraphicComposite();
        dots.add(new DotLeaf());
        dots.add(new DotLeaf());


        GraphicComposite circles = new GraphicComposite();
        circles.add(new CircleLeaf());
        circles.add(new CircleLeaf());


        GraphicComposite set = new GraphicComposite();
        set.add(dots);
        set.add(circles);

        // drawing all the components
        set.draw();
    }
}

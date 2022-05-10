package learning.handwriting.learners;

import learning.classifiers.Knn;
import learning.handwriting.core.Drawing;

public class Knn7 extends Knn<Drawing,String> {
    public Knn7() {
        super(7, (d1, d2) -> (double)d1.distance(d2));
    }
}

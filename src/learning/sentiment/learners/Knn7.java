package learning.sentiment.learners;

import learning.classifiers.Knn;
import learning.core.Histogram;

public class Knn7 extends Knn<Histogram<String>,String>  {
    public Knn7() {
        super(7, Histogram::cosineDistance);
    }
}

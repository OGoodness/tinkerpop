package com.tinkerpop.gremlin.process.graph.map;

import com.tinkerpop.gremlin.process.Traversal;
import com.tinkerpop.gremlin.process.graph.filter.FilterStep;
import com.tinkerpop.gremlin.process.util.Reversible;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public class IdentityStep<S> extends FilterStep<S> implements Reversible {

    public IdentityStep(final Traversal traversal) {
        super(traversal);
        this.setPredicate(traverser -> true);
    }
}

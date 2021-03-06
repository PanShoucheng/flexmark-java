package com.vladsch.flexmark.ext.gfm.tables;

import com.vladsch.flexmark.ast.CustomNode;
import com.vladsch.flexmark.util.sequence.BasedSequence;

/**
 * Body part of a {@link TableBlock} containing {@link TableRow TableRows}.
 */
public class TableBody extends CustomNode {
    @Override
    public BasedSequence[] getSegments() {
        return EMPTY_SEGMENTS;
    }

    public TableBody() {
    }

    public TableBody(BasedSequence chars) {
        super(chars);
    }
}

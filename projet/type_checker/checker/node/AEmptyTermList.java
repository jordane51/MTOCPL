/* This file was generated by SableCC (http://www.sablecc.org/). */

package checker.node;

import checker.analysis.*;

@SuppressWarnings("nls")
public final class AEmptyTermList extends PTermList
{

    public AEmptyTermList()
    {
        // Constructor
    }

    @Override
    public Object clone()
    {
        return new AEmptyTermList();
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEmptyTermList(this);
    }

    @Override
    public String toString()
    {
        return "";
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        throw new RuntimeException("Not a child.");
    }
}

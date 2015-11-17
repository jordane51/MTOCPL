/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.node;

import java.util.*;
import org.sablecc.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class ATokens extends PTokens
{
    private final LinkedList<PTokenDef> _tokenDefs_ = new LinkedList<PTokenDef>();

    public ATokens()
    {
        // Constructor
    }

    public ATokens(
        @SuppressWarnings("hiding") List<?> _tokenDefs_)
    {
        // Constructor
        setTokenDefs(_tokenDefs_);

    }

    @Override
    public Object clone()
    {
        return new ATokens(
            cloneList(this._tokenDefs_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATokens(this);
    }

    public LinkedList<PTokenDef> getTokenDefs()
    {
        return this._tokenDefs_;
    }

    public void setTokenDefs(List<?> list)
    {
        for(PTokenDef e : this._tokenDefs_)
        {
            e.parent(null);
        }
        this._tokenDefs_.clear();

        for(Object obj_e : list)
        {
            PTokenDef e = (PTokenDef) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._tokenDefs_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tokenDefs_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tokenDefs_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PTokenDef> i = this._tokenDefs_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PTokenDef) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}

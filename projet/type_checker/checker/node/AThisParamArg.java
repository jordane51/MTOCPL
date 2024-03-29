/* This file was generated by SableCC (http://www.sablecc.org/). */

package checker.node;

import checker.analysis.*;

@SuppressWarnings("nls")
public final class AThisParamArg extends PParamArg
{
    private TThis _this_;
    private TIdentifier _identifier_;

    public AThisParamArg()
    {
        // Constructor
    }

    public AThisParamArg(
        @SuppressWarnings("hiding") TThis _this_,
        @SuppressWarnings("hiding") TIdentifier _identifier_)
    {
        // Constructor
        setThis(_this_);

        setIdentifier(_identifier_);

    }

    @Override
    public Object clone()
    {
        return new AThisParamArg(
            cloneNode(this._this_),
            cloneNode(this._identifier_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAThisParamArg(this);
    }

    public TThis getThis()
    {
        return this._this_;
    }

    public void setThis(TThis node)
    {
        if(this._this_ != null)
        {
            this._this_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._this_ = node;
    }

    public TIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._this_)
            + toString(this._identifier_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._this_ == child)
        {
            this._this_ = null;
            return;
        }

        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._this_ == oldChild)
        {
            setThis((TThis) newChild);
            return;
        }

        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

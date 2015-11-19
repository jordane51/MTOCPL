/* This file was generated by SableCC (http://www.sablecc.org/). */

package checker.node;

import checker.analysis.*;

@SuppressWarnings("nls")
public final class AIdentParamArg extends PParamArg
{
    private TIdentifier _classname_;
    private TIdentifier _param_;

    public AIdentParamArg()
    {
        // Constructor
    }

    public AIdentParamArg(
        @SuppressWarnings("hiding") TIdentifier _classname_,
        @SuppressWarnings("hiding") TIdentifier _param_)
    {
        // Constructor
        setClassname(_classname_);

        setParam(_param_);

    }

    @Override
    public Object clone()
    {
        return new AIdentParamArg(
            cloneNode(this._classname_),
            cloneNode(this._param_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIdentParamArg(this);
    }

    public TIdentifier getClassname()
    {
        return this._classname_;
    }

    public void setClassname(TIdentifier node)
    {
        if(this._classname_ != null)
        {
            this._classname_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._classname_ = node;
    }

    public TIdentifier getParam()
    {
        return this._param_;
    }

    public void setParam(TIdentifier node)
    {
        if(this._param_ != null)
        {
            this._param_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._param_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._classname_)
            + toString(this._param_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._classname_ == child)
        {
            this._classname_ = null;
            return;
        }

        if(this._param_ == child)
        {
            this._param_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._classname_ == oldChild)
        {
            setClassname((TIdentifier) newChild);
            return;
        }

        if(this._param_ == oldChild)
        {
            setParam((TIdentifier) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

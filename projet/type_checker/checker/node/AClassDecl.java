/* This file was generated by SableCC (http://www.sablecc.org/). */

package checker.node;

import java.util.*;
import checker.analysis.*;

@SuppressWarnings("nls")
public final class AClassDecl extends PClassDecl
{
    private TTclass _tclass_;
    private TIdentifier _classname_;
    private TExtends _extends_;
    private TIdentifier _extendsname_;
    private TLBrace _lBrace_;
    private final LinkedList<PFieldDecl> _fieldDecl_ = new LinkedList<PFieldDecl>();
    private PConstructorDecl _constructorDecl_;
    private final LinkedList<PMethodDecl> _methodDecl_ = new LinkedList<PMethodDecl>();
    private TRBrace _rBrace_;

    public AClassDecl()
    {
        // Constructor
    }

    public AClassDecl(
        @SuppressWarnings("hiding") TTclass _tclass_,
        @SuppressWarnings("hiding") TIdentifier _classname_,
        @SuppressWarnings("hiding") TExtends _extends_,
        @SuppressWarnings("hiding") TIdentifier _extendsname_,
        @SuppressWarnings("hiding") TLBrace _lBrace_,
        @SuppressWarnings("hiding") List<PFieldDecl> _fieldDecl_,
        @SuppressWarnings("hiding") PConstructorDecl _constructorDecl_,
        @SuppressWarnings("hiding") List<PMethodDecl> _methodDecl_,
        @SuppressWarnings("hiding") TRBrace _rBrace_)
    {
        // Constructor
        setTclass(_tclass_);

        setClassname(_classname_);

        setExtends(_extends_);

        setExtendsname(_extendsname_);

        setLBrace(_lBrace_);

        setFieldDecl(_fieldDecl_);

        setConstructorDecl(_constructorDecl_);

        setMethodDecl(_methodDecl_);

        setRBrace(_rBrace_);

    }

    @Override
    public Object clone()
    {
        return new AClassDecl(
            cloneNode(this._tclass_),
            cloneNode(this._classname_),
            cloneNode(this._extends_),
            cloneNode(this._extendsname_),
            cloneNode(this._lBrace_),
            cloneList(this._fieldDecl_),
            cloneNode(this._constructorDecl_),
            cloneList(this._methodDecl_),
            cloneNode(this._rBrace_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAClassDecl(this);
    }

    public TTclass getTclass()
    {
        return this._tclass_;
    }

    public void setTclass(TTclass node)
    {
        if(this._tclass_ != null)
        {
            this._tclass_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tclass_ = node;
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

    public TExtends getExtends()
    {
        return this._extends_;
    }

    public void setExtends(TExtends node)
    {
        if(this._extends_ != null)
        {
            this._extends_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._extends_ = node;
    }

    public TIdentifier getExtendsname()
    {
        return this._extendsname_;
    }

    public void setExtendsname(TIdentifier node)
    {
        if(this._extendsname_ != null)
        {
            this._extendsname_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._extendsname_ = node;
    }

    public TLBrace getLBrace()
    {
        return this._lBrace_;
    }

    public void setLBrace(TLBrace node)
    {
        if(this._lBrace_ != null)
        {
            this._lBrace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lBrace_ = node;
    }

    public LinkedList<PFieldDecl> getFieldDecl()
    {
        return this._fieldDecl_;
    }

    public void setFieldDecl(List<PFieldDecl> list)
    {
        this._fieldDecl_.clear();
        this._fieldDecl_.addAll(list);
        for(PFieldDecl e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public PConstructorDecl getConstructorDecl()
    {
        return this._constructorDecl_;
    }

    public void setConstructorDecl(PConstructorDecl node)
    {
        if(this._constructorDecl_ != null)
        {
            this._constructorDecl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._constructorDecl_ = node;
    }

    public LinkedList<PMethodDecl> getMethodDecl()
    {
        return this._methodDecl_;
    }

    public void setMethodDecl(List<PMethodDecl> list)
    {
        this._methodDecl_.clear();
        this._methodDecl_.addAll(list);
        for(PMethodDecl e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public TRBrace getRBrace()
    {
        return this._rBrace_;
    }

    public void setRBrace(TRBrace node)
    {
        if(this._rBrace_ != null)
        {
            this._rBrace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rBrace_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tclass_)
            + toString(this._classname_)
            + toString(this._extends_)
            + toString(this._extendsname_)
            + toString(this._lBrace_)
            + toString(this._fieldDecl_)
            + toString(this._constructorDecl_)
            + toString(this._methodDecl_)
            + toString(this._rBrace_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tclass_ == child)
        {
            this._tclass_ = null;
            return;
        }

        if(this._classname_ == child)
        {
            this._classname_ = null;
            return;
        }

        if(this._extends_ == child)
        {
            this._extends_ = null;
            return;
        }

        if(this._extendsname_ == child)
        {
            this._extendsname_ = null;
            return;
        }

        if(this._lBrace_ == child)
        {
            this._lBrace_ = null;
            return;
        }

        if(this._fieldDecl_.remove(child))
        {
            return;
        }

        if(this._constructorDecl_ == child)
        {
            this._constructorDecl_ = null;
            return;
        }

        if(this._methodDecl_.remove(child))
        {
            return;
        }

        if(this._rBrace_ == child)
        {
            this._rBrace_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tclass_ == oldChild)
        {
            setTclass((TTclass) newChild);
            return;
        }

        if(this._classname_ == oldChild)
        {
            setClassname((TIdentifier) newChild);
            return;
        }

        if(this._extends_ == oldChild)
        {
            setExtends((TExtends) newChild);
            return;
        }

        if(this._extendsname_ == oldChild)
        {
            setExtendsname((TIdentifier) newChild);
            return;
        }

        if(this._lBrace_ == oldChild)
        {
            setLBrace((TLBrace) newChild);
            return;
        }

        for(ListIterator<PFieldDecl> i = this._fieldDecl_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PFieldDecl) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._constructorDecl_ == oldChild)
        {
            setConstructorDecl((PConstructorDecl) newChild);
            return;
        }

        for(ListIterator<PMethodDecl> i = this._methodDecl_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PMethodDecl) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._rBrace_ == oldChild)
        {
            setRBrace((TRBrace) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

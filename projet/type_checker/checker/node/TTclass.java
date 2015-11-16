/* This file was generated by SableCC (http://www.sablecc.org/). */

package checker.node;

import checker.analysis.*;

@SuppressWarnings("nls")
public final class TTclass extends Token
{
    public TTclass()
    {
        super.setText("class");
    }

    public TTclass(int line, int pos)
    {
        super.setText("class");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTclass(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTclass(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTclass text.");
    }
}
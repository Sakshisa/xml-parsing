package com.qa.pojo;

public class SchemaCheck
{
    private String xmlns;

    private Check[] Check;

    public String getXmlns ()
    
    {
        return xmlns;
    }

    public void setXmlns (String xmlns)
    {
        this.xmlns = xmlns;
    }

    public Check[] getCheck ()
    {
        return Check;
    }

    public void setCheck (Check[] Check)
    {
        this.Check = Check;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [xmlns = "+xmlns+", Check = "+Check+"]";
    }
}

package com.qa.pojo;

public class Payment
{
    private String RestaurantNumber;

    private String CheckID;

    private String Amount;

    private String PaymentType;

    private String TipAmount;

    private String SeqNumber;

    public String getRestaurantNumber ()
    {
        return RestaurantNumber;
    }

    public void setRestaurantNumber (String RestaurantNumber)
    {
        this.RestaurantNumber = RestaurantNumber;
    }

    public String getCheckID ()
    {
        return CheckID;
    }

    public void setCheckID (String CheckID)
    {
        this.CheckID = CheckID;
    }

    public String getAmount ()
    {
        return Amount;
    }

    public void setAmount (String Amount)
    {
        this.Amount = Amount;
    }

    public String getPaymentType ()
    {
        return PaymentType;
    }

    public void setPaymentType (String PaymentType)
    {
        this.PaymentType = PaymentType;
    }

    public String getTipAmount ()
    {
        return TipAmount;
    }

    public void setTipAmount (String TipAmount)
    {
        this.TipAmount = TipAmount;
    }

    public String getSeqNumber ()
    {
        return SeqNumber;
    }

    public void setSeqNumber (String SeqNumber)
    {
        this.SeqNumber = SeqNumber;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [RestaurantNumber = "+RestaurantNumber+", CheckID = "+CheckID+", Amount = "+Amount+", PaymentType = "+PaymentType+", TipAmount = "+TipAmount+", SeqNumber = "+SeqNumber+"]";
    }
}
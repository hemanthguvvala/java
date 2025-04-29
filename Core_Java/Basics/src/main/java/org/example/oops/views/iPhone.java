package org.example.oops.views;

import org.example.oops.model.Smartphone;

public class iPhone extends Smartphone {

    private int internalRamGB;

    public iPhone(){
        internalRamGB = super.getInternalRamGB();
    }

    @Override
    public int getInternalRamGB() {
        return internalRamGB;
    }

    @Override
    public void setInternalRamGB(int internalRamGB) {
        this.internalRamGB = internalRamGB;
    }
}

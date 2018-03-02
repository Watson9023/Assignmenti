package com.watson.collections;

import junit.framework.Assert;
import junit.framework.TestCase;

public class collectionsTest extends TestCase {

    collections collectionsObj = new collections();
    public void testSetVehicle() throws Exception {
        collectionsObj.setVehicle("Porshe","Cayenne GTS",2015);
        Assert.assertEquals(collectionsObj.getMeki()+collectionsObj.getModel() + collectionsObj.getYear(),"Porshe" +"Cayenne GTS" + 2015);
    }

    public void testSetMake() throws Exception {
        collectionsObj.setMake("VW");
        Assert.assertEquals("VW","VW");
    }

    public void testSetModel() throws Exception {
        collectionsObj.setModel("M3");
        Assert.assertEquals("M3","M3");
    }

    public void testSetYear() throws Exception {
        collectionsObj.setYear(2015);
        Assert.assertEquals(2015, 2015);
    }

    public void testGetMake() throws Exception {
        collectionsObj.setMake("VW");
        Assert.assertEquals("VW", collectionsObj.getMeki());
    }

    public void testGetYear() throws Exception {
        collectionsObj.setYear(2015);
        Assert.assertEquals(2015,collectionsObj.getYear());
    }

    public void testGetModel() throws Exception {
        collectionsObj.setModel("M3");
        Assert.assertEquals("M3", collectionsObj.getModel());
    }


}
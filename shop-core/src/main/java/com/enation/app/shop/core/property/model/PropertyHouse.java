package com.enation.app.shop.core.property.model;

import com.enation.framework.database.PrimaryKeyField;

public class PropertyHouse {

    private long house_id;
    private long community_id;
    private long unit_id;
    private long doornum_id;
    private long create_date;
    private double property_charges;
    private String community_name;
    private String unit_name;
    private String doornum;

    @PrimaryKeyField
    public long getHouse_id() {
        return house_id;
    }

    public void setHouse_id(long house_id) {
        this.house_id = house_id;
    }

    public long getCommunity_id() {
        return community_id;
    }

    public void setCommunity_id(long community_id) {
        this.community_id = community_id;
    }

    public long getUnit_id() {
        return unit_id;
    }

    public void setUnit_id(long unit_id) {
        this.unit_id = unit_id;
    }

    public long getDoornum_id() {
        return doornum_id;
    }

    public void setDoornum_id(long doornum_id) {
        this.doornum_id = doornum_id;
    }

    public long getCreate_date() {
        return create_date;
    }

    public void setCreate_date(long create_date) {
        this.create_date = create_date;
    }

    public double getProperty_charges() {
        return property_charges;
    }

    public void setProperty_charges(double property_charges) {
        this.property_charges = property_charges;
    }

    public String getCommunity_name() {
        return community_name;
    }

    public void setCommunity_name(String community_name) {
        this.community_name = community_name;
    }

    public String getUnit_name() {
        return unit_name;
    }

    public void setUnit_name(String unit_name) {
        this.unit_name = unit_name;
    }

    public String getDoornum() {
        return doornum;
    }

    public void setDoornum(String doornum) {
        this.doornum = doornum;
    }
}
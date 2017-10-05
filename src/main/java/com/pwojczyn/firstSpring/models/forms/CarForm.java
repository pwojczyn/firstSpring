package com.pwojczyn.firstSpring.models.forms;
//rok produkcji, model, marka.
public class CarForm {
    private String productionYear;
    private String model;
    private String mark;

    public CarForm(String productionYear, String model, String mark) {
        this.productionYear = productionYear;
        this.model = model;
        this.mark = mark;
    }

    public CarForm() {

    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}

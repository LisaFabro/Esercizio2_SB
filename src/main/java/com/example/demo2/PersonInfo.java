package com.example.demo2;

public class PersonInfo {
    public String name;
    public String province;
    public String phrase;
    public String sentence(String name, String province){
        return  "Ciao " + name + ", com'è il tempo in " + province + "?";
    }

    public PersonInfo(String name, String province){
        this.name=name;
        this.province=province;
        this.phrase=sentence(name, province);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPhrase() {
        return phrase;
    }
}

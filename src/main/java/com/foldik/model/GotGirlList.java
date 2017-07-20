package com.foldik.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class GotGirlList {

    private List<GotGirl> gotGirls;

    public GotGirlList() {
    }

    public GotGirlList(List<GotGirl> gotGirls) {
        this.gotGirls = gotGirls;
    }

    public List<GotGirl> getGotGirls() {
        return gotGirls;
    }

    public void setGotGirls(List<GotGirl> gotGirls) {
        this.gotGirls = gotGirls;
    }
}

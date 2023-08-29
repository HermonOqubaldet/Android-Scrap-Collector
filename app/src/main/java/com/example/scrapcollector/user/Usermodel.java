package com.example.scrapcollector.user;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.scrapcollector.R;

public class Usermodel{
    String up;
    String un;
    String ue;
    String ul;
    String unum;
    public Usermodel(){
    }

    public Usermodel(String up, String un, String ue, String ul, String unum) {
        this.up = up;
        this.un = un;
        this.ue = ue;
        this.ul = ul;
        this.unum = unum;
    }

    public String getUp() {
        return up;
    }

    public void setUp(String up) {
        this.up = up;
    }

    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public String getUe() {
        return ue;
    }

    public void setUe(String ue) {
        this.ue = ue;
    }

    public String getUl() {
        return ul;
    }

    public void setUl(String ul) {
        this.ul = ul;
    }

    public String getUnum() {
        return unum;
    }

    public void setUnum(String unum) {
        this.unum = unum;
    }
}
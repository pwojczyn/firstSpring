package com.pwojczyn.firstSpring.models.forms;

import org.apache.tomcat.util.codec.binary.Base64;

public class TextForm {
    private String text;

    public TextForm(String text) {
        this.text = text;
    }

    public TextForm() {

    }
    public String encodeText(String text){
        byte[] encodedBytes = Base64.encodeBase64(text.getBytes());

        return new String(encodedBytes);
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

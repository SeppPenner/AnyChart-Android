package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class ChartCredits extends JsObject {

    
    private String alt;

    public void setAlt(String alt) {
        this.alt = alt;
    }

    private String imgAlt;

    public void setImgalt(String imgAlt) {
        this.imgAlt = imgAlt;
    }

    private String type;
    private Boolean useCapture;

    public void setListen(String type, Boolean useCapture) {
        this.type = type;
        this.useCapture = useCapture;
    }

    private String type1;
    private Boolean useCapture1;

    public void setListenonce(String type1, Boolean useCapture1) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
        this.useCapture = null;
        this.useCapture1 = null;
        
        this.useCapture1 = useCapture1;
    }

    private String logoSrc;

    public void setLogosrc(String logoSrc) {
        this.logoSrc = logoSrc;
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
    }

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    private String type3;
    private Boolean useCapture2;

    public void setUnlisten(String type3, Boolean useCapture2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        
        this.type3 = type3;
        this.useCapture = null;
        this.useCapture1 = null;
        this.useCapture2 = null;
        
        this.useCapture2 = useCapture2;
    }

    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    private String generateJSalt() {
        if (alt != null) {
            return String.format(Locale.US, "alt: %s,", alt);
        }
        return "";
    }

    private String generateJSimgAlt() {
        if (imgAlt != null) {
            return String.format(Locale.US, "imgAlt: %s,", imgAlt);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", type);
        }
        return "";
    }

    private String generateJSuseCapture() {
        if (useCapture != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", type1);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
        }
        return "";
    }

    private String generateJSlogoSrc() {
        if (logoSrc != null) {
            return String.format(Locale.US, "logoSrc: %s,", logoSrc);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJStext() {
        if (text != null) {
            return String.format(Locale.US, "text: %s,", text);
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: %s,", type3);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
        }
        return "";
    }

    private String generateJSurl() {
        if (url != null) {
            return String.format(Locale.US, "url: %s,", url);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSalt());
        js.append(generateJSimgAlt());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJSlogoSrc());
        js.append(generateJStype2());
        js.append(generateJStext());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());
        js.append(generateJSurl());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
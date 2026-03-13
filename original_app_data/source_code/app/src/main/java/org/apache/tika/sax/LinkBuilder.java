package org.apache.tika.sax;

import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class LinkBuilder {
    private final String type;
    private final StringBuilder text = new StringBuilder();
    private String uri = "";
    private String title = "";
    private String rel = "";

    public LinkBuilder(String str) {
        this.type = str;
    }

    public void characters(char[] cArr, int i10, int i11) {
        this.text.append(cArr, i10, i11);
    }

    public Link getLink() {
        return getLink(false);
    }

    public String getType() {
        return this.type;
    }

    public void setRel(String str) {
        if (str != null) {
            this.rel = str;
        } else {
            this.rel = "";
        }
    }

    public void setTitle(String str) {
        if (str != null) {
            this.title = str;
        } else {
            this.title = "";
        }
    }

    public void setURI(String str) {
        if (str != null) {
            this.uri = str;
        } else {
            this.uri = "";
        }
    }

    public Link getLink(boolean z10) {
        String string = this.text.toString();
        if (z10) {
            string = string.replaceAll("\\s+", StringUtils.SPACE).trim();
        }
        return new Link(this.type, this.uri, this.title, string, this.rel);
    }
}

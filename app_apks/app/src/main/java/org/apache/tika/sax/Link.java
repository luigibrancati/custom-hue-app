package org.apache.tika.sax;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class Link {
    private final String rel;
    private final String text;
    private final String title;
    private final String type;
    private final String uri;

    public Link(String str, String str2, String str3, String str4) {
        this.type = str;
        this.uri = str2;
        this.title = str3;
        this.text = str4;
        this.rel = "";
    }

    public String getRel() {
        return this.rel;
    }

    public String getText() {
        return this.text;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public String getUri() {
        return this.uri;
    }

    public boolean isAnchor() {
        return "a".equals(this.type);
    }

    public boolean isIframe() {
        return "iframe".equals(this.type);
    }

    public boolean isImage() {
        return "img".equals(this.type);
    }

    public boolean isLink() {
        return "link".equals(this.type);
    }

    public boolean isScript() {
        return "script".equals(this.type);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (isImage()) {
            sb2.append("<img src=\"");
            sb2.append(this.uri);
            String str = this.title;
            if (str != null && str.length() > 0) {
                sb2.append("\" title=\"");
                sb2.append(this.title);
            }
            String str2 = this.text;
            if (str2 != null && str2.length() > 0) {
                sb2.append("\" alt=\"");
                sb2.append(this.text);
            }
            sb2.append("\"/>");
        } else {
            sb2.append("<");
            sb2.append(this.type);
            sb2.append(" href=\"");
            sb2.append(this.uri);
            String str3 = this.title;
            if (str3 != null && str3.length() > 0) {
                sb2.append("\" title=\"");
                sb2.append(this.title);
            }
            String str4 = this.rel;
            if (str4 != null && str4.length() > 0) {
                sb2.append("\" rel=\"");
                sb2.append(this.rel);
            }
            sb2.append("\">");
            sb2.append(this.text);
            sb2.append("</");
            sb2.append(this.type);
            sb2.append(">");
        }
        return sb2.toString();
    }

    public Link(String str, String str2, String str3, String str4, String str5) {
        this.type = str;
        this.uri = str2;
        this.title = str3;
        this.text = str4;
        this.rel = str5;
    }
}

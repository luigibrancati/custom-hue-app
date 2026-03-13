package org.apache.tika.sax.xpath;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class Matcher {
    public static final Matcher FAIL = new Matcher();

    public Matcher descend(String str, String str2) {
        return FAIL;
    }

    public boolean matchesAttribute(String str, String str2) {
        return false;
    }

    public boolean matchesElement() {
        return false;
    }

    public boolean matchesText() {
        return false;
    }
}

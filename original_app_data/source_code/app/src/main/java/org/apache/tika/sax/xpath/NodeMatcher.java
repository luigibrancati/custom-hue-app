package org.apache.tika.sax.xpath;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class NodeMatcher extends Matcher {
    public static final Matcher INSTANCE = new NodeMatcher();

    @Override // org.apache.tika.sax.xpath.Matcher
    public boolean matchesAttribute(String str, String str2) {
        return true;
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public boolean matchesElement() {
        return true;
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public boolean matchesText() {
        return true;
    }
}

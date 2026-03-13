package org.apache.tika.sax.xpath;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ChildMatcher extends Matcher {
    private final Matcher then;

    public ChildMatcher(Matcher matcher) {
        this.then = matcher;
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public Matcher descend(String str, String str2) {
        return this.then;
    }
}

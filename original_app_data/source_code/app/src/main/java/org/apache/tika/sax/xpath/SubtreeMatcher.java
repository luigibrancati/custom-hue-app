package org.apache.tika.sax.xpath;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class SubtreeMatcher extends Matcher {
    private final Matcher then;

    public SubtreeMatcher(Matcher matcher) {
        this.then = matcher;
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public Matcher descend(String str, String str2) {
        Matcher matcherDescend = this.then.descend(str, str2);
        return (matcherDescend == Matcher.FAIL || matcherDescend == this.then) ? this : new CompositeMatcher(matcherDescend, this);
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public boolean matchesAttribute(String str, String str2) {
        return this.then.matchesAttribute(str, str2);
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public boolean matchesElement() {
        return this.then.matchesElement();
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public boolean matchesText() {
        return this.then.matchesText();
    }
}

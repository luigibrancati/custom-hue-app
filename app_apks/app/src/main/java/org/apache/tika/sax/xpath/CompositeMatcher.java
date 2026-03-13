package org.apache.tika.sax.xpath;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class CompositeMatcher extends Matcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matcher f41605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matcher f41606b;

    public CompositeMatcher(Matcher matcher, Matcher matcher2) {
        this.f41605a = matcher;
        this.f41606b = matcher2;
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public Matcher descend(String str, String str2) {
        Matcher matcherDescend = this.f41605a.descend(str, str2);
        Matcher matcherDescend2 = this.f41606b.descend(str, str2);
        Matcher matcher = Matcher.FAIL;
        return matcherDescend == matcher ? matcherDescend2 : matcherDescend2 == matcher ? matcherDescend : (this.f41605a == matcherDescend && this.f41606b == matcherDescend2) ? this : new CompositeMatcher(matcherDescend, matcherDescend2);
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public boolean matchesAttribute(String str, String str2) {
        return this.f41605a.matchesAttribute(str, str2) || this.f41606b.matchesAttribute(str, str2);
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public boolean matchesElement() {
        return this.f41605a.matchesElement() || this.f41606b.matchesElement();
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public boolean matchesText() {
        return this.f41605a.matchesText() || this.f41606b.matchesText();
    }
}

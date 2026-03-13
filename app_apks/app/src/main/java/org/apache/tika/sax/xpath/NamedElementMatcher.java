package org.apache.tika.sax.xpath;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class NamedElementMatcher extends ChildMatcher {
    private final String name;
    private final String namespace;

    public NamedElementMatcher(String str, String str2, Matcher matcher) {
        super(matcher);
        this.namespace = str;
        this.name = str2;
    }

    @Override // org.apache.tika.sax.xpath.ChildMatcher, org.apache.tika.sax.xpath.Matcher
    public Matcher descend(String str, String str2) {
        return (Objects.equals(str, this.namespace) && str2.equals(this.name)) ? super.descend(str, str2) : Matcher.FAIL;
    }
}

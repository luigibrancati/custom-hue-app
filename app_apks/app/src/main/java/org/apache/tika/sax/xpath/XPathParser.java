package org.apache.tika.sax.xpath;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class XPathParser {
    private final Map<String, String> prefixes = new HashMap();

    public XPathParser() {
    }

    public void addPrefix(String str, String str2) {
        this.prefixes.put(str, str2);
    }

    public Matcher parse(String str) {
        if (str.equals("/text()")) {
            return TextMatcher.INSTANCE;
        }
        if (str.equals("/node()")) {
            return NodeMatcher.INSTANCE;
        }
        if (str.equals("/descendant::node()") || str.equals("/descendant:node()")) {
            return new CompositeMatcher(TextMatcher.INSTANCE, new ChildMatcher(new SubtreeMatcher(NodeMatcher.INSTANCE)));
        }
        if (str.equals("/@*")) {
            return AttributeMatcher.INSTANCE;
        }
        if (str.isEmpty()) {
            return ElementMatcher.INSTANCE;
        }
        String strSubstring = null;
        if (str.startsWith("/@")) {
            String strSubstring2 = str.substring(2);
            int iIndexOf = strSubstring2.indexOf(58);
            if (iIndexOf != -1) {
                strSubstring = strSubstring2.substring(0, iIndexOf);
                strSubstring2 = strSubstring2.substring(iIndexOf + 1);
            }
            return this.prefixes.containsKey(strSubstring) ? new NamedAttributeMatcher(this.prefixes.get(strSubstring), strSubstring2) : Matcher.FAIL;
        }
        if (str.startsWith("/*")) {
            return new ChildMatcher(parse(str.substring(2)));
        }
        if (str.startsWith("///")) {
            return Matcher.FAIL;
        }
        if (str.startsWith("//")) {
            return new SubtreeMatcher(parse(str.substring(1)));
        }
        if (!str.startsWith("/")) {
            return Matcher.FAIL;
        }
        int iIndexOf2 = str.indexOf(47, 1);
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.length();
        }
        String strSubstring3 = str.substring(1, iIndexOf2);
        int iIndexOf3 = strSubstring3.indexOf(58);
        if (iIndexOf3 != -1) {
            strSubstring = strSubstring3.substring(0, iIndexOf3);
            strSubstring3 = strSubstring3.substring(iIndexOf3 + 1);
        }
        return this.prefixes.containsKey(strSubstring) ? new NamedElementMatcher(this.prefixes.get(strSubstring), strSubstring3, parse(str.substring(iIndexOf2))) : Matcher.FAIL;
    }

    public XPathParser(String str, String str2) {
        addPrefix(str, str2);
    }
}

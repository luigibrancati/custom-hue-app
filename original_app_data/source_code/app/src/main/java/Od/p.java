package Od;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p {
    public static final k e(Matcher matcher, int i10, CharSequence charSequence) {
        if (matcher.find(i10)) {
            return new l(matcher, charSequence);
        }
        return null;
    }

    public static final k f(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new l(matcher, charSequence);
        }
        return null;
    }

    public static final Bc.f g(MatchResult matchResult) {
        return Bc.k.p(matchResult.start(), matchResult.end());
    }

    public static final Bc.f h(MatchResult matchResult, int i10) {
        return Bc.k.p(matchResult.start(i10), matchResult.end(i10));
    }
}

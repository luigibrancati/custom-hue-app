package p9;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X f42358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z f42359b;

    public N(X timeProvider, Z uuidGenerator) {
        AbstractC4862t.e(timeProvider, "timeProvider");
        AbstractC4862t.e(uuidGenerator, "uuidGenerator");
        this.f42358a = timeProvider;
        this.f42359b = uuidGenerator;
    }

    public final SessionDetails a(SessionDetails sessionDetails) {
        String firstSessionId;
        String strB = b();
        if (sessionDetails == null || (firstSessionId = sessionDetails.getFirstSessionId()) == null) {
            firstSessionId = strB;
        }
        return new SessionDetails(strB, firstSessionId, sessionDetails != null ? sessionDetails.getSessionIndex() + 1 : 0, this.f42358a.a().getUs());
    }

    public final String b() {
        String string = this.f42359b.next().toString();
        AbstractC4862t.d(string, "toString(...)");
        String lowerCase = Od.C.L(string, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        AbstractC4862t.d(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}

package nd;

import Od.C;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: nd.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC5174m {
    PLAIN { // from class: nd.m.b
        @Override // nd.EnumC5174m
        public String b(String string) {
            AbstractC4862t.e(string, "string");
            return string;
        }
    },
    HTML { // from class: nd.m.a
        @Override // nd.EnumC5174m
        public String b(String string) {
            AbstractC4862t.e(string, "string");
            return C.L(C.L(string, "<", "&lt;", false, 4, null), ">", "&gt;", false, 4, null);
        }
    };

    /* synthetic */ EnumC5174m(AbstractC4854k abstractC4854k) {
        this();
    }

    public abstract String b(String str);
}

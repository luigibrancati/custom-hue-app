package Rd;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.AbstractC4984a;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class L extends AbstractC4984a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15140b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15141a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements InterfaceC4992i.c {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public L(String str) {
        super(f15140b);
        this.f15141a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof L) && AbstractC4862t.a(this.f15141a, ((L) obj).f15141a);
    }

    public int hashCode() {
        return this.f15141a.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f15141a + ')';
    }
}

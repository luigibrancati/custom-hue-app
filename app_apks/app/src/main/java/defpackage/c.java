package defpackage;

import gc.C4205s;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f25516b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f25517a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final c a(List pigeonVar_list) {
            AbstractC4862t.e(pigeonVar_list, "pigeonVar_list");
            return new c((Boolean) pigeonVar_list.get(0));
        }

        public a() {
        }
    }

    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List a() {
        return C4205s.d(this.f25517a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return j.f38859a.a(a(), ((c) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return "IsEnabledMessage(enabled=" + this.f25517a + ")";
    }

    public c(Boolean bool) {
        this.f25517a = bool;
    }

    public /* synthetic */ c(Boolean bool, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? null : bool);
    }
}

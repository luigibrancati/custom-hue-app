package defpackage;

import gc.C4205s;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f32711b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f32712a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final d a(List pigeonVar_list) {
            AbstractC4862t.e(pigeonVar_list, "pigeonVar_list");
            return new d((Boolean) pigeonVar_list.get(0));
        }

        public a() {
        }
    }

    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Boolean a() {
        return this.f32712a;
    }

    public final List b() {
        return C4205s.d(this.f32712a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return j.f38859a.a(b(), ((d) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return "ToggleMessage(enable=" + this.f32712a + ")";
    }

    public d(Boolean bool) {
        this.f32712a = bool;
    }

    public /* synthetic */ d(Boolean bool, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? null : bool);
    }
}

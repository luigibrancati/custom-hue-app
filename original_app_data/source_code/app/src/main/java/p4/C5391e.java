package p4;

import gc.Q;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: p4.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5391e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f42193c;

    public C5391e() {
        this(null, null, null, 7, null);
    }

    public final String a() {
        return this.f42192b;
    }

    public final String b() {
        return this.f42191a;
    }

    public final Map c() {
        return this.f42193c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5391e)) {
            return false;
        }
        C5391e c5391e = (C5391e) obj;
        return AbstractC4862t.a(this.f42191a, c5391e.f42191a) && AbstractC4862t.a(this.f42192b, c5391e.f42192b) && AbstractC4862t.a(this.f42193c, c5391e.f42193c);
    }

    public int hashCode() {
        String str = this.f42191a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f42192b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f42193c.hashCode();
    }

    public String toString() {
        return "Identity(userId=" + ((Object) this.f42191a) + ", deviceId=" + ((Object) this.f42192b) + ", userProperties=" + this.f42193c + ')';
    }

    public C5391e(String str, String str2, Map userProperties) {
        AbstractC4862t.e(userProperties, "userProperties");
        this.f42191a = str;
        this.f42192b = str2;
        this.f42193c = userProperties;
    }

    public /* synthetic */ C5391e(String str, String str2, Map map, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? Q.i() : map);
    }
}

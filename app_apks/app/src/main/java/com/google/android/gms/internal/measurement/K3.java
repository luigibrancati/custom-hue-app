package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class K3 extends AbstractC3183e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f29250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J7.t f29251b;

    public K3(Context context, J7.t tVar) {
        this.f29250a = context;
        this.f29251b = tVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3183e4
    public final Context a() {
        return this.f29250a;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3183e4
    public final J7.t b() {
        return this.f29251b;
    }

    public final boolean equals(Object obj) {
        J7.t tVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3183e4) {
            AbstractC3183e4 abstractC3183e4 = (AbstractC3183e4) obj;
            if (this.f29250a.equals(abstractC3183e4.a()) && ((tVar = this.f29251b) != null ? tVar.equals(abstractC3183e4.b()) : abstractC3183e4.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f29250a.hashCode() ^ 1000003;
        J7.t tVar = this.f29251b;
        return (tVar == null ? 0 : tVar.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String string = this.f29250a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f29251b);
        StringBuilder sb2 = new StringBuilder(length + 45 + strValueOf.length() + 1);
        sb2.append("FlagsContext{context=");
        sb2.append(string);
        sb2.append(", hermeticFileOverrides=");
        sb2.append(strValueOf);
        sb2.append("}");
        return sb2.toString();
    }
}

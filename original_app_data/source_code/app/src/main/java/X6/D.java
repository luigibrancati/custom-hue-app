package X6;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final G f18200f;

    public D(C2416j3 c2416j3, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        G g10;
        AbstractC6056k.f(str2);
        AbstractC6056k.f(str3);
        this.f18195a = str2;
        this.f18196b = str3;
        this.f18197c = true == TextUtils.isEmpty(str) ? null : str;
        this.f18198d = j10;
        this.f18199e = j11;
        if (j11 != 0 && j11 > j10) {
            c2416j3.a().r().b("Event created with reverse previous/current timestamps. appId", C2542z2.x(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            g10 = new G(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    c2416j3.a().o().a("Param name can't be null");
                    it.remove();
                } else {
                    Object objS = c2416j3.C().s(next, bundle2.get(next));
                    if (objS == null) {
                        c2416j3.a().r().b("Param value can't be null", c2416j3.D().b(next));
                        it.remove();
                    } else {
                        c2416j3.C().A(bundle2, next, objS);
                    }
                }
            }
            g10 = new G(bundle2);
        }
        this.f18200f = g10;
    }

    public final D a(C2416j3 c2416j3, long j10) {
        return new D(c2416j3, this.f18197c, this.f18195a, this.f18196b, this.f18198d, j10, this.f18200f);
    }

    public final String toString() {
        String string = this.f18200f.toString();
        String str = this.f18195a;
        int length = String.valueOf(str).length();
        String str2 = this.f18196b;
        StringBuilder sb2 = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        sb2.append("Event{appId='");
        sb2.append(str);
        sb2.append("', name='");
        sb2.append(str2);
        sb2.append("', params=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }

    public D(C2416j3 c2416j3, String str, String str2, String str3, long j10, long j11, G g10) {
        AbstractC6056k.f(str2);
        AbstractC6056k.f(str3);
        AbstractC6056k.l(g10);
        this.f18195a = str2;
        this.f18196b = str3;
        this.f18197c = true == TextUtils.isEmpty(str) ? null : str;
        this.f18198d = j10;
        this.f18199e = j11;
        if (j11 != 0 && j11 > j10) {
            c2416j3.a().r().c("Event created with reverse previous/current timestamps. appId, name", C2542z2.x(str2), C2542z2.x(str3));
        }
        this.f18200f = g10;
    }
}

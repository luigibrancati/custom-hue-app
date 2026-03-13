package ve;

import Fe.InterfaceC0845g;
import kotlin.jvm.internal.AbstractC4862t;
import pe.D;
import pe.x;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f46053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0845g f46054d;

    public h(String str, long j10, InterfaceC0845g source) {
        AbstractC4862t.e(source, "source");
        this.f46052b = str;
        this.f46053c = j10;
        this.f46054d = source;
    }

    @Override // pe.D
    public long a() {
        return this.f46053c;
    }

    @Override // pe.D
    public x b() {
        String str = this.f46052b;
        if (str != null) {
            return x.f42891e.a(str);
        }
        return null;
    }

    @Override // pe.D
    public InterfaceC0845g c() {
        return this.f46054d;
    }
}

package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class Y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile InterfaceC3568l3 f30113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile AbstractC3597q2 f30114b;

    public final int a() {
        if (this.f30114b != null) {
            return ((C3585o2) this.f30114b).f30204c.length;
        }
        if (this.f30113a != null) {
            return this.f30113a.h();
        }
        return 0;
    }

    public final AbstractC3597q2 b() {
        if (this.f30114b != null) {
            return this.f30114b;
        }
        synchronized (this) {
            try {
                if (this.f30114b != null) {
                    return this.f30114b;
                }
                if (this.f30113a == null) {
                    this.f30114b = AbstractC3597q2.f30229b;
                } else {
                    this.f30114b = this.f30113a.e();
                }
                return this.f30114b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(InterfaceC3568l3 interfaceC3568l3) {
        if (this.f30113a != null) {
            return;
        }
        synchronized (this) {
            if (this.f30113a != null) {
                return;
            }
            try {
                this.f30113a = interfaceC3568l3;
                this.f30114b = AbstractC3597q2.f30229b;
            } catch (V2 unused) {
                this.f30113a = interfaceC3568l3;
                this.f30114b = AbstractC3597q2.f30229b;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y2)) {
            return false;
        }
        Y2 y22 = (Y2) obj;
        InterfaceC3568l3 interfaceC3568l3 = this.f30113a;
        InterfaceC3568l3 interfaceC3568l32 = y22.f30113a;
        if (interfaceC3568l3 == null && interfaceC3568l32 == null) {
            return b().equals(y22.b());
        }
        if (interfaceC3568l3 != null && interfaceC3568l32 != null) {
            return interfaceC3568l3.equals(interfaceC3568l32);
        }
        if (interfaceC3568l3 != null) {
            y22.c(interfaceC3568l3.g());
            return interfaceC3568l3.equals(y22.f30113a);
        }
        c(interfaceC3568l32.g());
        return this.f30113a.equals(interfaceC3568l32);
    }

    public int hashCode() {
        return 1;
    }
}

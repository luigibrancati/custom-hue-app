package x0;

import fc.InterfaceC4023f;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: x0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6281a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4023f f47233b;

    public C6281a(String str, InterfaceC4023f interfaceC4023f) {
        this.f47232a = str;
        this.f47233b = interfaceC4023f;
    }

    public final InterfaceC4023f a() {
        return this.f47233b;
    }

    public final String b() {
        return this.f47232a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6281a)) {
            return false;
        }
        C6281a c6281a = (C6281a) obj;
        return AbstractC4862t.a(this.f47232a, c6281a.f47232a) && AbstractC4862t.a(this.f47233b, c6281a.f47233b);
    }

    public int hashCode() {
        String str = this.f47232a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC4023f interfaceC4023f = this.f47233b;
        return iHashCode + (interfaceC4023f != null ? interfaceC4023f.hashCode() : 0);
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.f47232a + ", action=" + this.f47233b + ')';
    }
}

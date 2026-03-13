package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class T {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D f32185e = D.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC3722j f32186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public D f32187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile InterfaceC3717g0 f32188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile AbstractC3722j f32189d;

    public void a(InterfaceC3717g0 interfaceC3717g0) {
        if (this.f32188c != null) {
            return;
        }
        synchronized (this) {
            if (this.f32188c != null) {
                return;
            }
            try {
                if (this.f32186a != null) {
                    this.f32188c = (InterfaceC3717g0) interfaceC3717g0.getParserForType().a(this.f32186a, this.f32187b);
                    this.f32189d = this.f32186a;
                } else {
                    this.f32188c = interfaceC3717g0;
                    this.f32189d = AbstractC3722j.f32236b;
                }
            } catch (O unused) {
                this.f32188c = interfaceC3717g0;
                this.f32189d = AbstractC3722j.f32236b;
            }
        }
    }

    public int b() {
        if (this.f32189d != null) {
            return this.f32189d.size();
        }
        AbstractC3722j abstractC3722j = this.f32186a;
        if (abstractC3722j != null) {
            return abstractC3722j.size();
        }
        if (this.f32188c != null) {
            return this.f32188c.getSerializedSize();
        }
        return 0;
    }

    public InterfaceC3717g0 c(InterfaceC3717g0 interfaceC3717g0) {
        a(interfaceC3717g0);
        return this.f32188c;
    }

    public AbstractC3722j d() {
        if (this.f32189d != null) {
            return this.f32189d;
        }
        AbstractC3722j abstractC3722j = this.f32186a;
        if (abstractC3722j != null) {
            return abstractC3722j;
        }
        synchronized (this) {
            try {
                if (this.f32189d != null) {
                    return this.f32189d;
                }
                if (this.f32188c == null) {
                    this.f32189d = AbstractC3722j.f32236b;
                } else {
                    this.f32189d = this.f32188c.toByteString();
                }
                return this.f32189d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t10 = (T) obj;
        InterfaceC3717g0 interfaceC3717g0 = this.f32188c;
        InterfaceC3717g0 interfaceC3717g02 = t10.f32188c;
        return (interfaceC3717g0 == null && interfaceC3717g02 == null) ? d().equals(t10.d()) : (interfaceC3717g0 == null || interfaceC3717g02 == null) ? interfaceC3717g0 != null ? interfaceC3717g0.equals(t10.c(interfaceC3717g0.getDefaultInstanceForType())) : c(interfaceC3717g02.getDefaultInstanceForType()).equals(interfaceC3717g02) : interfaceC3717g0.equals(interfaceC3717g02);
    }

    public int hashCode() {
        return 1;
    }
}

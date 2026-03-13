package ie;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ie.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C4386h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4393o f37533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37534b;

    public C4386h(InterfaceC4393o writer) {
        AbstractC4862t.e(writer, "writer");
        this.f37533a = writer;
        this.f37534b = true;
    }

    public final boolean a() {
        return this.f37534b;
    }

    public void b() {
        this.f37534b = true;
    }

    public void c() {
        this.f37534b = false;
    }

    public void d() {
        this.f37534b = false;
    }

    public void e(byte b10) {
        this.f37533a.writeLong(b10);
    }

    public final void f(char c10) {
        this.f37533a.a(c10);
    }

    public void g(double d10) {
        this.f37533a.c(String.valueOf(d10));
    }

    public void h(float f10) {
        this.f37533a.c(String.valueOf(f10));
    }

    public void i(int i10) {
        this.f37533a.writeLong(i10);
    }

    public void j(long j10) {
        this.f37533a.writeLong(j10);
    }

    public final void k(String v10) {
        AbstractC4862t.e(v10, "v");
        this.f37533a.c(v10);
    }

    public void l(short s10) {
        this.f37533a.writeLong(s10);
    }

    public void m(boolean z10) {
        this.f37533a.c(String.valueOf(z10));
    }

    public void n(String value) {
        AbstractC4862t.e(value, "value");
        this.f37533a.b(value);
    }

    public final void o(boolean z10) {
        this.f37534b = z10;
    }

    public void p() {
    }

    public void q() {
    }
}

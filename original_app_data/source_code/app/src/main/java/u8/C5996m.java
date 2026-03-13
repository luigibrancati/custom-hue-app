package u8;

import q9.InterfaceC5510c;

/* JADX INFO: renamed from: u8.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5996m implements InterfaceC5510c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f45344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5995l f45345b;

    public C5996m(H h10, A8.g gVar) {
        this.f45344a = h10;
        this.f45345b = new C5995l(gVar);
    }

    @Override // q9.InterfaceC5510c
    public boolean a() {
        return this.f45344a.d();
    }

    @Override // q9.InterfaceC5510c
    public InterfaceC5510c.a b() {
        return InterfaceC5510c.a.CRASHLYTICS;
    }

    @Override // q9.InterfaceC5510c
    public void c(InterfaceC5510c.b bVar) {
        r8.g.f().b("App Quality Sessions session changed: " + bVar);
        this.f45345b.f(bVar.a());
    }

    public String d(String str) {
        return this.f45345b.c(str);
    }

    public void e(String str) {
        this.f45345b.g(str);
    }
}

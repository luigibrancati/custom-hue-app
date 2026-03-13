package c6;

import android.content.Context;
import l6.InterfaceC4957a;

/* JADX INFO: renamed from: c6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3078c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4957a f25805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4957a f25806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25807d;

    public C3078c(Context context, InterfaceC4957a interfaceC4957a, InterfaceC4957a interfaceC4957a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f25804a = context;
        if (interfaceC4957a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f25805b = interfaceC4957a;
        if (interfaceC4957a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f25806c = interfaceC4957a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f25807d = str;
    }

    @Override // c6.h
    public Context b() {
        return this.f25804a;
    }

    @Override // c6.h
    public String c() {
        return this.f25807d;
    }

    @Override // c6.h
    public InterfaceC4957a d() {
        return this.f25806c;
    }

    @Override // c6.h
    public InterfaceC4957a e() {
        return this.f25805b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f25804a.equals(hVar.b()) && this.f25805b.equals(hVar.e()) && this.f25806c.equals(hVar.d()) && this.f25807d.equals(hVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f25807d.hashCode() ^ ((((((this.f25804a.hashCode() ^ 1000003) * 1000003) ^ this.f25805b.hashCode()) * 1000003) ^ this.f25806c.hashCode()) * 1000003);
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f25804a + ", wallClock=" + this.f25805b + ", monotonicClock=" + this.f25806c + ", backendName=" + this.f25807d + "}";
    }
}

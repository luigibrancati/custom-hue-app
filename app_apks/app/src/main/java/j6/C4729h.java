package j6;

import android.content.Context;
import d6.AbstractC3833d;
import d6.InterfaceC3831b;
import ec.InterfaceC3978a;

/* JADX INFO: renamed from: j6.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4729h implements InterfaceC3831b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f39066a;

    public C4729h(InterfaceC3978a interfaceC3978a) {
        this.f39066a = interfaceC3978a;
    }

    public static C4729h a(InterfaceC3978a interfaceC3978a) {
        return new C4729h(interfaceC3978a);
    }

    public static String c(Context context) {
        return (String) AbstractC3833d.d(AbstractC4727f.b(context));
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.f39066a.get());
    }
}

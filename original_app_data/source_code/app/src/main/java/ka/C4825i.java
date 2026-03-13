package ka;

import android.content.ContentResolver;
import android.content.Context;
import ka.InterfaceC4817a;

/* JADX INFO: renamed from: ka.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4825i implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f39490a;

    public C4825i(X3.a aVar) {
        this.f39490a = aVar;
    }

    public static C4825i a(X3.a aVar) {
        return new C4825i(aVar);
    }

    public static ContentResolver c(Context context) {
        return (ContentResolver) W3.e.d(InterfaceC4817a.c.h(context));
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ContentResolver get() {
        return c((Context) this.f39490a.get());
    }
}

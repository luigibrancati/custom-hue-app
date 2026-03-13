package z1;

import androidx.lifecycle.InterfaceC2752h;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.lifecycle.Q;
import kotlin.jvm.internal.AbstractC4862t;
import y1.AbstractC6382a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f48702a = new f();

    public final AbstractC6382a a(Q owner) {
        AbstractC4862t.e(owner, "owner");
        return owner instanceof InterfaceC2752h ? ((InterfaceC2752h) owner).getDefaultViewModelCreationExtras() : AbstractC6382a.b.f48335c;
    }

    public final O.c b(Q owner) {
        AbstractC4862t.e(owner, "owner");
        return owner instanceof InterfaceC2752h ? ((InterfaceC2752h) owner).getDefaultViewModelProviderFactory() : C6499b.f48696b;
    }

    public final String c(Cc.d modelClass) {
        AbstractC4862t.e(modelClass, "modelClass");
        String strA = AbstractC6498a.a(modelClass);
        if (strA == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + strA;
    }

    public final N d() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}

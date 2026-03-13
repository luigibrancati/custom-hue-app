package S6;

import S6.C2197c;
import android.graphics.Bitmap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.zzbv;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class A extends zzbv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2197c.p f15382a;

    public A(C2197c c2197c, C2197c.p pVar) {
        this.f15382a = pVar;
        Objects.requireNonNull(c2197c);
    }

    @Override // T6.I
    public final void A3(IObjectWrapper iObjectWrapper) {
        this.f15382a.a((Bitmap) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // T6.I
    public final void G4(Bitmap bitmap) {
        this.f15382a.a(bitmap);
    }
}

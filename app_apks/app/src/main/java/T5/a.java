package T5;

import android.content.Context;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a extends lb.h {

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public boolean f16205J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, d.p pVar) {
        super(context, null, 0, 0, pVar, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147483630, null);
        AbstractC4862t.e(context, "context");
    }

    public final boolean getAllowDestroy() {
        return this.f16205J0;
    }

    @Override // lb.h, jb.AbstractC4755b
    public void h() {
        if (!this.f16205J0) {
            r.f16248c.a().e("ArManagedSceneView destroy() suppressed");
        } else {
            r.f16248c.a().e("ArManagedSceneView destroy()");
            super.h();
        }
    }

    @Override // jb.AbstractC4755b, android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        r.f16248c.a().e("ArManagedSceneView onAttachedToWindow");
        super.onAttachedToWindow();
    }

    @Override // jb.AbstractC4755b, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        r.f16248c.a().e("ArManagedSceneView onDetachedFromWindow");
        super.onDetachedFromWindow();
    }

    public final void setAllowDestroy(boolean z10) {
        this.f16205J0 = z10;
    }
}

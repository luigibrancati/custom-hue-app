package com.hiennv.flutter_callkit_incoming;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import io.sentry.protocol.FeatureFlag;
import k4.InterfaceC4797c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0011\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/SafeTarget;", "Lk4/c;", "", "notificationId", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "Lfc/H;", "onLoaded", "<init>", "(ILvc/l;)V", "Landroid/graphics/drawable/Drawable;", FeatureFlag.JsonKeys.RESULT, "onSuccess", "(Landroid/graphics/drawable/Drawable;)V", "placeholder", "onStart", "error", "onError", "I", "Lvc/l;", "", "isCancelled", "Z", "()Z", "setCancelled", "(Z)V", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class SafeTarget implements InterfaceC4797c {
    private boolean isCancelled;
    private final int notificationId;
    private final vc.l onLoaded;

    public SafeTarget(int i10, vc.l onLoaded) {
        AbstractC4862t.e(onLoaded, "onLoaded");
        this.notificationId = i10;
        this.onLoaded = onLoaded;
    }

    /* JADX INFO: renamed from: isCancelled, reason: from getter */
    public final boolean getIsCancelled() {
        return this.isCancelled;
    }

    @Override // k4.InterfaceC4797c
    public void onError(Drawable error) {
        InterfaceC4797c.a.a(this, error);
        Log.d("onError", "-");
    }

    @Override // k4.InterfaceC4797c
    public void onStart(Drawable placeholder) {
        InterfaceC4797c.a.b(this, placeholder);
        Log.d("onStart", "-");
    }

    @Override // k4.InterfaceC4797c
    public void onSuccess(Drawable result) {
        AbstractC4862t.e(result, "result");
        InterfaceC4797c.a.c(this, result);
        Log.d("onSuccess", "-");
        if (this.isCancelled) {
            return;
        }
        vc.l lVar = this.onLoaded;
        Bitmap bitmap = ((BitmapDrawable) result).getBitmap();
        AbstractC4862t.d(bitmap, "getBitmap(...)");
        lVar.invoke(bitmap);
    }

    public final void setCancelled(boolean z10) {
        this.isCancelled = z10;
    }
}

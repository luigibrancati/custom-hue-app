package Z0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f20086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20087c;

    public a(int i10, h hVar, int i11) {
        this.f20085a = i10;
        this.f20086b = hVar;
        this.f20087c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f20085a);
        this.f20086b.b0(this.f20087c, bundle);
    }
}

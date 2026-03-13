package X6;

import android.content.SharedPreferences;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class I2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N2 f18353e;

    public I2(N2 n22, String str, boolean z10) {
        Objects.requireNonNull(n22);
        this.f18353e = n22;
        AbstractC6056k.f(str);
        this.f18349a = str;
        this.f18350b = z10;
    }

    public final boolean a() {
        if (!this.f18351c) {
            this.f18351c = true;
            N2 n22 = this.f18353e;
            this.f18352d = n22.p().getBoolean(this.f18349a, this.f18350b);
        }
        return this.f18352d;
    }

    public final void b(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f18353e.p().edit();
        editorEdit.putBoolean(this.f18349a, z10);
        editorEdit.apply();
        this.f18352d = z10;
    }
}

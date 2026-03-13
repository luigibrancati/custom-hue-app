package X6;

import android.content.SharedPreferences;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class M2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f18412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N2 f18413d;

    public M2(N2 n22, String str, String str2) {
        Objects.requireNonNull(n22);
        this.f18413d = n22;
        AbstractC6056k.f(str);
        this.f18410a = str;
    }

    public final String a() {
        if (!this.f18411b) {
            this.f18411b = true;
            N2 n22 = this.f18413d;
            this.f18412c = n22.p().getString(this.f18410a, null);
        }
        return this.f18412c;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.f18413d.p().edit();
        editorEdit.putString(this.f18410a, str);
        editorEdit.apply();
        this.f18412c = str;
    }
}

package X6;

import android.content.SharedPreferences;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class K2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N2 f18385e;

    public K2(N2 n22, String str, long j10) {
        Objects.requireNonNull(n22);
        this.f18385e = n22;
        AbstractC6056k.f(str);
        this.f18381a = str;
        this.f18382b = j10;
    }

    public final long a() {
        if (!this.f18383c) {
            this.f18383c = true;
            N2 n22 = this.f18385e;
            this.f18384d = n22.p().getLong(this.f18381a, this.f18382b);
        }
        return this.f18384d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor editorEdit = this.f18385e.p().edit();
        editorEdit.putLong(this.f18381a, j10);
        editorEdit.apply();
        this.f18384d = j10;
    }
}

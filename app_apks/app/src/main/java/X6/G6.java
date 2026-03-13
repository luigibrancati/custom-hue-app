package X6;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class G6 implements B2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f18324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f18325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ R6 f18326c;

    public G6(R6 r62, String str, List list) {
        this.f18324a = str;
        this.f18325b = list;
        Objects.requireNonNull(r62);
        this.f18326c = r62;
    }

    @Override // X6.B2
    public final void a(String str, int i10, Throwable th, byte[] bArr, Map map) {
        this.f18326c.A(true, i10, th, bArr, this.f18324a, this.f18325b);
    }
}

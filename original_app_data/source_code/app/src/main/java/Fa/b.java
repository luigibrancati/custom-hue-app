package Fa;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteBuffer f3793c;

    public b(int i10, int i11, ByteBuffer buffer) {
        AbstractC4862t.e(buffer, "buffer");
        this.f3791a = i10;
        this.f3792b = i11;
        this.f3793c = buffer;
    }

    public final ByteBuffer a() {
        return this.f3793c;
    }

    public final int b() {
        return this.f3792b;
    }

    public final int c() {
        return this.f3791a;
    }
}

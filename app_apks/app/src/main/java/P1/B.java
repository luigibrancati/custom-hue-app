package P1;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class B implements J1.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f12549d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f12550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f12551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12552c;

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    static {
        /*
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1c
            java.lang.String r1 = "AFTB"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
        L1c:
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            P1.B.f12549d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.B.<clinit>():void");
    }

    public B(UUID uuid, byte[] bArr) {
        this(uuid, bArr, false);
    }

    public B(UUID uuid, byte[] bArr, boolean z10) {
        this.f12550a = uuid;
        this.f12551b = bArr;
        this.f12552c = z10;
    }
}

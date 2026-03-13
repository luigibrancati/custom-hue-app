package ma;

import java.util.UUID;

/* JADX INFO: renamed from: ma.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5035a extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f40230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40232c;

    public C5035a(String str, UUID uuid, int i10, int i11) {
        super(str);
        this.f40230a = uuid;
        this.f40231b = i10;
        this.f40232c = i11;
    }
}

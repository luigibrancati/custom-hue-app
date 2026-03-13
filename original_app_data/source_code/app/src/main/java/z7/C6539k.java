package z7;

import java.util.Set;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: z7.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6539k implements InterfaceC6541m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f48816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC6550v f48817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C6544p f48818c;

    public C6539k(C6544p c6544p, Set set, AbstractC6550v abstractC6550v) {
        this.f48818c = c6544p;
        this.f48816a = set;
        this.f48817b = abstractC6550v;
    }

    @Override // z7.InterfaceC6541m
    public final void a(ZipFile zipFile, Set set) {
        this.f48816a.addAll(C6544p.a(this.f48818c, set, this.f48817b, zipFile));
    }
}

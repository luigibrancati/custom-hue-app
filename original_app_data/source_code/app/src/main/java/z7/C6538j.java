package z7;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: z7.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6538j implements InterfaceC6541m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC6550v f48812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f48813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f48814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C6544p f48815d;

    public C6538j(C6544p c6544p, AbstractC6550v abstractC6550v, Set set, AtomicBoolean atomicBoolean) {
        this.f48815d = c6544p;
        this.f48812a = abstractC6550v;
        this.f48813b = set;
        this.f48814c = atomicBoolean;
    }

    @Override // z7.InterfaceC6541m
    public final void a(ZipFile zipFile, Set set) {
        this.f48815d.f(this.f48812a, set, new C6537i(this));
    }
}

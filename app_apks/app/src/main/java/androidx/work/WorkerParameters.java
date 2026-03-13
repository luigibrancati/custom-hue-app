package androidx.work;

import I3.E;
import I3.InterfaceC0881k;
import I3.Q;
import android.net.Network;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UUID f24711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f24712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f24713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f24714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Executor f24716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC4992i f24717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public S3.b f24718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Q f24719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public E f24720j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC0881k f24721k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f24722l;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f24723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f24724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Network f24725c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.f24723a = list;
            this.f24724b = list;
        }
    }

    public WorkerParameters(UUID uuid, b bVar, Collection collection, a aVar, int i10, int i11, Executor executor, InterfaceC4992i interfaceC4992i, S3.b bVar2, Q q10, E e10, InterfaceC0881k interfaceC0881k) {
        this.f24711a = uuid;
        this.f24712b = bVar;
        this.f24713c = new HashSet(collection);
        this.f24714d = aVar;
        this.f24715e = i10;
        this.f24722l = i11;
        this.f24716f = executor;
        this.f24717g = interfaceC4992i;
        this.f24718h = bVar2;
        this.f24719i = q10;
        this.f24720j = e10;
        this.f24721k = interfaceC0881k;
    }

    public Executor a() {
        return this.f24716f;
    }

    public InterfaceC0881k b() {
        return this.f24721k;
    }

    public UUID c() {
        return this.f24711a;
    }

    public b d() {
        return this.f24712b;
    }

    public InterfaceC4992i e() {
        return this.f24717g;
    }
}

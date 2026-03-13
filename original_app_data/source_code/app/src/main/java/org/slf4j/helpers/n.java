package org.slf4j.helpers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class n implements af.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f41631a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f41632b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedBlockingQueue f41633c = new LinkedBlockingQueue();

    @Override // af.a
    public synchronized af.c a(String str) {
        m mVar;
        mVar = (m) this.f41632b.get(str);
        if (mVar == null) {
            mVar = new m(str, this.f41633c, this.f41631a);
            this.f41632b.put(str, mVar);
        }
        return mVar;
    }

    public void b() {
        this.f41632b.clear();
        this.f41633c.clear();
    }

    public LinkedBlockingQueue c() {
        return this.f41633c;
    }

    public List d() {
        return new ArrayList(this.f41632b.values());
    }

    public void e() {
        this.f41631a = true;
    }
}

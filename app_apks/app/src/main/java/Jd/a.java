package Jd;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements Iterable, InterfaceC6184a {

    /* JADX INFO: renamed from: Jd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class AbstractC0110a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Cc.d f6394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6395b;

        public AbstractC0110a(Cc.d key, int i10) {
            AbstractC4862t.e(key, "key");
            this.f6394a = key;
            this.f6395b = i10;
        }

        public final Object a(a thisRef) {
            AbstractC4862t.e(thisRef, "thisRef");
            return thisRef.c().get(this.f6395b);
        }
    }

    public abstract c c();

    public abstract s d();

    public final boolean isEmpty() {
        return c().c() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return c().iterator();
    }
}

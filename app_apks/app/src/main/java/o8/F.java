package o8;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class F implements InterfaceC5234d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f41232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f41233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f41234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f41235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f41236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f41237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC5234d f41238g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements L8.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f41239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final L8.c f41240b;

        public a(Set set, L8.c cVar) {
            this.f41239a = set;
            this.f41240b = cVar;
        }

        @Override // L8.c
        public void d(L8.a aVar) {
            if (!this.f41239a.contains(aVar.b())) {
                throw new s(String.format("Attempting to publish an undeclared event %s.", aVar));
            }
            this.f41240b.d(aVar);
        }
    }

    public F(C5233c c5233c, InterfaceC5234d interfaceC5234d) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : c5233c.g()) {
            if (qVar.e()) {
                if (qVar.g()) {
                    hashSet4.add(qVar.c());
                } else {
                    hashSet.add(qVar.c());
                }
            } else if (qVar.d()) {
                hashSet3.add(qVar.c());
            } else if (qVar.g()) {
                hashSet5.add(qVar.c());
            } else {
                hashSet2.add(qVar.c());
            }
        }
        if (!c5233c.k().isEmpty()) {
            hashSet.add(E.b(L8.c.class));
        }
        this.f41232a = Collections.unmodifiableSet(hashSet);
        this.f41233b = Collections.unmodifiableSet(hashSet2);
        this.f41234c = Collections.unmodifiableSet(hashSet3);
        this.f41235d = Collections.unmodifiableSet(hashSet4);
        this.f41236e = Collections.unmodifiableSet(hashSet5);
        this.f41237f = c5233c.k();
        this.f41238g = interfaceC5234d;
    }

    @Override // o8.InterfaceC5234d
    public Set a(E e10) {
        if (this.f41235d.contains(e10)) {
            return this.f41238g.a(e10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Set<%s>.", e10));
    }

    @Override // o8.InterfaceC5234d
    public O8.b b(E e10) {
        if (this.f41233b.contains(e10)) {
            return this.f41238g.b(e10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<%s>.", e10));
    }

    @Override // o8.InterfaceC5234d
    public O8.a d(E e10) {
        if (this.f41234c.contains(e10)) {
            return this.f41238g.d(e10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Deferred<%s>.", e10));
    }

    @Override // o8.InterfaceC5234d
    public O8.b e(Class cls) {
        return b(E.b(cls));
    }

    @Override // o8.InterfaceC5234d
    public O8.b f(E e10) {
        if (this.f41236e.contains(e10)) {
            return this.f41238g.f(e10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", e10));
    }

    @Override // o8.InterfaceC5234d
    public Object g(E e10) {
        if (this.f41232a.contains(e10)) {
            return this.f41238g.g(e10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency %s.", e10));
    }

    @Override // o8.InterfaceC5234d
    public Object get(Class cls) {
        if (!this.f41232a.contains(E.b(cls))) {
            throw new s(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object obj = this.f41238g.get(cls);
        return !cls.equals(L8.c.class) ? obj : new a(this.f41237f, (L8.c) obj);
    }

    @Override // o8.InterfaceC5234d
    public O8.a h(Class cls) {
        return d(E.b(cls));
    }
}

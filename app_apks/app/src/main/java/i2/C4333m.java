package i2;

import F2.s;
import K7.AbstractC1081v;
import P2.C1842b;
import P2.C1845e;
import P2.C1848h;
import P2.C1850j;
import android.net.Uri;
import j2.C4678b;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import l2.C4874a;
import m2.C5008a;
import o2.C5199c;
import p2.C5385a;
import q2.C5479a;

/* JADX INFO: renamed from: i2.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4333m implements u {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f37007s = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f37008t = new a(new a.InterfaceC0485a() { // from class: i2.k
        @Override // i2.C4333m.a.InterfaceC0485a
        public final Constructor a() {
            return C4333m.l();
        }
    });

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f37009u = new a(new a.InterfaceC0485a() { // from class: i2.l
        @Override // i2.C4333m.a.InterfaceC0485a
        public final Constructor a() {
            return C4333m.m();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f37015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f37016h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f37017i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f37018j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f37020l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AbstractC1081v f37021m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f37025q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f37026r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f37019k = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f37022n = 112800;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public s.a f37024p = new F2.h();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f37023o = true;

    /* JADX INFO: renamed from: i2.m$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC0485a f37027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f37028b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Constructor f37029c;

        /* JADX INFO: renamed from: i2.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public interface InterfaceC0485a {
            Constructor a();
        }

        public a(InterfaceC0485a interfaceC0485a) {
            this.f37027a = interfaceC0485a;
        }

        public InterfaceC4336p a(Object... objArr) {
            Constructor constructorB = b();
            if (constructorB == null) {
                return null;
            }
            try {
                return (InterfaceC4336p) constructorB.newInstance(objArr);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating extractor", e10);
            }
        }

        public final Constructor b() {
            synchronized (this.f37028b) {
                if (this.f37028b.get()) {
                    return this.f37029c;
                }
                try {
                    return this.f37027a.a();
                } catch (ClassNotFoundException unused) {
                    this.f37028b.set(true);
                    return this.f37029c;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
        }
    }

    public static Constructor l() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC4336p.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    public static Constructor m() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(InterfaceC4336p.class).getConstructor(null);
    }

    @Override // i2.u
    public synchronized InterfaceC4336p[] d(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = f37007s;
            arrayList = new ArrayList(iArr.length);
            int iB = D1.l.b(map);
            if (iB != -1) {
                i(iB, arrayList);
            }
            int iC = D1.l.c(uri);
            if (iC != -1 && iC != iB) {
                i(iC, arrayList);
            }
            for (int i10 : iArr) {
                if (i10 != iB && i10 != iC) {
                    i(i10, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (InterfaceC4336p[]) arrayList.toArray(new InterfaceC4336p[0]);
    }

    @Override // i2.u
    public synchronized InterfaceC4336p[] f() {
        return d(Uri.EMPTY, new HashMap());
    }

    public final void i(int i10, List list) {
        switch (i10) {
            case 0:
                list.add(new C1842b());
                break;
            case 1:
                list.add(new C1845e());
                break;
            case 2:
                list.add(new C1848h(this.f37012d | (this.f37010b ? 1 : 0) | (this.f37011c ? 2 : 0)));
                break;
            case 3:
                list.add(new C4678b(this.f37013e | (this.f37010b ? 1 : 0) | (this.f37011c ? 2 : 0)));
                break;
            case 4:
                InterfaceC4336p interfaceC4336pA = f37008t.a(Integer.valueOf(this.f37014f));
                if (interfaceC4336pA == null) {
                    list.add(new n2.d(this.f37014f));
                } else {
                    list.add(interfaceC4336pA);
                }
                break;
            case 5:
                list.add(new C5199c());
                break;
            case 6:
                list.add(new A2.e(this.f37024p, this.f37015g | (this.f37023o ? 0 : 2)));
                break;
            case 7:
                list.add(new B2.f(this.f37018j | (this.f37010b ? 1 : 0) | (this.f37011c ? 2 : 0)));
                break;
            case 8:
                list.add(new C2.h(this.f37024p, this.f37017i | C2.h.h(this.f37025q) | (this.f37023o ? 0 : 32)));
                list.add(new C2.n(this.f37024p, this.f37016h | C2.n.s(this.f37025q) | (this.f37023o ? 0 : 16)));
                break;
            case 9:
                list.add(new D2.d());
                break;
            case 10:
                list.add(new P2.C());
                break;
            case 11:
                if (this.f37021m == null) {
                    this.f37021m = AbstractC1081v.z();
                }
                list.add(new P2.K(this.f37019k, !this.f37023o ? 1 : 0, this.f37024p, new G1.H(0L), new C1850j(this.f37020l, this.f37021m), this.f37022n));
                break;
            case 12:
                list.add(new Q2.b());
                break;
            case 14:
                list.add(new C5479a(this.f37026r));
                break;
            case 15:
                InterfaceC4336p interfaceC4336pA2 = f37009u.a(new Object[0]);
                if (interfaceC4336pA2 != null) {
                    list.add(interfaceC4336pA2);
                }
                break;
            case 16:
                list.add(new k2.b(!this.f37023o ? 1 : 0, this.f37024p));
                break;
            case 17:
                list.add(new E2.a());
                break;
            case 18:
                list.add(new R2.a());
                break;
            case 19:
                list.add(new C5008a());
                break;
            case 20:
                int i11 = this.f37016h;
                if ((i11 & 2) == 0 && (i11 & 4) == 0) {
                    list.add(new C5385a());
                    break;
                }
                break;
            case 21:
                list.add(new C4874a());
                break;
        }
    }

    @Override // i2.u
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public synchronized C4333m c(int i10) {
        this.f37025q = i10;
        return this;
    }

    @Override // i2.u
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public synchronized C4333m b(boolean z10) {
        this.f37023o = z10;
        return this;
    }

    public synchronized C4333m n(int i10) {
        this.f37026r = i10;
        return this;
    }

    @Override // i2.u
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public synchronized C4333m a(s.a aVar) {
        this.f37024p = aVar;
        return this;
    }
}

package b0;

import fc.C4015H;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4853j;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import wc.InterfaceC6184a;

/* JADX INFO: renamed from: b0.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2784h implements Set, InterfaceC6184a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2775F f24895a;

    /* JADX INFO: renamed from: b0.h$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.k implements vc.p {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f24896k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f24897l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f24898m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f24899n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f24900o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f24901p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f24902q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f24903r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f24904s;

        public a(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Nd.j jVar, InterfaceC4988e interfaceC4988e) {
            return ((a) create(jVar, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            a aVar = C2784h.this.new a(interfaceC4988e);
            aVar.f24904s = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0059 -> B:14:0x006a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0073 -> B:20:0x00a8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a5 -> B:21:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b8 -> B:26:0x00b9). Please report as a decompilation issue!!! */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = mc.C5046c.f()
                int r2 = r0.f24903r
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L32
                if (r2 != r5) goto L2a
                int r2 = r0.f24901p
                int r6 = r0.f24900o
                long r7 = r0.f24902q
                int r9 = r0.f24899n
                int r10 = r0.f24898m
                java.lang.Object r11 = r0.f24897l
                long[] r11 = (long[]) r11
                java.lang.Object r12 = r0.f24896k
                b0.h r12 = (b0.C2784h) r12
                java.lang.Object r13 = r0.f24904s
                Nd.j r13 = (Nd.j) r13
                fc.AbstractC4036s.b(r21)
                goto La8
            L2a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L32:
                fc.AbstractC4036s.b(r21)
                java.lang.Object r2 = r0.f24904s
                Nd.j r2 = (Nd.j) r2
                b0.h r6 = b0.C2784h.this
                b0.F r6 = b0.C2784h.c(r6)
                b0.h r7 = b0.C2784h.this
                long[] r6 = r6.f24838a
                int r8 = r6.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto Lbf
                r9 = 0
            L49:
                r10 = r6[r9]
                long r12 = ~r10
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto Lb8
                int r12 = r9 - r8
                int r12 = ~r12
                int r12 = r12 >>> 31
                int r12 = 8 - r12
                r13 = r2
                r2 = 0
                r18 = r10
                r11 = r6
                r10 = r8
                r6 = r12
                r12 = r7
                r7 = r18
            L6a:
                if (r2 >= r6) goto Lb0
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r7
                r16 = 128(0x80, double:6.3E-322)
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 >= 0) goto La8
                int r14 = r9 << 3
                int r14 = r14 + r2
                b0.u r15 = new b0.u
                b0.F r3 = b0.C2784h.c(r12)
                java.lang.Object[] r3 = r3.f24839b
                r3 = r3[r14]
                r17 = r4
                b0.F r4 = b0.C2784h.c(r12)
                java.lang.Object[] r4 = r4.f24840c
                r4 = r4[r14]
                r15.<init>(r3, r4)
                r0.f24904s = r13
                r0.f24896k = r12
                r0.f24897l = r11
                r0.f24898m = r10
                r0.f24899n = r9
                r0.f24902q = r7
                r0.f24900o = r6
                r0.f24901p = r2
                r0.f24903r = r5
                java.lang.Object r3 = r13.a(r15, r0)
                if (r3 != r1) goto Laa
                return r1
            La8:
                r17 = r4
            Laa:
                long r7 = r7 >> r17
                int r2 = r2 + r5
                r4 = r17
                goto L6a
            Lb0:
                r3 = r4
                if (r6 != r3) goto Lbf
                r8 = r10
                r6 = r11
                r7 = r12
                r2 = r13
                goto Lb9
            Lb8:
                r3 = r4
            Lb9:
                if (r9 == r8) goto Lbf
                int r9 = r9 + 1
                r4 = r3
                goto L49
            Lbf:
                fc.H r0 = fc.C4015H.f34254a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: b0.C2784h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C2784h(AbstractC2775F parent) {
        AbstractC4862t.e(parent, "parent");
        this.f24895a = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return d((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC4862t.e(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!AbstractC4862t.a(this.f24895a.d(entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    public boolean d(Map.Entry element) {
        AbstractC4862t.e(element, "element");
        return AbstractC4862t.a(this.f24895a.d(element.getKey()), element.getValue());
    }

    public int e() {
        return this.f24895a.f24842e;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f24895a.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return Nd.k.a(new a(null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC4853j.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC4862t.e(array, "array");
        return AbstractC4853j.b(this, array);
    }
}

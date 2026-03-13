package Oa;

import Oa.c;
import Ra.b;
import android.content.Context;
import android.media.AudioManager;
import fc.C4029l;
import fc.InterfaceC4028k;
import gc.C4179C;
import gc.C4185I;
import gc.C4206t;
import gc.C4207u;
import gc.InterfaceC4184H;
import gc.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import org.webrtc.MediaStreamTrack;
import vc.InterfaceC6082a;
import vc.l;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f12084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f12085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ra.b f12086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f12087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Oa.c f12088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Oa.c f12089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SortedSet f12090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Pa.b f12093j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Oa.d f12094k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f12083m = new b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final InterfaceC4028k f12082l = C4029l.b(C0157a.f12095a);

    /* JADX INFO: renamed from: Oa.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0157a extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0157a f12095a = new C0157a();

        public C0157a() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return C4206t.n(c.a.class, c.d.class, c.b.class, c.C0158c.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public b() {
        }

        public final List a() {
            return (List) a.f12082l.getValue();
        }

        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum c {
        STARTED,
        ACTIVATED,
        STOPPED
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d implements InterfaceC4184H {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable f12096a;

        public d(Iterable iterable) {
            this.f12096a = iterable;
        }

        @Override // gc.InterfaceC4184H
        public Object a(Object obj) {
            return (Class) obj;
        }

        @Override // gc.InterfaceC4184H
        public Iterator b() {
            return this.f12096a.iterator();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends v implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f12097a = new e();

        public e() {
            super(1);
        }

        public final boolean a(Oa.c cVar) {
            return cVar instanceof c.b;
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(a((Oa.c) obj));
        }
    }

    public a(Context context, AudioManager.OnAudioFocusChangeListener audioFocusChangeListener, Ra.b scanner, boolean z10, Pa.b logger, List preferredDeviceList, Oa.d audioDeviceManager) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(audioFocusChangeListener, "audioFocusChangeListener");
        AbstractC4862t.e(scanner, "scanner");
        AbstractC4862t.e(logger, "logger");
        AbstractC4862t.e(preferredDeviceList, "preferredDeviceList");
        AbstractC4862t.e(audioDeviceManager, "audioDeviceManager");
        this.f12093j = logger;
        this.f12094k = audioDeviceManager;
        this.f12085b = c.STOPPED;
        this.f12086c = scanner;
        this.f12091h = true;
        this.f12087d = l(preferredDeviceList);
        this.f12090g = new ConcurrentSkipListSet(new Qa.a(this.f12087d));
        this.f12093j.a("AudioSwitch", "AudioSwitch(1.2.0)");
        Pa.b bVar = this.f12093j;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Preferred device list = ");
        List list = this.f12087d;
        ArrayList arrayList = new ArrayList(C4207u.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Class) it.next()).getSimpleName());
        }
        sb2.append(arrayList);
        bVar.a("AudioSwitch", sb2.toString());
    }

    public static /* synthetic */ void s(a aVar, boolean z10, Oa.c cVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectAudioDevice");
        }
        if ((i10 & 2) != 0) {
            cVar = aVar.j();
        }
        aVar.r(z10, cVar);
    }

    public final void A(boolean z10) {
        this.f12091h = z10;
    }

    public final void B(List preferredDeviceList) {
        AbstractC4862t.e(preferredDeviceList, "preferredDeviceList");
        if (AbstractC4862t.a(preferredDeviceList, this.f12087d)) {
            return;
        }
        SortedSet sortedSet = this.f12090g;
        this.f12087d = l(preferredDeviceList);
        ConcurrentSkipListSet concurrentSkipListSet = new ConcurrentSkipListSet(new Qa.a(this.f12087d));
        this.f12090g = concurrentSkipListSet;
        concurrentSkipListSet.addAll(sortedSet);
        Pa.b bVar = this.f12093j;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("New preferred device list = ");
        List list = this.f12087d;
        ArrayList arrayList = new ArrayList(C4207u.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Class) it.next()).getSimpleName());
        }
        sb2.append(arrayList);
        bVar.a("AudioSwitch", sb2.toString());
        s(this, false, null, 2, null);
    }

    public final void C(Oa.c cVar) {
        this.f12088e = cVar;
    }

    public final boolean D() {
        int iG = g();
        return this.f12092i || iG == 3 || iG == 2;
    }

    public final void E(p listener) {
        AbstractC4862t.e(listener, "listener");
        this.f12084a = listener;
        if (Oa.b.f12098a[this.f12085b.ordinal()] != 1) {
            this.f12093j.a("AudioSwitch", "Redundant start() invocation while already in the started or activated state");
        } else {
            this.f12086c.b(this);
            this.f12085b = c.STARTED;
        }
    }

    @Override // Ra.b.a
    public void b(Oa.c audioDevice) {
        AbstractC4862t.e(audioDevice, "audioDevice");
        this.f12093j.a("AudioSwitch", "onDeviceConnected(" + audioDevice + ')');
        if ((audioDevice instanceof c.b) && h().contains(new c.d(null, 1, null))) {
            return;
        }
        boolean zAdd = this.f12090g.add(audioDevice);
        if (audioDevice instanceof c.d) {
            y.H(this.f12090g, e.f12097a);
        }
        s(this, zAdd, null, 2, null);
    }

    public final void d() {
        Oa.c cVar;
        int i10 = Oa.b.f12100c[this.f12085b.ordinal()];
        if (i10 == 1) {
            this.f12094k.a();
            this.f12094k.f(false);
            if (this.f12091h) {
                this.f12094k.j();
            }
            Oa.c cVar2 = this.f12089f;
            if (cVar2 != null) {
                cVar = D() ? cVar2 : null;
                if (cVar != null) {
                    p(cVar);
                }
            }
            this.f12085b = c.ACTIVATED;
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                throw new IllegalStateException();
            }
            return;
        }
        Oa.c cVar3 = this.f12089f;
        if (cVar3 != null) {
            cVar = D() ? cVar3 : null;
            if (cVar != null) {
                p(cVar);
            }
        }
    }

    public final void e() {
        if (Oa.b.f12101d[this.f12085b.ordinal()] != 1) {
            return;
        }
        q();
        this.f12094k.g();
        this.f12085b = c.STARTED;
    }

    public final Oa.d f() {
        return this.f12094k;
    }

    public final int g() {
        return this.f12094k.d();
    }

    public final List h() {
        return C4179C.V0(this.f12090g);
    }

    public final SortedSet i() {
        return this.f12090g;
    }

    public final Oa.c j() {
        Object next;
        Oa.c cVar = this.f12088e;
        if (cVar != null && this.f12086c.a(cVar)) {
            return cVar;
        }
        Iterator it = this.f12090g.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Oa.c it2 = (Oa.c) next;
            Ra.b bVar = this.f12086c;
            AbstractC4862t.d(it2, "it");
            if (bVar.a(it2)) {
                break;
            }
        }
        return (Oa.c) next;
    }

    public final Pa.b k() {
        return this.f12093j;
    }

    public final List l(List list) {
        if (!o(list)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!list.isEmpty()) {
            b bVar = f12083m;
            if (!AbstractC4862t.a(list, bVar.a())) {
                List listX0 = C4179C.X0(bVar.a());
                listX0.removeAll(list);
                int i10 = 0;
                for (Object obj : list) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        C4206t.u();
                    }
                    listX0.add(i10, (Class) obj);
                    i10 = i11;
                }
                return listX0;
            }
        }
        return f12083m.a();
    }

    public final Oa.c m() {
        return this.f12089f;
    }

    public final Oa.c n() {
        return this.f12088e;
    }

    public final boolean o(List list) {
        Map mapA = C4185I.a(new d(list));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapA.entrySet()) {
            if (((Number) entry.getValue()).intValue() > 1) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.isEmpty();
    }

    public abstract void p(Oa.c cVar);

    public abstract void q();

    public final void r(boolean z10, Oa.c cVar) {
        p pVar;
        if (AbstractC4862t.a(this.f12089f, cVar)) {
            if (!z10 || (pVar = this.f12084a) == null) {
                return;
            }
            return;
        }
        if (D()) {
            this.f12093j.a("AudioSwitch", "Current user selected AudioDevice = " + this.f12088e);
            this.f12089f = cVar;
            if (this.f12085b == c.ACTIVATED) {
                d();
            }
        }
        p pVar2 = this.f12084a;
        if (pVar2 != null) {
        }
    }

    public final void t(Oa.c cVar) {
        this.f12093j.a("AudioSwitch", "Selected AudioDevice = " + cVar);
        this.f12088e = cVar;
        r(false, cVar);
    }

    public final void u(int i10) {
        this.f12094k.h(i10);
    }

    public final void v(int i10) {
        this.f12094k.i(i10);
    }

    public final void w(int i10) {
        this.f12094k.k(i10);
    }

    public final void x(int i10) {
        this.f12094k.l(i10);
    }

    public final void y(int i10) {
        this.f12094k.m(i10);
    }

    public final void z(boolean z10) {
        this.f12092i = z10;
    }

    public /* synthetic */ a(Context context, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Ra.b bVar, boolean z10, Pa.b bVar2, List list, Oa.d dVar, int i10, AbstractC4854k abstractC4854k) {
        Oa.d dVar2;
        boolean z11 = (i10 & 8) != 0 ? true : z10;
        Pa.b cVar = (i10 & 16) != 0 ? new Pa.c(z11) : bVar2;
        if ((i10 & 64) != 0) {
            Pa.b bVar3 = cVar;
            Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            if (systemService != null) {
                dVar2 = new Oa.d(context, bVar3, (AudioManager) systemService, null, null, onAudioFocusChangeListener, 24, null);
                cVar = bVar3;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
            }
        } else {
            dVar2 = dVar;
        }
        this(context, onAudioFocusChangeListener, bVar, z11, cVar, list, dVar2);
    }
}

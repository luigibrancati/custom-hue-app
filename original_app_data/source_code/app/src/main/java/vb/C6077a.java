package vb;

import android.view.MotionEvent;
import com.google.android.filament.utils.Float2;
import gc.C4179C;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: vb.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C6077a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f45909k = new b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f45910l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC6082a f45911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f45912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f45913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f45914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f45915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f45916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f45917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f45918h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f45919i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f45920j;

    /* JADX INFO: renamed from: vb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface InterfaceC0627a {
    }

    /* JADX INFO: renamed from: vb.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: vb.a$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c NONE = new c("NONE", 0);
        public static final c ORBIT = new c("ORBIT", 1);
        public static final c PAN = new c("PAN", 2);
        public static final c ZOOM = new c("ZOOM", 3);

        static {
            c[] cVarArrA = a();
            $VALUES = cVarArrA;
            $ENTRIES = AbstractC5277b.a(cVarArrA);
        }

        public c(String str, int i10) {
        }

        public static final /* synthetic */ c[] a() {
            return new c[]{NONE, ORBIT, PAN, ZOOM};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* JADX INFO: renamed from: vb.a$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Float2 f45921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Float2 f45922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f45923c;

        public d(Float2 pt0, Float2 pt1, int i10) {
            AbstractC4862t.e(pt0, "pt0");
            AbstractC4862t.e(pt1, "pt1");
            this.f45921a = pt0;
            this.f45922b = pt1;
            this.f45923c = i10;
        }

        public final Float2 a() {
            Float2 float2 = this.f45921a;
            Float2 float22 = this.f45922b;
            return new Float2((float2.getX() * 0.5f) + (float22.getX() * 0.5f), (float2.getY() * 0.5f) + (float22.getY() * 0.5f));
        }

        public final float b() {
            Float2 float2 = this.f45921a;
            Float2 float22 = this.f45922b;
            Float2 float23 = new Float2(float2.getX() - float22.getX(), float2.getY() - float22.getY());
            return (float) Math.sqrt((float23.getX() * float23.getX()) + (float23.getY() * float23.getY()));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC4862t.a(this.f45921a, dVar.f45921a) && AbstractC4862t.a(this.f45922b, dVar.f45922b) && this.f45923c == dVar.f45923c;
        }

        public int hashCode() {
            return (((this.f45921a.hashCode() * 31) + this.f45922b.hashCode()) * 31) + Integer.hashCode(this.f45923c);
        }

        public String toString() {
            return "TouchPair(pt0=" + this.f45921a + ", pt1=" + this.f45922b + ", count=" + this.f45923c + ")";
        }

        public d() {
            this(new Float2(0.0f), new Float2(0.0f), 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public d(MotionEvent me2, int i10) {
            this();
            AbstractC4862t.e(me2, "me");
            if (me2.getPointerCount() >= 1) {
                Float2 float2 = new Float2(me2.getX(0), i10 - me2.getY(0));
                this.f45921a = float2;
                this.f45922b = float2;
                this.f45923c++;
            }
            if (me2.getPointerCount() >= 2) {
                this.f45922b = new Float2(me2.getX(1), i10 - me2.getY(1));
                this.f45923c++;
            }
        }
    }

    public C6077a(InterfaceC6082a viewHeight, InterfaceC0627a interfaceC0627a) {
        AbstractC4862t.e(viewHeight, "viewHeight");
        this.f45911a = viewHeight;
        this.f45912b = c.NONE;
        this.f45913c = new d();
        this.f45914d = new ArrayList();
        this.f45915e = new ArrayList();
        this.f45916f = new ArrayList();
        this.f45917g = 2;
        this.f45918h = 10;
        this.f45919i = 10;
        this.f45920j = true;
    }

    public final void a() {
        this.f45914d.clear();
        this.f45915e.clear();
        this.f45916f.clear();
        this.f45912b = c.NONE;
    }

    public final InterfaceC0627a b() {
        return null;
    }

    public final boolean c() {
        return this.f45915e.size() > this.f45917g;
    }

    public final boolean d() {
        if (this.f45920j && this.f45914d.size() > this.f45917g) {
            Float2 float2A = ((d) C4179C.h0(this.f45914d)).a();
            Float2 float2A2 = ((d) C4179C.s0(this.f45914d)).a();
            Float2 float2 = new Float2(float2A.getX() - float2A2.getX(), float2A.getY() - float2A2.getY());
            if (((float) Math.sqrt((float2.getX() * float2.getX()) + (float2.getY() * float2.getY()))) > this.f45918h) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        if (this.f45916f.size() <= this.f45917g) {
            return false;
        }
        return Math.abs(((d) C4179C.s0(this.f45916f)).b() - ((d) C4179C.h0(this.f45916f)).b()) > ((float) this.f45919i);
    }

    public final void f(MotionEvent event) {
        AbstractC4862t.e(event, "event");
        d dVar = new d(event, ((Number) this.f45911a.invoke()).intValue());
        int actionMasked = event.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if ((event.getPointerCount() != 1 && this.f45912b == c.ORBIT) || ((event.getPointerCount() != 2 && this.f45912b == c.PAN) || (event.getPointerCount() != 2 && this.f45912b == c.ZOOM))) {
                    a();
                    return;
                }
                c cVar = this.f45912b;
                c cVar2 = c.ZOOM;
                if (cVar == cVar2) {
                    this.f45913c.b();
                    dVar.b();
                    this.f45913c = dVar;
                    return;
                }
                if (cVar != c.NONE) {
                    return;
                }
                if (event.getPointerCount() == 1) {
                    this.f45915e.add(dVar);
                }
                if (event.getPointerCount() == 2) {
                    this.f45914d.add(dVar);
                    this.f45916f.add(dVar);
                }
                if (c()) {
                    this.f45912b = c.ORBIT;
                    return;
                }
                if (e()) {
                    this.f45912b = cVar2;
                    this.f45913c = dVar;
                    return;
                } else {
                    if (d()) {
                        this.f45912b = c.PAN;
                        return;
                    }
                    return;
                }
            }
            if (actionMasked != 3) {
                return;
            }
        }
        a();
    }

    public final void g(InterfaceC0627a interfaceC0627a) {
    }
}

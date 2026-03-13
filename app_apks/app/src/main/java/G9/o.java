package G9;

import E9.c;
import S6.C2197c;
import U6.AbstractC2277d;
import U6.C2276c;
import U6.C2291s;
import U6.r;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class o implements G9.a {
    private c.b mClickListener;
    private final E9.c mClusterManager;
    private c mClusterMarkerCache;
    private Set<? extends E9.a> mClusters;
    private ShapeDrawable mColoredCircleBackground;
    private final float mDensity;
    private final M9.b mIconGenerator;
    private c.InterfaceC0049c mInfoWindowClickListener;
    private c.d mInfoWindowLongClickListener;
    private c.e mItemClickListener;
    private c.f mItemInfoWindowClickListener;
    private c.g mItemInfoWindowLongClickListener;
    private final C2197c mMap;
    private c mMarkerCache;
    private final G9.o.g mViewModifier;
    private float mZoom;
    private static final int[] BUCKETS = {10, 20, 50, 100, 200, 500, 1000};
    private static final TimeInterpolator ANIMATION_INTERP = new DecelerateInterpolator();
    private final Executor mExecutor = Executors.newSingleThreadExecutor();
    private Set<e> mMarkers = Collections.newSetFromMap(new ConcurrentHashMap());
    private SparseArray<C2276c> mIcons = new SparseArray<>();
    private int mMinClusterSize = 4;
    private boolean mAnimate = true;
    private long mAnimationDurationMs = 300;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f4596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r f4597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LatLng f4598c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final LatLng f4599d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f4600e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public H9.b f4601f;

        public void a() {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(o.ANIMATION_INTERP);
            valueAnimatorOfFloat.setDuration(o.this.mAnimationDurationMs);
            valueAnimatorOfFloat.addUpdateListener(this);
            valueAnimatorOfFloat.addListener(this);
            valueAnimatorOfFloat.start();
        }

        public void b(H9.b bVar) {
            this.f4601f = bVar;
            this.f4600e = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f4600e) {
                o.this.mMarkerCache.d(this.f4597b);
                o.this.mClusterMarkerCache.d(this.f4597b);
                this.f4601f.d(this.f4597b);
            }
            this.f4596a.f4619b = this.f4599d;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (this.f4599d == null || this.f4598c == null || this.f4597b == null) {
                return;
            }
            float animatedFraction = valueAnimator.getAnimatedFraction();
            LatLng latLng = this.f4599d;
            double d10 = latLng.f30350a;
            LatLng latLng2 = this.f4598c;
            double d11 = latLng2.f30350a;
            double d12 = animatedFraction;
            double d13 = ((d10 - d11) * d12) + d11;
            double dSignum = latLng.f30351b - latLng2.f30351b;
            if (Math.abs(dSignum) > 180.0d) {
                dSignum -= Math.signum(dSignum) * 360.0d;
            }
            this.f4597b.n(new LatLng(d13, (dSignum * d12) + this.f4598c.f30351b));
        }

        public a(e eVar, LatLng latLng, LatLng latLng2) {
            this.f4596a = eVar;
            this.f4597b = eVar.f4618a;
            this.f4598c = latLng;
            this.f4599d = latLng2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final E9.a f4603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f4604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LatLng f4605c;

        public b(E9.a aVar, Set set, LatLng latLng) {
            this.f4603a = aVar;
            this.f4604b = set;
            this.f4605c = latLng;
        }

        public final void b(d dVar) {
            e eVar;
            e eVar2;
            if (o.this.shouldRenderAsCluster(this.f4603a)) {
                r rVarA = o.this.mClusterMarkerCache.a(this.f4603a);
                if (rVarA == null) {
                    C2291s c2291s = new C2291s();
                    LatLng position = this.f4605c;
                    if (position == null) {
                        position = this.f4603a.getPosition();
                    }
                    C2291s c2291sL = c2291s.L(position);
                    o.this.onBeforeClusterRendered(this.f4603a, c2291sL);
                    rVarA = o.this.mClusterManager.f().j(c2291sL);
                    o.this.mClusterMarkerCache.c(this.f4603a, rVarA);
                    eVar = new e(rVarA);
                    LatLng latLng = this.f4605c;
                    if (latLng != null) {
                        dVar.b(eVar, latLng, this.f4603a.getPosition());
                    }
                } else {
                    eVar = new e(rVarA);
                    o.this.onClusterUpdated(this.f4603a, rVarA);
                }
                o.this.onClusterRendered(this.f4603a, rVarA);
                this.f4604b.add(eVar);
                return;
            }
            for (E9.b bVar : this.f4603a.b()) {
                r rVarA2 = o.this.mMarkerCache.a(bVar);
                if (rVarA2 == null) {
                    C2291s c2291s2 = new C2291s();
                    LatLng latLng2 = this.f4605c;
                    if (latLng2 != null) {
                        c2291s2.L(latLng2);
                    } else {
                        c2291s2.L(bVar.getPosition());
                        if (bVar.getZIndex() != null) {
                            c2291s2.Q(bVar.getZIndex().floatValue());
                        }
                    }
                    o.this.onBeforeClusterItemRendered(bVar, c2291s2);
                    rVarA2 = o.this.mClusterManager.g().j(c2291s2);
                    eVar2 = new e(rVarA2);
                    o.this.mMarkerCache.c(bVar, rVarA2);
                    LatLng latLng3 = this.f4605c;
                    if (latLng3 != null) {
                        dVar.b(eVar2, latLng3, bVar.getPosition());
                    }
                } else {
                    eVar2 = new e(rVarA2);
                    o.this.onClusterItemUpdated(bVar, rVarA2);
                }
                o.this.onClusterItemRendered(bVar, rVarA2);
                this.f4604b.add(eVar2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map f4607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map f4608b;

        public r a(Object obj) {
            return (r) this.f4607a.get(obj);
        }

        public Object b(r rVar) {
            return this.f4608b.get(rVar);
        }

        public void c(Object obj, r rVar) {
            this.f4607a.put(obj, rVar);
            this.f4608b.put(rVar, obj);
        }

        public void d(r rVar) {
            Object obj = this.f4608b.get(rVar);
            this.f4608b.remove(rVar);
            this.f4607a.remove(obj);
        }

        public c() {
            this.f4607a = new HashMap();
            this.f4608b = new HashMap();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d extends Handler implements MessageQueue.IdleHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Lock f4609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Condition f4610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Queue f4611c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Queue f4612d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Queue f4613e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Queue f4614f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Queue f4615g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f4616h;

        public void a(boolean z10, b bVar) {
            this.f4609a.lock();
            sendEmptyMessage(0);
            if (z10) {
                this.f4612d.add(bVar);
            } else {
                this.f4611c.add(bVar);
            }
            this.f4609a.unlock();
        }

        public void b(e eVar, LatLng latLng, LatLng latLng2) {
            this.f4609a.lock();
            this.f4615g.add(new a(eVar, latLng, latLng2));
            this.f4609a.unlock();
        }

        public void c(e eVar, LatLng latLng, LatLng latLng2) {
            this.f4609a.lock();
            a aVar = new a(eVar, latLng, latLng2);
            aVar.b(o.this.mClusterManager.h());
            this.f4615g.add(aVar);
            this.f4609a.unlock();
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean d() {
            /*
                r1 = this;
                java.util.concurrent.locks.Lock r0 = r1.f4609a     // Catch: java.lang.Throwable -> L30
                r0.lock()     // Catch: java.lang.Throwable -> L30
                java.util.Queue r0 = r1.f4611c     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L32
                java.util.Queue r0 = r1.f4612d     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L32
                java.util.Queue r0 = r1.f4614f     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L32
                java.util.Queue r0 = r1.f4613e     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L32
                java.util.Queue r0 = r1.f4615g     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 != 0) goto L2e
                goto L32
            L2e:
                r0 = 0
                goto L33
            L30:
                r0 = move-exception
                goto L39
            L32:
                r0 = 1
            L33:
                java.util.concurrent.locks.Lock r1 = r1.f4609a
                r1.unlock()
                return r0
            L39:
                java.util.concurrent.locks.Lock r1 = r1.f4609a
                r1.unlock()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: G9.o.d.d():boolean");
        }

        public final void e() {
            if (!this.f4614f.isEmpty()) {
                g((r) this.f4614f.poll());
                return;
            }
            if (!this.f4615g.isEmpty()) {
                ((a) this.f4615g.poll()).a();
                return;
            }
            if (!this.f4612d.isEmpty()) {
                ((b) this.f4612d.poll()).b(this);
            } else if (!this.f4611c.isEmpty()) {
                ((b) this.f4611c.poll()).b(this);
            } else {
                if (this.f4613e.isEmpty()) {
                    return;
                }
                g((r) this.f4613e.poll());
            }
        }

        public void f(boolean z10, r rVar) {
            this.f4609a.lock();
            sendEmptyMessage(0);
            if (z10) {
                this.f4614f.add(rVar);
            } else {
                this.f4613e.add(rVar);
            }
            this.f4609a.unlock();
        }

        public final void g(r rVar) {
            o.this.mMarkerCache.d(rVar);
            o.this.mClusterMarkerCache.d(rVar);
            o.this.mClusterManager.h().d(rVar);
        }

        public void h() {
            while (d()) {
                sendEmptyMessage(0);
                this.f4609a.lock();
                try {
                    try {
                        if (d()) {
                            this.f4610b.await();
                        }
                    } catch (InterruptedException e10) {
                        throw new RuntimeException(e10);
                    }
                } finally {
                    this.f4609a.unlock();
                }
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (!this.f4616h) {
                Looper.myQueue().addIdleHandler(this);
                this.f4616h = true;
            }
            removeMessages(0);
            this.f4609a.lock();
            for (int i10 = 0; i10 < 10; i10++) {
                try {
                    e();
                } catch (Throwable th) {
                    this.f4609a.unlock();
                    throw th;
                }
            }
            if (d()) {
                sendEmptyMessageDelayed(0, 10L);
            } else {
                this.f4616h = false;
                Looper.myQueue().removeIdleHandler(this);
                this.f4610b.signalAll();
            }
            this.f4609a.unlock();
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }

        public d() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f4609a = reentrantLock;
            this.f4610b = reentrantLock.newCondition();
            this.f4611c = new LinkedList();
            this.f4612d = new LinkedList();
            this.f4613e = new LinkedList();
            this.f4614f = new LinkedList();
            this.f4615g = new LinkedList();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f4618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public LatLng f4619b;

        public boolean equals(Object obj) {
            if (obj instanceof e) {
                return this.f4618a.equals(((e) obj).f4618a);
            }
            return false;
        }

        public int hashCode() {
            return this.f4618a.hashCode();
        }

        public e(r rVar) {
            this.f4618a = rVar;
            this.f4619b = rVar.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f4620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Runnable f4621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public S6.i f4622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public K9.b f4623d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f4624e;

        public void a(Runnable runnable) {
            this.f4621b = runnable;
        }

        public void b(float f10) {
            this.f4624e = f10;
            this.f4623d = new K9.b(Math.pow(2.0d, Math.min(f10, o.this.mZoom)) * 256.0d);
        }

        public void c(S6.i iVar) {
            this.f4622c = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            LatLngBounds latLngBoundsA;
            ArrayList arrayList;
            o oVar = o.this;
            if (!oVar.shouldRender(oVar.y(oVar.mClusters), o.this.y(this.f4620a))) {
                this.f4621b.run();
                return;
            }
            ArrayList arrayList2 = null;
            d dVar = new d();
            float f10 = this.f4624e;
            boolean z10 = f10 > o.this.mZoom;
            float f11 = f10 - o.this.mZoom;
            Set<e> set = o.this.mMarkers;
            try {
                latLngBoundsA = this.f4622c.b().f16663e;
            } catch (Exception e10) {
                e10.printStackTrace();
                latLngBoundsA = LatLngBounds.d().b(new LatLng(0.0d, 0.0d)).a();
            }
            if (o.this.mClusters == null || !o.this.mAnimate) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (E9.a aVar : o.this.mClusters) {
                    if (o.this.shouldRenderAsCluster(aVar) && latLngBoundsA.e(aVar.getPosition())) {
                        arrayList.add(this.f4623d.b(aVar.getPosition()));
                    }
                }
            }
            Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            for (E9.a aVar2 : this.f4620a) {
                boolean zE = latLngBoundsA.e(aVar2.getPosition());
                if (z10 && zE && o.this.mAnimate) {
                    I9.b bVarX = o.this.x(arrayList, this.f4623d.b(aVar2.getPosition()));
                    if (bVarX != null) {
                        dVar.a(true, o.this.new b(aVar2, setNewSetFromMap, this.f4623d.a(bVarX)));
                    } else {
                        dVar.a(true, o.this.new b(aVar2, setNewSetFromMap, null));
                    }
                } else {
                    dVar.a(zE, o.this.new b(aVar2, setNewSetFromMap, null));
                }
            }
            dVar.h();
            set.removeAll(setNewSetFromMap);
            if (o.this.mAnimate) {
                arrayList2 = new ArrayList();
                for (E9.a aVar3 : this.f4620a) {
                    if (o.this.shouldRenderAsCluster(aVar3) && latLngBoundsA.e(aVar3.getPosition())) {
                        arrayList2.add(this.f4623d.b(aVar3.getPosition()));
                    }
                }
            }
            for (e eVar : set) {
                boolean zE2 = latLngBoundsA.e(eVar.f4619b);
                if (z10 || f11 <= -3.0f || !zE2 || !o.this.mAnimate) {
                    dVar.f(zE2, eVar.f4618a);
                } else {
                    I9.b bVarX2 = o.this.x(arrayList2, this.f4623d.b(eVar.f4619b));
                    if (bVarX2 != null) {
                        dVar.c(eVar, eVar.f4619b, this.f4623d.a(bVarX2));
                    } else {
                        dVar.f(true, eVar.f4618a);
                    }
                }
            }
            dVar.h();
            o.this.mMarkers = setNewSetFromMap;
            o.this.mClusters = this.f4620a;
            o.this.mZoom = f10;
            this.f4621b.run();
        }

        public f(Set set) {
            this.f4620a = set;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class g extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f4626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f f4627b;

        public final /* synthetic */ void b() {
            sendEmptyMessage(1);
        }

        public void c(Set set) {
            synchronized (this) {
                this.f4627b = new f(set);
            }
            sendEmptyMessage(0);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            f fVar;
            if (message.what == 1) {
                this.f4626a = false;
                if (this.f4627b != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (this.f4626a || this.f4627b == null) {
                return;
            }
            S6.i iVarM = o.this.mMap.m();
            synchronized (this) {
                fVar = this.f4627b;
                this.f4627b = null;
                this.f4626a = true;
            }
            fVar.a(new Runnable() { // from class: G9.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4629a.b();
                }
            });
            fVar.c(iVarM);
            fVar.b(o.this.mMap.i().f30343b);
            o.this.mExecutor.execute(fVar);
        }

        public g() {
            this.f4626a = false;
            this.f4627b = null;
        }
    }

    public o(Context context, C2197c c2197c, E9.c cVar) {
        this.mMarkerCache = new c();
        this.mClusterMarkerCache = new c();
        this.mViewModifier = new g();
        this.mMap = c2197c;
        this.mDensity = context.getResources().getDisplayMetrics().density;
        M9.b bVar = new M9.b(context);
        this.mIconGenerator = bVar;
        bVar.g(G(context));
        bVar.i(D9.d.f2326c);
        bVar.e(F());
        this.mClusterManager = cVar;
    }

    private LayerDrawable F() {
        this.mColoredCircleBackground = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.mColoredCircleBackground});
        int i10 = (int) (this.mDensity * 3.0f);
        layerDrawable.setLayerInset(1, i10, i10, i10, i10);
        return layerDrawable;
    }

    private M9.c G(Context context) {
        M9.c cVar = new M9.c(context);
        cVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        cVar.setId(D9.b.f2322a);
        int i10 = (int) (this.mDensity * 12.0f);
        cVar.setPadding(i10, i10, i10, i10);
        return cVar;
    }

    private static double w(I9.b bVar, I9.b bVar2) {
        double d10 = bVar.f5671a;
        double d11 = bVar2.f5671a;
        double d12 = (d10 - d11) * (d10 - d11);
        double d13 = bVar.f5672b;
        double d14 = bVar2.f5672b;
        return d12 + ((d13 - d14) * (d13 - d14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public I9.b x(List list, I9.b bVar) {
        I9.b bVar2 = null;
        if (list != null && !list.isEmpty()) {
            int iG = this.mClusterManager.e().g();
            double d10 = iG * iG;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                I9.b bVar3 = (I9.b) it.next();
                double dW = w(bVar3, bVar);
                if (dW < d10) {
                    bVar2 = bVar3;
                    d10 = dW;
                }
            }
        }
        return bVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set y(Set set) {
        return set != null ? Collections.unmodifiableSet(set) : Collections.EMPTY_SET;
    }

    public final /* synthetic */ boolean C(r rVar) {
        c.b bVar = this.mClickListener;
        return bVar != null && bVar.onClusterClick((E9.a) this.mClusterMarkerCache.b(rVar));
    }

    public int getBucket(E9.a aVar) {
        int size = aVar.getSize();
        int i10 = 0;
        if (size <= BUCKETS[0]) {
            return size;
        }
        while (true) {
            int[] iArr = BUCKETS;
            if (i10 >= iArr.length - 1) {
                return iArr[iArr.length - 1];
            }
            int i11 = i10 + 1;
            if (size < iArr[i11]) {
                return iArr[i10];
            }
            i10 = i11;
        }
    }

    public E9.a getCluster(r rVar) {
        return (E9.a) this.mClusterMarkerCache.b(rVar);
    }

    public E9.b getClusterItem(r rVar) {
        return (E9.b) this.mMarkerCache.b(rVar);
    }

    public String getClusterText(int i10) {
        if (i10 < BUCKETS[0]) {
            return String.valueOf(i10);
        }
        return i10 + "+";
    }

    public int getClusterTextAppearance(int i10) {
        return D9.d.f2326c;
    }

    public int getColor(int i10) {
        float fMin = 300.0f - Math.min(i10, 300.0f);
        return Color.HSVToColor(new float[]{((fMin * fMin) / 90000.0f) * 220.0f, 1.0f, 0.6f});
    }

    public C2276c getDescriptorForCluster(E9.a aVar) {
        int bucket = getBucket(aVar);
        C2276c c2276c = this.mIcons.get(bucket);
        if (c2276c != null) {
            return c2276c;
        }
        this.mColoredCircleBackground.getPaint().setColor(getColor(bucket));
        this.mIconGenerator.i(getClusterTextAppearance(bucket));
        C2276c c2276cD = AbstractC2277d.d(this.mIconGenerator.d(getClusterText(bucket)));
        this.mIcons.put(bucket, c2276cD);
        return c2276cD;
    }

    public r getMarker(E9.b bVar) {
        return this.mMarkerCache.a(bVar);
    }

    public int getMinClusterSize() {
        return this.mMinClusterSize;
    }

    @Override // G9.a
    public void onAdd() {
        this.mClusterManager.g().n(new C2197c.l() { // from class: G9.i
            @Override // S6.C2197c.l
            public final boolean onMarkerClick(r rVar) {
                return this.f4590a.z(rVar);
            }
        });
        this.mClusterManager.g().l(new C2197c.h() { // from class: G9.j
            @Override // S6.C2197c.h
            public final void onInfoWindowClick(r rVar) {
                this.f4591a.A(rVar);
            }
        });
        this.mClusterManager.g().m(new C2197c.i() { // from class: G9.k
            @Override // S6.C2197c.i
            public final void a(r rVar) {
                this.f4592a.B(rVar);
            }
        });
        this.mClusterManager.f().n(new C2197c.l() { // from class: G9.l
            @Override // S6.C2197c.l
            public final boolean onMarkerClick(r rVar) {
                return this.f4593a.C(rVar);
            }
        });
        this.mClusterManager.f().l(new C2197c.h() { // from class: G9.m
            @Override // S6.C2197c.h
            public final void onInfoWindowClick(r rVar) {
                this.f4594a.D(rVar);
            }
        });
        this.mClusterManager.f().m(new C2197c.i() { // from class: G9.n
            @Override // S6.C2197c.i
            public final void a(r rVar) {
                this.f4595a.E(rVar);
            }
        });
    }

    public void onBeforeClusterItemRendered(E9.b bVar, C2291s c2291s) {
        if (bVar.getTitle() != null && bVar.getSnippet() != null) {
            c2291s.O(bVar.getTitle());
            c2291s.N(bVar.getSnippet());
        } else if (bVar.getTitle() != null) {
            c2291s.O(bVar.getTitle());
        } else if (bVar.getSnippet() != null) {
            c2291s.O(bVar.getSnippet());
        }
        if (bVar.getZIndex() != null) {
            c2291s.Q(bVar.getZIndex().floatValue());
        }
    }

    public void onBeforeClusterRendered(E9.a aVar, C2291s c2291s) {
        Float zIndex;
        c2291s.B(getDescriptorForCluster(aVar));
        ArrayList arrayList = new ArrayList(aVar.b());
        if (arrayList.isEmpty() || (zIndex = ((E9.b) arrayList.get(0)).getZIndex()) == null) {
            return;
        }
        c2291s.Q(zIndex.floatValue());
    }

    public void onClusterItemUpdated(E9.b bVar, r rVar) {
        boolean z10 = true;
        boolean z11 = false;
        if (bVar.getTitle() == null || bVar.getSnippet() == null) {
            if (bVar.getSnippet() != null && !bVar.getSnippet().equals(rVar.d())) {
                rVar.q(bVar.getSnippet());
            } else if (bVar.getTitle() != null && !bVar.getTitle().equals(rVar.d())) {
                rVar.q(bVar.getTitle());
            }
            z11 = true;
        } else {
            if (!bVar.getTitle().equals(rVar.d())) {
                rVar.q(bVar.getTitle());
                z11 = true;
            }
            if (!bVar.getSnippet().equals(rVar.c())) {
                rVar.p(bVar.getSnippet());
                z11 = true;
            }
        }
        if (rVar.b().equals(bVar.getPosition())) {
            z10 = z11;
        } else {
            rVar.n(bVar.getPosition());
            if (bVar.getZIndex() != null) {
                rVar.s(bVar.getZIndex().floatValue());
            }
        }
        if (z10 && rVar.f()) {
            rVar.t();
        }
    }

    public void onClusterUpdated(E9.a aVar, r rVar) {
        rVar.l(getDescriptorForCluster(aVar));
    }

    @Override // G9.a
    public void onClustersChanged(Set<? extends E9.a> set) {
        this.mViewModifier.c(set);
    }

    @Override // G9.a
    public void onRemove() {
        this.mClusterManager.g().n(null);
        this.mClusterManager.g().l(null);
        this.mClusterManager.g().m(null);
        this.mClusterManager.f().n(null);
        this.mClusterManager.f().l(null);
        this.mClusterManager.f().m(null);
    }

    public void setAnimation(boolean z10) {
        this.mAnimate = z10;
    }

    public void setAnimationDuration(long j10) {
        this.mAnimationDurationMs = j10;
    }

    public void setMinClusterSize(int i10) {
        this.mMinClusterSize = i10;
    }

    @Override // G9.a
    public void setOnClusterClickListener(c.b bVar) {
        this.mClickListener = bVar;
    }

    @Override // G9.a
    public void setOnClusterItemClickListener(c.e eVar) {
        this.mItemClickListener = eVar;
    }

    public boolean shouldRender(Set<? extends E9.a> set, Set<? extends E9.a> set2) {
        return !set2.equals(set);
    }

    public boolean shouldRenderAsCluster(E9.a aVar) {
        return aVar.getSize() >= this.mMinClusterSize;
    }

    public final /* synthetic */ boolean z(r rVar) {
        c.e eVar = this.mItemClickListener;
        return eVar != null && eVar.onClusterItemClick((E9.b) this.mMarkerCache.b(rVar));
    }

    public r getMarker(E9.a aVar) {
        return this.mClusterMarkerCache.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(r rVar) {
    }

    public final /* synthetic */ void A(r rVar) {
    }

    public final /* synthetic */ void D(r rVar) {
    }

    public final /* synthetic */ void E(r rVar) {
    }

    @Override // G9.a
    public void setOnClusterInfoWindowClickListener(c.InterfaceC0049c interfaceC0049c) {
    }

    @Override // G9.a
    public void setOnClusterInfoWindowLongClickListener(c.d dVar) {
    }

    @Override // G9.a
    public void setOnClusterItemInfoWindowClickListener(c.f fVar) {
    }

    @Override // G9.a
    public void setOnClusterItemInfoWindowLongClickListener(c.g gVar) {
    }

    public void onClusterItemRendered(E9.b bVar, r rVar) {
    }

    public void onClusterRendered(E9.a aVar, r rVar) {
    }
}

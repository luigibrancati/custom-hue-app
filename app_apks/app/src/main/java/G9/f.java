package G9;

import E9.c;
import S6.C2197c;
import U6.AbstractC2277d;
import U6.C2274a;
import U6.C2275b;
import U6.C2276c;
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
public abstract class f implements G9.a {
    private c.b mClickListener;
    private final E9.c mClusterManager;
    private e mClusterMarkerCache;
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
    private e mMarkerCache;
    private final G9.f.i mViewModifier;
    private float mZoom;
    private static final int[] BUCKETS = {10, 20, 50, 100, 200, 500, 1000};
    private static final TimeInterpolator ANIMATION_INTERP = new DecelerateInterpolator();
    private final Executor mExecutor = Executors.newSingleThreadExecutor();
    private Set<g> mMarkers = Collections.newSetFromMap(new ConcurrentHashMap());
    private SparseArray<C2276c> mIcons = new SparseArray<>();
    private int mMinClusterSize = 4;
    private boolean mAnimate = true;
    private long mAnimationDurationMs = 300;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements C2197c.l {
        public a() {
        }

        @Override // S6.C2197c.l
        public boolean onMarkerClick(r rVar) {
            return f.this.mItemClickListener != null && f.this.mItemClickListener.onClusterItemClick((E9.b) f.this.mMarkerCache.b(rVar));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements C2197c.h {
        public b() {
        }

        @Override // S6.C2197c.h
        public void onInfoWindowClick(r rVar) {
            f.l(f.this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f4556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r f4557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LatLng f4558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final LatLng f4559d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f4560e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public H9.b f4561f;

        public void a() {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(f.ANIMATION_INTERP);
            valueAnimatorOfFloat.setDuration(f.this.mAnimationDurationMs);
            valueAnimatorOfFloat.addUpdateListener(this);
            valueAnimatorOfFloat.addListener(this);
            valueAnimatorOfFloat.start();
        }

        public void b(H9.b bVar) {
            this.f4561f = bVar;
            this.f4560e = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f4560e) {
                f.this.mMarkerCache.d(this.f4557b);
                f.this.mClusterMarkerCache.d(this.f4557b);
                this.f4561f.d(this.f4557b);
            }
            this.f4556a.f4579b = this.f4559d;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            LatLng latLng = this.f4559d;
            double d10 = latLng.f30350a;
            LatLng latLng2 = this.f4558c;
            double d11 = latLng2.f30350a;
            double d12 = animatedFraction;
            double d13 = ((d10 - d11) * d12) + d11;
            double dSignum = latLng.f30351b - latLng2.f30351b;
            if (Math.abs(dSignum) > 180.0d) {
                dSignum -= Math.signum(dSignum) * 360.0d;
            }
            this.f4557b.n(new LatLng(d13, (dSignum * d12) + this.f4558c.f30351b));
        }

        public c(g gVar, LatLng latLng, LatLng latLng2) {
            this.f4556a = gVar;
            this.f4557b = gVar.f4578a;
            this.f4558c = latLng;
            this.f4559d = latLng2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final E9.a f4563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f4564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LatLng f4565c;

        public d(E9.a aVar, Set set, LatLng latLng) {
            this.f4563a = aVar;
            this.f4564b = set;
            this.f4565c = latLng;
        }

        public final void b(HandlerC0074f handlerC0074f) {
            g gVar;
            g gVar2;
            if (f.this.shouldRenderAsCluster(this.f4563a)) {
                C2274a c2274a = (C2274a) f.this.mClusterMarkerCache.a(this.f4563a);
                if (c2274a == null) {
                    C2275b c2275b = new C2275b();
                    LatLng position = this.f4565c;
                    if (position == null) {
                        position = this.f4563a.getPosition();
                    }
                    C2275b c2275bL = c2275b.L(position);
                    f.this.onBeforeClusterRendered(this.f4563a, c2275bL);
                    c2274a = (C2274a) f.this.mClusterManager.f().i(c2275bL);
                    f.this.mClusterMarkerCache.c(this.f4563a, c2274a);
                    gVar = new g(c2274a);
                    LatLng latLng = this.f4565c;
                    if (latLng != null) {
                        handlerC0074f.b(gVar, latLng, this.f4563a.getPosition());
                    }
                } else {
                    gVar = new g(c2274a);
                    f.this.onClusterUpdated(this.f4563a, c2274a);
                }
                f.this.onClusterRendered(this.f4563a, c2274a);
                this.f4564b.add(gVar);
                return;
            }
            for (E9.b bVar : this.f4563a.b()) {
                C2274a c2274a2 = (C2274a) f.this.mMarkerCache.a(bVar);
                if (c2274a2 == null) {
                    C2275b c2275b2 = new C2275b();
                    LatLng latLng2 = this.f4565c;
                    if (latLng2 != null) {
                        c2275b2.L(latLng2);
                    } else {
                        c2275b2.L(bVar.getPosition());
                        if (bVar.getZIndex() != null) {
                            c2275b2.Q(bVar.getZIndex().floatValue());
                        }
                    }
                    f.this.onBeforeClusterItemRendered(bVar, c2275b2);
                    c2274a2 = (C2274a) f.this.mClusterManager.g().i(c2275b2);
                    gVar2 = new g(c2274a2);
                    f.this.mMarkerCache.c(bVar, c2274a2);
                    LatLng latLng3 = this.f4565c;
                    if (latLng3 != null) {
                        handlerC0074f.b(gVar2, latLng3, bVar.getPosition());
                    }
                } else {
                    gVar2 = new g(c2274a2);
                    f.this.onClusterItemUpdated(bVar, c2274a2);
                }
                f.this.onClusterItemRendered(bVar, c2274a2);
                this.f4564b.add(gVar2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map f4567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map f4568b;

        public r a(Object obj) {
            return (r) this.f4567a.get(obj);
        }

        public Object b(r rVar) {
            return this.f4568b.get(rVar);
        }

        public void c(Object obj, r rVar) {
            this.f4567a.put(obj, rVar);
            this.f4568b.put(rVar, obj);
        }

        public void d(r rVar) {
            Object obj = this.f4568b.get(rVar);
            this.f4568b.remove(rVar);
            this.f4567a.remove(obj);
        }

        public e() {
            this.f4567a = new HashMap();
            this.f4568b = new HashMap();
        }
    }

    /* JADX INFO: renamed from: G9.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class HandlerC0074f extends Handler implements MessageQueue.IdleHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Lock f4569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Condition f4570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Queue f4571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Queue f4572d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Queue f4573e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Queue f4574f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Queue f4575g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f4576h;

        public void a(boolean z10, d dVar) {
            this.f4569a.lock();
            sendEmptyMessage(0);
            if (z10) {
                this.f4572d.add(dVar);
            } else {
                this.f4571c.add(dVar);
            }
            this.f4569a.unlock();
        }

        public void b(g gVar, LatLng latLng, LatLng latLng2) {
            this.f4569a.lock();
            this.f4575g.add(new c(gVar, latLng, latLng2));
            this.f4569a.unlock();
        }

        public void c(g gVar, LatLng latLng, LatLng latLng2) {
            this.f4569a.lock();
            c cVar = new c(gVar, latLng, latLng2);
            cVar.b(f.this.mClusterManager.h());
            this.f4575g.add(cVar);
            this.f4569a.unlock();
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean d() {
            /*
                r1 = this;
                java.util.concurrent.locks.Lock r0 = r1.f4569a     // Catch: java.lang.Throwable -> L30
                r0.lock()     // Catch: java.lang.Throwable -> L30
                java.util.Queue r0 = r1.f4571c     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L32
                java.util.Queue r0 = r1.f4572d     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L32
                java.util.Queue r0 = r1.f4574f     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L32
                java.util.Queue r0 = r1.f4573e     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L32
                java.util.Queue r0 = r1.f4575g     // Catch: java.lang.Throwable -> L30
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
                java.util.concurrent.locks.Lock r1 = r1.f4569a
                r1.unlock()
                return r0
            L39:
                java.util.concurrent.locks.Lock r1 = r1.f4569a
                r1.unlock()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: G9.f.HandlerC0074f.d():boolean");
        }

        public final void e() {
            if (!this.f4574f.isEmpty()) {
                g((r) this.f4574f.poll());
                return;
            }
            if (!this.f4575g.isEmpty()) {
                ((c) this.f4575g.poll()).a();
                return;
            }
            if (!this.f4572d.isEmpty()) {
                ((d) this.f4572d.poll()).b(this);
            } else if (!this.f4571c.isEmpty()) {
                ((d) this.f4571c.poll()).b(this);
            } else {
                if (this.f4573e.isEmpty()) {
                    return;
                }
                g((r) this.f4573e.poll());
            }
        }

        public void f(boolean z10, r rVar) {
            this.f4569a.lock();
            sendEmptyMessage(0);
            if (z10) {
                this.f4574f.add(rVar);
            } else {
                this.f4573e.add(rVar);
            }
            this.f4569a.unlock();
        }

        public final void g(r rVar) {
            f.this.mMarkerCache.d(rVar);
            f.this.mClusterMarkerCache.d(rVar);
            f.this.mClusterManager.h().d(rVar);
        }

        public void h() {
            while (d()) {
                sendEmptyMessage(0);
                this.f4569a.lock();
                try {
                    try {
                        if (d()) {
                            this.f4570b.await();
                        }
                    } catch (InterruptedException e10) {
                        throw new RuntimeException(e10);
                    }
                } finally {
                    this.f4569a.unlock();
                }
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (!this.f4576h) {
                Looper.myQueue().addIdleHandler(this);
                this.f4576h = true;
            }
            removeMessages(0);
            this.f4569a.lock();
            for (int i10 = 0; i10 < 10; i10++) {
                try {
                    e();
                } catch (Throwable th) {
                    this.f4569a.unlock();
                    throw th;
                }
            }
            if (d()) {
                sendEmptyMessageDelayed(0, 10L);
            } else {
                this.f4576h = false;
                Looper.myQueue().removeIdleHandler(this);
                this.f4570b.signalAll();
            }
            this.f4569a.unlock();
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }

        public HandlerC0074f() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f4569a = reentrantLock;
            this.f4570b = reentrantLock.newCondition();
            this.f4571c = new LinkedList();
            this.f4572d = new LinkedList();
            this.f4573e = new LinkedList();
            this.f4574f = new LinkedList();
            this.f4575g = new LinkedList();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f4578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public LatLng f4579b;

        public boolean equals(Object obj) {
            if (obj instanceof g) {
                return this.f4578a.equals(((g) obj).f4578a);
            }
            return false;
        }

        public int hashCode() {
            return this.f4578a.hashCode();
        }

        public g(r rVar) {
            this.f4578a = rVar;
            this.f4579b = rVar.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f4580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Runnable f4581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public S6.i f4582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public K9.b f4583d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f4584e;

        public void a(Runnable runnable) {
            this.f4581b = runnable;
        }

        public void b(float f10) {
            this.f4584e = f10;
            this.f4583d = new K9.b(Math.pow(2.0d, Math.min(f10, f.this.mZoom)) * 256.0d);
        }

        public void c(S6.i iVar) {
            this.f4582c = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            LatLngBounds latLngBoundsA;
            ArrayList arrayList;
            f fVar = f.this;
            if (!fVar.shouldRender(fVar.y(fVar.mClusters), f.this.y(this.f4580a))) {
                this.f4581b.run();
                return;
            }
            ArrayList arrayList2 = null;
            HandlerC0074f handlerC0074f = new HandlerC0074f();
            float f10 = this.f4584e;
            boolean z10 = f10 > f.this.mZoom;
            float f11 = f10 - f.this.mZoom;
            Set<g> set = f.this.mMarkers;
            try {
                latLngBoundsA = this.f4582c.b().f16663e;
            } catch (Exception e10) {
                e10.printStackTrace();
                latLngBoundsA = LatLngBounds.d().b(new LatLng(0.0d, 0.0d)).a();
            }
            if (f.this.mClusters == null || !f.this.mAnimate) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (E9.a aVar : f.this.mClusters) {
                    if (f.this.shouldRenderAsCluster(aVar) && latLngBoundsA.e(aVar.getPosition())) {
                        arrayList.add(this.f4583d.b(aVar.getPosition()));
                    }
                }
            }
            Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            for (E9.a aVar2 : this.f4580a) {
                boolean zE = latLngBoundsA.e(aVar2.getPosition());
                if (z10 && zE && f.this.mAnimate) {
                    I9.b bVarX = f.this.x(arrayList, this.f4583d.b(aVar2.getPosition()));
                    if (bVarX != null) {
                        handlerC0074f.a(true, f.this.new d(aVar2, setNewSetFromMap, this.f4583d.a(bVarX)));
                    } else {
                        handlerC0074f.a(true, f.this.new d(aVar2, setNewSetFromMap, null));
                    }
                } else {
                    handlerC0074f.a(zE, f.this.new d(aVar2, setNewSetFromMap, null));
                }
            }
            handlerC0074f.h();
            set.removeAll(setNewSetFromMap);
            if (f.this.mAnimate) {
                arrayList2 = new ArrayList();
                for (E9.a aVar3 : this.f4580a) {
                    if (f.this.shouldRenderAsCluster(aVar3) && latLngBoundsA.e(aVar3.getPosition())) {
                        arrayList2.add(this.f4583d.b(aVar3.getPosition()));
                    }
                }
            }
            for (g gVar : set) {
                boolean zE2 = latLngBoundsA.e(gVar.f4579b);
                if (z10 || f11 <= -3.0f || !zE2 || !f.this.mAnimate) {
                    handlerC0074f.f(zE2, gVar.f4578a);
                } else {
                    I9.b bVarX2 = f.this.x(arrayList2, this.f4583d.b(gVar.f4579b));
                    if (bVarX2 != null) {
                        handlerC0074f.c(gVar, gVar.f4579b, this.f4583d.a(bVarX2));
                    } else {
                        handlerC0074f.f(true, gVar.f4578a);
                    }
                }
            }
            handlerC0074f.h();
            f.this.mMarkers = setNewSetFromMap;
            f.this.mClusters = this.f4580a;
            f.this.mZoom = f10;
            this.f4581b.run();
        }

        public h(Set set) {
            this.f4580a = set;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class i extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f4586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public h f4587b;

        public final /* synthetic */ void b() {
            sendEmptyMessage(1);
        }

        public void c(Set set) {
            synchronized (this) {
                this.f4587b = new h(set);
            }
            sendEmptyMessage(0);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            h hVar;
            if (message.what == 1) {
                this.f4586a = false;
                if (this.f4587b != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (this.f4586a || this.f4587b == null) {
                return;
            }
            S6.i iVarM = f.this.mMap.m();
            synchronized (this) {
                hVar = this.f4587b;
                this.f4587b = null;
                this.f4586a = true;
            }
            hVar.a(new Runnable() { // from class: G9.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4589a.b();
                }
            });
            hVar.c(iVarM);
            hVar.b(f.this.mMap.i().f30343b);
            f.this.mExecutor.execute(hVar);
        }

        public i() {
            this.f4586a = false;
            this.f4587b = null;
        }
    }

    public f(Context context, C2197c c2197c, E9.c cVar) {
        this.mMarkerCache = new e();
        this.mClusterMarkerCache = new e();
        this.mViewModifier = new i();
        this.mMap = c2197c;
        this.mDensity = context.getResources().getDisplayMetrics().density;
        M9.b bVar = new M9.b(context);
        this.mIconGenerator = bVar;
        bVar.g(E(context));
        bVar.i(D9.d.f2326c);
        bVar.e(D());
        this.mClusterManager = cVar;
    }

    public static /* bridge */ /* synthetic */ c.f l(f fVar) {
        fVar.getClass();
        return null;
    }

    public static double w(I9.b bVar, I9.b bVar2) {
        double d10 = bVar.f5671a;
        double d11 = bVar2.f5671a;
        double d12 = (d10 - d11) * (d10 - d11);
        double d13 = bVar.f5672b;
        double d14 = bVar2.f5672b;
        return d12 + ((d13 - d14) * (d13 - d14));
    }

    public final /* synthetic */ boolean A(r rVar) {
        c.b bVar = this.mClickListener;
        return bVar != null && bVar.onClusterClick((E9.a) this.mClusterMarkerCache.b(rVar));
    }

    public final LayerDrawable D() {
        this.mColoredCircleBackground = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.mColoredCircleBackground});
        int i10 = (int) (this.mDensity * 3.0f);
        layerDrawable.setLayerInset(1, i10, i10, i10, i10);
        return layerDrawable;
    }

    public final M9.c E(Context context) {
        M9.c cVar = new M9.c(context);
        cVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        cVar.setId(D9.b.f2322a);
        int i10 = (int) (this.mDensity * 12.0f);
        cVar.setPadding(i10, i10, i10, i10);
        return cVar;
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
        this.mClusterManager.g().n(new a());
        this.mClusterManager.g().l(new b());
        this.mClusterManager.g().m(new C2197c.i() { // from class: G9.b
            @Override // S6.C2197c.i
            public final void a(r rVar) {
                this.f4550a.z(rVar);
            }
        });
        this.mClusterManager.f().n(new C2197c.l() { // from class: G9.c
            @Override // S6.C2197c.l
            public final boolean onMarkerClick(r rVar) {
                return this.f4551a.A(rVar);
            }
        });
        this.mClusterManager.f().l(new C2197c.h() { // from class: G9.d
            @Override // S6.C2197c.h
            public final void onInfoWindowClick(r rVar) {
                this.f4552a.B(rVar);
            }
        });
        this.mClusterManager.f().m(new C2197c.i() { // from class: G9.e
            @Override // S6.C2197c.i
            public final void a(r rVar) {
                this.f4553a.C(rVar);
            }
        });
    }

    public abstract void onBeforeClusterItemRendered(E9.b bVar, C2275b c2275b);

    public void onBeforeClusterRendered(E9.a aVar, C2275b c2275b) {
        c2275b.B(getDescriptorForCluster(aVar));
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

    public void onClusterUpdated(E9.a aVar, C2274a c2274a) {
        c2274a.l(getDescriptorForCluster(aVar));
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

    public final I9.b x(List list, I9.b bVar) {
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

    public final Set y(Set set) {
        return set != null ? Collections.unmodifiableSet(set) : Collections.EMPTY_SET;
    }

    public r getMarker(E9.a aVar) {
        return this.mClusterMarkerCache.a(aVar);
    }

    public final /* synthetic */ void B(r rVar) {
    }

    public final /* synthetic */ void C(r rVar) {
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

    public final /* synthetic */ void z(r rVar) {
    }

    public void onClusterItemRendered(E9.b bVar, r rVar) {
    }

    public void onClusterRendered(E9.a aVar, r rVar) {
    }
}

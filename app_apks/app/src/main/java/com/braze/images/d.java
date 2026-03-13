package com.braze.images;

import android.content.Context;
import com.braze.support.BrazeLogger;
import fc.AbstractC4036s;
import fc.C4015H;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.m;
import vc.InterfaceC6082a;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d extends m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f27771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultBrazeImageLoader f27772b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, DefaultBrazeImageLoader defaultBrazeImageLoader, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27771a = context;
        this.f27772b = defaultBrazeImageLoader;
    }

    public static final String a() {
        return "Initializing disk cache";
    }

    public static final String b() {
        return "Disk cache initialized";
    }

    public static final String c() {
        return "Image loader was replaced. Disk cache shut down";
    }

    public static final String d() {
        return "Caught exception creating new disk cache. Unable to create new disk cache";
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new d(this.f27771a, this.f27772b, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return new d(this.f27771a, this.f27772b, (InterfaceC4988e) obj2).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        c cVar = DefaultBrazeImageLoader.Companion;
        Context context = this.f27771a;
        cVar.getClass();
        File fileA = c.a(context, "appboy.imageloader.lru.cache");
        ReentrantLock reentrantLock = this.f27772b.diskCacheLock;
        DefaultBrazeImageLoader defaultBrazeImageLoader = this.f27772b;
        reentrantLock.lock();
        try {
            try {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, DefaultBrazeImageLoader.TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: b5.x
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.images.d.a();
                    }
                }, 14, (Object) null);
                defaultBrazeImageLoader.diskLruCache = new a(fileA);
                if (defaultBrazeImageLoader.isOffline.get()) {
                    BrazeLogger.brazelog$default(brazeLogger, DefaultBrazeImageLoader.TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: b5.z
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.images.d.c();
                        }
                    }, 14, (Object) null);
                    a aVar = defaultBrazeImageLoader.diskLruCache;
                    if (aVar == null) {
                        AbstractC4862t.p("diskLruCache");
                        aVar = null;
                    }
                    aVar.a();
                } else {
                    BrazeLogger.brazelog$default(brazeLogger, DefaultBrazeImageLoader.TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: b5.y
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.images.d.b();
                        }
                    }, 14, (Object) null);
                    defaultBrazeImageLoader.isDiskCacheStarting = false;
                }
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DefaultBrazeImageLoader.TAG, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: b5.A
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.images.d.d();
                    }
                }, 8, (Object) null);
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
            return c4015h;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}

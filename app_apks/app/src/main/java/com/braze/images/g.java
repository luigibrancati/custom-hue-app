package com.braze.images;

import Rd.AbstractC2128g;
import Rd.C2123d0;
import Rd.J0;
import Rd.M;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.widget.ImageView;
import com.braze.R$string;
import com.braze.enums.BrazeViewBounds;
import com.braze.support.BrazeLogger;
import fc.AbstractC4036s;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.m;
import vc.InterfaceC6082a;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g extends m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f27778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DefaultBrazeImageLoader f27780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f27781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f27782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BrazeViewBounds f27783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ImageView f27784g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DefaultBrazeImageLoader defaultBrazeImageLoader, Context context, String str, BrazeViewBounds brazeViewBounds, ImageView imageView, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27780c = defaultBrazeImageLoader;
        this.f27781d = context;
        this.f27782e = str;
        this.f27783f = brazeViewBounds;
        this.f27784g = imageView;
    }

    public static final String a(String str) {
        return "Failed to retrieve bitmap from url: " + str;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new g(this.f27780c, this.f27781d, this.f27782e, this.f27783f, this.f27784g, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((M) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Bitmap bitmap;
        Object objF = C5046c.f();
        int i10 = this.f27779b;
        if (i10 == 0) {
            AbstractC4036s.b(obj);
            TrafficStats.setThreadStatsTag(1337);
            Bitmap bitmapFromUrl = this.f27780c.getBitmapFromUrl(this.f27781d, this.f27782e, this.f27783f);
            if (bitmapFromUrl == null) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                String str = DefaultBrazeImageLoader.TAG;
                final String str2 = this.f27782e;
                BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: b5.C
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.images.g.a(str2);
                    }
                }, 14, (Object) null);
            } else {
                String str3 = this.f27782e;
                Object tag = this.f27784g.getTag(R$string.com_braze_image_lru_cache_image_url_key);
                AbstractC4862t.c(tag, "null cannot be cast to non-null type kotlin.String");
                if (AbstractC4862t.a(str3, (String) tag)) {
                    J0 j0C = C2123d0.c();
                    e eVar = new e(this.f27784g, bitmapFromUrl, null);
                    this.f27778a = bitmapFromUrl;
                    this.f27779b = 1;
                    if (AbstractC2128g.g(j0C, eVar, this) == objF) {
                        return objF;
                    }
                    bitmap = bitmapFromUrl;
                }
            }
            return C4015H.f34254a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bitmap = this.f27778a;
        AbstractC4036s.b(obj);
        BrazeViewBounds brazeViewBounds = this.f27783f;
        ImageView imageView = this.f27784g;
        imageView.addOnLayoutChangeListener(new f(brazeViewBounds, imageView, bitmap));
        return C4015H.f34254a;
    }
}

package com.google.android.gms.internal.measurement;

import X6.AbstractC2352b3;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class O0 extends AbstractRunnableC3225j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f29294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f29295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C3323u1 f29296g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(C3323u1 c3323u1, Context context, Bundle bundle) {
        super(c3323u1, true);
        this.f29294e = context;
        this.f29295f = bundle;
        Objects.requireNonNull(c3323u1);
        this.f29296g = c3323u1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3225j1
    public final void a() {
        try {
            Context context = this.f29294e;
            AbstractC6056k.l(context);
            String strA = AbstractC2352b3.a(context);
            AbstractC6056k.l(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(strA)) {
                strA = AbstractC2352b3.a(context);
            }
            Boolean boolC = AbstractC2352b3.c("google_analytics_force_disable_updates", resources, strA);
            C3323u1 c3323u1 = this.f29296g;
            c3323u1.o(c3323u1.u(context, boolC == null || !boolC.booleanValue()));
            if (c3323u1.n() == null) {
                Log.w(c3323u1.l(), "Failed to connect to measurement client.");
                return;
            }
            int iA = DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
            ((InterfaceC3287q0) AbstractC6056k.l(c3323u1.n())).initialize(ObjectWrapper.wrap(context), new A0(133005L, Math.max(iA, r0), Boolean.TRUE.equals(boolC) || DynamiteModule.c(context, ModuleDescriptor.MODULE_ID) < iA, this.f29295f, AbstractC2352b3.a(context)), this.f29506a);
        } catch (Exception e10) {
            this.f29296g.k(e10, true, false);
        }
    }
}

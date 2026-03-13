package com.github.rmtmckenzie.native_device_orientation;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.Display;
import android.view.OrientationEventListener;
import com.github.rmtmckenzie.native_device_orientation.a;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class h implements com.github.rmtmckenzie.native_device_orientation.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f28916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a.InterfaceC0355a f28917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f28918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OrientationEventListener f28919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f28920e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends OrientationEventListener {
        public a(Context context, int i10) {
            super(context, i10);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            e eVarF = h.this.f(i10);
            if (eVarF.equals(h.this.f28920e)) {
                return;
            }
            h.this.f28920e = eVarF;
            h.this.f28917b.a(eVarF);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum b {
        normal(3),
        ui(2),
        game(1),
        fastest(0);

        final int nativeValue;

        b(int i10) {
            this.nativeValue = i10;
        }
    }

    public h(Activity activity, a.InterfaceC0355a interfaceC0355a, b bVar) {
        this.f28920e = null;
        this.f28916a = activity;
        this.f28917b = interfaceC0355a;
        this.f28918c = bVar;
    }

    @Override // com.github.rmtmckenzie.native_device_orientation.a
    public void a() {
        OrientationEventListener orientationEventListener = this.f28919d;
        if (orientationEventListener == null) {
            return;
        }
        orientationEventListener.disable();
        this.f28919d = null;
    }

    @Override // com.github.rmtmckenzie.native_device_orientation.a
    public void b() {
        if (this.f28919d != null) {
            this.f28917b.a(this.f28920e);
            return;
        }
        a aVar = new a(this.f28916a, this.f28918c.nativeValue);
        this.f28919d = aVar;
        if (aVar.canDetectOrientation()) {
            this.f28919d.enable();
        }
    }

    public e f(int i10) {
        if (i10 == -1) {
            return e.Unknown;
        }
        int i11 = i10 + 45;
        if (g() == 2) {
            i11 = i10 + 135;
        }
        int i12 = (i11 % 360) / 90;
        return i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? e.Unknown : e.LandscapeLeft : e.PortraitDown : e.LandscapeRight : e.PortraitUp;
    }

    public int g() {
        Configuration configuration = this.f28916a.getResources().getConfiguration();
        Display display = this.f28916a.getDisplay();
        Objects.requireNonNull(display);
        int rotation = display.getRotation();
        return (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? 2 : 1;
    }

    public h(Activity activity, a.InterfaceC0355a interfaceC0355a) {
        this(activity, interfaceC0355a, b.ui);
    }
}

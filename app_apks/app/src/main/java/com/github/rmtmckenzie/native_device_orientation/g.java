package com.github.rmtmckenzie.native_device_orientation;

import android.app.Activity;
import android.view.Display;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class g {
    public e a(Activity activity) {
        Display display = activity.getDisplay();
        Objects.requireNonNull(display);
        int rotation = display.getRotation();
        int i10 = activity.getResources().getConfiguration().orientation;
        return i10 != 1 ? i10 != 2 ? e.Unknown : (rotation == 0 || rotation == 1) ? e.LandscapeLeft : e.LandscapeRight : (rotation == 0 || rotation == 1) ? e.PortraitUp : e.PortraitDown;
    }
}

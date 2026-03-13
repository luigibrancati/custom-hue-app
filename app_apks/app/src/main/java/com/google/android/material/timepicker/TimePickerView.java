package com.google.android.material.timepicker;

import Y0.E;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ClockHandView f30995A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ClockFaceView f30996B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final MaterialButtonToggleGroup f30997C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final View.OnClickListener f30998D;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Chip f30999y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Chip f31000z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.t(TimePickerView.this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements MaterialButtonToggleGroup.d {
        public b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10) {
            TimePickerView.u(TimePickerView.this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends GestureDetector.SimpleOnGestureListener {
        public c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.v(TimePickerView.this);
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ GestureDetector f31004a;

        public d(GestureDetector gestureDetector) {
            this.f31004a = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f31004a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface e {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface f {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface g {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static /* synthetic */ g t(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    public static /* synthetic */ f u(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    public static /* synthetic */ e v(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        y();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            y();
        }
    }

    public final void w() {
        this.f30999y.setTag(c7.e.f25905D, 12);
        this.f31000z.setTag(c7.e.f25905D, 10);
        this.f30999y.setOnClickListener(this.f30998D);
        this.f31000z.setOnClickListener(this.f30998D);
        this.f30999y.setAccessibilityClassName("android.view.View");
        this.f31000z.setAccessibilityClassName("android.view.View");
    }

    public final void x() {
        d dVar = new d(new GestureDetector(getContext(), new c()));
        this.f30999y.setOnTouchListener(dVar);
        this.f31000z.setOnTouchListener(dVar);
    }

    public final void y() {
        if (this.f30997C.getVisibility() == 0) {
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            cVar.g(this);
            cVar.e(c7.e.f25921g, E.w(this) == 0 ? 2 : 1);
            cVar.c(this);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f30998D = new a();
        LayoutInflater.from(context).inflate(c7.g.f25950i, this);
        this.f30996B = (ClockFaceView) findViewById(c7.e.f25922h);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(c7.e.f25924j);
        this.f30997C = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new b());
        this.f30999y = (Chip) findViewById(c7.e.f25927m);
        this.f31000z = (Chip) findViewById(c7.e.f25925k);
        this.f30995A = (ClockHandView) findViewById(c7.e.f25923i);
        x();
        w();
    }
}

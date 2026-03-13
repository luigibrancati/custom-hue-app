package com.google.android.material.internal;

import Y0.C2547a;
import Y0.E;
import Z0.h;
import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import com.google.android.libraries.barhopper.RecognitionOptions;
import d1.AbstractC3806a;
import h.AbstractC4262a;
import p.C5353o;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class CheckableImageButton extends C5353o implements Checkable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f30764g = {R.attr.state_checked};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f30765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f30766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f30767f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends C2547a {
        public a() {
        }

        @Override // Y0.C2547a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // Y0.C2547a
        public void g(View view, h hVar) {
            super.g(view, hVar);
            hVar.g0(CheckableImageButton.this.a());
            hVar.h0(CheckableImageButton.this.isChecked());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends AbstractC3806a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f30769c;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f30769c = parcel.readInt() == 1;
        }

        @Override // d1.AbstractC3806a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f30769c ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4262a.f35817z);
    }

    public boolean a() {
        return this.f30766e;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f30765d;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (!this.f30765d) {
            return super.onCreateDrawableState(i10);
        }
        int[] iArr = f30764g;
        return View.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f30769c);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f30769c = this.f30765d;
        return bVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f30766e != z10) {
            this.f30766e = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f30766e || this.f30765d == z10) {
            return;
        }
        this.f30765d = z10;
        refreshDrawableState();
        sendAccessibilityEvent(RecognitionOptions.PDF417);
    }

    public void setPressable(boolean z10) {
        this.f30767f = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f30767f) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f30765d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f30766e = true;
        this.f30767f = true;
        E.f0(this, new a());
    }
}

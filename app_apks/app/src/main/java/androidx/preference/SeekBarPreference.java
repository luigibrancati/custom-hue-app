package androidx.preference;

import T2.c;
import T2.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f23959E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f23960F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f23961G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f23962H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f23963I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public SeekBar f23964J;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public TextView f23965P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f23966Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f23967R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f23968S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f23969T;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final View.OnKeyListener f23970V;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f23968S || !seekBarPreference.f23963I) {
                    seekBarPreference.W(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.X(i10 + seekBarPreference2.f23960F);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f23963I = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f23963I = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f23960F != seekBarPreference.f23959E) {
                seekBarPreference.W(seekBar);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements View.OnKeyListener {
        public b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f23966Q && (i10 == 21 || i10 == 22)) || i10 == 23 || i10 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f23964J;
            if (seekBar != null) {
                return seekBar.onKeyDown(i10, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f23969T = new a();
        this.f23970V = new b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f16084C0, i10, i11);
        this.f23960F = typedArrayObtainStyledAttributes.getInt(g.f16090F0, 0);
        T(typedArrayObtainStyledAttributes.getInt(g.f16086D0, 100));
        U(typedArrayObtainStyledAttributes.getInt(g.f16092G0, 0));
        this.f23966Q = typedArrayObtainStyledAttributes.getBoolean(g.f16088E0, true);
        this.f23967R = typedArrayObtainStyledAttributes.getBoolean(g.f16094H0, false);
        this.f23968S = typedArrayObtainStyledAttributes.getBoolean(g.f16096I0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public Object J(TypedArray typedArray, int i10) {
        return Integer.valueOf(typedArray.getInt(i10, 0));
    }

    public final void T(int i10) {
        int i11 = this.f23960F;
        if (i10 < i11) {
            i10 = i11;
        }
        if (i10 != this.f23961G) {
            this.f23961G = i10;
            F();
        }
    }

    public final void U(int i10) {
        if (i10 != this.f23962H) {
            this.f23962H = Math.min(this.f23961G - this.f23960F, Math.abs(i10));
            F();
        }
    }

    public final void V(int i10, boolean z10) {
        int i11 = this.f23960F;
        if (i10 < i11) {
            i10 = i11;
        }
        int i12 = this.f23961G;
        if (i10 > i12) {
            i10 = i12;
        }
        if (i10 != this.f23959E) {
            this.f23959E = i10;
            X(i10);
            O(i10);
            if (z10) {
                F();
            }
        }
    }

    public void W(SeekBar seekBar) {
        int progress = this.f23960F + seekBar.getProgress();
        if (progress != this.f23959E) {
            if (a(Integer.valueOf(progress))) {
                V(progress, false);
            } else {
                seekBar.setProgress(this.f23959E - this.f23960F);
                X(this.f23959E);
            }
        }
    }

    public void X(int i10) {
        TextView textView = this.f23965P;
        if (textView != null) {
            textView.setText(String.valueOf(i10));
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f16073h);
    }
}

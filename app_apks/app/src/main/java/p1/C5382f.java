package p1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: renamed from: p1.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5382f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f42162a;

    /* JADX INFO: renamed from: p1.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f42163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C5380d f42164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f42165c = true;

        public a(TextView textView) {
            this.f42163a = textView;
            this.f42164b = new C5380d(textView);
        }

        @Override // p1.C5382f.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f42165c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override // p1.C5382f.b
        public boolean b() {
            return this.f42165c;
        }

        @Override // p1.C5382f.b
        public void c(boolean z10) {
            if (z10) {
                l();
            }
        }

        @Override // p1.C5382f.b
        public void d(boolean z10) {
            this.f42165c = z10;
            l();
            k();
        }

        @Override // p1.C5382f.b
        public TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f42165c ? m(transformationMethod) : j(transformationMethod);
        }

        public final InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f42164b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f42164b;
            return inputFilterArr2;
        }

        public final SparseArray g(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof C5380d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            return sparseArray;
        }

        public final InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray sparseArrayG = g(inputFilterArr);
            if (sparseArrayG.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayG.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArrayG.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        public void i(boolean z10) {
            this.f42165c = z10;
        }

        public final TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof C5384h ? ((C5384h) transformationMethod).a() : transformationMethod;
        }

        public final void k() {
            this.f42163a.setFilters(a(this.f42163a.getFilters()));
        }

        public void l() {
            this.f42163a.setTransformationMethod(e(this.f42163a.getTransformationMethod()));
        }

        public final TransformationMethod m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof C5384h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C5384h(transformationMethod);
        }
    }

    /* JADX INFO: renamed from: p1.f$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {
        public abstract InputFilter[] a(InputFilter[] inputFilterArr);

        public abstract boolean b();

        public abstract void c(boolean z10);

        public abstract void d(boolean z10);

        public abstract TransformationMethod e(TransformationMethod transformationMethod);
    }

    /* JADX INFO: renamed from: p1.f$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f42166a;

        public c(TextView textView) {
            this.f42166a = new a(textView);
        }

        @Override // p1.C5382f.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f42166a.a(inputFilterArr);
        }

        @Override // p1.C5382f.b
        public boolean b() {
            return this.f42166a.b();
        }

        @Override // p1.C5382f.b
        public void c(boolean z10) {
            if (f()) {
                return;
            }
            this.f42166a.c(z10);
        }

        @Override // p1.C5382f.b
        public void d(boolean z10) {
            if (f()) {
                this.f42166a.i(z10);
            } else {
                this.f42166a.d(z10);
            }
        }

        @Override // p1.C5382f.b
        public TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f42166a.e(transformationMethod);
        }

        public final boolean f() {
            return !androidx.emoji2.text.c.i();
        }
    }

    public C5382f(TextView textView, boolean z10) {
        X0.h.h(textView, "textView cannot be null");
        if (z10) {
            this.f42162a = new a(textView);
        } else {
            this.f42162a = new c(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f42162a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f42162a.b();
    }

    public void c(boolean z10) {
        this.f42162a.c(z10);
    }

    public void d(boolean z10) {
        this.f42162a.d(z10);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f42162a.e(transformationMethod);
    }
}

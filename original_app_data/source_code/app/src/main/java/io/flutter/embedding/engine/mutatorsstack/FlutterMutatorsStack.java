package io.flutter.embedding.engine.mutatorsstack;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public class FlutterMutatorsStack {
    private List<FlutterMutator> mutators = new ArrayList();
    private Matrix finalMatrix = new Matrix();
    private List<Path> finalClippingPaths = new ArrayList();
    private float finalOpacity = 1.0f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum FlutterMutatorType {
        CLIP_RECT,
        CLIP_RRECT,
        CLIP_PATH,
        TRANSFORM,
        OPACITY
    }

    public List<Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public float getFinalOpacity() {
        return this.finalOpacity;
    }

    public List<FlutterMutator> getMutators() {
        return this.mutators;
    }

    public void pushClipPath(Path path) {
        this.mutators.add(new FlutterMutator(path));
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRRect(int i10, int i11, int i12, int i13, float[] fArr) {
        Rect rect = new Rect(i10, i11, i12, i13);
        this.mutators.add(new FlutterMutator(rect, fArr));
        Path path = new Path();
        path.addRoundRect(new RectF(rect), fArr, Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRect(int i10, int i11, int i12, int i13) {
        Rect rect = new Rect(i10, i11, i12, i13);
        this.mutators.add(new FlutterMutator(rect));
        Path path = new Path();
        path.addRect(new RectF(rect), Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushOpacity(float f10) {
        this.mutators.add(new FlutterMutator(f10));
        this.finalOpacity *= f10;
    }

    public void pushTransform(float[] fArr) {
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        FlutterMutator flutterMutator = new FlutterMutator(matrix);
        this.mutators.add(flutterMutator);
        this.finalMatrix.preConcat(flutterMutator.getMatrix());
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class FlutterMutator {
        private Matrix matrix;
        private float opacity;
        private Path path;
        private float[] radiis;
        private Rect rect;
        private FlutterMutatorType type;

        public FlutterMutator(Rect rect) {
            this.opacity = 1.0f;
            this.type = FlutterMutatorType.CLIP_RECT;
            this.rect = rect;
        }

        public Matrix getMatrix() {
            return this.matrix;
        }

        public float getOpacity() {
            return this.opacity;
        }

        public Path getPath() {
            return this.path;
        }

        public Rect getRect() {
            return this.rect;
        }

        public FlutterMutatorType getType() {
            return this.type;
        }

        public FlutterMutator(Rect rect, float[] fArr) {
            this.opacity = 1.0f;
            this.type = FlutterMutatorType.CLIP_RRECT;
            this.rect = rect;
            this.radiis = fArr;
        }

        public FlutterMutator(Path path) {
            this.opacity = 1.0f;
            this.type = FlutterMutatorType.CLIP_PATH;
            this.path = path;
        }

        public FlutterMutator(Matrix matrix) {
            this.opacity = 1.0f;
            this.type = FlutterMutatorType.TRANSFORM;
            this.matrix = matrix;
        }

        public FlutterMutator(float f10) {
            this.opacity = 1.0f;
            this.type = FlutterMutatorType.OPACITY;
            this.opacity = f10;
        }
    }
}

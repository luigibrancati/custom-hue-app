package io.sentry;

import io.sentry.util.AutoClosableReentrantLock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class Hint {
    private static final Map<String, Class<?>> PRIMITIVE_MAPPINGS;
    private final Map<String, Object> internalStorage = new HashMap();
    private final List<Attachment> attachments = new ArrayList();
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();
    private Attachment screenshot = null;
    private Attachment viewHierarchy = null;
    private Attachment threadDump = null;
    private ReplayRecording replayRecording = null;

    static {
        HashMap map = new HashMap();
        PRIMITIVE_MAPPINGS = map;
        map.put("boolean", Boolean.class);
        map.put("char", Character.class);
        map.put("byte", Byte.class);
        map.put("short", Short.class);
        map.put("int", Integer.class);
        map.put("long", Long.class);
        map.put("float", Float.class);
        map.put("double", Double.class);
    }

    private boolean isCastablePrimitive(Object obj, Class<?> cls) {
        Class<?> cls2 = PRIMITIVE_MAPPINGS.get(cls.getCanonicalName());
        return obj != null && cls.isPrimitive() && cls2 != null && cls2.isInstance(obj);
    }

    public static Hint withAttachment(Attachment attachment) {
        Hint hint = new Hint();
        hint.addAttachment(attachment);
        return hint;
    }

    public static Hint withAttachments(List<Attachment> list) {
        Hint hint = new Hint();
        hint.addAttachments(list);
        return hint;
    }

    public void addAttachment(Attachment attachment) {
        if (attachment != null) {
            this.attachments.add(attachment);
        }
    }

    public void addAttachments(List<Attachment> list) {
        if (list != null) {
            this.attachments.addAll(list);
        }
    }

    public void clear() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            Iterator<Map.Entry<String, Object>> it = this.internalStorage.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Object> next = it.next();
                if (next.getKey() == null || !next.getKey().startsWith("sentry:")) {
                    it.remove();
                }
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void clearAttachments() {
        this.attachments.clear();
    }

    public Object get(String str) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            Object obj = this.internalStorage.get(str);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return obj;
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public <T> T getAs(String str, Class<T> cls) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            T t10 = (T) this.internalStorage.get(str);
            if (cls.isInstance(t10)) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return t10;
                }
            } else {
                if (!isCastablePrimitive(t10, cls)) {
                    if (iSentryLifecycleTokenAcquire != null) {
                        iSentryLifecycleTokenAcquire.close();
                    }
                    return null;
                }
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
            }
            return t10;
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public List<Attachment> getAttachments() {
        return new ArrayList(this.attachments);
    }

    public ReplayRecording getReplayRecording() {
        return this.replayRecording;
    }

    public Attachment getScreenshot() {
        return this.screenshot;
    }

    public Attachment getThreadDump() {
        return this.threadDump;
    }

    public Attachment getViewHierarchy() {
        return this.viewHierarchy;
    }

    public void remove(String str) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            this.internalStorage.remove(str);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void replaceAttachments(List<Attachment> list) {
        clearAttachments();
        addAttachments(list);
    }

    public void set(String str, Object obj) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            this.internalStorage.put(str, obj);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void setReplayRecording(ReplayRecording replayRecording) {
        this.replayRecording = replayRecording;
    }

    public void setScreenshot(Attachment attachment) {
        this.screenshot = attachment;
    }

    public void setThreadDump(Attachment attachment) {
        this.threadDump = attachment;
    }

    public void setViewHierarchy(Attachment attachment) {
        this.viewHierarchy = attachment;
    }
}

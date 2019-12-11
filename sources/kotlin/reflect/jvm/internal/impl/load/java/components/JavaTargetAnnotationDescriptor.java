package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

/* compiled from: JavaAnnotationMapper.kt */
public final class JavaTargetAnnotationDescriptor extends JavaAnnotationDescriptor {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(JavaTargetAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    private final NotNullLazyValue allValueArguments$delegate;

    public JavaTargetAnnotationDescriptor(JavaAnnotation javaAnnotation, LazyJavaResolverContext lazyJavaResolverContext) {
        FqName fqName = KotlinBuiltIns.FQ_NAMES.target;
        C12880j.m40222a((Object) fqName, "KotlinBuiltIns.FQ_NAMES.target");
        super(lazyJavaResolverContext, javaAnnotation, fqName);
        this.allValueArguments$delegate = lazyJavaResolverContext.getStorageManager().createLazyValue(new JavaTargetAnnotationDescriptor$allValueArguments$2(this));
    }

    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return (Map) StorageKt.getValue(this.allValueArguments$delegate, (Object) this, $$delegatedProperties[0]);
    }
}

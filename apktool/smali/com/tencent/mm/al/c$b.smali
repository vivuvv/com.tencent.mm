.class public final Lcom/tencent/mm/al/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/mm/al/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public cat:Ljava/lang/String;

.field public ccA:I

.field public ccB:I

.field public ccC:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/tencent/mm/al/c$b;->cat:Ljava/lang/String;

    .line 54
    iput v1, p0, Lcom/tencent/mm/al/c$b;->ccA:I

    .line 55
    iput v1, p0, Lcom/tencent/mm/al/c$b;->ccB:I

    .line 56
    iput v1, p0, Lcom/tencent/mm/al/c$b;->ccC:I

    return-void
.end method

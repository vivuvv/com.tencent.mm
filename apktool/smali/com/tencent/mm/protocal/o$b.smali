.class public final Lcom/tencent/mm/protocal/o$b;
.super Lcom/tencent/mm/protocal/h$d;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/mm/protocal/h$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/mm/protocal/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public iVc:Lcom/tencent/mm/protocal/b/rh;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 39
    invoke-direct {p0}, Lcom/tencent/mm/protocal/h$d;-><init>()V

    .line 41
    new-instance v0, Lcom/tencent/mm/protocal/b/rh;

    invoke-direct {v0}, Lcom/tencent/mm/protocal/b/rh;-><init>()V

    iput-object v0, p0, Lcom/tencent/mm/protocal/o$b;->iVc:Lcom/tencent/mm/protocal/b/rh;

    return-void
.end method


# virtual methods
.method public final getCmdId()I
    .locals 1

    .prologue
    .line 53
    const v0, 0x3b9acab3

    return v0
.end method

.method public final y([B)I
    .locals 1

    .prologue
    .line 45
    new-instance v0, Lcom/tencent/mm/protocal/b/rh;

    invoke-direct {v0}, Lcom/tencent/mm/protocal/b/rh;-><init>()V

    invoke-virtual {v0, p1}, Lcom/tencent/mm/protocal/b/rh;->am([B)Lcom/tencent/mm/at/a;

    move-result-object v0

    check-cast v0, Lcom/tencent/mm/protocal/b/rh;

    iput-object v0, p0, Lcom/tencent/mm/protocal/o$b;->iVc:Lcom/tencent/mm/protocal/b/rh;

    .line 46
    iget-object v0, p0, Lcom/tencent/mm/protocal/o$b;->iVc:Lcom/tencent/mm/protocal/b/rh;

    iget-object v0, v0, Lcom/tencent/mm/protocal/b/alq;->jHj:Lcom/tencent/mm/protocal/b/dd;

    invoke-static {p0, v0}, Lcom/tencent/mm/protocal/h;->a(Lcom/tencent/mm/protocal/h$d;Lcom/tencent/mm/protocal/b/dd;)V

    .line 47
    iget-object v0, p0, Lcom/tencent/mm/protocal/o$b;->iVc:Lcom/tencent/mm/protocal/b/rh;

    iget-object v0, v0, Lcom/tencent/mm/protocal/b/alq;->jHj:Lcom/tencent/mm/protocal/b/dd;

    iget v0, v0, Lcom/tencent/mm/protocal/b/dd;->iZL:I

    return v0
.end method

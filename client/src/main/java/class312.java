public class class312 {
   int field3780 = 0;
   int field3784 = 0;
   int field3787 = 0;
   int field3788 = 0;
   long field3781 = -1L;
   long field3783 = 0L;
   long field3785 = 0L;
   long field3786 = -1L;
   long field3789 = 0L;
   public boolean field3782 = false;

   public void method5055() {
      this.field3786 = class87.method1989();
   }

   public void method5056() {
      if (this.field3786 != -1L) {
         this.field3785 = class87.method1989() - this.field3786;
         this.field3786 = -1L;
      }

   }

   public void method5060(int var1) {
      this.field3781 = class87.method1989();
      this.field3787 = var1;
   }

   public void method5075() {
      if (-1L != this.field3781) {
         this.field3783 = class87.method1989() - this.field3781;
         this.field3781 = -1L;
      }

      ++this.field3788;
      this.field3782 = true;
   }

   public void method5059() {
      this.field3782 = false;
      this.field3780 = 0;
   }

   public void method5064() {
      this.method5075();
   }

   public void method5065(Buffer var1) {
      class263.method4334(var1, this.field3785);
      class263.method4334(var1, this.field3783);
      class263.method4334(var1, this.field3789);
      var1.writeShort(this.field3787);
      var1.writeShort(this.field3780);
      var1.writeShort(this.field3788);
      var1.writeShort(this.field3784);
   }

   static final void resetModelFrames(int var0) {
      if (class251.method4294(var0)) {
         Interface[] var2 = Interface.components[var0];

         for(int var3 = 0; var3 < var2.length; ++var3) {
            Interface var4 = var2[var3];
            if (var4 != null) {
               var4.field3094 = 0;
               var4.field3090 = 0;
            }
         }

      }
   }
}

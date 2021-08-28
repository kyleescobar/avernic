final class class378 implements class373 {
   void method5861(String var1, Buffer var2) {
      var2.writeStringCP1252(var1);
   }

   public Object method5840(Buffer var1) {
      return var1.readStringNullTerminated();
   }

   public void method5843(Object var1, Buffer var2) {
      this.method5861((String)var1, var2);
   }
}

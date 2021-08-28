public class class1 implements class4 {
   public Buffer method11(Buffer var1) {
      Buffer var2 = new Buffer(100);
      this.method4(var1, var2);
      return var2;
   }

   void method4(Buffer var1, Buffer var2) {
      class9 var3 = new class9(var1);
      class6 var4 = new class6(var3);

      long var5;
      for(var5 = 0L; !var4.method19(var3.method58(), var3.method52(), var5); ++var5) {
      }

      var2.writeLong(var5);
   }
}

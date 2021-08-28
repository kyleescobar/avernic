public class class258 implements class290 {
   public static final class258 field3140 = new class258(2);
   public static final class258 field3143 = new class258(3);
   public static final class258 field3149 = new class258(0);
   public static final class258 field3160 = new class258(9);
   public static final class258 field3162 = new class258(22);
   static class302 field3165;
   static final class258 field3141 = new class258(1);
   static final class258 field3142 = new class258(5);
   static final class258 field3144 = new class258(13);
   static final class258 field3145 = new class258(6);
   static final class258 field3146 = new class258(8);
   static final class258 field3147 = new class258(16);
   static final class258 field3148 = new class258(7);
   static final class258 field3150 = new class258(12);
   static final class258 field3151 = new class258(10);
   static final class258 field3152 = new class258(14);
   static final class258 field3153 = new class258(15);
   static final class258 field3154 = new class258(11);
   static final class258 field3155 = new class258(17);
   static final class258 field3156 = new class258(18);
   static final class258 field3157 = new class258(19);
   static final class258 field3158 = new class258(20);
   static final class258 field3159 = new class258(21);
   static final class258 field3161 = new class258(4);
   public final int field3163;

   static final void method4324(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
      }

   }

   static int method4326(int var0, int var1) {
      class65 var3 = (class65)class65.field935.get((long)var0);
      if (var3 == null) {
         return 0;
      } else if (var1 == -1) {
         return 0;
      } else {
         int var4 = 0;

         for(int var5 = 0; var5 < var3.field932.length; ++var5) {
            if (var3.field931[var5] == var1) {
               var4 += var3.field932[var5];
            }
         }

         return var4;
      }
   }

   class258(int var1) {
      this.field3163 = var1;
   }

   static class264[] method4330() {
      return new class264[]{class264.field3192, class264.field3190};
   }

   public int method4619() {
      return this.field3163;
   }
}

public abstract class class341 extends class217 implements class392 {
   protected class341(class266 var1, class292 var2, int var3) {
      super(var1, var2, var3);
   }

   public int method5397() {
      return super.field2548;
   }

   public Object method6250(int var1) {
      class343 var3 = this.method5401(var1);
      return null != var3 && var3.method5410() ? var3.method5417() : null;
   }

   public class393 method5407(Buffer var1) {
      int var3 = var1.readUnsignedShort();
      class343 var4 = this.method5401(var3);
      class393 var5 = new class393(var3);
      Class var6 = var4.field3941.field4161;
      if (var6 == Integer.class) {
         var5.field4242 = var1.readInt();
      } else if (Long.class == var6) {
         var5.field4242 = var1.method5954();
      } else if (String.class == var6) {
         var5.field4242 = var1.method6094();
      } else {
         if (!class388.class.isAssignableFrom(var6)) {
            throw new IllegalStateException();
         }

         try {
            class388 var7 = (class388)var6.newInstance();
            var7.method6226(var1);
            var5.field4242 = var7;
         } catch (InstantiationException var8) {
         } catch (IllegalAccessException var9) {
         }
      }

      return var5;
   }

   protected abstract class343 method5401(int var1);
}

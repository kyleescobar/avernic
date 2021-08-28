public class class358 {
   static int field4012;
   boolean field4020 = false;
   class277 field4016;
   int field4017 = 0;
   String field4018;

   class358(class277 var1) {
      this.field4016 = var1;
   }

   void method5468(String var1) {
      if (null != var1 && !var1.isEmpty()) {
         if (this.field4018 != var1) {
            this.field4018 = var1;
            this.field4017 = 0;
            this.field4020 = false;
            this.method5469();
         }
      }
   }

   int method5469() {
      if (this.field4017 < 33) {
         if (!this.field4016.method4468(class187.field2116.field2114, this.field4018)) {
            return this.field4017;
         }

         this.field4017 = 33;
      }

      if (33 == this.field4017) {
         if (this.field4016.method4431(class187.field2115.field2114, this.field4018) && !this.field4016.method4468(class187.field2115.field2114, this.field4018)) {
            return this.field4017;
         }

         this.field4017 = 66;
      }

      if (66 == this.field4017) {
         if (!this.field4016.method4468(this.field4018, class187.field2117.field2114)) {
            return this.field4017;
         }

         this.field4017 = 100;
         this.field4020 = true;
      }

      return this.field4017;
   }

   boolean method5470() {
      return this.field4020;
   }

   int method5474() {
      return this.field4017;
   }
}
